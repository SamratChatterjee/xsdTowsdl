//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TargetURL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetURL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}URLAddress" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SessionExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SessionExpirationTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetURL_Type", propOrder = {
    "urlAddress",
    "sessionExpirationDate",
    "sessionExpirationTime",
    "oLifEExtension"
})
public class TargetURLType {

    @XmlElement(name = "URLAddress")
    protected String urlAddress;
    @XmlElement(name = "SessionExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sessionExpirationDate;
    @XmlElement(name = "SessionExpirationTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sessionExpirationTime;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;

    /**
     * Gets the value of the urlAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAddress() {
        return urlAddress;
    }

    /**
     * Sets the value of the urlAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAddress(String value) {
        this.urlAddress = value;
    }

    /**
     * Gets the value of the sessionExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionExpirationDate() {
        return sessionExpirationDate;
    }

    /**
     * Sets the value of the sessionExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionExpirationDate(XMLGregorianCalendar value) {
        this.sessionExpirationDate = value;
    }

    /**
     * Gets the value of the sessionExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionExpirationTime() {
        return sessionExpirationTime;
    }

    /**
     * Sets the value of the sessionExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionExpirationTime(XMLGregorianCalendar value) {
        this.sessionExpirationTime = value;
    }

    /**
     * Gets the value of the oLifEExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oLifEExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOLifEExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OLifEExtensionType }
     * 
     * 
     */
    public List<OLifEExtensionType> getOLifEExtension() {
        if (oLifEExtension == null) {
            oLifEExtension = new ArrayList<OLifEExtensionType>();
        }
        return this.oLifEExtension;
    }

}