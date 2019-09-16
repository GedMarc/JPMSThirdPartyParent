//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.30 at 07:10:18 AM BST 
//


package org.hibernate.boot.jaxb.cfg.spi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventListenerGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventListenerGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listener" type="{http://www.hibernate.org/xsd/orm/cfg}EventListenerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.hibernate.org/xsd/orm/cfg}EventTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventListenerGroupType", propOrder = {
    "listener"
})
public class JaxbCfgEventListenerGroupType {

    protected List<JaxbCfgEventListenerType> listener;
    @XmlAttribute(name = "type", required = true)
    protected JaxbCfgEventTypeEnum type;

    /**
     * Gets the value of the listener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.hibernate.boot.jaxb.cfg.spi.JaxbCfgEventListenerType }
     * 
     * 
     */
    public List<JaxbCfgEventListenerType> getListener() {
        if (listener == null) {
            listener = new ArrayList<JaxbCfgEventListenerType>();
        }
        return this.listener;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link org.hibernate.boot.jaxb.cfg.spi.JaxbCfgEventTypeEnum }
     *     
     */
    public JaxbCfgEventTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hibernate.boot.jaxb.cfg.spi.JaxbCfgEventTypeEnum }
     *     
     */
    public void setType(JaxbCfgEventTypeEnum value) {
        this.type = value;
    }

}
