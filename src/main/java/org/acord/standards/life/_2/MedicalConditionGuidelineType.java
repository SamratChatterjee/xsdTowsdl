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
 * <p>Java class for MedicalConditionGuideline_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalConditionGuideline_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MedicalConditionGuidelineKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MedicalConditionGuidelineSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ConditionType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}GuidelineFailInstructionType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}HistoryDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}HistoryDurationQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxNumberOccurrences" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}GuidelineDescription" minOccurs="0"/>
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
@XmlType(name = "MedicalConditionGuideline_Type", propOrder = {
    "medicalConditionGuidelineKey",
    "medicalConditionGuidelineSysKey",
    "conditionType",
    "guidelineFailInstructionType",
    "historyDuration",
    "historyDurationQualifier",
    "maxNumberOccurrences",
    "guidelineDescription",
    "attachment",
    "oLifEExtension"
})
public class MedicalConditionGuidelineType {

    @XmlElement(name = "MedicalConditionGuidelineKey")
    protected PERSISTKEY medicalConditionGuidelineKey;
    @XmlElement(name = "MedicalConditionGuidelineSysKey")
    protected List<SYSKEY> medicalConditionGuidelineSysKey;
    @XmlElement(name = "ConditionType")
    protected OLILUMEDCOND conditionType;
    @XmlElement(name = "GuidelineFailInstructionType")
    protected OLILUGDLNFAILINST guidelineFailInstructionType;
    @XmlElement(name = "HistoryDuration")
    protected BigInteger historyDuration;
    @XmlElement(name = "HistoryDurationQualifier")
    protected OLILUMEASUNITS historyDurationQualifier;
    @XmlElement(name = "MaxNumberOccurrences")
    protected BigInteger maxNumberOccurrences;
    @XmlElement(name = "GuidelineDescription")
    protected String guidelineDescription;
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
     * Gets the value of the medicalConditionGuidelineKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getMedicalConditionGuidelineKey() {
        return medicalConditionGuidelineKey;
    }

    /**
     * Sets the value of the medicalConditionGuidelineKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setMedicalConditionGuidelineKey(PERSISTKEY value) {
        this.medicalConditionGuidelineKey = value;
    }

    /**
     * Gets the value of the medicalConditionGuidelineSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicalConditionGuidelineSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicalConditionGuidelineSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getMedicalConditionGuidelineSysKey() {
        if (medicalConditionGuidelineSysKey == null) {
            medicalConditionGuidelineSysKey = new ArrayList<SYSKEY>();
        }
        return this.medicalConditionGuidelineSysKey;
    }

    /**
     * Gets the value of the conditionType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEDCOND }
     *     
     */
    public OLILUMEDCOND getConditionType() {
        return conditionType;
    }

    /**
     * Sets the value of the conditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEDCOND }
     *     
     */
    public void setConditionType(OLILUMEDCOND value) {
        this.conditionType = value;
    }

    /**
     * Gets the value of the guidelineFailInstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUGDLNFAILINST }
     *     
     */
    public OLILUGDLNFAILINST getGuidelineFailInstructionType() {
        return guidelineFailInstructionType;
    }

    /**
     * Sets the value of the guidelineFailInstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUGDLNFAILINST }
     *     
     */
    public void setGuidelineFailInstructionType(OLILUGDLNFAILINST value) {
        this.guidelineFailInstructionType = value;
    }

    /**
     * Gets the value of the historyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHistoryDuration() {
        return historyDuration;
    }

    /**
     * Sets the value of the historyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHistoryDuration(BigInteger value) {
        this.historyDuration = value;
    }

    /**
     * Gets the value of the historyDurationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getHistoryDurationQualifier() {
        return historyDurationQualifier;
    }

    /**
     * Sets the value of the historyDurationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setHistoryDurationQualifier(OLILUMEASUNITS value) {
        this.historyDurationQualifier = value;
    }

    /**
     * Gets the value of the maxNumberOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOccurrences() {
        return maxNumberOccurrences;
    }

    /**
     * Sets the value of the maxNumberOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOccurrences(BigInteger value) {
        this.maxNumberOccurrences = value;
    }

    /**
     * Gets the value of the guidelineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidelineDescription() {
        return guidelineDescription;
    }

    /**
     * Sets the value of the guidelineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidelineDescription(String value) {
        this.guidelineDescription = value;
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
