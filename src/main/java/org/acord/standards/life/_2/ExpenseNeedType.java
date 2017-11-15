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
 * <p>Java class for ExpenseNeed_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpenseNeed_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpenseNeedKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpenseNeedSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpenseNeedTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Objective" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxInterpretationFlag" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedAmount" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedAmountBasedOn" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Frequency" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StartDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StartDateBasedOn" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EndDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EndDateBasedOn" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SolutionType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}VendorCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ScenarioName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimesRuleNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ScenarioID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseNeed_Type", propOrder = {
    "expenseNeedKey",
    "expenseNeedSysKey",
    "needName",
    "expenseNeedTypeCode",
    "objective",
    "taxInterpretationFlag",
    "needAmount",
    "needAmountBasedOn",
    "needPct",
    "frequency",
    "startDate",
    "startDateBasedOn",
    "endDate",
    "endDateBasedOn",
    "solutionType",
    "vendorCode",
    "scenarioName",
    "timesRuleNumber",
    "attachment",
    "oLifEExtension"
})
public class ExpenseNeedType {

    @XmlElement(name = "ExpenseNeedKey")
    protected PERSISTKEY expenseNeedKey;
    @XmlElement(name = "ExpenseNeedSysKey")
    protected List<SYSKEY> expenseNeedSysKey;
    @XmlElement(name = "NeedName")
    protected String needName;
    @XmlElement(name = "ExpenseNeedTypeCode")
    protected OLILUNEED expenseNeedTypeCode;
    @XmlElement(name = "Objective")
    protected OLILUINVESTOBJ objective;
    @XmlElement(name = "TaxInterpretationFlag")
    protected OLILUBOOLEAN taxInterpretationFlag;
    @XmlElement(name = "NeedAmount")
    protected BigDecimal needAmount;
    @XmlElement(name = "NeedAmountBasedOn")
    protected OLILUNEEDAMTBASIS needAmountBasedOn;
    @XmlElement(name = "NeedPct")
    protected Double needPct;
    @XmlElement(name = "Frequency")
    protected OLILUFREQ frequency;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StartDateBasedOn")
    protected OLILUSTARTDATEBASIS startDateBasedOn;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "EndDateBasedOn")
    protected OLILUENDDATEBASIS endDateBasedOn;
    @XmlElement(name = "SolutionType")
    protected OLILUSOLUTIONTYPE solutionType;
    @XmlElement(name = "VendorCode")
    protected String vendorCode;
    @XmlElement(name = "ScenarioName")
    protected String scenarioName;
    @XmlElement(name = "TimesRuleNumber")
    protected BigInteger timesRuleNumber;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ScenarioID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object scenarioID;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;

    /**
     * Gets the value of the expenseNeedKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getExpenseNeedKey() {
        return expenseNeedKey;
    }

    /**
     * Sets the value of the expenseNeedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setExpenseNeedKey(PERSISTKEY value) {
        this.expenseNeedKey = value;
    }

    /**
     * Gets the value of the expenseNeedSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseNeedSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseNeedSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getExpenseNeedSysKey() {
        if (expenseNeedSysKey == null) {
            expenseNeedSysKey = new ArrayList<SYSKEY>();
        }
        return this.expenseNeedSysKey;
    }

    /**
     * Gets the value of the needName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedName() {
        return needName;
    }

    /**
     * Sets the value of the needName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedName(String value) {
        this.needName = value;
    }

    /**
     * Gets the value of the expenseNeedTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNEED }
     *     
     */
    public OLILUNEED getExpenseNeedTypeCode() {
        return expenseNeedTypeCode;
    }

    /**
     * Sets the value of the expenseNeedTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNEED }
     *     
     */
    public void setExpenseNeedTypeCode(OLILUNEED value) {
        this.expenseNeedTypeCode = value;
    }

    /**
     * Gets the value of the objective property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUINVESTOBJ }
     *     
     */
    public OLILUINVESTOBJ getObjective() {
        return objective;
    }

    /**
     * Sets the value of the objective property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUINVESTOBJ }
     *     
     */
    public void setObjective(OLILUINVESTOBJ value) {
        this.objective = value;
    }

    /**
     * Gets the value of the taxInterpretationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getTaxInterpretationFlag() {
        return taxInterpretationFlag;
    }

    /**
     * Sets the value of the taxInterpretationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setTaxInterpretationFlag(OLILUBOOLEAN value) {
        this.taxInterpretationFlag = value;
    }

    /**
     * Gets the value of the needAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNeedAmount() {
        return needAmount;
    }

    /**
     * Sets the value of the needAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNeedAmount(BigDecimal value) {
        this.needAmount = value;
    }

    /**
     * Gets the value of the needAmountBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNEEDAMTBASIS }
     *     
     */
    public OLILUNEEDAMTBASIS getNeedAmountBasedOn() {
        return needAmountBasedOn;
    }

    /**
     * Sets the value of the needAmountBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNEEDAMTBASIS }
     *     
     */
    public void setNeedAmountBasedOn(OLILUNEEDAMTBASIS value) {
        this.needAmountBasedOn = value;
    }

    /**
     * Gets the value of the needPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNeedPct() {
        return needPct;
    }

    /**
     * Sets the value of the needPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNeedPct(Double value) {
        this.needPct = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUFREQ }
     *     
     */
    public OLILUFREQ getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUFREQ }
     *     
     */
    public void setFrequency(OLILUFREQ value) {
        this.frequency = value;
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
     * Gets the value of the startDateBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSTARTDATEBASIS }
     *     
     */
    public OLILUSTARTDATEBASIS getStartDateBasedOn() {
        return startDateBasedOn;
    }

    /**
     * Sets the value of the startDateBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSTARTDATEBASIS }
     *     
     */
    public void setStartDateBasedOn(OLILUSTARTDATEBASIS value) {
        this.startDateBasedOn = value;
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
     * Gets the value of the endDateBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUENDDATEBASIS }
     *     
     */
    public OLILUENDDATEBASIS getEndDateBasedOn() {
        return endDateBasedOn;
    }

    /**
     * Sets the value of the endDateBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUENDDATEBASIS }
     *     
     */
    public void setEndDateBasedOn(OLILUENDDATEBASIS value) {
        this.endDateBasedOn = value;
    }

    /**
     * Gets the value of the solutionType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSOLUTIONTYPE }
     *     
     */
    public OLILUSOLUTIONTYPE getSolutionType() {
        return solutionType;
    }

    /**
     * Sets the value of the solutionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSOLUTIONTYPE }
     *     
     */
    public void setSolutionType(OLILUSOLUTIONTYPE value) {
        this.solutionType = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the scenarioName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScenarioName() {
        return scenarioName;
    }

    /**
     * Sets the value of the scenarioName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScenarioName(String value) {
        this.scenarioName = value;
    }

    /**
     * Gets the value of the timesRuleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimesRuleNumber() {
        return timesRuleNumber;
    }

    /**
     * Sets the value of the timesRuleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimesRuleNumber(BigInteger value) {
        this.timesRuleNumber = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
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
     * Gets the value of the scenarioID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getScenarioID() {
        return scenarioID;
    }

    /**
     * Sets the value of the scenarioID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setScenarioID(Object value) {
        this.scenarioID = value;
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