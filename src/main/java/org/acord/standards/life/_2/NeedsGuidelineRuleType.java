//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

import java.math.BigDecimal;
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
 * <p>Java class for NeedsGuidelineRule_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeedsGuidelineRule_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedsGuidelineRuleKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedsGuidelineRuleSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}GuidelineDescription" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedsRuleType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedsRuleContextAmtType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedsRuleAmtQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InfoSourceTC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InfoSourceDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinFactor" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxFactor" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinDurationQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxDurationQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}JurisdictionApproval" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "NeedsGuidelineRule_Type", propOrder = {
    "needsGuidelineRuleKey",
    "needsGuidelineRuleSysKey",
    "guidelineDescription",
    "needsRuleType",
    "needsRuleContextAmtType",
    "needsRuleAmtQualifier",
    "infoSourceTC",
    "infoSourceDesc",
    "minAge",
    "maxAge",
    "minAmt",
    "maxAmt",
    "minPct",
    "maxPct",
    "minFactor",
    "maxFactor",
    "minDuration",
    "minDurationQualifier",
    "maxDuration",
    "maxDurationQualifier",
    "jurisdictionApproval",
    "attachment",
    "oLifEExtension"
})
public class NeedsGuidelineRuleType {

    @XmlElement(name = "NeedsGuidelineRuleKey")
    protected PERSISTKEY needsGuidelineRuleKey;
    @XmlElement(name = "NeedsGuidelineRuleSysKey")
    protected List<SYSKEY> needsGuidelineRuleSysKey;
    @XmlElement(name = "GuidelineDescription")
    protected String guidelineDescription;
    @XmlElement(name = "NeedsRuleType")
    protected OLILUNEEDSRULE needsRuleType;
    @XmlElement(name = "NeedsRuleContextAmtType")
    protected OLILUNEEDSRULECONTEXTAMT needsRuleContextAmtType;
    @XmlElement(name = "NeedsRuleAmtQualifier")
    protected OLILUNEEDSRULEAMTQUAL needsRuleAmtQualifier;
    @XmlElement(name = "InfoSourceTC")
    protected OLILUINFOSRC infoSourceTC;
    @XmlElement(name = "InfoSourceDesc")
    protected String infoSourceDesc;
    @XmlElement(name = "MinAge")
    protected BigInteger minAge;
    @XmlElement(name = "MaxAge")
    protected BigInteger maxAge;
    @XmlElement(name = "MinAmt")
    protected BigDecimal minAmt;
    @XmlElement(name = "MaxAmt")
    protected BigDecimal maxAmt;
    @XmlElement(name = "MinPct")
    protected Double minPct;
    @XmlElement(name = "MaxPct")
    protected Double maxPct;
    @XmlElement(name = "MinFactor")
    protected Double minFactor;
    @XmlElement(name = "MaxFactor")
    protected Double maxFactor;
    @XmlElement(name = "MinDuration")
    protected Double minDuration;
    @XmlElement(name = "MinDurationQualifier")
    protected OLILUMEASUNITS minDurationQualifier;
    @XmlElement(name = "MaxDuration")
    protected Double maxDuration;
    @XmlElement(name = "MaxDurationQualifier")
    protected OLILUMEASUNITS maxDurationQualifier;
    @XmlElement(name = "JurisdictionApproval")
    protected List<JurisdictionApprovalType> jurisdictionApproval;
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
     * Gets the value of the needsGuidelineRuleKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getNeedsGuidelineRuleKey() {
        return needsGuidelineRuleKey;
    }

    /**
     * Sets the value of the needsGuidelineRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setNeedsGuidelineRuleKey(PERSISTKEY value) {
        this.needsGuidelineRuleKey = value;
    }

    /**
     * Gets the value of the needsGuidelineRuleSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the needsGuidelineRuleSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeedsGuidelineRuleSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getNeedsGuidelineRuleSysKey() {
        if (needsGuidelineRuleSysKey == null) {
            needsGuidelineRuleSysKey = new ArrayList<SYSKEY>();
        }
        return this.needsGuidelineRuleSysKey;
    }

    /**
     * Gets the value of the guidelineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidelineDescription() {
        return guidelineDescription;
    }

    /**
     * Sets the value of the guidelineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidelineDescription(String value) {
        this.guidelineDescription = value;
    }

    /**
     * Gets the value of the needsRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNEEDSRULE }
     *     
     */
    public OLILUNEEDSRULE getNeedsRuleType() {
        return needsRuleType;
    }

