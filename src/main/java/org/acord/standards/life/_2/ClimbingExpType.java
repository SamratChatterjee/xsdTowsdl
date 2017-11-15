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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ClimbingExp_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClimbingExp_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ClimbingExpKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ClimbingExpSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TypeOfEquipment" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LocationOfLastClimb" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AvgClimbDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AvgClimbHeight" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AvgDegreeOfDifficulty" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxClimbHeightToDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}GuideUsageInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ClimbSoloInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ClimbSoloDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AvgPartySize" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BreathingApparatusInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AboveCriticalHeightInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AboveCriticalHeightDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiffInFutureInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiffInFutureDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}GeographicRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Terrain" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Season" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ClimbingExp_Type", propOrder = {
    "climbingExpKey",
    "climbingExpSysKey",
    "typeOfEquipment",
    "locationOfLastClimb",
    "avgClimbDuration",
    "avgClimbHeight",
    "avgDegreeOfDifficulty",
    "maxClimbHeightToDate",
    "guideUsageInd",
    "climbSoloInd",
    "climbSoloDesc",
    "avgPartySize",
    "breathingApparatusInd",
    "aboveCriticalHeightInd",
    "aboveCriticalHeightDesc",
    "diffInFutureInd",
    "diffInFutureDesc",
    "geographicRegion",
    "terrain",
    "season",
    "oLifEExtension"
})
public class ClimbingExpType {

    @XmlElement(name = "ClimbingExpKey")
    protected PERSISTKEY climbingExpKey;
    @XmlElement(name = "ClimbingExpSysKey")
    protected List<SYSKEY> climbingExpSysKey;
    @XmlElement(name = "TypeOfEquipment")
    protected String typeOfEquipment;
    @XmlElement(name = "LocationOfLastClimb")
    protected String locationOfLastClimb;
    @XmlElement(name = "AvgClimbDuration")
    protected BigInteger avgClimbDuration;
    @XmlElement(name = "AvgClimbHeight")
    protected BigInteger avgClimbHeight;
    @XmlElement(name = "AvgDegreeOfDifficulty")
    protected OLILUDEGDIFFICULTY avgDegreeOfDifficulty;
    @XmlElement(name = "MaxClimbHeightToDate")
    protected BigInteger maxClimbHeightToDate;
    @XmlElement(name = "GuideUsageInd")
    protected OLILUBOOLEAN guideUsageInd;
    @XmlElement(name = "ClimbSoloInd")
    protected OLILUBOOLEAN climbSoloInd;
    @XmlElement(name = "ClimbSoloDesc")
    protected String climbSoloDesc;
    @XmlElement(name = "AvgPartySize")
    protected BigInteger avgPartySize;
    @XmlElement(name = "BreathingApparatusInd")
    protected OLILUBOOLEAN breathingApparatusInd;
    @XmlElement(name = "AboveCriticalHeightInd")
    protected OLILUBOOLEAN aboveCriticalHeightInd;
    @XmlElement(name = "AboveCriticalHeightDesc")
    protected String aboveCriticalHeightDesc;
    @XmlElement(name = "DiffInFutureInd")
    protected OLILUBOOLEAN diffInFutureInd;
    @XmlElement(name = "DiffInFutureDesc")
    protected String diffInFutureDesc;
    @XmlElement(name = "GeographicRegion")
    protected List<GeographicRegionType> geographicRegion;
    @XmlElement(name = "Terrain")
    protected List<TerrainType> terrain;
    @XmlElement(name = "Season")
    protected List<SeasonType> season;
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
     * Gets the value of the climbingExpKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getClimbingExpKey() {
        return climbingExpKey;
    }

    /**
     * Sets the value of the climbingExpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setClimbingExpKey(PERSISTKEY value) {
        this.climbingExpKey = value;
    }

    /**
     * Gets the value of the climbingExpSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the climbingExpSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClimbingExpSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getClimbingExpSysKey() {
        if (climbingExpSysKey == null) {
            climbingExpSysKey = new ArrayList<SYSKEY>();
        }
        return this.climbingExpSysKey;
    }

    /**
     * Gets the value of the typeOfEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfEquipment() {
        return typeOfEquipment;
    }

    /**
     * Sets the value of the typeOfEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfEquipment(String value) {
        this.typeOfEquipment = value;
    }

    /**
     * Gets the value of the locationOfLastClimb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationOfLastClimb() {
        return locationOfLastClimb;
    }

    /**
     * Sets the value of the locationOfLastClimb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationOfLastClimb(String value) {
        this.locationOfLastClimb = value;
    }

    /**
     * Gets the value of the avgClimbDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvgClimbDuration() {
        return avgClimbDuration;
    }

    /**
     * Sets the value of the avgClimbDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvgClimbDuration(BigInteger value) {
        this.avgClimbDuration = value;
    }

    /**
     * Gets the value of the avgClimbHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvgClimbHeight() {
        return avgClimbHeight;
    }

    /**
     * Sets the value of the avgClimbHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvgClimbHeight(BigInteger value) {
        this.avgClimbHeight = value;
    }

    /**
     * Gets the value of the avgDegreeOfDifficulty property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDEGDIFFICULTY }
     *     
     */
    public OLILUDEGDIFFICULTY getAvgDegreeOfDifficulty() {
        return avgDegreeOfDifficulty;
    }

