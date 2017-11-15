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
 * <p>Java class for DistributionAgreement_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionAgreement_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistributionAgreementKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistributionAgreementSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AdvancingAllowedInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BackDatingAllowedInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProductType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NettingAllowedInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InterestRateClass" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DateBasedOn" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistributionAgreementCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Name" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistLimitMaxNumAgents" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistLimitMaxNumInvestProducts" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistLimitMaxPremiumInitialAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistLimitMaxPremiumAddOnAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyProductInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommRemittance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BusinessProcessAllowed" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FundingSourceMethodsAllowed" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanEntityExclude" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}KeyedValue" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DistributionAgreement_Type", propOrder = {
    "distributionAgreementKey",
    "distributionAgreementSysKey",
    "advancingAllowedInd",
    "backDatingAllowedInd",
    "productType",
    "nettingAllowedInd",
    "interestRateClass",
    "dateBasedOn",
    "effDate",
    "expDate",
    "distributionAgreementCode",
    "carrierCode",
    "name",
    "distLimitMaxNumAgents",
    "distLimitMaxNumInvestProducts",
    "distLimitMaxPremiumInitialAmt",
    "distLimitMaxPremiumAddOnAmt",
    "policyProductInfo",
    "commRemittance",
    "businessProcessAllowed",
    "fundingSourceMethodsAllowed",
    "qualifiedPlanEntityExclude",
    "keyedValue",
    "oLifEExtension"
})
public class DistributionAgreementType {

