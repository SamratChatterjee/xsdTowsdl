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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvestProductInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestProductInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InvestProductInfoKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InvestProductInfoSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Sequence" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FullName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CusipNum" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProductSymbol" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProductCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IncludeOption" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RateVariationKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UnitPriceBuyRate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SaleEffectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SaleExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NoNewMoneyDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinDepositAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxDepositAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinDepositPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxDepositPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AgeCalculationType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PartySelection" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ParticipantBasedPartySelection" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinIssueAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxIssueAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinIssueAgeOwner" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxIssueAgeOwner" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SoftCloseDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InforceExclusionCalendarDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InforceExclusionContractDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DefaultInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InvestProductTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}JurisdictionApproval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InvestProductInfoXLat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RateVariationCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ProductID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="InvestProductID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="RateVariationID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestProductInfo_Type", propOrder = {
    "investProductInfoKey",
    "investProductInfoSysKey",
    "carrierCode",
    "sequence",
    "fullName",
    "cusipNum",
    "productSymbol",
    "productCode",
    "includeOption",
    "rateVariationKey",
    "unitPriceBuyRate",
    "saleEffectiveDate",
    "saleExpirationDate",
    "noNewMoneyDate",
    "minDepositAmt",
    "maxDepositAmt",
    "minDepositPct",
    "maxDepositPct",
    "maxAmt",
    "minAmt",
    "maxPct",
    "minPct",
    "ageCalculationType",
    "partySelection",
    "participantBasedPartySelection",
    "minIssueAge",
    "maxIssueAge",
    "minIssueAgeOwner",
    "maxIssueAgeOwner",
    "softCloseDate",
    "inforceExclusionCalendarDate",
    "inforceExclusionContractDate",
    "defaultInd",
    "investProductTypeCode",
    "fee",
    "jurisdictionApproval",
    "investProductInfoXLat",
    "rateVariationCode",
    "qualifiedPlanEntity",
    "oLifEExtension"
})
public class InvestProductInfoType {