    /**
     * Sets the value of the avgDegreeOfDifficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDEGDIFFICULTY }
     *     
     */
    public void setAvgDegreeOfDifficulty(OLILUDEGDIFFICULTY value) {
        this.avgDegreeOfDifficulty = value;
    }

    /**
     * Gets the value of the maxClimbHeightToDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxClimbHeightToDate() {
        return maxClimbHeightToDate;
    }

    /**
     * Sets the value of the maxClimbHeightToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxClimbHeightToDate(BigInteger value) {
        this.maxClimbHeightToDate = value;
    }

    /**
     * Gets the value of the guideUsageInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getGuideUsageInd() {
        return guideUsageInd;
    }

    /**
     * Sets the value of the guideUsageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setGuideUsageInd(OLILUBOOLEAN value) {
        this.guideUsageInd = value;
    }

    /**
     * Gets the value of the climbSoloInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getClimbSoloInd() {
        return climbSoloInd;
    }

    /**
     * Sets the value of the climbSoloInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setClimbSoloInd(OLILUBOOLEAN value) {
        this.climbSoloInd = value;
    }

    /**
     * Gets the value of the climbSoloDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClimbSoloDesc() {
        return climbSoloDesc;
    }

    /**
     * Sets the value of the climbSoloDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClimbSoloDesc(String value) {
        this.climbSoloDesc = value;
    }

    /**
     * Gets the value of the avgPartySize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvgPartySize() {
        return avgPartySize;
    }

    /**
     * Sets the value of the avgPartySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvgPartySize(BigInteger value) {
        this.avgPartySize = value;
    }

    /**
     * Gets the value of the breathingApparatusInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getBreathingApparatusInd() {
        return breathingApparatusInd;
    }

    /**
     * Sets the value of the breathingApparatusInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setBreathingApparatusInd(OLILUBOOLEAN value) {
        this.breathingApparatusInd = value;
    }

    /**
     * Gets the value of the aboveCriticalHeightInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getAboveCriticalHeightInd() {
        return aboveCriticalHeightInd;
    }

    /**
     * Sets the value of the aboveCriticalHeightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setAboveCriticalHeightInd(OLILUBOOLEAN value) {
        this.aboveCriticalHeightInd = value;
    }

    /**
     * Gets the value of the aboveCriticalHeightDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboveCriticalHeightDesc() {
        return aboveCriticalHeightDesc;
    }

    /**
     * Sets the value of the aboveCriticalHeightDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboveCriticalHeightDesc(String value) {
        this.aboveCriticalHeightDesc = value;
    }

    /**
     * Gets the value of the diffInFutureInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getDiffInFutureInd() {
        return diffInFutureInd;
    }

    /**
     * Sets the value of the diffInFutureInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setDiffInFutureInd(OLILUBOOLEAN value) {
        this.diffInFutureInd = value;
    }

    /**
     * Gets the value of the diffInFutureDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffInFutureDesc() {
        return diffInFutureDesc;
    }

    /**
     * Sets the value of the diffInFutureDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffInFutureDesc(String value) {
        this.diffInFutureDesc = value;
    }

    /**
     * Gets the value of the geographicRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicRegionType }
     * 
     * 
     */
    public List<GeographicRegionType> getGeographicRegion() {
        if (geographicRegion == null) {
            geographicRegion = new ArrayList<GeographicRegionType>();
        }
        return this.geographicRegion;
    }

    /**
     * Gets the value of the terrain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terrain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerrain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerrainType }
     * 
     * 
     */
    public List<TerrainType> getTerrain() {
        if (terrain == null) {
            terrain = new ArrayList<TerrainType>();
        }
        return this.terrain;
    }

    /**
     * Gets the value of the season property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the season property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeasonType }
     * 
     * 
     */
    public List<SeasonType> getSeason() {
        if (season == null) {
            season = new ArrayList<SeasonType>();
        }
        return this.season;
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