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
 * <p>Java class for UnsavedValueVersionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnsavedValueVersionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="negative"/&gt;
 *     &lt;enumeration value="null"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnsavedValueVersionEnum")
@XmlEnum
public enum JaxbHbmUnsavedValueVersionEnum {

    @XmlEnumValue("negative")
    NEGATIVE("negative"),
    @XmlEnumValue("null")
    NULL("null"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    JaxbHbmUnsavedValueVersionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbHbmUnsavedValueVersionEnum fromValue(String v) {
        for (JaxbHbmUnsavedValueVersionEnum c: JaxbHbmUnsavedValueVersionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