    /**
     * Sets the value of the needsRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNEEDSRULE }
     *     
     */
    public void setNeedsRuleType(OLILUNEEDSRULE value) {
        this.needsRuleType = value;
    }

    /**
     * Gets the value of the needsRuleContextAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNEEDSRULECONTEXTAMT }
     *     
     */
    public OLILUNEEDSRULECONTEXTAMT getNeedsRuleContextAmtType() {
        return needsRuleContextAmtType;
    }

    /**
     * Sets the value of the needsRuleContextAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNEEDSRULECONTEXTAMT }
     *     
     */
    public void setNeedsRuleContextAmtType(OLILUNEEDSRULECONTEXTAMT value) {
        this.needsRuleContextAmtType = value;
    }

    /**
     * Gets the value of the needsRuleAmtQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNEEDSRULEAMTQUAL }
     *     
     */
    public OLILUNEEDSRULEAMTQUAL getNeedsRuleAmtQualifier() {
        return needsRuleAmtQualifier;
    }

    /**
     * Sets the value of the needsRuleAmtQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNEEDSRULEAMTQUAL }
     *     
     */
    public void setNeedsRuleAmtQualifier(OLILUNEEDSRULEAMTQUAL value) {
        this.needsRuleAmtQualifier = value;
    }

    /**
     * Gets the value of the infoSourceTC property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUINFOSRC }
     *     
     */
    public OLILUINFOSRC getInfoSourceTC() {
        return infoSourceTC;
    }

    /**
     * Sets the value of the infoSourceTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUINFOSRC }
     *     
     */
    public void setInfoSourceTC(OLILUINFOSRC value) {
        this.infoSourceTC = value;
    }

    /**
     * Gets the value of the infoSourceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSourceDesc() {
        return infoSourceDesc;
    }

    /**
     * Sets the value of the infoSourceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSourceDesc(String value) {
        this.infoSourceDesc = value;
    }

    /**
     * Gets the value of the minAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinAge() {
        return minAge;
    }

    /**
     * Sets the value of the minAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinAge(BigInteger value) {
        this.minAge = value;
    }

    /**
     * Gets the value of the maxAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the value of the maxAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAge(BigInteger value) {
        this.maxAge = value;
    }

    /**
     * Gets the value of the minAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmt() {
        return minAmt;
    }

    /**
     * Sets the value of the minAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmt(BigDecimal value) {
        this.minAmt = value;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
    }

    /**
     * Gets the value of the minPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinPct() {
        return minPct;
    }

    /**
     * Sets the value of the minPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinPct(Double value) {
        this.minPct = value;
    }

    /**
     * Gets the value of the maxPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxPct() {
        return maxPct;
    }

    /**
     * Sets the value of the maxPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxPct(Double value) {
        this.maxPct = value;
    }

    /**
     * Gets the value of the minFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinFactor() {
        return minFactor;
    }

    /**
     * Sets the value of the minFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinFactor(Double value) {
        this.minFactor = value;
    }

    /**
     * Gets the value of the maxFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxFactor() {
        return maxFactor;
    }

    /**
     * Sets the value of the maxFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxFactor(Double value) {
        this.maxFactor = value;
    }

    /**
     * Gets the value of the minDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDuration() {
        return minDuration;
    }

    /**
     * Sets the value of the minDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDuration(Double value) {
        this.minDuration = value;
    }

    /**
     * Gets the value of the minDurationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getMinDurationQualifier() {
        return minDurationQualifier;
    }

    /**
     * Sets the value of the minDurationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setMinDurationQualifier(OLILUMEASUNITS value) {
        this.minDurationQualifier = value;
    }

    /**
     * Gets the value of the maxDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets the value of the maxDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDuration(Double value) {
        this.maxDuration = value;
    }

    /**
     * Gets the value of the maxDurationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getMaxDurationQualifier() {
        return maxDurationQualifier;
    }

    /**
     * Sets the value of the maxDurationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setMaxDurationQualifier(OLILUMEASUNITS value) {
        this.maxDurationQualifier = value;
    }

    /**
     * Gets the value of the jurisdictionApproval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdictionApproval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdictionApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JurisdictionApprovalType }
     * 
     * 
     */
    public List<JurisdictionApprovalType> getJurisdictionApproval() {
        if (jurisdictionApproval == null) {
            jurisdictionApproval = new ArrayList<JurisdictionApprovalType>();
        }
        return this.jurisdictionApproval;
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
