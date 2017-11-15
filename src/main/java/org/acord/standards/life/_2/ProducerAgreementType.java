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
 * <p>Java class for ProducerAgreement_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProducerAgreement_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProducerAgreementKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProducerAgreementSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProducerType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProducerAgreementStatus" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AgreementStatusReason" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AgreementStatusReasonEvent" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}VestedType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DistributionLevel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProductTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="PartyID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="CarrierAppointmentID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="ProducerAgreementID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProducerAgreement_Type", propOrder = {
    "producerAgreementKey",
    "producerAgreementSysKey",
    "producerType",
    "producerAgreementStatus",
    "agreementStatusReason",
    "agreementStatusReasonEvent",
    "vestedType",
    "expDate",
    "effDate",
    "distributionLevel",
    "productTypeInfo",
    "oLifEExtension"
})
public class ProducerAgreementType {

    @XmlElement(name = "ProducerAgreementKey")
    protected PERSISTKEY producerAgreementKey;
    @XmlElement(name = "ProducerAgreementSysKey")
    protected List<SYSKEY> producerAgreementSysKey;
    @XmlElement(name = "ProducerType")
    protected OLILUPROTYPE producerType;
    @XmlElement(name = "ProducerAgreementStatus")
    protected OLILUPROAGRESTAT producerAgreementStatus;
    @XmlElement(name = "AgreementStatusReason")
    protected OLILUPROSTATREAS agreementStatusReason;
    @XmlElement(name = "AgreementStatusReasonEvent")
    protected OLILUPROSTATEVENT agreementStatusReasonEvent;
    @XmlElement(name = "VestedType")
    protected OLILUVESTINGTYPE vestedType;
    @XmlElement(name = "ExpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDate;
    @XmlElement(name = "EffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDate;
    @XmlElement(name = "DistributionLevel")
    protected List<DistributionLevelType> distributionLevel;
    @XmlElement(name = "ProductTypeInfo")
    protected List<ProductTypeInfoType> productTypeInfo;
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
    @XmlAttribute(name = "PartyID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object partyID;
    @XmlAttribute(name = "CarrierAppointmentID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object carrierAppointmentID;
    @XmlAttribute(name = "ProducerAgreementID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object producerAgreementID;

    /**
     * Gets the value of the producerAgreementKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getProducerAgreementKey() {
        return producerAgreementKey;
    }

    /**
     * Sets the value of the producerAgreementKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setProducerAgreementKey(PERSISTKEY value) {
        this.producerAgreementKey = value;
    }

    /**
     * Gets the value of the producerAgreementSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerAgreementSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducerAgreementSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getProducerAgreementSysKey() {
        if (producerAgreementSysKey == null) {
            producerAgreementSysKey = new ArrayList<SYSKEY>();
        }
        return this.producerAgreementSysKey;
    }

    /**
     * Gets the value of the producerType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPROTYPE }
     *     
     */
    public OLILUPROTYPE getProducerType() {
        return producerType;
    }

    /**
     * Sets the value of the producerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPROTYPE }
     *     
     */
    public void setProducerType(OLILUPROTYPE value) {
        this.producerType = value;
    }

    /**
     * Gets the value of the producerAgreementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPROAGRESTAT }
     *     
     */
    public OLILUPROAGRESTAT getProducerAgreementStatus() {
        return producerAgreementStatus;
    }

    /**
     * Sets the value of the producerAgreementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPROAGRESTAT }
     *     
     */
    public void setProducerAgreementStatus(OLILUPROAGRESTAT value) {
        this.producerAgreementStatus = value;
    }

    /**
     * Gets the value of the agreementStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPROSTATREAS }
     *     
     */
    public OLILUPROSTATREAS getAgreementStatusReason() {
        return agreementStatusReason;
    }

    /**
     * Sets the value of the agreementStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPROSTATREAS }
     *     
     */
    public void setAgreementStatusReason(OLILUPROSTATREAS value) {
        this.agreementStatusReason = value;
    }

    /**
     * Gets the value of the agreementStatusReasonEvent property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPROSTATEVENT }
     *     
     */
    public OLILUPROSTATEVENT getAgreementStatusReasonEvent() {
        return agreementStatusReasonEvent;
    }

    /**
     * Sets the value of the agreementStatusReasonEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPROSTATEVENT }
     *     
     */
    public void setAgreementStatusReasonEvent(OLILUPROSTATEVENT value) {
        this.agreementStatusReasonEvent = value;
    }

    /**
     * Gets the value of the vestedType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUVESTINGTYPE }
     *     
     */
    public OLILUVESTINGTYPE getVestedType() {
        return vestedType;
    }

    /**
     * Sets the value of the vestedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUVESTINGTYPE }
     *     
     */
    public void setVestedType(OLILUVESTINGTYPE value) {
        this.vestedType = value;
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
     * Gets the value of the distributionLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionLevelType }
     * 
     * 
     */
    public List<DistributionLevelType> getDistributionLevel() {
        if (distributionLevel == null) {
            distributionLevel = new ArrayList<DistributionLevelType>();
        }
        return this.distributionLevel;
    }

    /**
     * Gets the value of the productTypeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTypeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductTypeInfoType }
     * 
     * 
     */
    public List<ProductTypeInfoType> getProductTypeInfo() {
        if (productTypeInfo == null) {
            productTypeInfo = new ArrayList<ProductTypeInfoType>();
        }
        return this.productTypeInfo;
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

    /**
     * Gets the value of the partyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPartyID() {
        return partyID;
    }

    /**
     * Sets the value of the partyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPartyID(Object value) {
        this.partyID = value;
    }

    /**
     * Gets the value of the carrierAppointmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCarrierAppointmentID() {
        return carrierAppointmentID;
    }

    /**
     * Sets the value of the carrierAppointmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCarrierAppointmentID(Object value) {
        this.carrierAppointmentID = value;
    }

    /**
     * Gets the value of the producerAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProducerAgreementID() {
        return producerAgreementID;
    }

    /**
     * Sets the value of the producerAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProducerAgreementID(Object value) {
        this.producerAgreementID = value;
    }

}
