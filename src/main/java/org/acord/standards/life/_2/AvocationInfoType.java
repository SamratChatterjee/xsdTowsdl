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


/**
 * <p>Java class for AvocationInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvocationInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AvocationInfoKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AvocationInfoSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AvocationType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AvocationDetails" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxAvocationValue" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinAvocationValue" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AvocationValueQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Attachment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AvocationInfo_Type", propOrder = {
    "avocationInfoKey",
    "avocationInfoSysKey",
    "avocationType",
    "avocationDetails",
    "maxAvocationValue",
    "minAvocationValue",
    "avocationValueQualifier",
    "attachment",
    "oLifEExtension"
})
public class AvocationInfoType {

    @XmlElement(name = "AvocationInfoKey")
    protected PERSISTKEY avocationInfoKey;
    @XmlElement(name = "AvocationInfoSysKey")
    protected List<SYSKEY> avocationInfoSysKey;
    @XmlElement(name = "AvocationType")
    protected OLILULIFEACTIVITYTYPE avocationType;
    @XmlElement(name = "AvocationDetails")
    protected String avocationDetails;
    @XmlElement(name = "MaxAvocationValue")
    protected String maxAvocationValue;
    @XmlElement(name = "MinAvocationValue")
    protected String minAvocationValue;
    @XmlElement(name = "AvocationValueQualifier")
    protected OLILUMEASUNITS avocationValueQualifier;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
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
     * Gets the value of the avocationInfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getAvocationInfoKey() {
        return avocationInfoKey;
    }

    /**
     * Sets the value of the avocationInfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setAvocationInfoKey(PERSISTKEY value) {
        this.avocationInfoKey = value;
    }

    /**
     * Gets the value of the avocationInfoSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avocationInfoSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvocationInfoSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getAvocationInfoSysKey() {
        if (avocationInfoSysKey == null) {
            avocationInfoSysKey = new ArrayList<SYSKEY>();
        }
        return this.avocationInfoSysKey;
    }

    /**
     * Gets the value of the avocationType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILULIFEACTIVITYTYPE }
     *     
     */
    public OLILULIFEACTIVITYTYPE getAvocationType() {
        return avocationType;
    }

    /**
     * Sets the value of the avocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILULIFEACTIVITYTYPE }
     *     
     */
    public void setAvocationType(OLILULIFEACTIVITYTYPE value) {
        this.avocationType = value;
    }

    /**
     * Gets the value of the avocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvocationDetails() {
        return avocationDetails;
    }

    /**
     * Sets the value of the avocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvocationDetails(String value) {
        this.avocationDetails = value;
    }

    /**
     * Gets the value of the maxAvocationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAvocationValue() {
        return maxAvocationValue;
    }

    /**
     * Sets the value of the maxAvocationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAvocationValue(String value) {
        this.maxAvocationValue = value;
    }

    /**
     * Gets the value of the minAvocationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAvocationValue() {
        return minAvocationValue;
    }

    /**
     * Sets the value of the minAvocationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAvocationValue(String value) {
        this.minAvocationValue = value;
    }

    /**
     * Gets the value of the avocationValueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getAvocationValueQualifier() {
        return avocationValueQualifier;
    }

    /**
     * Sets the value of the avocationValueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setAvocationValueQualifier(OLILUMEASUNITS value) {
        this.avocationValueQualifier = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
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