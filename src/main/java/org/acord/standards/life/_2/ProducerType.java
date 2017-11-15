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


/**
 * <p>Java class for Producer_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Producer_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProducerKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProducerSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Certification" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NIPRNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PrefLanguage" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AlternateLanguage" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AlternateLanguageProficiency" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CRDNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EOCoverageInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}License" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierAppointment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Registration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProducerAgreement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DesignationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NationApproval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SupervisionLevel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="EOCoverageID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Producer_Type", propOrder = {
    "producerKey",
    "producerSysKey",
    "certification",
    "niprNumber",
    "prefLanguage",
    "alternateLanguage",
    "alternateLanguageProficiency",
    "crdNumber",
    "eoCoverageInfo",
    "license",
    "carrierAppointment",
    "registration",
    "producerAgreement",
    "designationInfo",
    "nationApproval",
    "supervisionLevel",
    "oLifEExtension"
})
public class ProducerType {

    @XmlElement(name = "ProducerKey")
    protected PERSISTKEY producerKey;
    @XmlElement(name = "ProducerSysKey")
    protected List<SYSKEY> producerSysKey;
    @XmlElement(name = "Certification")
    protected String certification;
    @XmlElement(name = "NIPRNumber")
    protected String niprNumber;
    @XmlElement(name = "PrefLanguage")
    protected OLILUCLIENTLANGUAGES prefLanguage;
    @XmlElement(name = "AlternateLanguage")
    protected OLILUCLIENTLANGUAGES alternateLanguage;
    @XmlElement(name = "AlternateLanguageProficiency")
    protected OLILULANGPROF alternateLanguageProficiency;
    @XmlElement(name = "CRDNumber")
    protected String crdNumber;
    @XmlElement(name = "EOCoverageInfo")
    protected List<EOCoverageInfoType> eoCoverageInfo;
    @XmlElement(name = "License")
    protected List<LicenseType> license;
    @XmlElement(name = "CarrierAppointment")
    protected List<CarrierAppointmentType> carrierAppointment;
    @XmlElement(name = "Registration")
    protected List<RegistrationType> registration;
    @XmlElement(name = "ProducerAgreement")
    protected List<ProducerAgreementType> producerAgreement;
    @XmlElement(name = "DesignationInfo")
    protected List<DesignationInfoType> designationInfo;
    @XmlElement(name = "NationApproval")
    protected List<NationApprovalType> nationApproval;
    @XmlElement(name = "SupervisionLevel")
    protected List<SupervisionLevelType> supervisionLevel;
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
    @XmlAttribute(name = "EOCoverageID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object eoCoverageID;

    /**
     * Gets the value of the producerKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getProducerKey() {
        return producerKey;
    }

    /**
     * Sets the value of the producerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setProducerKey(PERSISTKEY value) {
        this.producerKey = value;
    }

    /**
     * Gets the value of the producerSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducerSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getProducerSysKey() {
        if (producerSysKey == null) {
            producerSysKey = new ArrayList<SYSKEY>();
        }
        return this.producerSysKey;
    }

    /**
     * Gets the value of the certification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertification() {
        return certification;
    }

    /**
     * Sets the value of the certification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertification(String value) {
        this.certification = value;
    }

    /**
     * Gets the value of the niprNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIPRNumber() {
        return niprNumber;
    }

    /**
     * Sets the value of the niprNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIPRNumber(String value) {
        this.niprNumber = value;
    }

    /**
     * Gets the value of the prefLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCLIENTLANGUAGES }
     *     
     */
    public OLILUCLIENTLANGUAGES getPrefLanguage() {
        return prefLanguage;
    }

    /**
     * Sets the value of the prefLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCLIENTLANGUAGES }
     *     
     */
    public void setPrefLanguage(OLILUCLIENTLANGUAGES value) {
        this.prefLanguage = value;
    }

    /**
     * Gets the value of the alternateLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCLIENTLANGUAGES }
     *     
     */
    public OLILUCLIENTLANGUAGES getAlternateLanguage() {
        return alternateLanguage;
    }

    /**
     * Sets the value of the alternateLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCLIENTLANGUAGES }
     *     
     */
    public void setAlternateLanguage(OLILUCLIENTLANGUAGES value) {
        this.alternateLanguage = value;
    }

    /**
     * Gets the value of the alternateLanguageProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link OLILULANGPROF }
     *     
     */
    public OLILULANGPROF getAlternateLanguageProficiency() {
        return alternateLanguageProficiency;
    }

    /**
     * Sets the value of the alternateLanguageProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILULANGPROF }
     *     
     */
    public void setAlternateLanguageProficiency(OLILULANGPROF value) {
        this.alternateLanguageProficiency = value;
    }

    /**
     * Gets the value of the crdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDNumber() {
        return crdNumber;
    }

    /**
     * Sets the value of the crdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDNumber(String value) {
        this.crdNumber = value;
    }

    /**
     * Gets the value of the eoCoverageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eoCoverageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEOCoverageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EOCoverageInfoType }
     * 
     * 
     */
    public List<EOCoverageInfoType> getEOCoverageInfo() {
        if (eoCoverageInfo == null) {
            eoCoverageInfo = new ArrayList<EOCoverageInfoType>();
        }
        return this.eoCoverageInfo;
    }

    /**
     * Gets the value of the license property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the license property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseType }
     * 
     * 
     */
    public List<LicenseType> getLicense() {
        if (license == null) {
            license = new ArrayList<LicenseType>();
        }
        return this.license;
    }

    /**
     * Gets the value of the carrierAppointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierAppointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierAppointmentType }
     * 
     * 
     */
    public List<CarrierAppointmentType> getCarrierAppointment() {
        if (carrierAppointment == null) {
            carrierAppointment = new ArrayList<CarrierAppointmentType>();
        }
        return this.carrierAppointment;
    }

    /**
     * Gets the value of the registration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationType }
     * 
     * 
     */
    public List<RegistrationType> getRegistration() {
        if (registration == null) {
            registration = new ArrayList<RegistrationType>();
        }
        return this.registration;
    }

    /**
     * Gets the value of the producerAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducerAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerAgreementType }
     * 
     * 
     */
    public List<ProducerAgreementType> getProducerAgreement() {
        if (producerAgreement == null) {
            producerAgreement = new ArrayList<ProducerAgreementType>();
        }
        return this.producerAgreement;
    }

    /**
     * Gets the value of the designationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignationInfoType }
     * 
     * 
     */
    public List<DesignationInfoType> getDesignationInfo() {
        if (designationInfo == null) {
            designationInfo = new ArrayList<DesignationInfoType>();
        }
        return this.designationInfo;
    }

    /**
     * Gets the value of the nationApproval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationApproval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationApprovalType }
     * 
     * 
     */
    public List<NationApprovalType> getNationApproval() {
        if (nationApproval == null) {
            nationApproval = new ArrayList<NationApprovalType>();
        }
        return this.nationApproval;
    }

    /**
     * Gets the value of the supervisionLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supervisionLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupervisionLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupervisionLevelType }
     * 
     * 
     */
    public List<SupervisionLevelType> getSupervisionLevel() {
        if (supervisionLevel == null) {
            supervisionLevel = new ArrayList<SupervisionLevelType>();
        }
        return this.supervisionLevel;
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
     * Gets the value of the eoCoverageID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEOCoverageID() {
        return eoCoverageID;
    }

    /**
     * Sets the value of the eoCoverageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEOCoverageID(Object value) {
        this.eoCoverageID = value;
    }

}