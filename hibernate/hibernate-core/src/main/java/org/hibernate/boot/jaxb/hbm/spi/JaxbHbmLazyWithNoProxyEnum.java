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
 * <p>Java class for LazyWithNoProxyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LazyWithNoProxyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="false"/&gt;
 *     &lt;enumeration value="no-proxy"/&gt;
 *     &lt;enumeration value="proxy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LazyWithNoProxyEnum")
@XmlEnum
public enum JaxbHbmLazyWithNoProxyEnum {

    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("no-proxy")
    NO_PROXY("no-proxy"),
    @XmlEnumValue("proxy")
    PROXY("proxy");
    private final String value;

    JaxbHbmLazyWithNoProxyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbHbmLazyWithNoProxyEnum fromValue(String v) {
        for (JaxbHbmLazyWithNoProxyEnum c: JaxbHbmLazyWithNoProxyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
