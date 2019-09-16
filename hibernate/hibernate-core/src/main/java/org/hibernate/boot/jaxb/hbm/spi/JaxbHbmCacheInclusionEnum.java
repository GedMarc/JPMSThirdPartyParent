//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.30 at 07:10:18 AM BST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CacheInclusionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CacheInclusionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="non-lazy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CacheInclusionEnum")
@XmlEnum
public enum JaxbHbmCacheInclusionEnum {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("non-lazy")
    NON_LAZY("non-lazy");
    private final String value;

    JaxbHbmCacheInclusionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbHbmCacheInclusionEnum fromValue(String v) {
        for (JaxbHbmCacheInclusionEnum c: JaxbHbmCacheInclusionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
