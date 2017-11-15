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
 * <p>Java class for Registration_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Registration_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RegistrationKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RegistrationSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StatusDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FirmName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FirmRegistrationNum" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RegistrationNum" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StatusDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RenewalDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RegistrationJurisdiction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Exam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RequirementInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="AgencyAffiliationID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registration_Type", propOrder = {
    "registrationKey",
    "registrationSysKey",
    "statusDate",
    "firmName",
    "firmRegistrationNum",
    "registrationNum",
    "statusDesc",
    "effDate",
    "expDate",
    "renewalDate",
    "registrationJurisdiction",
    "exam",
    "requirementInfo",
    "oLifEExtension"
})
public class RegistrationType {

    @XmlElement(name = "RegistrationKey")
    protected PERSISTKEY registrationKey;
    @XmlElement(name = "RegistrationSysKey")
    protected List<SYSKEY> registrationSysKey;
    @XmlElement(name = "StatusDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(name = "FirmName")
    protected String firmName;
    @XmlElement(name = "FirmRegistrationNum")
    protected String firmRegistrationNum;
    @XmlElement(name = "RegistrationNum")
    protected String registrationNum;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDate;
    @XmlElement(name = "ExpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDate;
    @XmlElement(name = "RenewalDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar renewalDate;
    @XmlElement(name = "RegistrationJurisdiction")
    protected List<RegistrationJurisdictionType> registrationJurisdiction;
    @XmlElement(name = "Exam")
    protected List<ExamType> exam;
    @XmlElement(name = "RequirementInfo")
    protected List<RequirementInfoType> requirementInfo;
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
    @XmlAttribute(name = "AgencyAffiliationID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object agencyAffiliationID;

    /**
     * Gets the value of the registrationKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getRegistrationKey() {
        return registrationKey;
    }

    /**
     * Sets the value of the registrationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setRegistrationKey(PERSISTKEY value) {
        this.registrationKey = value;
    }

    /**
     * Gets the value of the registrationSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getRegistrationSysKey() {
        if (registrationSysKey == null) {
            registrationSysKey = new ArrayList<SYSKEY>();
        }
        return this.registrationSysKey;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the firmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * Sets the value of the firmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmName(String value) {
        this.firmName = value;
    }

    /**
     * Gets the value of the firmRegistrationNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmRegistrationNum() {
        return firmRegistrationNum;
    }

    /**
     * Sets the value of the firmRegistrationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmRegistrationNum(String value) {
        this.firmRegistrationNum = value;
    }

    /**
     * Gets the value of the registrationNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNum() {
        return registrationNum;
    }

    /**
     * Sets the value of the registrationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNum(String value) {
        this.registrationNum = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
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
     * Gets the value of the renewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRenewalDate() {
        return renewalDate;
    }

    /**
     * Sets the value of the renewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRenewalDate(XMLGregorianCalendar value) {
        this.renewalDate = value;
    }

    /**
     * Gets the value of the registrationJurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationJurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationJurisdictionType }
     * 
     * 
     */
    public List<RegistrationJurisdictionType> getRegistrationJurisdiction() {
        if (registrationJurisdiction == null) {
            registrationJurisdiction = new ArrayList<RegistrationJurisdictionType>();
        }
        return this.registrationJurisdiction;
    }

    /**
     * Gets the value of the exam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExamType }
     * 
     * 
     */
    public List<ExamType> getExam() {
        if (exam == null) {
            exam = new ArrayList<ExamType>();
        }
        return this.exam;
    }

    /**
     * Gets the value of the requirementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequirementInfoType }
     * 
     * 
     */
    public List<RequirementInfoType> getRequirementInfo() {
        if (requirementInfo == null) {
            requirementInfo = new ArrayList<RequirementInfoType>();
        }
        return this.requirementInfo;
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
     * Gets the value of the agencyAffiliationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAgencyAffiliationID() {
        return agencyAffiliationID;
    }

    /**
     * Sets the value of the agencyAffiliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAgencyAffiliationID(Object value) {
        this.agencyAffiliationID = value;
    }

}
