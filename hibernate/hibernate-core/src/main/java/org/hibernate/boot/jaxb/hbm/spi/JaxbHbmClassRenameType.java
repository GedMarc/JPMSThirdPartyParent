//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.30 at 07:10:18 AM BST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassRenameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassRenameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="class" use="required" type="{http://www.hibernate.org/xsd/orm/hbm}ClassNameType" /&gt;
 *       &lt;attribute name="rename" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassRenameType")
public class JaxbHbmClassRenameType
    implements Serializable
{

    @XmlAttribute(name = "class", required = true)
    protected String clazz;
    @XmlAttribute(name = "rename")
    protected String rename;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the rename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRename() {
        return rename;
    }

    /**
     * Sets the value of the rename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRename(String value) {
        this.rename = value;
    }

}
