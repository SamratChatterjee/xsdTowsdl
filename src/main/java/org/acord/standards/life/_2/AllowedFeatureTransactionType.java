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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AllowedFeatureTransaction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowedFeatureTransaction_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedFeatureTransactionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedFeatureTransactionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransSubType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowedFeatureTransaction_Type", propOrder = {
    "allowedFeatureTransactionKey",
    "allowedFeatureTransactionSysKey",
    "transType",
    "transSubType",
    "effDate",
    "expDate",
    "oLifEExtension"
})
public class AllowedFeatureTransactionType {

    @XmlElement(name = "AllowedFeatureTransactionKey")
    protected PERSISTKEY allowedFeatureTransactionKey;
    @XmlElement(name = "AllowedFeatureTransactionSysKey")
    protected List<SYSKEY> allowedFeatureTransactionSysKey;
    @XmlElement(name = "TransType")
    protected OLILUTRANSTYPECODES transType;
    @XmlElement(name = "TransSubType")
    protected TRANSSUBTYPECODES transSubType;
    @XmlElement(name = "EffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDate;
    @XmlElement(name = "ExpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDate;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;

    /**
     * Gets the value of the allowedFeatureTransactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getAllowedFeatureTransactionKey() {
        return allowedFeatureTransactionKey;
    }

    /**
     * Sets the value of the allowedFeatureTransactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setAllowedFeatureTransactionKey(PERSISTKEY value) {
        this.allowedFeatureTransactionKey = value;
    }

    /**
     * Gets the value of the allowedFeatureTransactionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedFeatureTransactionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedFeatureTransactionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getAllowedFeatureTransactionSysKey() {
        if (allowedFeatureTransactionSysKey == null) {
            allowedFeatureTransactionSysKey = new ArrayList<SYSKEY>();
        }
        return this.allowedFeatureTransactionSysKey;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTRANSTYPECODES }
     *     
     */
    public OLILUTRANSTYPECODES getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTRANSTYPECODES }
     *     
     */
    public void setTransType(OLILUTRANSTYPECODES value) {
        this.transType = value;
    }

    /**
     * Gets the value of the transSubType property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSSUBTYPECODES }
     *     
     */
    public TRANSSUBTYPECODES getTransSubType() {
        return transSubType;
    }

    /**
     * Sets the value of the transSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSSUBTYPECODES }
     *     
     */
    public void setTransSubType(TRANSSUBTYPECODES value) {
        this.transSubType = value;
    }

    /**
     * Gets the value of the effDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Sets the value of the effDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dataRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRep() {
        return dataRep;
    }

    /**
     * Sets the value of the dataRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRep(String value) {
        this.dataRep = value;
    }

}