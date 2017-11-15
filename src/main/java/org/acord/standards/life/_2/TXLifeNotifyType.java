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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TXLifeNotify_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TXLifeNotify_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransRefGUID"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransType"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransExeDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransExeTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransMode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InquiryLevel" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxRecords" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StartRecord" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StartDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EndDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PendingResponseOK" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NoResponseOK" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TestIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IllustrationRequest" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MIBRequest" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransResult" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifE" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}XTbML" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TXLifeNotify_Type", propOrder = {
    "transRefGUID",
    "transType",
    "transExeDate",
    "transExeTime",
    "transMode",
    "inquiryLevel",
    "maxRecords",
    "startRecord",
    "startDate",
    "endDate",
    "pendingResponseOK",
    "noResponseOK",
    "testIndicator",
    "illustrationRequest",
    "mibRequest",
    "transResult",
    "oLifE",
    "xTbML",
    "oLifEExtension"
})
public class TXLifeNotifyType {

    @XmlElement(name = "TransRefGUID", required = true)
    protected String transRefGUID;
    @XmlElement(name = "TransType", required = true)
    protected OLILUTRANSTYPECODES transType;
    @XmlElement(name = "TransExeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transExeDate;
    @XmlElement(name = "TransExeTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar transExeTime;
    @XmlElement(name = "TransMode")
    protected TRANSMODECODES transMode;
    @XmlElement(name = "InquiryLevel")
    protected INQUIRYLEVELCODES inquiryLevel;
    @XmlElement(name = "MaxRecords")
    protected BigInteger maxRecords;
    @XmlElement(name = "StartRecord")
    protected BigInteger startRecord;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "PendingResponseOK")
    protected OLILUBOOLEAN pendingResponseOK;
    @XmlElement(name = "NoResponseOK")
    protected OLILUBOOLEAN noResponseOK;
    @XmlElement(name = "TestIndicator")
    protected OLILUBOOLEAN testIndicator;
    @XmlElement(name = "IllustrationRequest")
    protected IllustrationRequestType illustrationRequest;
    @XmlElement(name = "MIBRequest")
    protected MIBRequestType mibRequest;
    @XmlElement(name = "TransResult")
    protected TransResultType transResult;
    @XmlElement(name = "OLifE")
    protected OLifEType oLifE;
    @XmlElement(name = "XTbML")
    protected XTbMLType xTbML;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;

    /**
     * Gets the value of the transRefGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransRefGUID() {
        return transRefGUID;
    }

    /**
     * Sets the value of the transRefGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransRefGUID(String value) {
        this.transRefGUID = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTRANSTYPECODES }
     *     
     */
    public OLILUTRANSTYPECODES getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTRANSTYPECODES }
     *     
     */
    public void setTransType(OLILUTRANSTYPECODES value) {
        this.transType = value;
    }

    /**
     * Gets the value of the transExeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransExeDate() {
        return transExeDate;
    }

    /**
     * Sets the value of the transExeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransExeDate(XMLGregorianCalendar value) {
        this.transExeDate = value;
    }

    /**
     * Gets the value of the transExeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransExeTime() {
        return transExeTime;
    }

    /**
     * Sets the value of the transExeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransExeTime(XMLGregorianCalendar value) {
        this.transExeTime = value;
    }

    /**
     * Gets the value of the transMode property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSMODECODES }
     *     
     */
    public TRANSMODECODES getTransMode() {
        return transMode;
    }

    /**
     * Sets the value of the transMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSMODECODES }
     *     
     */
    public void setTransMode(TRANSMODECODES value) {
        this.transMode = value;
    }

    /**
     * Gets the value of the inquiryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link INQUIRYLEVELCODES }
     *     
     */
    public INQUIRYLEVELCODES getInquiryLevel() {
        return inquiryLevel;
    }

    /**
     * Sets the value of the inquiryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link INQUIRYLEVELCODES }
     *     
     */
    public void setInquiryLevel(INQUIRYLEVELCODES value) {
        this.inquiryLevel = value;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRecords(BigInteger value) {
        this.maxRecords = value;
    }

    /**
     * Gets the value of the startRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartRecord() {
        return startRecord;
    }

    /**
     * Sets the value of the startRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartRecord(BigInteger value) {
        this.startRecord = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the pendingResponseOK property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getPendingResponseOK() {
        return pendingResponseOK;
    }

    /**
     * Sets the value of the pendingResponseOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setPendingResponseOK(OLILUBOOLEAN value) {
        this.pendingResponseOK = value;
    }

    /**
     * Gets the value of the noResponseOK property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getNoResponseOK() {
        return noResponseOK;
    }

    /**
     * Sets the value of the noResponseOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setNoResponseOK(OLILUBOOLEAN value) {
        this.noResponseOK = value;
    }

    /**
     * Gets the value of the testIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getTestIndicator() {
        return testIndicator;
    }

    /**
     * Sets the value of the testIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setTestIndicator(OLILUBOOLEAN value) {
        this.testIndicator = value;
    }

    /**
     * Gets the value of the illustrationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IllustrationRequestType }
     *     
     */
    public IllustrationRequestType getIllustrationRequest() {
        return illustrationRequest;
    }

    /**
     * Sets the value of the illustrationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IllustrationRequestType }
     *     
     */
    public void setIllustrationRequest(IllustrationRequestType value) {
        this.illustrationRequest = value;
    }

    /**
     * Gets the value of the mibRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MIBRequestType }
     *     
     */
    public MIBRequestType getMIBRequest() {
        return mibRequest;
    }

    /**
     * Sets the value of the mibRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIBRequestType }
     *     
     */
    public void setMIBRequest(MIBRequestType value) {
        this.mibRequest = value;
    }

    /**
     * Gets the value of the transResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransResultType }
     *     
     */
    public TransResultType getTransResult() {
        return transResult;
    }

    /**
     * Sets the value of the transResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransResultType }
     *     
     */
    public void setTransResult(TransResultType value) {
        this.transResult = value;
    }

    /**
     * Gets the value of the oLifE property.
     * 
     * @return
     *     possible object is
     *     {@link OLifEType }
     *     
     */
    public OLifEType getOLifE() {
        return oLifE;
    }

    /**
     * Sets the value of the oLifE property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLifEType }
     *     
     */
    public void setOLifE(OLifEType value) {
        this.oLifE = value;
    }

    /**
     * Gets the value of the xTbML property.
     * 
     * @return
     *     possible object is
     *     {@link XTbMLType }
     *     
     */
    public XTbMLType getXTbML() {
        return xTbML;
    }

    /**
     * Sets the value of the xTbML property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTbMLType }
     *     
     */
    public void setXTbML(XTbMLType value) {
        this.xTbML = value;
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

}