    @XmlElement(name = "DistributionAgreementKey")
    protected PERSISTKEY distributionAgreementKey;
    @XmlElement(name = "DistributionAgreementSysKey")
    protected List<SYSKEY> distributionAgreementSysKey;
    @XmlElement(name = "AdvancingAllowedInd")
    protected OLILUBOOLEAN advancingAllowedInd;
    @XmlElement(name = "BackDatingAllowedInd")
    protected OLILUBOOLEAN backDatingAllowedInd;
    @XmlElement(name = "ProductType")
    protected OLILUPOLPROD productType;
    @XmlElement(name = "NettingAllowedInd")
    protected OLILUBOOLEAN nettingAllowedInd;
    @XmlElement(name = "InterestRateClass")
    protected String interestRateClass;
    @XmlElement(name = "DateBasedOn")
    protected OLILUDATEBASIS dateBasedOn;
    @XmlElement(name = "EffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDate;
    @XmlElement(name = "ExpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDate;
    @XmlElement(name = "DistributionAgreementCode")
    protected String distributionAgreementCode;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DistLimitMaxNumAgents")
    protected BigInteger distLimitMaxNumAgents;
    @XmlElement(name = "DistLimitMaxNumInvestProducts")
    protected BigInteger distLimitMaxNumInvestProducts;
    @XmlElement(name = "DistLimitMaxPremiumInitialAmt")
    protected BigDecimal distLimitMaxPremiumInitialAmt;
    @XmlElement(name = "DistLimitMaxPremiumAddOnAmt")
    protected BigDecimal distLimitMaxPremiumAddOnAmt;
    @XmlElement(name = "PolicyProductInfo")
    protected List<PolicyProductInfoType> policyProductInfo;
    @XmlElement(name = "CommRemittance")
    protected List<CommRemittanceType> commRemittance;
    @XmlElement(name = "BusinessProcessAllowed")
    protected List<BusinessProcessAllowedType> businessProcessAllowed;
    @XmlElement(name = "FundingSourceMethodsAllowed")
    protected List<FundingSourceMethodsAllowedType> fundingSourceMethodsAllowed;
    @XmlElement(name = "QualifiedPlanEntityExclude")
    protected List<QualifiedPlanEntityExcludeType> qualifiedPlanEntityExclude;
    @XmlElement(name = "KeyedValue")
    protected List<KeyedValueType> keyedValue;
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
     * Gets the value of the distributionAgreementKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getDistributionAgreementKey() {
        return distributionAgreementKey;
    }

    /**
     * Sets the value of the distributionAgreementKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setDistributionAgreementKey(PERSISTKEY value) {
        this.distributionAgreementKey = value;
    }

    /**
     * Gets the value of the distributionAgreementSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionAgreementSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionAgreementSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getDistributionAgreementSysKey() {
        if (distributionAgreementSysKey == null) {
            distributionAgreementSysKey = new ArrayList<SYSKEY>();
        }
        return this.distributionAgreementSysKey;
    }

    /**
     * Gets the value of the advancingAllowedInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getAdvancingAllowedInd() {
        return advancingAllowedInd;
    }

    /**
     * Sets the value of the advancingAllowedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setAdvancingAllowedInd(OLILUBOOLEAN value) {
        this.advancingAllowedInd = value;
    }

    /**
     * Gets the value of the backDatingAllowedInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getBackDatingAllowedInd() {
        return backDatingAllowedInd;
    }

    /**
     * Sets the value of the backDatingAllowedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setBackDatingAllowedInd(OLILUBOOLEAN value) {
        this.backDatingAllowedInd = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPOLPROD }
     *     
     */
    public OLILUPOLPROD getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPOLPROD }
     *     
     */
    public void setProductType(OLILUPOLPROD value) {
        this.productType = value;
    }

    /**
     * Gets the value of the nettingAllowedInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getNettingAllowedInd() {
        return nettingAllowedInd;
    }

    /**
     * Sets the value of the nettingAllowedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setNettingAllowedInd(OLILUBOOLEAN value) {
        this.nettingAllowedInd = value;
    }

    /**
     * Gets the value of the interestRateClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRateClass() {
        return interestRateClass;
    }

    /**
     * Sets the value of the interestRateClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRateClass(String value) {
        this.interestRateClass = value;
    }

    /**
     * Gets the value of the dateBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDATEBASIS }
     *     
     */
    public OLILUDATEBASIS getDateBasedOn() {
        return dateBasedOn;
    }

    /**
     * Sets the value of the dateBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDATEBASIS }
     *     
     */
    public void setDateBasedOn(OLILUDATEBASIS value) {
        this.dateBasedOn = value;
    }

    /**
     * Gets the value of the effDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Sets the value of the effDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the distributionAgreementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionAgreementCode() {
        return distributionAgreementCode;
    }

    /**
     * Sets the value of the distributionAgreementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionAgreementCode(String value) {
        this.distributionAgreementCode = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the distLimitMaxNumAgents property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistLimitMaxNumAgents() {
        return distLimitMaxNumAgents;
    }

    /**
     * Sets the value of the distLimitMaxNumAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistLimitMaxNumAgents(BigInteger value) {
        this.distLimitMaxNumAgents = value;
    }

    /**
     * Gets the value of the distLimitMaxNumInvestProducts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistLimitMaxNumInvestProducts() {
        return distLimitMaxNumInvestProducts;
    }

    /**
     * Sets the value of the distLimitMaxNumInvestProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistLimitMaxNumInvestProducts(BigInteger value) {
        this.distLimitMaxNumInvestProducts = value;
    }

    /**
     * Gets the value of the distLimitMaxPremiumInitialAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistLimitMaxPremiumInitialAmt() {
        return distLimitMaxPremiumInitialAmt;
    }

    /**
     * Sets the value of the distLimitMaxPremiumInitialAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistLimitMaxPremiumInitialAmt(BigDecimal value) {
        this.distLimitMaxPremiumInitialAmt = value;
    }

    /**
     * Gets the value of the distLimitMaxPremiumAddOnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistLimitMaxPremiumAddOnAmt() {
        return distLimitMaxPremiumAddOnAmt;
    }

    /**
     * Sets the value of the distLimitMaxPremiumAddOnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistLimitMaxPremiumAddOnAmt(BigDecimal value) {
        this.distLimitMaxPremiumAddOnAmt = value;
    }

    /**
     * Gets the value of the policyProductInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyProductInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyProductInfoType }
     * 
     * 
     */
    public List<PolicyProductInfoType> getPolicyProductInfo() {
        if (policyProductInfo == null) {
            policyProductInfo = new ArrayList<PolicyProductInfoType>();
        }
        return this.policyProductInfo;
    }

    /**
     * Gets the value of the commRemittance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commRemittance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommRemittance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommRemittanceType }
     * 
     * 
     */
    public List<CommRemittanceType> getCommRemittance() {
        if (commRemittance == null) {
            commRemittance = new ArrayList<CommRemittanceType>();
        }
        return this.commRemittance;
    }

    /**
     * Gets the value of the businessProcessAllowed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessProcessAllowed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessProcessAllowed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessProcessAllowedType }
     * 
     * 
     */
    public List<BusinessProcessAllowedType> getBusinessProcessAllowed() {
        if (businessProcessAllowed == null) {
            businessProcessAllowed = new ArrayList<BusinessProcessAllowedType>();
        }
        return this.businessProcessAllowed;
    }

    /**
     * Gets the value of the fundingSourceMethodsAllowed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingSourceMethodsAllowed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingSourceMethodsAllowed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingSourceMethodsAllowedType }
     * 
     * 
     */
    public List<FundingSourceMethodsAllowedType> getFundingSourceMethodsAllowed() {
        if (fundingSourceMethodsAllowed == null) {
            fundingSourceMethodsAllowed = new ArrayList<FundingSourceMethodsAllowedType>();
        }
        return this.fundingSourceMethodsAllowed;
    }

    /**
     * Gets the value of the qualifiedPlanEntityExclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedPlanEntityExclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedPlanEntityExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPlanEntityExcludeType }
     * 
     * 
     */
    public List<QualifiedPlanEntityExcludeType> getQualifiedPlanEntityExclude() {
        if (qualifiedPlanEntityExclude == null) {
            qualifiedPlanEntityExclude = new ArrayList<QualifiedPlanEntityExcludeType>();
        }
        return this.qualifiedPlanEntityExclude;
    }

    /**
     * Gets the value of the keyedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyedValueType }
     * 
     * 
     */
    public List<KeyedValueType> getKeyedValue() {
        if (keyedValue == null) {
            keyedValue = new ArrayList<KeyedValueType>();
        }
        return this.keyedValue;
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
