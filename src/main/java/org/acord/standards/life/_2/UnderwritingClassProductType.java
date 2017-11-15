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
 * <p>Java class for UnderwritingClassProduct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderwritingClassProduct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UnderwritingClassProductKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UnderwritingClassProductSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UnderwritingClass" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UnderwritingSubClass" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Sequence" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SmokerStat" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TobaccoPremiumBasis" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IssueGender" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinIssueAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxIssueAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinIssueAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxIssueAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ClassName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AgeAdjustment" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxIssueUnits" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinIssueUnits" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxFlatExtra" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxTableRating" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxPctMonthlyGrossSalary" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxIssuePremAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinIssuePremAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxPermFlatExtra" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxTempFlatExtra" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UnderwritingClassProductXLat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AgeAmtProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempTableRatingCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermTableRatingCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}JurisdictionApproval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempTableRatingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermTableRatingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UndClassGuidelineInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "UnderwritingClassProduct_Type", propOrder = {
    "underwritingClassProductKey",
    "underwritingClassProductSysKey",
    "underwritingClass",
    "underwritingSubClass",
    "sequence",
    "description",
    "smokerStat",
    "tobaccoPremiumBasis",
    "issueGender",
    "minIssueAge",
    "maxIssueAge",
    "minIssueAmt",
    "maxIssueAmt",
    "className",
    "ageAdjustment",
    "maxIssueUnits",
    "minIssueUnits",
    "maxFlatExtra",
    "maxTableRating",
    "maxPctMonthlyGrossSalary",
    "minPct",
    "maxPct",
    "maxIssuePremAmt",
    "minIssuePremAmt",
    "maxPermFlatExtra",
    "maxTempFlatExtra",
    "underwritingClassProductXLat",
    "ageAmtProduct",
    "tempTableRatingCC",
    "permTableRatingCC",
    "jurisdictionApproval",
    "tempTableRatingInfo",
    "permTableRatingInfo",
    "undClassGuidelineInfo",
    "oLifEExtension"
})
public class UnderwritingClassProductType {

