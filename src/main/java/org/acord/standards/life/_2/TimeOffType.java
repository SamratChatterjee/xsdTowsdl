//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

import java.math.BigDecimal;
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
 * <p>Java class for TimeOff_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeOff_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeOffKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeOffSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeOffType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeOffCompensationType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AsOfDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeOffPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeOffPeriodQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeOffBalance" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeOffBalanceUnits" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeOffBalanceExpectedCost" minOccurs="0"/>
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
@XmlType(name = "TimeOff_Type", propOrder = {
    "timeOffKey",
    "timeOffSysKey",
    "timeOffType",
    "timeOffCompensationType",
    "asOfDate",
    "timeOffPeriod",
    "timeOffPeriodQualifier",
    "timeOffBalance",
    "timeOffBalanceUnits",
    "timeOffBalanceExpectedCost",
    "oLifEExtension"
})
public class TimeOffType {

    @XmlElement(name = "TimeOffKey")
    protected PERSISTKEY timeOffKey;
    @XmlElement(name = "TimeOffSysKey")
    protected List<SYSKEY> timeOffSysKey;
    @XmlElement(name = "TimeOffType")
    protected OLILUTIMEOFFTYPE timeOffType;
    @XmlElement(name = "TimeOffCompensationType")
    protected OLILUTIMEOFFCOMPENSTYPE timeOffCompensationType;
    @XmlElement(name = "AsOfDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    @XmlElement(name = "TimeOffPeriod")
    protected Double timeOffPeriod;
    @XmlElement(name = "TimeOffPeriodQualifier")
    protected OLILUMEASUNITS timeOffPeriodQualifier;
    @XmlElement(name = "TimeOffBalance")
    protected Double timeOffBalance;
    @XmlElement(name = "TimeOffBalanceUnits")
    protected OLILUMEASUNITS timeOffBalanceUnits;
    @XmlElement(name = "TimeOffBalanceExpectedCost")
    protected BigDecimal timeOffBalanceExpectedCost;
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
     * Gets the value of the timeOffKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getTimeOffKey() {
        return timeOffKey;
    }

    /**
     * Sets the value of the timeOffKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setTimeOffKey(PERSISTKEY value) {
        this.timeOffKey = value;
    }

    /**
     * Gets the value of the timeOffSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeOffSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeOffSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getTimeOffSysKey() {
        if (timeOffSysKey == null) {
            timeOffSysKey = new ArrayList<SYSKEY>();
        }
        return this.timeOffSysKey;
    }

    /**
     * Gets the value of the timeOffType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTIMEOFFTYPE }
     *     
     */
    public OLILUTIMEOFFTYPE getTimeOffType() {
        return timeOffType;
    }

    /**
     * Sets the value of the timeOffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTIMEOFFTYPE }
     *     
     */
    public void setTimeOffType(OLILUTIMEOFFTYPE value) {
        this.timeOffType = value;
    }

    /**
     * Gets the value of the timeOffCompensationType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTIMEOFFCOMPENSTYPE }
     *     
     */
    public OLILUTIMEOFFCOMPENSTYPE getTimeOffCompensationType() {
        return timeOffCompensationType;
    }

    /**
     * Sets the value of the timeOffCompensationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTIMEOFFCOMPENSTYPE }
     *     
     */
    public void setTimeOffCompensationType(OLILUTIMEOFFCOMPENSTYPE value) {
        this.timeOffCompensationType = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the timeOffPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTimeOffPeriod() {
        return timeOffPeriod;
    }

    /**
     * Sets the value of the timeOffPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTimeOffPeriod(Double value) {
        this.timeOffPeriod = value;
    }

    /**
     * Gets the value of the timeOffPeriodQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getTimeOffPeriodQualifier() {
        return timeOffPeriodQualifier;
    }

    /**
     * Sets the value of the timeOffPeriodQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setTimeOffPeriodQualifier(OLILUMEASUNITS value) {
        this.timeOffPeriodQualifier = value;
    }

    /**
     * Gets the value of the timeOffBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTimeOffBalance() {
        return timeOffBalance;
    }

    /**
     * Sets the value of the timeOffBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTimeOffBalance(Double value) {
        this.timeOffBalance = value;
    }

    /**
     * Gets the value of the timeOffBalanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getTimeOffBalanceUnits() {
        return timeOffBalanceUnits;
    }

    /**
     * Sets the value of the timeOffBalanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setTimeOffBalanceUnits(OLILUMEASUNITS value) {
        this.timeOffBalanceUnits = value;
    }

    /**
     * Gets the value of the timeOffBalanceExpectedCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeOffBalanceExpectedCost() {
        return timeOffBalanceExpectedCost;
    }

    /**
     * Sets the value of the timeOffBalanceExpectedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeOffBalanceExpectedCost(BigDecimal value) {
        this.timeOffBalanceExpectedCost = value;
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
