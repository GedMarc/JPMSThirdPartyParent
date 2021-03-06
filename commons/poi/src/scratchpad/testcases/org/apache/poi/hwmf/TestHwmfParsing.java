/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hwmf;

import static org.apache.poi.POITestCase.assertContains;
import static org.junit.Assert.assertEquals;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.imageio.ImageIO;

import org.apache.poi.POIDataSamples;
import org.apache.poi.hwmf.record.HwmfFill.HwmfImageRecord;
import org.apache.poi.hwmf.record.HwmfFont;
import org.apache.poi.hwmf.record.HwmfRecord;
import org.apache.poi.hwmf.record.HwmfRecordType;
import org.apache.poi.hwmf.record.HwmfText;
import org.apache.poi.hwmf.usermodel.HwmfEmbedded;
import org.apache.poi.hwmf.usermodel.HwmfPicture;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.sl.usermodel.PictureData.PictureType;
import org.apache.poi.sl.usermodel.SlideShow;
import org.apache.poi.sl.usermodel.SlideShowFactory;
import org.apache.poi.util.LocaleUtil;
import org.apache.poi.util.RecordFormatException;
import org.apache.poi.util.Units;
import org.junit.Ignore;
import org.junit.Test;

public class TestHwmfParsing {

    private static final POIDataSamples samples = POIDataSamples.getSlideShowInstance();


    @Test
    public void parse() throws IOException {
        try (InputStream fis = samples.openResourceAsStream("santa.wmf")) {
            HwmfPicture wmf = new HwmfPicture(fis);
            List<HwmfRecord> records = wmf.getRecords();
            assertEquals(581, records.size());
        }
    }

    @Test(expected = RecordFormatException.class)
    public void testInfiniteLoop() throws Exception {
        try (InputStream is = samples.openResourceAsStream("61338.wmf")) {
            new HwmfPicture(is);
        }
    }

