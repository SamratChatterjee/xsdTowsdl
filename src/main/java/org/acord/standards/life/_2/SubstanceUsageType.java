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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubstanceUsage_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstanceUsage_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceUsageKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceUsageSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Applicability" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TobaccoType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceComments" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceStartDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceStartPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceEndDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceEndPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceLastUseDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceLastUsePartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceLastUseDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceMode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceModeDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TreatmentInd" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}LastTreatmentDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}LastTreatmentPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MemberOfSupportGroupInd" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SupportGroupStartDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SupportGroupStartPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SupportGroupEndDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SupportGroupEndPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SupportGroupName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AdvisedToLimitUseInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstanceDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DurationUnitMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RiskNotification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="PhysicianPartyID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="FacilityPartyID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstanceUsage_Type", propOrder = {
    "substanceUsageKey",
    "substanceUsageSysKey",
    "applicability",
    "substanceType",
    "tobaccoType",
    "substanceDesc",
    "substanceComments",
    "substanceStartDate",
    "substanceStartPartialDate",
    "substanceEndDate",
    "substanceEndPartialDate",
    "substanceLastUseDate",
    "substanceLastUsePartialDate",
    "substanceLastUseDesc",
    "substanceMode",
    "substanceModeDesc",
    "substanceAmt",
    "treatmentInd",
    "lastTreatmentDate",
    "lastTreatmentPartialDate",
    "memberOfSupportGroupInd",
    "supportGroupStartDate",
    "supportGroupStartPartialDate",
    "supportGroupEndDate",
    "supportGroupEndPartialDate",
    "supportGroupName",
    "advisedToLimitUseInd",
    "substanceDuration",
    "durationUnitMeasure",
    "riskNotification",
    "oLifEExtension"
})
public class SubstanceUsageType {

