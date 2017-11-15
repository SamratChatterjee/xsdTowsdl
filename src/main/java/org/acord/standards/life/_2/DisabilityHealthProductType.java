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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisabilityHealthProduct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisabilityHealthProduct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DisabilityHealthProductKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DisabilityHealthProductSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ChildMaxIssueAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ChildMatureAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ChildAgeUse" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ChildPremRule" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BenefitCoordinationInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PreExistingConditionInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IssueGenderCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SaleEffectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SaleExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FlatExtraPremBasis" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CovUnitType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CovAmountChanges" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CovScope" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LivesType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxMultiLives" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaturityAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxFlatExtra" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxTableRating" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ValuePerUnit" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstdMaxIssueAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstdMaxIssueAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstdMaxIssueUnits" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstdPolicyReservePct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstdReserveCeaseType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstdReserveCeaseValue" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstdFlatAdjInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstdFlatAdjFactor" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CovEffDateRestriction" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaturityAgeUse" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaturityDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaturityDurationQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstdPolicyReserveMethod" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InitialPremRenewYrs" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubseqPremStartYr" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubseqPremRenewYrs" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}HIPAANinetyDayCertRequireInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RiderProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DisabilityHealthProvisions" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PremiumRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RestrictionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FeatureTransactionProduct" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DisabilityHealthProduct_Type", propOrder = {
    "disabilityHealthProductKey",
    "disabilityHealthProductSysKey",
    "childMaxIssueAge",
    "childMatureAge",
    "childAgeUse",
    "childPremRule",
    "benefitCoordinationInd",
    "preExistingConditionInd",
    "issueGenderCC",
    "saleEffectiveDate",
    "saleExpirationDate",
    "flatExtraPremBasis",
    "covUnitType",
    "covAmountChanges",
    "covScope",
    "livesType",
    "maxMultiLives",
    "maturityAge",
    "maxFlatExtra",
    "maxTableRating",
    "valuePerUnit",
    "substdMaxIssueAge",
    "substdMaxIssueAmt",
    "substdMaxIssueUnits",
    "substdPolicyReservePct",
    "substdReserveCeaseType",
    "substdReserveCeaseValue",
    "substdFlatAdjInd",
    "substdFlatAdjFactor",
    "covEffDateRestriction",
    "maturityAgeUse",
    "maturityDuration",
    "maturityDurationQualifier",
    "substdPolicyReserveMethod",
    "initialPremRenewYrs",
    "subseqPremStartYr",
    "subseqPremRenewYrs",
    "hipaaNinetyDayCertRequireInd",
    "riderProduct",
    "disabilityHealthProvisions",
    "premiumRate",
    "restrictionInfo",
    "featureTransactionProduct",
    "oLifEExtension"
})
public class DisabilityHealthProductType {

