//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.30 at 07:10:18 AM BST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A many-to-one association embedded in a composite identifier or map index
 *                 (always not-null, never cascade).
 *             
 * 
 * <p>Java class for CompositeKeyManyToOneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeKeyManyToOneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hibernate.org/xsd/orm/hbm}ToolingHintContainer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="column" type="{http://www.hibernate.org/xsd/orm/hbm}ColumnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.hibernate.org/xsd/orm/hbm}ClassNameType" /&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="foreign-key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lazy" type="{http://www.hibernate.org/xsd/orm/hbm}LazyEnum" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="on-delete" type="{http://www.hibernate.org/xsd/orm/hbm}OnDeleteEnum" default="noaction" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeKeyManyToOneType", propOrder = {
    "column"
})
public class JaxbHbmCompositeKeyManyToOneType
    extends JaxbHbmToolingHintContainer
    implements Serializable, SingularAttributeInfo
{

    protected List<JaxbHbmColumnType> column;
    @XmlAttribute(name = "access")
    protected String access;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "column")
    protected String columnAttribute;
    @XmlAttribute(name = "entity-name")
    protected String entityName;
    @XmlAttribute(name = "foreign-key")
    protected String foreignKey;
    @XmlAttribute(name = "lazy")
    protected JaxbHbmLazyEnum lazy;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "on-delete")
    protected JaxbHbmOnDeleteEnum onDelete;

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.hibernate.boot.jaxb.hbm.spi.JaxbHbmColumnType }
     * 
     * 
     */
    public List<JaxbHbmColumnType> getColumn() {
        if (column == null) {
            column = new ArrayList<JaxbHbmColumnType>();
        }
        return this.column;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccess(String value) {
        this.access = value;
    }

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
     * Gets the value of the columnAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnAttribute() {
        return columnAttribute;
    }

    /**
     * Sets the value of the columnAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnAttribute(String value) {
        this.columnAttribute = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the foreignKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignKey() {
        return foreignKey;
    }

    /**
     * Sets the value of the foreignKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignKey(String value) {
        this.foreignKey = value;
    }

    /**
     * Gets the value of the lazy property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.boot.jaxb.hbm.spi.JaxbHbmLazyEnum }
     *     
     */
    public JaxbHbmLazyEnum getLazy() {
        return lazy;
    }

    /**
     * Sets the value of the lazy property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.boot.jaxb.hbm.spi.JaxbHbmLazyEnum }
     *     
     */
    public void setLazy(JaxbHbmLazyEnum value) {
        this.lazy = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the onDelete property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.boot.jaxb.hbm.spi.JaxbHbmOnDeleteEnum }
     *     
     */
    public JaxbHbmOnDeleteEnum getOnDelete() {
        if (onDelete == null) {
            return JaxbHbmOnDeleteEnum.NOACTION;
        } else {
            return onDelete;
        }
    }

    /**
     * Sets the value of the onDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.boot.jaxb.hbm.spi.JaxbHbmOnDeleteEnum }
     *     
     */
    public void setOnDelete(JaxbHbmOnDeleteEnum value) {
        this.onDelete = value;
    }

}
