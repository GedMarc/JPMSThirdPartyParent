//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.30 at 07:10:45 AM BST 
//


package org.hibernate.jpamodelgen.xml.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *                 Defines an entity listener to be invoked at lifecycle events
 *                 for the entities that list this listener.
 * 
 *             
 * 
 * <p>Java class for entity-listener complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity-listener"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pre-persist" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}pre-persist" minOccurs="0"/&gt;
 *         &lt;element name="post-persist" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}post-persist" minOccurs="0"/&gt;
 *         &lt;element name="pre-remove" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}pre-remove" minOccurs="0"/&gt;
 *         &lt;element name="post-remove" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}post-remove" minOccurs="0"/&gt;
 *         &lt;element name="pre-update" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}pre-update" minOccurs="0"/&gt;
 *         &lt;element name="post-update" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}post-update" minOccurs="0"/&gt;
 *         &lt;element name="post-load" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}post-load" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entity-listener", propOrder = {
    "description",
    "prePersist",
    "postPersist",
    "preRemove",
    "postRemove",
    "preUpdate",
    "postUpdate",
    "postLoad"
})
public class EntityListener {

    protected String description;
    @XmlElement(name = "pre-persist")
    protected PrePersist prePersist;
    @XmlElement(name = "post-persist")
    protected PostPersist postPersist;
    @XmlElement(name = "pre-remove")
    protected PreRemove preRemove;
    @XmlElement(name = "post-remove")
    protected PostRemove postRemove;
    @XmlElement(name = "pre-update")
    protected PreUpdate preUpdate;
    @XmlElement(name = "post-update")
    protected PostUpdate postUpdate;
    @XmlElement(name = "post-load")
    protected PostLoad postLoad;
    @XmlAttribute(name = "class", required = true)
    protected String clazz;

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
     * Gets the value of the prePersist property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PrePersist }
     *     
     */
    public PrePersist getPrePersist() {
        return prePersist;
    }

    /**
     * Sets the value of the prePersist property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PrePersist }
     *     
     */
    public void setPrePersist(PrePersist value) {
        this.prePersist = value;
    }

    /**
     * Gets the value of the postPersist property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PostPersist }
     *     
     */
    public PostPersist getPostPersist() {
        return postPersist;
    }

    /**
     * Sets the value of the postPersist property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PostPersist }
     *     
     */
    public void setPostPersist(PostPersist value) {
        this.postPersist = value;
    }

    /**
     * Gets the value of the preRemove property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PreRemove }
     *     
     */
    public PreRemove getPreRemove() {
        return preRemove;
    }

    /**
     * Sets the value of the preRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PreRemove }
     *     
     */
    public void setPreRemove(PreRemove value) {
        this.preRemove = value;
    }

    /**
     * Gets the value of the postRemove property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PostRemove }
     *     
     */
    public PostRemove getPostRemove() {
        return postRemove;
    }

    /**
     * Sets the value of the postRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PostRemove }
     *     
     */
    public void setPostRemove(PostRemove value) {
        this.postRemove = value;
    }

    /**
     * Gets the value of the preUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PreUpdate }
     *     
     */
    public PreUpdate getPreUpdate() {
        return preUpdate;
    }

    /**
     * Sets the value of the preUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PreUpdate }
     *     
     */
    public void setPreUpdate(PreUpdate value) {
        this.preUpdate = value;
    }

    /**
     * Gets the value of the postUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PostUpdate }
     *     
     */
    public PostUpdate getPostUpdate() {
        return postUpdate;
    }

    /**
     * Sets the value of the postUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PostUpdate }
     *     
     */
    public void setPostUpdate(PostUpdate value) {
        this.postUpdate = value;
    }

    /**
     * Gets the value of the postLoad property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PostLoad }
     *     
     */
    public PostLoad getPostLoad() {
        return postLoad;
    }

    /**
     * Sets the value of the postLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.jpamodelgen.xml.jaxb.PostLoad }
     *     
     */
    public void setPostLoad(PostLoad value) {
        this.postLoad = value;
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

}
