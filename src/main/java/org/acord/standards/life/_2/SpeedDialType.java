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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SpeedDial_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedDial_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SpeedDialKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SpeedDialSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SpeedDialNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SpeedDialType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OrgCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="OwnerPartyID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="OwnerPhoneID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedDial_Type", propOrder = {
    "speedDialKey",
    "speedDialSysKey",
    "speedDialNumber",
    "speedDialType",
    "orgCode",
    "description",
    "oLifEExtension"
})
public class SpeedDialType {

    @XmlElement(name = "SpeedDialKey")
    protected PERSISTKEY speedDialKey;
    @XmlElement(name = "SpeedDialSysKey")
    protected List<SYSKEY> speedDialSysKey;
    @XmlElement(name = "SpeedDialNumber")
    protected String speedDialNumber;
    @XmlElement(name = "SpeedDialType")
    protected OLILUSPEEDDIAL speedDialType;
    @XmlElement(name = "OrgCode")
    protected String orgCode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "OwnerPartyID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ownerPartyID;
    @XmlAttribute(name = "OwnerPhoneID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ownerPhoneID;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;

    /**
     * Gets the value of the speedDialKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getSpeedDialKey() {
        return speedDialKey;
    }

    /**
     * Sets the value of the speedDialKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setSpeedDialKey(PERSISTKEY value) {
        this.speedDialKey = value;
    }

    /**
     * Gets the value of the speedDialSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speedDialSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeedDialSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getSpeedDialSysKey() {
        if (speedDialSysKey == null) {
            speedDialSysKey = new ArrayList<SYSKEY>();
        }
        return this.speedDialSysKey;
    }

    /**
     * Gets the value of the speedDialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedDialNumber() {
        return speedDialNumber;
    }

    /**
     * Sets the value of the speedDialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedDialNumber(String value) {
        this.speedDialNumber = value;
    }

    /**
     * Gets the value of the speedDialType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSPEEDDIAL }
     *     
     */
    public OLILUSPEEDDIAL getSpeedDialType() {
        return speedDialType;
    }

    /**
     * Sets the value of the speedDialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSPEEDDIAL }
     *     
     */
    public void setSpeedDialType(OLILUSPEEDDIAL value) {
        this.speedDialType = value;
    }

    /**
     * Gets the value of the orgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * Sets the value of the orgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

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
     * Gets the value of the ownerPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOwnerPartyID() {
        return ownerPartyID;
    }

    /**
     * Sets the value of the ownerPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOwnerPartyID(Object value) {
        this.ownerPartyID = value;
    }

    /**
     * Gets the value of the ownerPhoneID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOwnerPhoneID() {
        return ownerPhoneID;
    }

    /**
     * Sets the value of the ownerPhoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOwnerPhoneID(Object value) {
        this.ownerPhoneID = value;
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