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
 * <p>Java class for TravelLocationRating_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelLocationRating_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TravelLocationRatingKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TravelLocationRatingSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TravelCountry" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TravelLocation" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TravelRiskRating" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TravelRiskRatingName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LocationRestrictionInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TravelLocationRating_Type", propOrder = {
    "travelLocationRatingKey",
    "travelLocationRatingSysKey",
    "travelCountry",
    "travelLocation",
    "travelRiskRating",
    "travelRiskRatingName",
    "description",
    "locationRestrictionInfo",
    "attachment",
    "oLifEExtension"
})
public class TravelLocationRatingType {

    @XmlElement(name = "TravelLocationRatingKey")
    protected PERSISTKEY travelLocationRatingKey;
    @XmlElement(name = "TravelLocationRatingSysKey")
    protected List<SYSKEY> travelLocationRatingSysKey;
    @XmlElement(name = "TravelCountry")
    protected OLILUNATION travelCountry;
    @XmlElement(name = "TravelLocation")
    protected String travelLocation;
    @XmlElement(name = "TravelRiskRating")
    protected OLILUTRAVELRISK travelRiskRating;
    @XmlElement(name = "TravelRiskRatingName")
    protected String travelRiskRatingName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LocationRestrictionInfo")
    protected List<LocationRestrictionInfoType> locationRestrictionInfo;
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
     * Gets the value of the travelLocationRatingKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getTravelLocationRatingKey() {
        return travelLocationRatingKey;
    }

    /**
     * Sets the value of the travelLocationRatingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setTravelLocationRatingKey(PERSISTKEY value) {
        this.travelLocationRatingKey = value;
    }

    /**
     * Gets the value of the travelLocationRatingSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelLocationRatingSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelLocationRatingSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getTravelLocationRatingSysKey() {
        if (travelLocationRatingSysKey == null) {
            travelLocationRatingSysKey = new ArrayList<SYSKEY>();
        }
        return this.travelLocationRatingSysKey;
    }

    /**
     * Gets the value of the travelCountry property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNATION }
     *     
     */
    public OLILUNATION getTravelCountry() {
        return travelCountry;
    }

    /**
     * Sets the value of the travelCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNATION }
     *     
     */
    public void setTravelCountry(OLILUNATION value) {
        this.travelCountry = value;
    }

    /**
     * Gets the value of the travelLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelLocation() {
        return travelLocation;
    }

    /**
     * Sets the value of the travelLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelLocation(String value) {
        this.travelLocation = value;
    }

    /**
     * Gets the value of the travelRiskRating property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTRAVELRISK }
     *     
     */
    public OLILUTRAVELRISK getTravelRiskRating() {
        return travelRiskRating;
    }

    /**
     * Sets the value of the travelRiskRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTRAVELRISK }
     *     
     */
    public void setTravelRiskRating(OLILUTRAVELRISK value) {
        this.travelRiskRating = value;
    }

    /**
     * Gets the value of the travelRiskRatingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelRiskRatingName() {
        return travelRiskRatingName;
    }

    /**
     * Sets the value of the travelRiskRatingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelRiskRatingName(String value) {
        this.travelRiskRatingName = value;
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
     * Gets the value of the locationRestrictionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationRestrictionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationRestrictionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationRestrictionInfoType }
     * 
     * 
     */
    public List<LocationRestrictionInfoType> getLocationRestrictionInfo() {
        if (locationRestrictionInfo == null) {
            locationRestrictionInfo = new ArrayList<LocationRestrictionInfoType>();
        }
        return this.locationRestrictionInfo;
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