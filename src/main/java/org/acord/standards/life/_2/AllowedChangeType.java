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
 * <p>Java class for AllowedChange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowedChange_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedChangeKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedChangeSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProductCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinChangeAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxChangeAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedChangeDirection" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedChangeType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RoundingPrecision" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RoundingRule" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedPercent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedChangeMode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedTimingBasis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AnnualIndexTypeCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FeatureOptConflict" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FeatureOptRequisite" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TargetAgeRestriction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}JurisdictionApproval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DateCollection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RequisiteObjectInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ConflictObjectInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AllowedChange_Type", propOrder = {
    "allowedChangeKey",
    "allowedChangeSysKey",
    "productCode",
    "minChangeAmt",
    "maxChangeAmt",
    "minPct",
    "maxPct",
    "allowedChangeDirection",
    "allowedChangeType",
    "roundingPrecision",
    "roundingRule",
    "allowedPercent",
    "allowedChangeMode",
    "allowedTimingBasis",
    "annualIndexTypeCC",
    "featureOptConflict",
    "featureOptRequisite",
    "targetAgeRestriction",
    "jurisdictionApproval",
    "dateCollection",
    "allowedRelationship",
    "qualifiedPlanEntity",
    "requisiteObjectInfo",
    "conflictObjectInfo",
    "oLifEExtension"
})
public class AllowedChangeType {