    @Test
    @Ignore("This is work-in-progress and not a real unit test ...")
    public void paint() throws IOException {
        boolean dumpEmbedded = true;
        boolean dumpRecords = false;

        File f = new File("testme.wmf");
        FileInputStream fis = new FileInputStream(f);
        HwmfPicture wmf = new HwmfPicture(fis);
        fis.close();
        
        Dimension2D dim = wmf.getSize();
        double width = Units.pointsToPixel(dim.getWidth());
        // keep aspect ratio for height
        double height = Units.pointsToPixel(dim.getHeight());
        double scale = (width > height) ? 1500 / width : 1500 / width;
        width = Math.abs(width * scale);
        height = Math.abs(height * scale);

        BufferedImage bufImg = new BufferedImage((int)width, (int)height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bufImg.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        
        wmf.draw(g, new Rectangle2D.Double(0,0,width,height));

        g.dispose();
        
        ImageIO.write(bufImg, "PNG", new File("bla.png"));

        if (dumpEmbedded) {
            int embIdx = 0;
            for (HwmfEmbedded emb : wmf.getEmbeddings()) {
                final File embName = new File("build/tmp", "emb_"+embIdx + emb.getEmbeddedType().extension);
                try (FileOutputStream fos = new FileOutputStream(embName)) {
                    fos.write(emb.getRawData());
                }
                embIdx++;
            }
        }

        if (dumpRecords) {
            try (FileWriter fw = new FileWriter("wmf-records.log")) {
                for (HwmfRecord r : wmf.getRecords()) {
                    fw.write(r.getWmfRecordType().name());
                    fw.write(":");
                    fw.write(r.toString());
                    fw.write("\n");
                }
            }
        }
    }

    @Test
    @Ignore("This is work-in-progress and not a real unit test ...")
    public void fetchWmfFromGovdocs() throws IOException {
        URL url = new URL("http://digitalcorpora.org/corpora/files/govdocs1/by_type/ppt.zip");
        File outdir = new File("build/ppt");
        outdir.mkdirs();
        ZipInputStream zis = new ZipInputStream(url.openStream());
        ZipEntry ze;
        while ((ze = zis.getNextEntry()) != null) {
            String basename = ze.getName().replaceAll(".*?([^/]+)\\.wmf", "$1");
            FilterInputStream fis = new FilterInputStream(zis){
                @Override
                public void close() throws IOException {}
            };
            try {
                SlideShow<?,?> ss = SlideShowFactory.create(fis);
                int wmfIdx = 1;
                for (PictureData pd : ss.getPictureData()) {
                    if (pd.getType() != PictureType.WMF) {
                        continue;
                    }
                    byte[] wmfData = pd.getData();
                    String filename = String.format(Locale.ROOT, "%s-%04d.wmf", basename, wmfIdx);
                    FileOutputStream fos = new FileOutputStream(new File(outdir, filename));
                    fos.write(wmfData);
                    fos.close();
                    wmfIdx++;
                }
                ss.close();
            } catch (Exception e) {
                System.out.println(ze.getName()+" ignored.");
            }
        }
    }

    @Test
    @Ignore("This is work-in-progress and not a real unit test ...")
    public void parseWmfs() throws IOException {
        // parse and render the extracted wmfs from the fetchWmfFromGovdocs step
        boolean outputFiles = false;
        boolean renderWmf = true;
        File indir = new File("E:\\project\\poi\\misc\\govdocs-ppt");
        File outdir = new File("build/wmf");
        outdir.mkdirs();
        final String startFile = "";
        File[] files = indir.listFiles(new FileFilter() {
            boolean foundStartFile;

            @Override
            public boolean accept(File pathname) {
                foundStartFile |= startFile.isEmpty() || pathname.getName().contains(startFile);
                return foundStartFile && pathname.getName().matches("(?i).*\\.wmf?$");
            }
        });
        for (File f : files) {
            try {
                String basename = f.getName().replaceAll(".*?([^/]+)\\.wmf", "$1");
                FileInputStream fis = new FileInputStream(f);
                HwmfPicture wmf = new HwmfPicture(fis);
                fis.close();
                
                int bmpIndex = 1;
                for (HwmfRecord r : wmf.getRecords()) {
                    if (r instanceof HwmfImageRecord) {
                        BufferedImage bi = ((HwmfImageRecord)r).getImage();
                        if (bi != null && outputFiles) {
                            String filename = String.format(Locale.ROOT, "%s-%04d.png", basename, bmpIndex);
                            ImageIO.write(bi, "PNG", new File(outdir, filename));
                        }
                        bmpIndex++;
                    }
                }

                if (renderWmf) {
                    Dimension2D dim = wmf.getSize();
                    int width = Units.pointsToPixel(dim.getWidth());
                    // keep aspect ratio for height
                    int height = Units.pointsToPixel(dim.getHeight());

                    BufferedImage bufImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D g = bufImg.createGraphics();
                    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
                    g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                    
                    wmf.draw(g);

                    g.dispose();
                    
                    ImageIO.write(bufImg, "PNG", new File(outdir, basename+".png"));
                }
            } catch (Exception e) {
                System.out.println(f.getName()+" ignored.");                
            }
        }
    }

    @Test
    @Ignore("If we decide we can use common crawl file specified, we can turn this back on")
    public void testCyrillic() throws Exception {
        //TODO: move test file to framework and fix this
        File dir = new File("C:/somethingOrOther");
        File f = new File(dir, "ZMLH54SPLI76NQ7XMKVB7SMUJA2HTXTS-2.wmf");
        HwmfPicture wmf = new HwmfPicture(new FileInputStream(f));

        Charset charset = LocaleUtil.CHARSET_1252;
        StringBuilder sb = new StringBuilder();
        //this is pure hackery for specifying the font
        //this happens to work on this test file, but you need to
        //do what Graphics does by maintaining the stack, etc.!
        for (HwmfRecord r : wmf.getRecords()) {
            if (r.getWmfRecordType().equals(HwmfRecordType.createFontIndirect)) {
                HwmfFont font = ((HwmfText.WmfCreateFontIndirect)r).getFont();
                charset = (font.getCharset().getCharset() == null) ? LocaleUtil.CHARSET_1252 : font.getCharset().getCharset();
            }
            if (r.getWmfRecordType().equals(HwmfRecordType.extTextOut)) {
                HwmfText.WmfExtTextOut textOut = (HwmfText.WmfExtTextOut)r;
                sb.append(textOut.getText(charset)).append("\n");
            }
        }
        String txt = sb.toString();
        assertContains(txt, "\u041E\u0431\u0449\u043E");
        assertContains(txt, "\u0411\u0430\u043B\u0430\u043D\u0441");
    }

    @Test
    public void testShift_JIS() throws Exception {
        //this file derives from common crawl: see Bug 60677
        HwmfPicture wmf = null;
        try (InputStream fis = samples.openResourceAsStream("60677.wmf")) {
            wmf = new HwmfPicture(fis);
        }

        Charset charset = LocaleUtil.CHARSET_1252;
        StringBuilder sb = new StringBuilder();
        //this is pure hackery for specifying the font
        //this happens to work on this test file, but you need to
        //do what Graphics does by maintaining the stack, etc.!
        for (HwmfRecord r : wmf.getRecords()) {
            if (r.getWmfRecordType().equals(HwmfRecordType.createFontIndirect)) {
                HwmfFont font = ((HwmfText.WmfCreateFontIndirect)r).getFont();
                charset = (font.getCharset().getCharset() == null) ? LocaleUtil.CHARSET_1252 : font.getCharset().getCharset();
            }
            if (r.getWmfRecordType().equals(HwmfRecordType.extTextOut)) {
                HwmfText.WmfExtTextOut textOut = (HwmfText.WmfExtTextOut)r;
                sb.append(textOut.getText(charset)).append("\n");
            }
        }
        String txt = sb.toString();
        assertContains(txt, "\u822A\u7A7A\u60C5\u5831\u696D\u52D9\u3078\u306E\uFF27\uFF29\uFF33");
    }

    @Test
    public void testLengths() throws Exception {
        //both substring and length rely on char, not codepoints.
        //This test confirms that the substring calls in HwmfText
        //will not truncate even beyond-bmp data.
        //The last character (Deseret AY U+1040C) is comprised of 2 utf16 surrogates/codepoints
        String s = "\u666E\u6797\u65AF\uD801\uDC0C";
        Charset utf16LE = StandardCharsets.UTF_16LE;
        byte[] bytes = s.getBytes(utf16LE);
        String rebuilt = new String(bytes, utf16LE);
        rebuilt = rebuilt.substring(0, Math.min(bytes.length, rebuilt.length()));
        assertEquals(s, rebuilt);
        assertEquals(5, rebuilt.length());
        long cnt = rebuilt.codePoints().count();
        assertEquals(4, cnt);
    }
}
