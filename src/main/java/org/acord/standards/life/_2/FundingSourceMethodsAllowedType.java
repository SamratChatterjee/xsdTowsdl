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
 * <p>Java class for FundingSourceMethodsAllowed_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundingSourceMethodsAllowed_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FundingSourceMethodsAllowedKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FundingSourceMethodsAllowedSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MarketingName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FinActivityType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxNumInstances" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SourceOfFundsCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PaymentFormCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PaymentFormInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PaymentSourceCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedTransType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CreditCardTypeCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedRelationship" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FundingSourceMethodsAllowed_Type", propOrder = {
    "fundingSourceMethodsAllowedKey",
    "fundingSourceMethodsAllowedSysKey",
    "marketingName",
    "finActivityType",
    "maxNumInstances",
    "sourceOfFundsCC",
    "paymentFormCC",
    "paymentFormInfo",
    "paymentSourceCC",
    "allowedTransType",
    "creditCardTypeCC",
    "allowedRelationship",
    "oLifEExtension"
})
public class FundingSourceMethodsAllowedType {

    @XmlElement(name = "FundingSourceMethodsAllowedKey")
    protected PERSISTKEY fundingSourceMethodsAllowedKey;
    @XmlElement(name = "FundingSourceMethodsAllowedSysKey")
    protected List<SYSKEY> fundingSourceMethodsAllowedSysKey;
    @XmlElement(name = "MarketingName")
    protected String marketingName;
    @XmlElement(name = "FinActivityType")
    protected OLILUFINACTTYPE finActivityType;
    @XmlElement(name = "MaxNumInstances")
    protected BigInteger maxNumInstances;
    @XmlElement(name = "SourceOfFundsCC")
    protected SourceOfFundsCCType sourceOfFundsCC;
    @XmlElement(name = "PaymentFormCC")
    protected PaymentFormCCType paymentFormCC;
    @XmlElement(name = "PaymentFormInfo")
    protected List<PaymentFormInfoType> paymentFormInfo;
    @XmlElement(name = "PaymentSourceCC")
    protected PaymentSourceCCType paymentSourceCC;
    @XmlElement(name = "AllowedTransType")
    protected List<AllowedTransTypeType> allowedTransType;
    @XmlElement(name = "CreditCardTypeCC")
    protected CreditCardTypeCCType creditCardTypeCC;
    @XmlElement(name = "AllowedRelationship")
    protected List<AllowedRelationshipType> allowedRelationship;
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
     * Gets the value of the fundingSourceMethodsAllowedKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getFundingSourceMethodsAllowedKey() {
        return fundingSourceMethodsAllowedKey;
    }

    /**
     * Sets the value of the fundingSourceMethodsAllowedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setFundingSourceMethodsAllowedKey(PERSISTKEY value) {
        this.fundingSourceMethodsAllowedKey = value;
    }

    /**
     * Gets the value of the fundingSourceMethodsAllowedSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingSourceMethodsAllowedSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingSourceMethodsAllowedSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getFundingSourceMethodsAllowedSysKey() {
        if (fundingSourceMethodsAllowedSysKey == null) {
            fundingSourceMethodsAllowedSysKey = new ArrayList<SYSKEY>();
        }
        return this.fundingSourceMethodsAllowedSysKey;
    }

    /**
     * Gets the value of the marketingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingName() {
        return marketingName;
    }

    /**
     * Sets the value of the marketingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingName(String value) {
        this.marketingName = value;
    }

    /**
     * Gets the value of the finActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUFINACTTYPE }
     *     
     */
    public OLILUFINACTTYPE getFinActivityType() {
        return finActivityType;
    }

    /**
     * Sets the value of the finActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUFINACTTYPE }
     *     
     */
    public void setFinActivityType(OLILUFINACTTYPE value) {
        this.finActivityType = value;
    }

    /**
     * Gets the value of the maxNumInstances property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumInstances() {
        return maxNumInstances;
    }

    /**
     * Sets the value of the maxNumInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumInstances(BigInteger value) {
        this.maxNumInstances = value;
    }

    /**
     * Gets the value of the sourceOfFundsCC property.
     * 
     * @return
     *     possible object is
     *     {@link SourceOfFundsCCType }
     *     
     */
    public SourceOfFundsCCType getSourceOfFundsCC() {
        return sourceOfFundsCC;
    }

    /**
     * Sets the value of the sourceOfFundsCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceOfFundsCCType }
     *     
     */
    public void setSourceOfFundsCC(SourceOfFundsCCType value) {
        this.sourceOfFundsCC = value;
    }

    /**
     * Gets the value of the paymentFormCC property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormCCType }
     *     
     */
    public PaymentFormCCType getPaymentFormCC() {
        return paymentFormCC;
    }

    /**
     * Sets the value of the paymentFormCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormCCType }
     *     
     */
    public void setPaymentFormCC(PaymentFormCCType value) {
        this.paymentFormCC = value;
    }

    /**
     * Gets the value of the paymentFormInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormInfoType }
     * 
     * 
     */
    public List<PaymentFormInfoType> getPaymentFormInfo() {
        if (paymentFormInfo == null) {
            paymentFormInfo = new ArrayList<PaymentFormInfoType>();
        }
        return this.paymentFormInfo;
    }

    /**
     * Gets the value of the paymentSourceCC property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSourceCCType }
     *     
     */
    public PaymentSourceCCType getPaymentSourceCC() {
        return paymentSourceCC;
    }

    /**
     * Sets the value of the paymentSourceCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSourceCCType }
     *     
     */
    public void setPaymentSourceCC(PaymentSourceCCType value) {
        this.paymentSourceCC = value;
    }

    /**
     * Gets the value of the allowedTransType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedTransType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedTransType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedTransTypeType }
     * 
     * 
     */
    public List<AllowedTransTypeType> getAllowedTransType() {
        if (allowedTransType == null) {
            allowedTransType = new ArrayList<AllowedTransTypeType>();
        }
        return this.allowedTransType;
    }

    /**
     * Gets the value of the creditCardTypeCC property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTypeCCType }
     *     
     */
    public CreditCardTypeCCType getCreditCardTypeCC() {
        return creditCardTypeCC;
    }

    /**
     * Sets the value of the creditCardTypeCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTypeCCType }
     *     
     */
    public void setCreditCardTypeCC(CreditCardTypeCCType value) {
        this.creditCardTypeCC = value;
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