    @XmlElement(name = "UnderwritingClassProductKey")
    protected PERSISTKEY underwritingClassProductKey;
    @XmlElement(name = "UnderwritingClassProductSysKey")
    protected List<SYSKEY> underwritingClassProductSysKey;
    @XmlElement(name = "UnderwritingClass")
    protected OLILUUNWRITECLASS underwritingClass;
    @XmlElement(name = "UnderwritingSubClass")
    protected OLILUUNWRITESUBCLASS underwritingSubClass;
    @XmlElement(name = "Sequence")
    protected BigInteger sequence;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SmokerStat")
    protected OLILUSMOKERSTAT smokerStat;
    @XmlElement(name = "TobaccoPremiumBasis")
    protected OLILUTOBPREMBASIS tobaccoPremiumBasis;
    @XmlElement(name = "IssueGender")
    protected OLILUGENDER issueGender;
    @XmlElement(name = "MinIssueAge")
    protected BigInteger minIssueAge;
    @XmlElement(name = "MaxIssueAge")
    protected BigInteger maxIssueAge;
    @XmlElement(name = "MinIssueAmt")
    protected BigDecimal minIssueAmt;
    @XmlElement(name = "MaxIssueAmt")
    protected BigDecimal maxIssueAmt;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "AgeAdjustment")
    protected BigInteger ageAdjustment;
    @XmlElement(name = "MaxIssueUnits")
    protected Double maxIssueUnits;
    @XmlElement(name = "MinIssueUnits")
    protected Double minIssueUnits;
    @XmlElement(name = "MaxFlatExtra")
    protected BigDecimal maxFlatExtra;
    @XmlElement(name = "MaxTableRating")
    protected OLILURATINGS maxTableRating;
    @XmlElement(name = "MaxPctMonthlyGrossSalary")
    protected Double maxPctMonthlyGrossSalary;
    @XmlElement(name = "MinPct")
    protected Double minPct;
    @XmlElement(name = "MaxPct")
    protected Double maxPct;
    @XmlElement(name = "MaxIssuePremAmt")
    protected BigDecimal maxIssuePremAmt;
    @XmlElement(name = "MinIssuePremAmt")
    protected BigDecimal minIssuePremAmt;
    @XmlElement(name = "MaxPermFlatExtra")
    protected BigDecimal maxPermFlatExtra;
    @XmlElement(name = "MaxTempFlatExtra")
    protected BigDecimal maxTempFlatExtra;
    @XmlElement(name = "UnderwritingClassProductXLat")
    protected List<UnderwritingClassProductXLatType> underwritingClassProductXLat;
    @XmlElement(name = "AgeAmtProduct")
    protected List<AgeAmtProductType> ageAmtProduct;
    @XmlElement(name = "TempTableRatingCC")
    protected TempTableRatingCCType tempTableRatingCC;
    @XmlElement(name = "PermTableRatingCC")
    protected PermTableRatingCCType permTableRatingCC;
    @XmlElement(name = "JurisdictionApproval")
    protected List<JurisdictionApprovalType> jurisdictionApproval;
    @XmlElement(name = "TempTableRatingInfo")
    protected List<TempTableRatingInfoType> tempTableRatingInfo;
    @XmlElement(name = "PermTableRatingInfo")
    protected List<PermTableRatingInfoType> permTableRatingInfo;
    @XmlElement(name = "UndClassGuidelineInfo")
    protected List<UndClassGuidelineInfoType> undClassGuidelineInfo;
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
     * Gets the value of the underwritingClassProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getUnderwritingClassProductKey() {
        return underwritingClassProductKey;
    }

    /**
     * Sets the value of the underwritingClassProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setUnderwritingClassProductKey(PERSISTKEY value) {
        this.underwritingClassProductKey = value;
    }

    /**
     * Gets the value of the underwritingClassProductSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underwritingClassProductSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderwritingClassProductSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getUnderwritingClassProductSysKey() {
        if (underwritingClassProductSysKey == null) {
            underwritingClassProductSysKey = new ArrayList<SYSKEY>();
        }
        return this.underwritingClassProductSysKey;
    }

    /**
     * Gets the value of the underwritingClass property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUUNWRITECLASS }
     *     
     */
    public OLILUUNWRITECLASS getUnderwritingClass() {
        return underwritingClass;
    }

    /**
     * Sets the value of the underwritingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUUNWRITECLASS }
     *     
     */
    public void setUnderwritingClass(OLILUUNWRITECLASS value) {
        this.underwritingClass = value;
    }

    /**
     * Gets the value of the underwritingSubClass property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUUNWRITESUBCLASS }
     *     
     */
    public OLILUUNWRITESUBCLASS getUnderwritingSubClass() {
        return underwritingSubClass;
    }

    /**
     * Sets the value of the underwritingSubClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUUNWRITESUBCLASS }
     *     
     */
    public void setUnderwritingSubClass(OLILUUNWRITESUBCLASS value) {
        this.underwritingSubClass = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
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
     * Gets the value of the smokerStat property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSMOKERSTAT }
     *     
     */
    public OLILUSMOKERSTAT getSmokerStat() {
        return smokerStat;
    }

    /**
     * Sets the value of the smokerStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSMOKERSTAT }
     *     
     */
    public void setSmokerStat(OLILUSMOKERSTAT value) {
        this.smokerStat = value;
    }

    /**
     * Gets the value of the tobaccoPremiumBasis property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTOBPREMBASIS }
     *     
     */
    public OLILUTOBPREMBASIS getTobaccoPremiumBasis() {
        return tobaccoPremiumBasis;
    }

    /**
     * Sets the value of the tobaccoPremiumBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTOBPREMBASIS }
     *     
     */
    public void setTobaccoPremiumBasis(OLILUTOBPREMBASIS value) {
        this.tobaccoPremiumBasis = value;
    }

    /**
     * Gets the value of the issueGender property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUGENDER }
     *     
     */
    public OLILUGENDER getIssueGender() {
        return issueGender;
    }

    /**
     * Sets the value of the issueGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUGENDER }
     *     
     */
    public void setIssueGender(OLILUGENDER value) {
        this.issueGender = value;
    }

    /**
     * Gets the value of the minIssueAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinIssueAge() {
        return minIssueAge;
    }

    /**
     * Sets the value of the minIssueAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinIssueAge(BigInteger value) {
        this.minIssueAge = value;
    }

    /**
     * Gets the value of the maxIssueAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxIssueAge() {
        return maxIssueAge;
    }

    /**
     * Sets the value of the maxIssueAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxIssueAge(BigInteger value) {
        this.maxIssueAge = value;
    }

    /**
     * Gets the value of the minIssueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinIssueAmt() {
        return minIssueAmt;
    }

    /**
     * Sets the value of the minIssueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinIssueAmt(BigDecimal value) {
        this.minIssueAmt = value;
    }

    /**
     * Gets the value of the maxIssueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxIssueAmt() {
        return maxIssueAmt;
    }

    /**
     * Sets the value of the maxIssueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxIssueAmt(BigDecimal value) {
        this.maxIssueAmt = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the ageAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgeAdjustment() {
        return ageAdjustment;
    }

    /**
     * Sets the value of the ageAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgeAdjustment(BigInteger value) {
        this.ageAdjustment = value;
    }

    /**
     * Gets the value of the maxIssueUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxIssueUnits() {
        return maxIssueUnits;
    }

    /**
     * Sets the value of the maxIssueUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxIssueUnits(Double value) {
        this.maxIssueUnits = value;
    }

    /**
     * Gets the value of the minIssueUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinIssueUnits() {
        return minIssueUnits;
    }

    /**
     * Sets the value of the minIssueUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinIssueUnits(Double value) {
        this.minIssueUnits = value;
    }

    /**
     * Gets the value of the maxFlatExtra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxFlatExtra() {
        return maxFlatExtra;
    }

    /**
     * Sets the value of the maxFlatExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxFlatExtra(BigDecimal value) {
        this.maxFlatExtra = value;
    }

    /**
     * Gets the value of the maxTableRating property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURATINGS }
     *     
     */
    public OLILURATINGS getMaxTableRating() {
        return maxTableRating;
    }

    /**
     * Sets the value of the maxTableRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURATINGS }
     *     
     */
    public void setMaxTableRating(OLILURATINGS value) {
        this.maxTableRating = value;
    }

    /**
     * Gets the value of the maxPctMonthlyGrossSalary property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxPctMonthlyGrossSalary() {
        return maxPctMonthlyGrossSalary;
    }

    /**
     * Sets the value of the maxPctMonthlyGrossSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxPctMonthlyGrossSalary(Double value) {
        this.maxPctMonthlyGrossSalary = value;
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
     * Gets the value of the maxIssuePremAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxIssuePremAmt() {
        return maxIssuePremAmt;
    }

    /**
     * Sets the value of the maxIssuePremAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxIssuePremAmt(BigDecimal value) {
        this.maxIssuePremAmt = value;
    }

    /**
     * Gets the value of the minIssuePremAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinIssuePremAmt() {
        return minIssuePremAmt;
    }

    /**
     * Sets the value of the minIssuePremAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinIssuePremAmt(BigDecimal value) {
        this.minIssuePremAmt = value;
    }

    /**
     * Gets the value of the maxPermFlatExtra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPermFlatExtra() {
        return maxPermFlatExtra;
    }

    /**
     * Sets the value of the maxPermFlatExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPermFlatExtra(BigDecimal value) {
        this.maxPermFlatExtra = value;
    }

    /**
     * Gets the value of the maxTempFlatExtra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxTempFlatExtra() {
        return maxTempFlatExtra;
    }

    /**
     * Sets the value of the maxTempFlatExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxTempFlatExtra(BigDecimal value) {
        this.maxTempFlatExtra = value;
    }

    /**
     * Gets the value of the underwritingClassProductXLat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underwritingClassProductXLat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderwritingClassProductXLat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderwritingClassProductXLatType }
     * 
     * 
     */
    public List<UnderwritingClassProductXLatType> getUnderwritingClassProductXLat() {
        if (underwritingClassProductXLat == null) {
            underwritingClassProductXLat = new ArrayList<UnderwritingClassProductXLatType>();
        }
        return this.underwritingClassProductXLat;
    }

    /**
     * Gets the value of the ageAmtProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageAmtProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeAmtProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgeAmtProductType }
     * 
     * 
     */
    public List<AgeAmtProductType> getAgeAmtProduct() {
        if (ageAmtProduct == null) {
            ageAmtProduct = new ArrayList<AgeAmtProductType>();
        }
        return this.ageAmtProduct;
    }

    /**
     * Gets the value of the tempTableRatingCC property.
     * 
     * @return
     *     possible object is
     *     {@link TempTableRatingCCType }
     *     
     */
    public TempTableRatingCCType getTempTableRatingCC() {
        return tempTableRatingCC;
    }

    /**
     * Sets the value of the tempTableRatingCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link TempTableRatingCCType }
     *     
     */
    public void setTempTableRatingCC(TempTableRatingCCType value) {
        this.tempTableRatingCC = value;
    }

    /**
     * Gets the value of the permTableRatingCC property.
     * 
     * @return
     *     possible object is
     *     {@link PermTableRatingCCType }
     *     
     */
    public PermTableRatingCCType getPermTableRatingCC() {
        return permTableRatingCC;
    }

    /**
     * Sets the value of the permTableRatingCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermTableRatingCCType }
     *     
     */
    public void setPermTableRatingCC(PermTableRatingCCType value) {
        this.permTableRatingCC = value;
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
     * Gets the value of the tempTableRatingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tempTableRatingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTempTableRatingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TempTableRatingInfoType }
     * 
     * 
     */
    public List<TempTableRatingInfoType> getTempTableRatingInfo() {
        if (tempTableRatingInfo == null) {
            tempTableRatingInfo = new ArrayList<TempTableRatingInfoType>();
        }
        return this.tempTableRatingInfo;
    }

    /**
     * Gets the value of the permTableRatingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permTableRatingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermTableRatingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermTableRatingInfoType }
     * 
     * 
     */
    public List<PermTableRatingInfoType> getPermTableRatingInfo() {
        if (permTableRatingInfo == null) {
            permTableRatingInfo = new ArrayList<PermTableRatingInfoType>();
        }
        return this.permTableRatingInfo;
    }

    /**
     * Gets the value of the undClassGuidelineInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undClassGuidelineInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndClassGuidelineInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndClassGuidelineInfoType }
     * 
     * 
     */
    public List<UndClassGuidelineInfoType> getUndClassGuidelineInfo() {
        if (undClassGuidelineInfo == null) {
            undClassGuidelineInfo = new ArrayList<UndClassGuidelineInfoType>();
        }
        return this.undClassGuidelineInfo;
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