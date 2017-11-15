//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PolicyActivityList_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyActivityList_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SeqNum"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyActivity"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyActivityDate" minOccurs="0"/>
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
@XmlType(name = "PolicyActivityList_Type", propOrder = {
    "seqNum",
    "policyActivity",
    "policyActivityDate",
    "oLifEExtension"
})
public class PolicyActivityListType {

    @XmlElement(name = "SeqNum", required = true)
    protected BigInteger seqNum;
    @XmlElement(name = "PolicyActivity", required = true)
    protected REINSSUBTRANCODES policyActivity;
    @XmlElement(name = "PolicyActivityDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyActivityDate;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeqNum(BigInteger value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the policyActivity property.
     * 
     * @return
     *     possible object is
     *     {@link REINSSUBTRANCODES }
     *     
     */
    public REINSSUBTRANCODES getPolicyActivity() {
        return policyActivity;
    }

    /**
     * Sets the value of the policyActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link REINSSUBTRANCODES }
     *     
     */
    public void setPolicyActivity(REINSSUBTRANCODES value) {
        this.policyActivity = value;
    }

    /**
     * Gets the value of the policyActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyActivityDate() {
        return policyActivityDate;
    }

    /**
     * Sets the value of the policyActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyActivityDate(XMLGregorianCalendar value) {
        this.policyActivityDate = value;
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