    @XmlElement(name = "AllowedChangeKey")
    protected PERSISTKEY allowedChangeKey;
    @XmlElement(name = "AllowedChangeSysKey")
    protected List<SYSKEY> allowedChangeSysKey;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "MinChangeAmt")
    protected BigDecimal minChangeAmt;
    @XmlElement(name = "MaxChangeAmt")
    protected BigDecimal maxChangeAmt;
    @XmlElement(name = "MinPct")
    protected Double minPct;
    @XmlElement(name = "MaxPct")
    protected Double maxPct;
    @XmlElement(name = "AllowedChangeDirection")
    protected OLILUINCRDECR allowedChangeDirection;
    @XmlElement(name = "AllowedChangeType")
    protected OLILUALLOWCHANGETYPE allowedChangeType;
    @XmlElement(name = "RoundingPrecision")
    protected BigInteger roundingPrecision;
    @XmlElement(name = "RoundingRule")
    protected OLILUROUNDMETH roundingRule;
    @XmlElement(name = "AllowedPercent")
    protected List<AllowedPercentType> allowedPercent;
    @XmlElement(name = "AllowedChangeMode")
    protected List<AllowedChangeModeType> allowedChangeMode;
    @XmlElement(name = "AllowedTimingBasis")
    protected List<AllowedTimingBasisType> allowedTimingBasis;
    @XmlElement(name = "AnnualIndexTypeCC")
    protected AnnualIndexTypeCCType annualIndexTypeCC;
    @XmlElement(name = "FeatureOptConflict")
    protected List<FeatureOptConflictType> featureOptConflict;
    @XmlElement(name = "FeatureOptRequisite")
    protected List<FeatureOptRequisiteType> featureOptRequisite;
    @XmlElement(name = "TargetAgeRestriction")
    protected List<TargetAgeRestrictionType> targetAgeRestriction;
    @XmlElement(name = "JurisdictionApproval")
    protected List<JurisdictionApprovalType> jurisdictionApproval;
    @XmlElement(name = "DateCollection")
    protected List<DateCollectionType> dateCollection;
    @XmlElement(name = "AllowedRelationship")
    protected List<AllowedRelationshipType> allowedRelationship;
    @XmlElement(name = "QualifiedPlanEntity")
    protected List<QualifiedPlanEntityType> qualifiedPlanEntity;
    @XmlElement(name = "RequisiteObjectInfo")
    protected List<RequisiteObjectInfoType> requisiteObjectInfo;
    @XmlElement(name = "ConflictObjectInfo")
    protected List<ConflictObjectInfoType> conflictObjectInfo;
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
     * Gets the value of the allowedChangeKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getAllowedChangeKey() {
        return allowedChangeKey;
    }

    /**
     * Sets the value of the allowedChangeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setAllowedChangeKey(PERSISTKEY value) {
        this.allowedChangeKey = value;
    }

    /**
     * Gets the value of the allowedChangeSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedChangeSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedChangeSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getAllowedChangeSysKey() {
        if (allowedChangeSysKey == null) {
            allowedChangeSysKey = new ArrayList<SYSKEY>();
        }
        return this.allowedChangeSysKey;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the minChangeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinChangeAmt() {
        return minChangeAmt;
    }

    /**
     * Sets the value of the minChangeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinChangeAmt(BigDecimal value) {
        this.minChangeAmt = value;
    }

    /**
     * Gets the value of the maxChangeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxChangeAmt() {
        return maxChangeAmt;
    }

    /**
     * Sets the value of the maxChangeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxChangeAmt(BigDecimal value) {
        this.maxChangeAmt = value;
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
     * Gets the value of the allowedChangeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUINCRDECR }
     *     
     */
    public OLILUINCRDECR getAllowedChangeDirection() {
        return allowedChangeDirection;
    }

    /**
     * Sets the value of the allowedChangeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUINCRDECR }
     *     
     */
    public void setAllowedChangeDirection(OLILUINCRDECR value) {
        this.allowedChangeDirection = value;
    }

    /**
     * Gets the value of the allowedChangeType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUALLOWCHANGETYPE }
     *     
     */
    public OLILUALLOWCHANGETYPE getAllowedChangeType() {
        return allowedChangeType;
    }

    /**
     * Sets the value of the allowedChangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUALLOWCHANGETYPE }
     *     
     */
    public void setAllowedChangeType(OLILUALLOWCHANGETYPE value) {
        this.allowedChangeType = value;
    }

    /**
     * Gets the value of the roundingPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoundingPrecision() {
        return roundingPrecision;
    }

    /**
     * Sets the value of the roundingPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoundingPrecision(BigInteger value) {
        this.roundingPrecision = value;
    }

    /**
     * Gets the value of the roundingRule property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUROUNDMETH }
     *     
     */
    public OLILUROUNDMETH getRoundingRule() {
        return roundingRule;
    }

    /**
     * Sets the value of the roundingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUROUNDMETH }
     *     
     */
    public void setRoundingRule(OLILUROUNDMETH value) {
        this.roundingRule = value;
    }

    /**
     * Gets the value of the allowedPercent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedPercent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedPercent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedPercentType }
     * 
     * 
     */
    public List<AllowedPercentType> getAllowedPercent() {
        if (allowedPercent == null) {
            allowedPercent = new ArrayList<AllowedPercentType>();
        }
        return this.allowedPercent;
    }

    /**
     * Gets the value of the allowedChangeMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedChangeMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedChangeMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedChangeModeType }
     * 
     * 
     */
    public List<AllowedChangeModeType> getAllowedChangeMode() {
        if (allowedChangeMode == null) {
            allowedChangeMode = new ArrayList<AllowedChangeModeType>();
        }
        return this.allowedChangeMode;
    }

    /**
     * Gets the value of the allowedTimingBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedTimingBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedTimingBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedTimingBasisType }
     * 
     * 
     */
    public List<AllowedTimingBasisType> getAllowedTimingBasis() {
        if (allowedTimingBasis == null) {
            allowedTimingBasis = new ArrayList<AllowedTimingBasisType>();
        }
        return this.allowedTimingBasis;
    }

    /**
     * Gets the value of the annualIndexTypeCC property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualIndexTypeCCType }
     *     
     */
    public AnnualIndexTypeCCType getAnnualIndexTypeCC() {
        return annualIndexTypeCC;
    }

    /**
     * Sets the value of the annualIndexTypeCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualIndexTypeCCType }
     *     
     */
    public void setAnnualIndexTypeCC(AnnualIndexTypeCCType value) {
        this.annualIndexTypeCC = value;
    }

    /**
     * Gets the value of the featureOptConflict property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureOptConflict property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureOptConflict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureOptConflictType }
     * 
     * 
     */
    public List<FeatureOptConflictType> getFeatureOptConflict() {
        if (featureOptConflict == null) {
            featureOptConflict = new ArrayList<FeatureOptConflictType>();
        }
        return this.featureOptConflict;
    }

    /**
     * Gets the value of the featureOptRequisite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureOptRequisite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureOptRequisite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureOptRequisiteType }
     * 
     * 
     */
    public List<FeatureOptRequisiteType> getFeatureOptRequisite() {
        if (featureOptRequisite == null) {
            featureOptRequisite = new ArrayList<FeatureOptRequisiteType>();
        }
        return this.featureOptRequisite;
    }

    /**
     * Gets the value of the targetAgeRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetAgeRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetAgeRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetAgeRestrictionType }
     * 
     * 
     */
    public List<TargetAgeRestrictionType> getTargetAgeRestriction() {
        if (targetAgeRestriction == null) {
            targetAgeRestriction = new ArrayList<TargetAgeRestrictionType>();
        }
        return this.targetAgeRestriction;
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
     * Gets the value of the dateCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateCollectionType }
     * 
     * 
     */
    public List<DateCollectionType> getDateCollection() {
        if (dateCollection == null) {
            dateCollection = new ArrayList<DateCollectionType>();
        }
        return this.dateCollection;
    }

    /**
     * Gets the value of the allowedRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedRelationshipType }
     * 
     * 
     */
    public List<AllowedRelationshipType> getAllowedRelationship() {
        if (allowedRelationship == null) {
            allowedRelationship = new ArrayList<AllowedRelationshipType>();
        }
        return this.allowedRelationship;
    }

    /**
     * Gets the value of the qualifiedPlanEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedPlanEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedPlanEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPlanEntityType }
     * 
     * 
     */
    public List<QualifiedPlanEntityType> getQualifiedPlanEntity() {
        if (qualifiedPlanEntity == null) {
            qualifiedPlanEntity = new ArrayList<QualifiedPlanEntityType>();
        }
        return this.qualifiedPlanEntity;
    }

    /**
     * Gets the value of the requisiteObjectInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requisiteObjectInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequisiteObjectInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequisiteObjectInfoType }
     * 
     * 
     */
    public List<RequisiteObjectInfoType> getRequisiteObjectInfo() {
        if (requisiteObjectInfo == null) {
            requisiteObjectInfo = new ArrayList<RequisiteObjectInfoType>();
        }
        return this.requisiteObjectInfo;
    }

    /**
     * Gets the value of the conflictObjectInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conflictObjectInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConflictObjectInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConflictObjectInfoType }
     * 
     * 
     */
    public List<ConflictObjectInfoType> getConflictObjectInfo() {
        if (conflictObjectInfo == null) {
            conflictObjectInfo = new ArrayList<ConflictObjectInfoType>();
        }
        return this.conflictObjectInfo;
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