    @XmlElement(name = "InvestProductInfoKey")
    protected PERSISTKEY investProductInfoKey;
    @XmlElement(name = "InvestProductInfoSysKey")
    protected List<SYSKEY> investProductInfoSysKey;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "Sequence")
    protected BigInteger sequence;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "CusipNum")
    protected String cusipNum;
    @XmlElement(name = "ProductSymbol")
    protected String productSymbol;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "IncludeOption")
    protected OLILUINCLUDEOPTION includeOption;
    @XmlElement(name = "RateVariationKey")
    protected PERSISTKEY rateVariationKey;
    @XmlElement(name = "UnitPriceBuyRate")
    protected BigDecimal unitPriceBuyRate;
    @XmlElement(name = "SaleEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleEffectiveDate;
    @XmlElement(name = "SaleExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleExpirationDate;
    @XmlElement(name = "NoNewMoneyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar noNewMoneyDate;
    @XmlElement(name = "MinDepositAmt")
    protected BigDecimal minDepositAmt;
    @XmlElement(name = "MaxDepositAmt")
    protected BigDecimal maxDepositAmt;
    @XmlElement(name = "MinDepositPct")
    protected Double minDepositPct;
    @XmlElement(name = "MaxDepositPct")
    protected Double maxDepositPct;
    @XmlElement(name = "MaxAmt")
    protected BigDecimal maxAmt;
    @XmlElement(name = "MinAmt")
    protected BigDecimal minAmt;
    @XmlElement(name = "MaxPct")
    protected Double maxPct;
    @XmlElement(name = "MinPct")
    protected Double minPct;
    @XmlElement(name = "AgeCalculationType")
    protected OLILUAGECALCMETH ageCalculationType;
    @XmlElement(name = "PartySelection")
    protected OLILUPARTYSELECT partySelection;
    @XmlElement(name = "ParticipantBasedPartySelection")
    protected OLILUPARTICROLE participantBasedPartySelection;
    @XmlElement(name = "MinIssueAge")
    protected BigInteger minIssueAge;
    @XmlElement(name = "MaxIssueAge")
    protected BigInteger maxIssueAge;
    @XmlElement(name = "MinIssueAgeOwner")
    protected BigInteger minIssueAgeOwner;
    @XmlElement(name = "MaxIssueAgeOwner")
    protected BigInteger maxIssueAgeOwner;
    @XmlElement(name = "SoftCloseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar softCloseDate;
    @XmlElement(name = "InforceExclusionCalendarDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inforceExclusionCalendarDate;
    @XmlElement(name = "InforceExclusionContractDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inforceExclusionContractDate;
    @XmlElement(name = "DefaultInd")
    protected OLILUBOOLEAN defaultInd;
    @XmlElement(name = "InvestProductTypeCode")
    protected OLILUINVESTPROD investProductTypeCode;
    @XmlElement(name = "Fee")
    protected List<FeeType> fee;
    @XmlElement(name = "JurisdictionApproval")
    protected List<JurisdictionApprovalType> jurisdictionApproval;
    @XmlElement(name = "InvestProductInfoXLat")
    protected List<InvestProductInfoXLatType> investProductInfoXLat;
    @XmlElement(name = "RateVariationCode")
    protected String rateVariationCode;
    @XmlElement(name = "QualifiedPlanEntity")
    protected List<QualifiedPlanEntityType> qualifiedPlanEntity;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ProductID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object productID;
    @XmlAttribute(name = "InvestProductID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object investProductID;
    @XmlAttribute(name = "RateVariationID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rateVariationID;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;

    /**
     * Gets the value of the investProductInfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getInvestProductInfoKey() {
        return investProductInfoKey;
    }

    /**
     * Sets the value of the investProductInfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setInvestProductInfoKey(PERSISTKEY value) {
        this.investProductInfoKey = value;
    }

    /**
     * Gets the value of the investProductInfoSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investProductInfoSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestProductInfoSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getInvestProductInfoSysKey() {
        if (investProductInfoSysKey == null) {
            investProductInfoSysKey = new ArrayList<SYSKEY>();
        }
        return this.investProductInfoSysKey;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the cusipNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusipNum() {
        return cusipNum;
    }

    /**
     * Sets the value of the cusipNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusipNum(String value) {
        this.cusipNum = value;
    }

    /**
     * Gets the value of the productSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSymbol() {
        return productSymbol;
    }

    /**
     * Sets the value of the productSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSymbol(String value) {
        this.productSymbol = value;
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
     * Gets the value of the includeOption property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUINCLUDEOPTION }
     *     
     */
    public OLILUINCLUDEOPTION getIncludeOption() {
        return includeOption;
    }

    /**
     * Sets the value of the includeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUINCLUDEOPTION }
     *     
     */
    public void setIncludeOption(OLILUINCLUDEOPTION value) {
        this.includeOption = value;
    }

    /**
     * Gets the value of the rateVariationKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getRateVariationKey() {
        return rateVariationKey;
    }

    /**
     * Sets the value of the rateVariationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setRateVariationKey(PERSISTKEY value) {
        this.rateVariationKey = value;
    }

    /**
     * Gets the value of the unitPriceBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPriceBuyRate() {
        return unitPriceBuyRate;
    }

    /**
     * Sets the value of the unitPriceBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPriceBuyRate(BigDecimal value) {
        this.unitPriceBuyRate = value;
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
     * Gets the value of the noNewMoneyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNoNewMoneyDate() {
        return noNewMoneyDate;
    }

    /**
     * Sets the value of the noNewMoneyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNoNewMoneyDate(XMLGregorianCalendar value) {
        this.noNewMoneyDate = value;
    }

    /**
     * Gets the value of the minDepositAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinDepositAmt() {
        return minDepositAmt;
    }

    /**
     * Sets the value of the minDepositAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinDepositAmt(BigDecimal value) {
        this.minDepositAmt = value;
    }

    /**
     * Gets the value of the maxDepositAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxDepositAmt() {
        return maxDepositAmt;
    }

    /**
     * Sets the value of the maxDepositAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxDepositAmt(BigDecimal value) {
        this.maxDepositAmt = value;
    }

    /**
     * Gets the value of the minDepositPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDepositPct() {
        return minDepositPct;
    }

    /**
     * Sets the value of the minDepositPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDepositPct(Double value) {
        this.minDepositPct = value;
    }

    /**
     * Gets the value of the maxDepositPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDepositPct() {
        return maxDepositPct;
    }

    /**
     * Sets the value of the maxDepositPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDepositPct(Double value) {
        this.maxDepositPct = value;
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
     * Gets the value of the ageCalculationType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUAGECALCMETH }
     *     
     */
    public OLILUAGECALCMETH getAgeCalculationType() {
        return ageCalculationType;
    }

    /**
     * Sets the value of the ageCalculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUAGECALCMETH }
     *     
     */
    public void setAgeCalculationType(OLILUAGECALCMETH value) {
        this.ageCalculationType = value;
    }

    /**
     * Gets the value of the partySelection property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPARTYSELECT }
     *     
     */
    public OLILUPARTYSELECT getPartySelection() {
        return partySelection;
    }

    /**
     * Sets the value of the partySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPARTYSELECT }
     *     
     */
    public void setPartySelection(OLILUPARTYSELECT value) {
        this.partySelection = value;
    }

    /**
     * Gets the value of the participantBasedPartySelection property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPARTICROLE }
     *     
     */
    public OLILUPARTICROLE getParticipantBasedPartySelection() {
        return participantBasedPartySelection;
    }

    /**
     * Sets the value of the participantBasedPartySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPARTICROLE }
     *     
     */
    public void setParticipantBasedPartySelection(OLILUPARTICROLE value) {
        this.participantBasedPartySelection = value;
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
     * Gets the value of the minIssueAgeOwner property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinIssueAgeOwner() {
        return minIssueAgeOwner;
    }

    /**
     * Sets the value of the minIssueAgeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinIssueAgeOwner(BigInteger value) {
        this.minIssueAgeOwner = value;
    }

    /**
     * Gets the value of the maxIssueAgeOwner property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxIssueAgeOwner() {
        return maxIssueAgeOwner;
    }

    /**
     * Sets the value of the maxIssueAgeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxIssueAgeOwner(BigInteger value) {
        this.maxIssueAgeOwner = value;
    }

    /**
     * Gets the value of the softCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSoftCloseDate() {
        return softCloseDate;
    }

    /**
     * Sets the value of the softCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSoftCloseDate(XMLGregorianCalendar value) {
        this.softCloseDate = value;
    }

    /**
     * Gets the value of the inforceExclusionCalendarDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInforceExclusionCalendarDate() {
        return inforceExclusionCalendarDate;
    }

    /**
     * Sets the value of the inforceExclusionCalendarDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInforceExclusionCalendarDate(XMLGregorianCalendar value) {
        this.inforceExclusionCalendarDate = value;
    }

    /**
     * Gets the value of the inforceExclusionContractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInforceExclusionContractDate() {
        return inforceExclusionContractDate;
    }

    /**
     * Sets the value of the inforceExclusionContractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInforceExclusionContractDate(XMLGregorianCalendar value) {
        this.inforceExclusionContractDate = value;
    }

    /**
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getDefaultInd() {
        return defaultInd;
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setDefaultInd(OLILUBOOLEAN value) {
        this.defaultInd = value;
    }

    /**
     * Gets the value of the investProductTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUINVESTPROD }
     *     
     */
    public OLILUINVESTPROD getInvestProductTypeCode() {
        return investProductTypeCode;
    }

    /**
     * Sets the value of the investProductTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUINVESTPROD }
     *     
     */
    public void setInvestProductTypeCode(OLILUINVESTPROD value) {
        this.investProductTypeCode = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeType>();
        }
        return this.fee;
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
     * Gets the value of the investProductInfoXLat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investProductInfoXLat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestProductInfoXLat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestProductInfoXLatType }
     * 
     * 
     */
    public List<InvestProductInfoXLatType> getInvestProductInfoXLat() {
        if (investProductInfoXLat == null) {
            investProductInfoXLat = new ArrayList<InvestProductInfoXLatType>();
        }
        return this.investProductInfoXLat;
    }

    /**
     * Gets the value of the rateVariationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateVariationCode() {
        return rateVariationCode;
    }

    /**
     * Sets the value of the rateVariationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateVariationCode(String value) {
        this.rateVariationCode = value;
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
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductID(Object value) {
        this.productID = value;
    }

    /**
     * Gets the value of the investProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvestProductID() {
        return investProductID;
    }

    /**
     * Sets the value of the investProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvestProductID(Object value) {
        this.investProductID = value;
    }

    /**
     * Gets the value of the rateVariationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRateVariationID() {
        return rateVariationID;
    }

    /**
     * Sets the value of the rateVariationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRateVariationID(Object value) {
        this.rateVariationID = value;
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