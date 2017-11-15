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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommissionCalcInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionCalcInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionCalcInfoKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionCalcInfoSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransactionDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PremiumDueDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProcessingType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionableEvent" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionableEventDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProductionAffectedInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DecreaseInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierAdminSubSystem" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionCalcActivity" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CommissionCalcInfo_Type", propOrder = {
    "commissionCalcInfoKey",
    "commissionCalcInfoSysKey",
    "carrierCode",
    "userCode",
    "effDate",
    "transactionDate",
    "premiumDueDate",
    "processingType",
    "commissionableEvent",
    "commissionableEventDesc",
    "productionAffectedInd",
    "decreaseInd",
    "carrierAdminSubSystem",
    "commissionCalcActivity",
    "oLifEExtension"
})
public class CommissionCalcInfoType {

    @XmlElement(name = "CommissionCalcInfoKey")
    protected PERSISTKEY commissionCalcInfoKey;
    @XmlElement(name = "CommissionCalcInfoSysKey")
    protected List<SYSKEY> commissionCalcInfoSysKey;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "UserCode")
    protected String userCode;
    @XmlElement(name = "EffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDate;
    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "PremiumDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar premiumDueDate;
    @XmlElement(name = "ProcessingType")
    protected OLILUPROCTYPE processingType;
    @XmlElement(name = "CommissionableEvent")
    protected OLILUCOMMEVENT commissionableEvent;
    @XmlElement(name = "CommissionableEventDesc")
    protected String commissionableEventDesc;
    @XmlElement(name = "ProductionAffectedInd")
    protected OLILUBOOLEAN productionAffectedInd;
    @XmlElement(name = "DecreaseInd")
    protected OLILUBOOLEAN decreaseInd;
    @XmlElement(name = "CarrierAdminSubSystem")
    protected OLILUSUBSYSTEM carrierAdminSubSystem;
    @XmlElement(name = "CommissionCalcActivity")
    protected List<CommissionCalcActivityType> commissionCalcActivity;
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
     * Gets the value of the commissionCalcInfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getCommissionCalcInfoKey() {
        return commissionCalcInfoKey;
    }

    /**
     * Sets the value of the commissionCalcInfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setCommissionCalcInfoKey(PERSISTKEY value) {
        this.commissionCalcInfoKey = value;
    }

    /**
     * Gets the value of the commissionCalcInfoSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionCalcInfoSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionCalcInfoSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getCommissionCalcInfoSysKey() {
        if (commissionCalcInfoSysKey == null) {
            commissionCalcInfoSysKey = new ArrayList<SYSKEY>();
        }
        return this.commissionCalcInfoSysKey;
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
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
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
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the premiumDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPremiumDueDate() {
        return premiumDueDate;
    }

    /**
     * Sets the value of the premiumDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPremiumDueDate(XMLGregorianCalendar value) {
        this.premiumDueDate = value;
    }

    /**
     * Gets the value of the processingType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPROCTYPE }
     *     
     */
    public OLILUPROCTYPE getProcessingType() {
        return processingType;
    }

    /**
     * Sets the value of the processingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPROCTYPE }
     *     
     */
    public void setProcessingType(OLILUPROCTYPE value) {
        this.processingType = value;
    }

    /**
     * Gets the value of the commissionableEvent property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOMMEVENT }
     *     
     */
    public OLILUCOMMEVENT getCommissionableEvent() {
        return commissionableEvent;
    }

    /**
     * Sets the value of the commissionableEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOMMEVENT }
     *     
     */
    public void setCommissionableEvent(OLILUCOMMEVENT value) {
        this.commissionableEvent = value;
    }

    /**
     * Gets the value of the commissionableEventDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionableEventDesc() {
        return commissionableEventDesc;
    }

    /**
     * Sets the value of the commissionableEventDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionableEventDesc(String value) {
        this.commissionableEventDesc = value;
    }

    /**
     * Gets the value of the productionAffectedInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getProductionAffectedInd() {
        return productionAffectedInd;
    }

    /**
     * Sets the value of the productionAffectedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setProductionAffectedInd(OLILUBOOLEAN value) {
        this.productionAffectedInd = value;
    }

    /**
     * Gets the value of the decreaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getDecreaseInd() {
        return decreaseInd;
    }

    /**
     * Sets the value of the decreaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setDecreaseInd(OLILUBOOLEAN value) {
        this.decreaseInd = value;
    }

    /**
     * Gets the value of the carrierAdminSubSystem property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSUBSYSTEM }
     *     
     */
    public OLILUSUBSYSTEM getCarrierAdminSubSystem() {
        return carrierAdminSubSystem;
    }

    /**
     * Sets the value of the carrierAdminSubSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSUBSYSTEM }
     *     
     */
    public void setCarrierAdminSubSystem(OLILUSUBSYSTEM value) {
        this.carrierAdminSubSystem = value;
    }

    /**
     * Gets the value of the commissionCalcActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionCalcActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionCalcActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionCalcActivityType }
     * 
     * 
     */
    public List<CommissionCalcActivityType> getCommissionCalcActivity() {
        if (commissionCalcActivity == null) {
            commissionCalcActivity = new ArrayList<CommissionCalcActivityType>();
        }
        return this.commissionCalcActivity;
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