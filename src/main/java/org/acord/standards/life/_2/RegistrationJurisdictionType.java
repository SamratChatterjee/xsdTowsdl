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
 * <p>Java class for RegistrationJurisdiction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationJurisdiction_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RegistrationJurisdictionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RegistrationJurisdictionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StatusDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Nation" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RegistrationType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RegistrationEntity" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DeficiencyReason" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StatusDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Jurisdiction" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ResidentOfState" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Attachment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RegistrationJurisdiction_Type", propOrder = {
    "registrationJurisdictionKey",
    "registrationJurisdictionSysKey",
    "statusDate",
    "nation",
    "registrationType",
    "registrationEntity",
    "deficiencyReason",
    "statusDesc",
    "jurisdiction",
    "residentOfState",
    "effDate",
    "expDate",
    "attachment",
    "oLifEExtension"
})
public class RegistrationJurisdictionType {

    @XmlElement(name = "RegistrationJurisdictionKey")
    protected PERSISTKEY registrationJurisdictionKey;
    @XmlElement(name = "RegistrationJurisdictionSysKey")
    protected List<SYSKEY> registrationJurisdictionSysKey;
    @XmlElement(name = "StatusDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(name = "Nation")
    protected OLILUNATION nation;
    @XmlElement(name = "RegistrationType")
    protected OLILUREGISTRATIONTYPE registrationType;
    @XmlElement(name = "RegistrationEntity")
    protected OLILUREGISTRATIONENTITY registrationEntity;
    @XmlElement(name = "DeficiencyReason")
    protected String deficiencyReason;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "Jurisdiction")
    protected OLILUSTATE jurisdiction;
    @XmlElement(name = "ResidentOfState")
    protected OLILUBOOLEAN residentOfState;
    @XmlElement(name = "EffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDate;
    @XmlElement(name = "ExpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDate;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
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
     * Gets the value of the registrationJurisdictionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getRegistrationJurisdictionKey() {
        return registrationJurisdictionKey;
    }

    /**
     * Sets the value of the registrationJurisdictionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setRegistrationJurisdictionKey(PERSISTKEY value) {
        this.registrationJurisdictionKey = value;
    }

    /**
     * Gets the value of the registrationJurisdictionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationJurisdictionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationJurisdictionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getRegistrationJurisdictionSysKey() {
        if (registrationJurisdictionSysKey == null) {
            registrationJurisdictionSysKey = new ArrayList<SYSKEY>();
        }
        return this.registrationJurisdictionSysKey;
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
     * Gets the value of the nation property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNATION }
     *     
     */
    public OLILUNATION getNation() {
        return nation;
    }

    /**
     * Sets the value of the nation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNATION }
     *     
     */
    public void setNation(OLILUNATION value) {
        this.nation = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUREGISTRATIONTYPE }
     *     
     */
    public OLILUREGISTRATIONTYPE getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUREGISTRATIONTYPE }
     *     
     */
    public void setRegistrationType(OLILUREGISTRATIONTYPE value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the registrationEntity property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUREGISTRATIONENTITY }
     *     
     */
    public OLILUREGISTRATIONENTITY getRegistrationEntity() {
        return registrationEntity;
    }

    /**
     * Sets the value of the registrationEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUREGISTRATIONENTITY }
     *     
     */
    public void setRegistrationEntity(OLILUREGISTRATIONENTITY value) {
        this.registrationEntity = value;
    }

    /**
     * Gets the value of the deficiencyReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeficiencyReason() {
        return deficiencyReason;
    }

    /**
     * Sets the value of the deficiencyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeficiencyReason(String value) {
        this.deficiencyReason = value;
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
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSTATE }
     *     
     */
    public OLILUSTATE getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSTATE }
     *     
     */
    public void setJurisdiction(OLILUSTATE value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the residentOfState property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getResidentOfState() {
        return residentOfState;
    }

    /**
     * Sets the value of the residentOfState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setResidentOfState(OLILUBOOLEAN value) {
        this.residentOfState = value;
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