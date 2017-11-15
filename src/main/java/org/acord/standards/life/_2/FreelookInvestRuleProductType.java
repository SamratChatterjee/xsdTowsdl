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
 * <p>Java class for FreelookInvestRuleProduct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreelookInvestRuleProduct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FreelookInvestRuleProductKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FreelookInvestRuleProductSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FreeLookInvestDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FreeLookReturnProvision" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinIssueAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxIssueAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InvestRuleProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}JurisdictionApproval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FundingSourceMethodsAllowed" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FundViaExchangeInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinIssueAgeOwner" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxIssueAgeOwner" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ParticipantBasedOn" minOccurs="0"/>
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
@XmlType(name = "FreelookInvestRuleProduct_Type", propOrder = {
    "freelookInvestRuleProductKey",
    "freelookInvestRuleProductSysKey",
    "freeLookInvestDuration",
    "freeLookReturnProvision",
    "minIssueAge",
    "maxIssueAge",
    "description",
    "investRuleProduct",
    "jurisdictionApproval",
    "qualifiedPlanOption",
    "fundingSourceMethodsAllowed",
    "fundViaExchangeInd",
    "minIssueAgeOwner",
    "maxIssueAgeOwner",
    "participantBasedOn",
    "oLifEExtension"
})
public class FreelookInvestRuleProductType {

    @XmlElement(name = "FreelookInvestRuleProductKey")
    protected PERSISTKEY freelookInvestRuleProductKey;
    @XmlElement(name = "FreelookInvestRuleProductSysKey")
    protected List<SYSKEY> freelookInvestRuleProductSysKey;
    @XmlElement(name = "FreeLookInvestDuration")
    protected BigInteger freeLookInvestDuration;
    @XmlElement(name = "FreeLookReturnProvision")
    protected OLILURATEBASEDON freeLookReturnProvision;
    @XmlElement(name = "MinIssueAge")
    protected BigInteger minIssueAge;
    @XmlElement(name = "MaxIssueAge")
    protected BigInteger maxIssueAge;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "InvestRuleProduct")
    protected List<InvestRuleProductType> investRuleProduct;
    @XmlElement(name = "JurisdictionApproval")
    protected List<JurisdictionApprovalType> jurisdictionApproval;
    @XmlElement(name = "QualifiedPlanOption")
    protected List<QualifiedPlanOptionType> qualifiedPlanOption;
    @XmlElement(name = "FundingSourceMethodsAllowed")
    protected List<FundingSourceMethodsAllowedType> fundingSourceMethodsAllowed;
    @XmlElement(name = "FundViaExchangeInd")
    protected OLILUBOOLEAN fundViaExchangeInd;
    @XmlElement(name = "MinIssueAgeOwner")
    protected BigInteger minIssueAgeOwner;
    @XmlElement(name = "MaxIssueAgeOwner")
    protected BigInteger maxIssueAgeOwner;
    @XmlElement(name = "ParticipantBasedOn")
    protected OLILUPARTICROLE participantBasedOn;
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
     * Gets the value of the freelookInvestRuleProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getFreelookInvestRuleProductKey() {
        return freelookInvestRuleProductKey;
    }

    /**
     * Sets the value of the freelookInvestRuleProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setFreelookInvestRuleProductKey(PERSISTKEY value) {
        this.freelookInvestRuleProductKey = value;
    }

    /**
     * Gets the value of the freelookInvestRuleProductSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freelookInvestRuleProductSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreelookInvestRuleProductSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getFreelookInvestRuleProductSysKey() {
        if (freelookInvestRuleProductSysKey == null) {
            freelookInvestRuleProductSysKey = new ArrayList<SYSKEY>();
        }
        return this.freelookInvestRuleProductSysKey;
    }

    /**
     * Gets the value of the freeLookInvestDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFreeLookInvestDuration() {
        return freeLookInvestDuration;
    }

    /**
     * Sets the value of the freeLookInvestDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFreeLookInvestDuration(BigInteger value) {
        this.freeLookInvestDuration = value;
    }

    /**
     * Gets the value of the freeLookReturnProvision property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURATEBASEDON }
     *     
     */
    public OLILURATEBASEDON getFreeLookReturnProvision() {
        return freeLookReturnProvision;
    }

    /**
     * Sets the value of the freeLookReturnProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURATEBASEDON }
     *     
     */
    public void setFreeLookReturnProvision(OLILURATEBASEDON value) {
        this.freeLookReturnProvision = value;
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
     * Gets the value of the investRuleProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investRuleProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestRuleProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestRuleProductType }
     * 
     * 
     */
    public List<InvestRuleProductType> getInvestRuleProduct() {
        if (investRuleProduct == null) {
            investRuleProduct = new ArrayList<InvestRuleProductType>();
        }
        return this.investRuleProduct;
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
     * Gets the value of the qualifiedPlanOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedPlanOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedPlanOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPlanOptionType }
     * 
     * 
     */
    public List<QualifiedPlanOptionType> getQualifiedPlanOption() {
        if (qualifiedPlanOption == null) {
            qualifiedPlanOption = new ArrayList<QualifiedPlanOptionType>();
        }
        return this.qualifiedPlanOption;
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
     * Gets the value of the fundViaExchangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getFundViaExchangeInd() {
        return fundViaExchangeInd;
    }

    /**
     * Sets the value of the fundViaExchangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setFundViaExchangeInd(OLILUBOOLEAN value) {
        this.fundViaExchangeInd = value;
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
     * Gets the value of the participantBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPARTICROLE }
     *     
     */
    public OLILUPARTICROLE getParticipantBasedOn() {
        return participantBasedOn;
    }

    /**
     * Sets the value of the participantBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPARTICROLE }
     *     
     */
    public void setParticipantBasedOn(OLILUPARTICROLE value) {
        this.participantBasedOn = value;
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