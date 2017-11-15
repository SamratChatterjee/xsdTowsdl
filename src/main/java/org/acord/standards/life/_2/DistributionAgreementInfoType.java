//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

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
 * <p>Java class for DistributionAgreementInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionAgreementInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistributionAgreementInfoKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistributionAgreementInfoSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AdvancingAllowedInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BackDatingAllowedInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NettingAllowedInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PaymentForm" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PaymentMode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistributionAgreementCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DistributionAgreementID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="BankingInfoID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="CheckMailingID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionAgreementInfo_Type", propOrder = {
    "distributionAgreementInfoKey",
    "distributionAgreementInfoSysKey",
    "advancingAllowedInd",
    "backDatingAllowedInd",
    "nettingAllowedInd",
    "paymentForm",
    "paymentMode",
    "effDate",
    "expDate",
    "distributionAgreementCode",
    "carrierCode",
    "oLifEExtension"
})
public class DistributionAgreementInfoType {

    @XmlElement(name = "DistributionAgreementInfoKey")
    protected PERSISTKEY distributionAgreementInfoKey;
    @XmlElement(name = "DistributionAgreementInfoSysKey")
    protected List<SYSKEY> distributionAgreementInfoSysKey;
    @XmlElement(name = "AdvancingAllowedInd")
    protected OLILUBOOLEAN advancingAllowedInd;
    @XmlElement(name = "BackDatingAllowedInd")
    protected OLILUBOOLEAN backDatingAllowedInd;
    @XmlElement(name = "NettingAllowedInd")
    protected OLILUBOOLEAN nettingAllowedInd;
    @XmlElement(name = "PaymentForm")
    protected OLILUPAYMENTFORM paymentForm;
    @XmlElement(name = "PaymentMode")
    protected OLILUPAYMODE paymentMode;
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
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "DistributionAgreementID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object distributionAgreementID;
    @XmlAttribute(name = "BankingInfoID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object bankingInfoID;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;
    @XmlAttribute(name = "CheckMailingID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object checkMailingID;

    /**
     * Gets the value of the distributionAgreementInfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getDistributionAgreementInfoKey() {
        return distributionAgreementInfoKey;
    }

    /**
     * Sets the value of the distributionAgreementInfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setDistributionAgreementInfoKey(PERSISTKEY value) {
        this.distributionAgreementInfoKey = value;
    }

    /**
     * Gets the value of the distributionAgreementInfoSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionAgreementInfoSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionAgreementInfoSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getDistributionAgreementInfoSysKey() {
        if (distributionAgreementInfoSysKey == null) {
            distributionAgreementInfoSysKey = new ArrayList<SYSKEY>();
        }
        return this.distributionAgreementInfoSysKey;
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
     * Gets the value of the paymentForm property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPAYMENTFORM }
     *     
     */
    public OLILUPAYMENTFORM getPaymentForm() {
        return paymentForm;
    }

    /**
     * Sets the value of the paymentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPAYMENTFORM }
     *     
     */
    public void setPaymentForm(OLILUPAYMENTFORM value) {
        this.paymentForm = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public OLILUPAYMODE getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public void setPaymentMode(OLILUPAYMODE value) {
        this.paymentMode = value;
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
     * Gets the value of the distributionAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDistributionAgreementID() {
        return distributionAgreementID;
    }

    /**
     * Sets the value of the distributionAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDistributionAgreementID(Object value) {
        this.distributionAgreementID = value;
    }

    /**
     * Gets the value of the bankingInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBankingInfoID() {
        return bankingInfoID;
    }

    /**
     * Sets the value of the bankingInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBankingInfoID(Object value) {
        this.bankingInfoID = value;
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
     * Gets the value of the checkMailingID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCheckMailingID() {
        return checkMailingID;
    }

    /**
     * Sets the value of the checkMailingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCheckMailingID(Object value) {
        this.checkMailingID = value;
    }

}