    @XmlElement(name = "DisabilityHealthProductKey")
    protected PERSISTKEY disabilityHealthProductKey;
    @XmlElement(name = "DisabilityHealthProductSysKey")
    protected List<SYSKEY> disabilityHealthProductSysKey;
    @XmlElement(name = "ChildMaxIssueAge")
    protected BigInteger childMaxIssueAge;
    @XmlElement(name = "ChildMatureAge")
    protected BigInteger childMatureAge;
    @XmlElement(name = "ChildAgeUse")
    protected OLILUCHILDAGE childAgeUse;
    @XmlElement(name = "ChildPremRule")
    protected OLILUCHILDPREM childPremRule;
    @XmlElement(name = "BenefitCoordinationInd")
    protected OLILUBOOLEAN benefitCoordinationInd;
    @XmlElement(name = "PreExistingConditionInd")
    protected OLILUBOOLEAN preExistingConditionInd;
    @XmlElement(name = "IssueGenderCC")
    protected IssueGenderCCType issueGenderCC;
    @XmlElement(name = "SaleEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleEffectiveDate;
    @XmlElement(name = "SaleExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleExpirationDate;
    @XmlElement(name = "FlatExtraPremBasis")
    protected OLILUFLATEXTRAPREMBASISCODE flatExtraPremBasis;
    @XmlElement(name = "CovUnitType")
    protected OLILUCOVUNITTYPE covUnitType;
    @XmlElement(name = "CovAmountChanges")
    protected OLILUCOVCHGCTLTYPE covAmountChanges;
    @XmlElement(name = "CovScope")
    protected OLILUILLUSTYPES covScope;
    @XmlElement(name = "LivesType")
    protected OLILULIVESTYPE livesType;
    @XmlElement(name = "MaxMultiLives")
    protected BigInteger maxMultiLives;
    @XmlElement(name = "MaturityAge")
    protected BigInteger maturityAge;
    @XmlElement(name = "MaxFlatExtra")
    protected BigDecimal maxFlatExtra;
    @XmlElement(name = "MaxTableRating")
    protected OLILURATINGS maxTableRating;
    @XmlElement(name = "ValuePerUnit")
    protected BigDecimal valuePerUnit;
    @XmlElement(name = "SubstdMaxIssueAge")
    protected BigInteger substdMaxIssueAge;
    @XmlElement(name = "SubstdMaxIssueAmt")
    protected BigDecimal substdMaxIssueAmt;
    @XmlElement(name = "SubstdMaxIssueUnits")
    protected Double substdMaxIssueUnits;
    @XmlElement(name = "SubstdPolicyReservePct")
    protected Double substdPolicyReservePct;
    @XmlElement(name = "SubstdReserveCeaseType")
    protected OLILUSUBRESVCEASE substdReserveCeaseType;
    @XmlElement(name = "SubstdReserveCeaseValue")
    protected BigInteger substdReserveCeaseValue;
    @XmlElement(name = "SubstdFlatAdjInd")
    protected OLILUBOOLEAN substdFlatAdjInd;
    @XmlElement(name = "SubstdFlatAdjFactor")
    protected Double substdFlatAdjFactor;
    @XmlElement(name = "CovEffDateRestriction")
    protected OLILUCOVEFFDATERSTCT covEffDateRestriction;
    @XmlElement(name = "MaturityAgeUse")
    protected OLILUAGEDATEUSE maturityAgeUse;
    @XmlElement(name = "MaturityDuration")
    protected BigInteger maturityDuration;
    @XmlElement(name = "MaturityDurationQualifier")
    protected OLILUPAYMODE maturityDurationQualifier;
    @XmlElement(name = "SubstdPolicyReserveMethod")
    protected OLILUSUBSTDRESV substdPolicyReserveMethod;
    @XmlElement(name = "InitialPremRenewYrs")
    protected BigInteger initialPremRenewYrs;
    @XmlElement(name = "SubseqPremStartYr")
    protected BigInteger subseqPremStartYr;
    @XmlElement(name = "SubseqPremRenewYrs")
    protected BigInteger subseqPremRenewYrs;
    @XmlElement(name = "HIPAANinetyDayCertRequireInd")
    protected OLILUBOOLEAN hipaaNinetyDayCertRequireInd;
    @XmlElement(name = "RiderProduct")
    protected List<RiderProductType> riderProduct;
    @XmlElement(name = "DisabilityHealthProvisions")
    protected DisabilityHealthProvisionsType disabilityHealthProvisions;
    @XmlElement(name = "PremiumRate")
    protected List<PremiumRateType> premiumRate;
    @XmlElement(name = "RestrictionInfo")
    protected List<RestrictionInfoType> restrictionInfo;
    @XmlElement(name = "FeatureTransactionProduct")
    protected List<FeatureTransactionProductType> featureTransactionProduct;
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
     * Gets the value of the disabilityHealthProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getDisabilityHealthProductKey() {
        return disabilityHealthProductKey;
    }

    /**
     * Sets the value of the disabilityHealthProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setDisabilityHealthProductKey(PERSISTKEY value) {
        this.disabilityHealthProductKey = value;
    }

    /**
     * Gets the value of the disabilityHealthProductSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilityHealthProductSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilityHealthProductSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getDisabilityHealthProductSysKey() {
        if (disabilityHealthProductSysKey == null) {
            disabilityHealthProductSysKey = new ArrayList<SYSKEY>();
        }
        return this.disabilityHealthProductSysKey;
    }

    /**
     * Gets the value of the childMaxIssueAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildMaxIssueAge() {
        return childMaxIssueAge;
    }

    /**
     * Sets the value of the childMaxIssueAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildMaxIssueAge(BigInteger value) {
        this.childMaxIssueAge = value;
    }

    /**
     * Gets the value of the childMatureAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildMatureAge() {
        return childMatureAge;
    }

    /**
     * Sets the value of the childMatureAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildMatureAge(BigInteger value) {
        this.childMatureAge = value;
    }

    /**
     * Gets the value of the childAgeUse property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCHILDAGE }
     *     
     */
    public OLILUCHILDAGE getChildAgeUse() {
        return childAgeUse;
    }

    /**
     * Sets the value of the childAgeUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCHILDAGE }
     *     
     */
    public void setChildAgeUse(OLILUCHILDAGE value) {
        this.childAgeUse = value;
    }

    /**
     * Gets the value of the childPremRule property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCHILDPREM }
     *     
     */
    public OLILUCHILDPREM getChildPremRule() {
        return childPremRule;
    }

    /**
     * Sets the value of the childPremRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCHILDPREM }
     *     
     */
    public void setChildPremRule(OLILUCHILDPREM value) {
        this.childPremRule = value;
    }

    /**
     * Gets the value of the benefitCoordinationInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getBenefitCoordinationInd() {
        return benefitCoordinationInd;
    }

    /**
     * Sets the value of the benefitCoordinationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setBenefitCoordinationInd(OLILUBOOLEAN value) {
        this.benefitCoordinationInd = value;
    }

    /**
     * Gets the value of the preExistingConditionInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getPreExistingConditionInd() {
        return preExistingConditionInd;
    }

    /**
     * Sets the value of the preExistingConditionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setPreExistingConditionInd(OLILUBOOLEAN value) {
        this.preExistingConditionInd = value;
    }

    /**
     * Gets the value of the issueGenderCC property.
     * 
     * @return
     *     possible object is
     *     {@link IssueGenderCCType }
     *     
     */
    public IssueGenderCCType getIssueGenderCC() {
        return issueGenderCC;
    }

    /**
     * Sets the value of the issueGenderCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueGenderCCType }
     *     
     */
    public void setIssueGenderCC(IssueGenderCCType value) {
        this.issueGenderCC = value;
    }

    /**
     * Gets the value of the saleEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleEffectiveDate() {
        return saleEffectiveDate;
    }

    /**
     * Sets the value of the saleEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleEffectiveDate(XMLGregorianCalendar value) {
        this.saleEffectiveDate = value;
    }

    /**
     * Gets the value of the saleExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleExpirationDate() {
        return saleExpirationDate;
    }

    /**
     * Sets the value of the saleExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleExpirationDate(XMLGregorianCalendar value) {
        this.saleExpirationDate = value;
    }

    /**
     * Gets the value of the flatExtraPremBasis property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUFLATEXTRAPREMBASISCODE }
     *     
     */
    public OLILUFLATEXTRAPREMBASISCODE getFlatExtraPremBasis() {
        return flatExtraPremBasis;
    }

    /**
     * Sets the value of the flatExtraPremBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUFLATEXTRAPREMBASISCODE }
     *     
     */
    public void setFlatExtraPremBasis(OLILUFLATEXTRAPREMBASISCODE value) {
        this.flatExtraPremBasis = value;
    }

    /**
     * Gets the value of the covUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOVUNITTYPE }
     *     
     */
    public OLILUCOVUNITTYPE getCovUnitType() {
        return covUnitType;
    }

    /**
     * Sets the value of the covUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOVUNITTYPE }
     *     
     */
    public void setCovUnitType(OLILUCOVUNITTYPE value) {
        this.covUnitType = value;
    }

    /**
     * Gets the value of the covAmountChanges property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOVCHGCTLTYPE }
     *     
     */
    public OLILUCOVCHGCTLTYPE getCovAmountChanges() {
        return covAmountChanges;
    }

    /**
     * Sets the value of the covAmountChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOVCHGCTLTYPE }
     *     
     */
    public void setCovAmountChanges(OLILUCOVCHGCTLTYPE value) {
        this.covAmountChanges = value;
    }

    /**
     * Gets the value of the covScope property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUILLUSTYPES }
     *     
     */
    public OLILUILLUSTYPES getCovScope() {
        return covScope;
    }

    /**
     * Sets the value of the covScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUILLUSTYPES }
     *     
     */
    public void setCovScope(OLILUILLUSTYPES value) {
        this.covScope = value;
    }

    /**
     * Gets the value of the livesType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILULIVESTYPE }
     *     
     */
    public OLILULIVESTYPE getLivesType() {
        return livesType;
    }

    /**
     * Sets the value of the livesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILULIVESTYPE }
     *     
     */
    public void setLivesType(OLILULIVESTYPE value) {
        this.livesType = value;
    }

    /**
     * Gets the value of the maxMultiLives property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxMultiLives() {
        return maxMultiLives;
    }

    /**
     * Sets the value of the maxMultiLives property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxMultiLives(BigInteger value) {
        this.maxMultiLives = value;
    }

    /**
     * Gets the value of the maturityAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaturityAge() {
        return maturityAge;
    }

    /**
     * Sets the value of the maturityAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaturityAge(BigInteger value) {
        this.maturityAge = value;
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
     * Gets the value of the valuePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValuePerUnit() {
        return valuePerUnit;
    }

    /**
     * Sets the value of the valuePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValuePerUnit(BigDecimal value) {
        this.valuePerUnit = value;
    }

    /**
     * Gets the value of the substdMaxIssueAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubstdMaxIssueAge() {
        return substdMaxIssueAge;
    }

    /**
     * Sets the value of the substdMaxIssueAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubstdMaxIssueAge(BigInteger value) {
        this.substdMaxIssueAge = value;
    }

    /**
     * Gets the value of the substdMaxIssueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubstdMaxIssueAmt() {
        return substdMaxIssueAmt;
    }

    /**
     * Sets the value of the substdMaxIssueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubstdMaxIssueAmt(BigDecimal value) {
        this.substdMaxIssueAmt = value;
    }

    /**
     * Gets the value of the substdMaxIssueUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubstdMaxIssueUnits() {
        return substdMaxIssueUnits;
    }

    /**
     * Sets the value of the substdMaxIssueUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubstdMaxIssueUnits(Double value) {
        this.substdMaxIssueUnits = value;
    }

    /**
     * Gets the value of the substdPolicyReservePct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubstdPolicyReservePct() {
        return substdPolicyReservePct;
    }

    /**
     * Sets the value of the substdPolicyReservePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubstdPolicyReservePct(Double value) {
        this.substdPolicyReservePct = value;
    }

    /**
     * Gets the value of the substdReserveCeaseType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSUBRESVCEASE }
     *     
     */
    public OLILUSUBRESVCEASE getSubstdReserveCeaseType() {
        return substdReserveCeaseType;
    }

    /**
     * Sets the value of the substdReserveCeaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSUBRESVCEASE }
     *     
     */
    public void setSubstdReserveCeaseType(OLILUSUBRESVCEASE value) {
        this.substdReserveCeaseType = value;
    }

    /**
     * Gets the value of the substdReserveCeaseValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubstdReserveCeaseValue() {
        return substdReserveCeaseValue;
    }

    /**
     * Sets the value of the substdReserveCeaseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubstdReserveCeaseValue(BigInteger value) {
        this.substdReserveCeaseValue = value;
    }

    /**
     * Gets the value of the substdFlatAdjInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getSubstdFlatAdjInd() {
        return substdFlatAdjInd;
    }

    /**
     * Sets the value of the substdFlatAdjInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setSubstdFlatAdjInd(OLILUBOOLEAN value) {
        this.substdFlatAdjInd = value;
    }

    /**
     * Gets the value of the substdFlatAdjFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubstdFlatAdjFactor() {
        return substdFlatAdjFactor;
    }

    /**
     * Sets the value of the substdFlatAdjFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubstdFlatAdjFactor(Double value) {
        this.substdFlatAdjFactor = value;
    }

    /**
     * Gets the value of the covEffDateRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOVEFFDATERSTCT }
     *     
     */
    public OLILUCOVEFFDATERSTCT getCovEffDateRestriction() {
        return covEffDateRestriction;
    }

    /**
     * Sets the value of the covEffDateRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOVEFFDATERSTCT }
     *     
     */
    public void setCovEffDateRestriction(OLILUCOVEFFDATERSTCT value) {
        this.covEffDateRestriction = value;
    }

    /**
     * Gets the value of the maturityAgeUse property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUAGEDATEUSE }
     *     
     */
    public OLILUAGEDATEUSE getMaturityAgeUse() {
        return maturityAgeUse;
    }

    /**
     * Sets the value of the maturityAgeUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUAGEDATEUSE }
     *     
     */
    public void setMaturityAgeUse(OLILUAGEDATEUSE value) {
        this.maturityAgeUse = value;
    }

    /**
     * Gets the value of the maturityDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaturityDuration() {
        return maturityDuration;
    }

    /**
     * Sets the value of the maturityDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaturityDuration(BigInteger value) {
        this.maturityDuration = value;
    }

    /**
     * Gets the value of the maturityDurationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public OLILUPAYMODE getMaturityDurationQualifier() {
        return maturityDurationQualifier;
    }

    /**
     * Sets the value of the maturityDurationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public void setMaturityDurationQualifier(OLILUPAYMODE value) {
        this.maturityDurationQualifier = value;
    }

    /**
     * Gets the value of the substdPolicyReserveMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSUBSTDRESV }
     *     
     */
    public OLILUSUBSTDRESV getSubstdPolicyReserveMethod() {
        return substdPolicyReserveMethod;
    }

    /**
     * Sets the value of the substdPolicyReserveMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSUBSTDRESV }
     *     
     */
    public void setSubstdPolicyReserveMethod(OLILUSUBSTDRESV value) {
        this.substdPolicyReserveMethod = value;
    }

    /**
     * Gets the value of the initialPremRenewYrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInitialPremRenewYrs() {
        return initialPremRenewYrs;
    }

    /**
     * Sets the value of the initialPremRenewYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInitialPremRenewYrs(BigInteger value) {
        this.initialPremRenewYrs = value;
    }

    /**
     * Gets the value of the subseqPremStartYr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubseqPremStartYr() {
        return subseqPremStartYr;
    }

    /**
     * Sets the value of the subseqPremStartYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubseqPremStartYr(BigInteger value) {
        this.subseqPremStartYr = value;
    }

    /**
     * Gets the value of the subseqPremRenewYrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubseqPremRenewYrs() {
        return subseqPremRenewYrs;
    }

    /**
     * Sets the value of the subseqPremRenewYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubseqPremRenewYrs(BigInteger value) {
        this.subseqPremRenewYrs = value;
    }

    /**
     * Gets the value of the hipaaNinetyDayCertRequireInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getHIPAANinetyDayCertRequireInd() {
        return hipaaNinetyDayCertRequireInd;
    }

    /**
     * Sets the value of the hipaaNinetyDayCertRequireInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setHIPAANinetyDayCertRequireInd(OLILUBOOLEAN value) {
        this.hipaaNinetyDayCertRequireInd = value;
    }

    /**
     * Gets the value of the riderProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riderProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiderProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiderProductType }
     * 
     * 
     */
    public List<RiderProductType> getRiderProduct() {
        if (riderProduct == null) {
            riderProduct = new ArrayList<RiderProductType>();
        }
        return this.riderProduct;
    }

    /**
     * Gets the value of the disabilityHealthProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityHealthProvisionsType }
     *     
     */
    public DisabilityHealthProvisionsType getDisabilityHealthProvisions() {
        return disabilityHealthProvisions;
    }

    /**
     * Sets the value of the disabilityHealthProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityHealthProvisionsType }
     *     
     */
    public void setDisabilityHealthProvisions(DisabilityHealthProvisionsType value) {
        this.disabilityHealthProvisions = value;
    }

    /**
     * Gets the value of the premiumRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremiumRateType }
     * 
     * 
     */
    public List<PremiumRateType> getPremiumRate() {
        if (premiumRate == null) {
            premiumRate = new ArrayList<PremiumRateType>();
        }
        return this.premiumRate;
    }

    /**
     * Gets the value of the restrictionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionInfoType }
     * 
     * 
     */
    public List<RestrictionInfoType> getRestrictionInfo() {
        if (restrictionInfo == null) {
            restrictionInfo = new ArrayList<RestrictionInfoType>();
        }
        return this.restrictionInfo;
    }

    /**
     * Gets the value of the featureTransactionProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureTransactionProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureTransactionProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureTransactionProductType }
     * 
     * 
     */
    public List<FeatureTransactionProductType> getFeatureTransactionProduct() {
        if (featureTransactionProduct == null) {
            featureTransactionProduct = new ArrayList<FeatureTransactionProductType>();
        }
        return this.featureTransactionProduct;
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