//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.30 at 07:10:45 AM BST 
//


package org.hibernate.jpamodelgen.xml.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *                 @Target({TYPE}) @Retention(RUNTIME)
 *                 public @interface SqlResultSetMapping {
 *                 String name();
 *                 EntityResult[] entities() default {};
 *                 ConstructorResult[] classes() default{};
 *                 ColumnResult[] columns() default {};
 *                 }
 * 
 *             
 * 
 * <p>Java class for sql-result-set-mapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sql-result-set-mapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entity-result" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}entity-result" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="constructor-result" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}constructor-result" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="column-result" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}column-result" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sql-result-set-mapping", propOrder = {
    "description",
    "entityResult",
    "constructorResult",
    "columnResult"
})
public class SqlResultSetMapping {

    protected String description;
    @XmlElement(name = "entity-result")
    protected List<EntityResult> entityResult;
    @XmlElement(name = "constructor-result")
    protected List<ConstructorResult> constructorResult;
    @XmlElement(name = "column-result")
    protected List<ColumnResult> columnResult;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the entityResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.hibernate.jpamodelgen.xml.jaxb.EntityResult }
     * 
     * 
     */
    public List<EntityResult> getEntityResult() {
        if (entityResult == null) {
            entityResult = new ArrayList<EntityResult>();
        }
        return this.entityResult;
    }

    /**
     * Gets the value of the constructorResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructorResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructorResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.hibernate.jpamodelgen.xml.jaxb.ConstructorResult }
     * 
     * 
     */
    public List<ConstructorResult> getConstructorResult() {
        if (constructorResult == null) {
            constructorResult = new ArrayList<ConstructorResult>();
        }
        return this.constructorResult;
    }

    /**
     * Gets the value of the columnResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.hibernate.jpamodelgen.xml.jaxb.ColumnResult }
     * 
     * 
     */
    public List<ColumnResult> getColumnResult() {
        if (columnResult == null) {
            columnResult = new ArrayList<ColumnResult>();
        }
        return this.columnResult;
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

}