    @XmlElement(name = "SubstanceUsageKey")
    protected PERSISTKEY substanceUsageKey;
    @XmlElement(name = "SubstanceUsageSysKey")
    protected List<SYSKEY> substanceUsageSysKey;
    @XmlElement(name = "Applicability")
    protected OLILUAPPLICABILITY applicability;
    @XmlElement(name = "SubstanceType")
    protected OLILUSUBSTANCETYPE substanceType;
    @XmlElement(name = "TobaccoType")
    protected OLILUTOBACCOTYPE tobaccoType;
    @XmlElement(name = "SubstanceDesc")
    protected String substanceDesc;
    @XmlElement(name = "SubstanceComments")
    protected String substanceComments;
    @XmlElement(name = "SubstanceStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar substanceStartDate;
    @XmlElement(name = "SubstanceStartPartialDate")
    protected String substanceStartPartialDate;
    @XmlElement(name = "SubstanceEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar substanceEndDate;
    @XmlElement(name = "SubstanceEndPartialDate")
    protected String substanceEndPartialDate;
    @XmlElement(name = "SubstanceLastUseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar substanceLastUseDate;
    @XmlElement(name = "SubstanceLastUsePartialDate")
    protected String substanceLastUsePartialDate;
    @XmlElement(name = "SubstanceLastUseDesc")
    protected String substanceLastUseDesc;
    @XmlElement(name = "SubstanceMode")
    protected OLILUPARTFREQ substanceMode;
    @XmlElement(name = "SubstanceModeDesc")
    protected String substanceModeDesc;
    @XmlElement(name = "SubstanceAmt")
    protected BigInteger substanceAmt;
    @XmlElement(name = "TreatmentInd")
    protected OLILUBOOLEAN treatmentInd;
    @XmlElement(name = "LastTreatmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastTreatmentDate;
    @XmlElement(name = "LastTreatmentPartialDate")
    protected String lastTreatmentPartialDate;
    @XmlElement(name = "MemberOfSupportGroupInd")
    protected OLILUBOOLEAN memberOfSupportGroupInd;
    @XmlElement(name = "SupportGroupStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar supportGroupStartDate;
    @XmlElement(name = "SupportGroupStartPartialDate")
    protected String supportGroupStartPartialDate;
    @XmlElement(name = "SupportGroupEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar supportGroupEndDate;
    @XmlElement(name = "SupportGroupEndPartialDate")
    protected String supportGroupEndPartialDate;
    @XmlElement(name = "SupportGroupName")
    protected String supportGroupName;
    @XmlElement(name = "AdvisedToLimitUseInd")
    protected OLILUBOOLEAN advisedToLimitUseInd;
    @XmlElement(name = "SubstanceDuration")
    protected BigInteger substanceDuration;
    @XmlElement(name = "DurationUnitMeasure")
    protected OLILUMEASUNITS durationUnitMeasure;
    @XmlElement(name = "RiskNotification")
    protected List<RiskNotificationType> riskNotification;
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
    @XmlAttribute(name = "PhysicianPartyID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object physicianPartyID;
    @XmlAttribute(name = "FacilityPartyID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object facilityPartyID;

    /**
     * Gets the value of the substanceUsageKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getSubstanceUsageKey() {
        return substanceUsageKey;
    }

    /**
     * Sets the value of the substanceUsageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setSubstanceUsageKey(PERSISTKEY value) {
        this.substanceUsageKey = value;
    }

    /**
     * Gets the value of the substanceUsageSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substanceUsageSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstanceUsageSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getSubstanceUsageSysKey() {
        if (substanceUsageSysKey == null) {
            substanceUsageSysKey = new ArrayList<SYSKEY>();
        }
        return this.substanceUsageSysKey;
    }

    /**
     * Gets the value of the applicability property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUAPPLICABILITY }
     *     
     */
    public OLILUAPPLICABILITY getApplicability() {
        return applicability;
    }

    /**
     * Sets the value of the applicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUAPPLICABILITY }
     *     
     */
    public void setApplicability(OLILUAPPLICABILITY value) {
        this.applicability = value;
    }

    /**
     * Gets the value of the substanceType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSUBSTANCETYPE }
     *     
     */
    public OLILUSUBSTANCETYPE getSubstanceType() {
        return substanceType;
    }

    /**
     * Sets the value of the substanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSUBSTANCETYPE }
     *     
     */
    public void setSubstanceType(OLILUSUBSTANCETYPE value) {
        this.substanceType = value;
    }

    /**
     * Gets the value of the tobaccoType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTOBACCOTYPE }
     *     
     */
    public OLILUTOBACCOTYPE getTobaccoType() {
        return tobaccoType;
    }

    /**
     * Sets the value of the tobaccoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTOBACCOTYPE }
     *     
     */
    public void setTobaccoType(OLILUTOBACCOTYPE value) {
        this.tobaccoType = value;
    }

    /**
     * Gets the value of the substanceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceDesc() {
        return substanceDesc;
    }

    /**
     * Sets the value of the substanceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceDesc(String value) {
        this.substanceDesc = value;
    }

    /**
     * Gets the value of the substanceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceComments() {
        return substanceComments;
    }

    /**
     * Sets the value of the substanceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceComments(String value) {
        this.substanceComments = value;
    }

    /**
     * Gets the value of the substanceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubstanceStartDate() {
        return substanceStartDate;
    }

    /**
     * Sets the value of the substanceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubstanceStartDate(XMLGregorianCalendar value) {
        this.substanceStartDate = value;
    }

    /**
     * Gets the value of the substanceStartPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceStartPartialDate() {
        return substanceStartPartialDate;
    }

    /**
     * Sets the value of the substanceStartPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceStartPartialDate(String value) {
        this.substanceStartPartialDate = value;
    }

    /**
     * Gets the value of the substanceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubstanceEndDate() {
        return substanceEndDate;
    }

    /**
     * Sets the value of the substanceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubstanceEndDate(XMLGregorianCalendar value) {
        this.substanceEndDate = value;
    }

    /**
     * Gets the value of the substanceEndPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceEndPartialDate() {
        return substanceEndPartialDate;
    }

    /**
     * Sets the value of the substanceEndPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceEndPartialDate(String value) {
        this.substanceEndPartialDate = value;
    }

    /**
     * Gets the value of the substanceLastUseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubstanceLastUseDate() {
        return substanceLastUseDate;
    }

    /**
     * Sets the value of the substanceLastUseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubstanceLastUseDate(XMLGregorianCalendar value) {
        this.substanceLastUseDate = value;
    }

    /**
     * Gets the value of the substanceLastUsePartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceLastUsePartialDate() {
        return substanceLastUsePartialDate;
    }

    /**
     * Sets the value of the substanceLastUsePartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceLastUsePartialDate(String value) {
        this.substanceLastUsePartialDate = value;
    }

    /**
     * Gets the value of the substanceLastUseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceLastUseDesc() {
        return substanceLastUseDesc;
    }

    /**
     * Sets the value of the substanceLastUseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceLastUseDesc(String value) {
        this.substanceLastUseDesc = value;
    }

    /**
     * Gets the value of the substanceMode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPARTFREQ }
     *     
     */
    public OLILUPARTFREQ getSubstanceMode() {
        return substanceMode;
    }

    /**
     * Sets the value of the substanceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPARTFREQ }
     *     
     */
    public void setSubstanceMode(OLILUPARTFREQ value) {
        this.substanceMode = value;
    }

    /**
     * Gets the value of the substanceModeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceModeDesc() {
        return substanceModeDesc;
    }

    /**
     * Sets the value of the substanceModeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceModeDesc(String value) {
        this.substanceModeDesc = value;
    }

    /**
     * Gets the value of the substanceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubstanceAmt() {
        return substanceAmt;
    }

    /**
     * Sets the value of the substanceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubstanceAmt(BigInteger value) {
        this.substanceAmt = value;
    }

    /**
     * Gets the value of the treatmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getTreatmentInd() {
        return treatmentInd;
    }

    /**
     * Sets the value of the treatmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setTreatmentInd(OLILUBOOLEAN value) {
        this.treatmentInd = value;
    }

    /**
     * Gets the value of the lastTreatmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTreatmentDate() {
        return lastTreatmentDate;
    }

    /**
     * Sets the value of the lastTreatmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTreatmentDate(XMLGregorianCalendar value) {
        this.lastTreatmentDate = value;
    }

    /**
     * Gets the value of the lastTreatmentPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTreatmentPartialDate() {
        return lastTreatmentPartialDate;
    }

    /**
     * Sets the value of the lastTreatmentPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTreatmentPartialDate(String value) {
        this.lastTreatmentPartialDate = value;
    }

    /**
     * Gets the value of the memberOfSupportGroupInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getMemberOfSupportGroupInd() {
        return memberOfSupportGroupInd;
    }

    /**
     * Sets the value of the memberOfSupportGroupInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setMemberOfSupportGroupInd(OLILUBOOLEAN value) {
        this.memberOfSupportGroupInd = value;
    }

    /**
     * Gets the value of the supportGroupStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSupportGroupStartDate() {
        return supportGroupStartDate;
    }

    /**
     * Sets the value of the supportGroupStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSupportGroupStartDate(XMLGregorianCalendar value) {
        this.supportGroupStartDate = value;
    }

    /**
     * Gets the value of the supportGroupStartPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportGroupStartPartialDate() {
        return supportGroupStartPartialDate;
    }

    /**
     * Sets the value of the supportGroupStartPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportGroupStartPartialDate(String value) {
        this.supportGroupStartPartialDate = value;
    }

    /**
     * Gets the value of the supportGroupEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSupportGroupEndDate() {
        return supportGroupEndDate;
    }

    /**
     * Sets the value of the supportGroupEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSupportGroupEndDate(XMLGregorianCalendar value) {
        this.supportGroupEndDate = value;
    }

    /**
     * Gets the value of the supportGroupEndPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportGroupEndPartialDate() {
        return supportGroupEndPartialDate;
    }

    /**
     * Sets the value of the supportGroupEndPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportGroupEndPartialDate(String value) {
        this.supportGroupEndPartialDate = value;
    }

    /**
     * Gets the value of the supportGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportGroupName() {
        return supportGroupName;
    }

    /**
     * Sets the value of the supportGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportGroupName(String value) {
        this.supportGroupName = value;
    }

    /**
     * Gets the value of the advisedToLimitUseInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getAdvisedToLimitUseInd() {
        return advisedToLimitUseInd;
    }

    /**
     * Sets the value of the advisedToLimitUseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setAdvisedToLimitUseInd(OLILUBOOLEAN value) {
        this.advisedToLimitUseInd = value;
    }

    /**
     * Gets the value of the substanceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubstanceDuration() {
        return substanceDuration;
    }

    /**
     * Sets the value of the substanceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubstanceDuration(BigInteger value) {
        this.substanceDuration = value;
    }

    /**
     * Gets the value of the durationUnitMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getDurationUnitMeasure() {
        return durationUnitMeasure;
    }

    /**
     * Sets the value of the durationUnitMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setDurationUnitMeasure(OLILUMEASUNITS value) {
        this.durationUnitMeasure = value;
    }

    /**
     * Gets the value of the riskNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskNotificationType }
     * 
     * 
     */
    public List<RiskNotificationType> getRiskNotification() {
        if (riskNotification == null) {
            riskNotification = new ArrayList<RiskNotificationType>();
        }
        return this.riskNotification;
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

    /**
     * Gets the value of the physicianPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPhysicianPartyID() {
        return physicianPartyID;
    }

    /**
     * Sets the value of the physicianPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPhysicianPartyID(Object value) {
        this.physicianPartyID = value;
    }

    /**
     * Gets the value of the facilityPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFacilityPartyID() {
        return facilityPartyID;
    }

    /**
     * Sets the value of the facilityPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFacilityPartyID(Object value) {
        this.facilityPartyID = value;
    }

}
