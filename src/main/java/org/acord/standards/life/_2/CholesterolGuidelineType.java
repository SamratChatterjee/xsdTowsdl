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
 * <p>Java class for CholesterolGuideline_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CholesterolGuideline_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CholesterolGuidelineKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CholesterolGuidelineSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}GuidelineFailInstructionType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Gender" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinTotalCholesterol" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxTotalCholesterol" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxCholesterolToHDLRatio" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TreatmentGuidelineType" minOccurs="0"/>
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
@XmlType(name = "CholesterolGuideline_Type", propOrder = {
    "cholesterolGuidelineKey",
    "cholesterolGuidelineSysKey",
    "guidelineFailInstructionType",
    "gender",
    "minTotalCholesterol",
    "maxTotalCholesterol",
    "maxCholesterolToHDLRatio",
    "treatmentGuidelineType",
    "guidelineDescription",
    "attachment",
    "oLifEExtension"
})
public class CholesterolGuidelineType {

    @XmlElement(name = "CholesterolGuidelineKey")
    protected PERSISTKEY cholesterolGuidelineKey;
    @XmlElement(name = "CholesterolGuidelineSysKey")
    protected List<SYSKEY> cholesterolGuidelineSysKey;
    @XmlElement(name = "GuidelineFailInstructionType")
    protected OLILUGDLNFAILINST guidelineFailInstructionType;
    @XmlElement(name = "Gender")
    protected OLILUGENDER gender;
    @XmlElement(name = "MinTotalCholesterol")
    protected BigInteger minTotalCholesterol;
    @XmlElement(name = "MaxTotalCholesterol")
    protected BigInteger maxTotalCholesterol;
    @XmlElement(name = "MaxCholesterolToHDLRatio")
    protected Double maxCholesterolToHDLRatio;
    @XmlElement(name = "TreatmentGuidelineType")
    protected OLILUTREATGUIDE treatmentGuidelineType;
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
     * Gets the value of the cholesterolGuidelineKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getCholesterolGuidelineKey() {
        return cholesterolGuidelineKey;
    }

    /**
     * Sets the value of the cholesterolGuidelineKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setCholesterolGuidelineKey(PERSISTKEY value) {
        this.cholesterolGuidelineKey = value;
    }

    /**
     * Gets the value of the cholesterolGuidelineSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cholesterolGuidelineSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCholesterolGuidelineSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getCholesterolGuidelineSysKey() {
        if (cholesterolGuidelineSysKey == null) {
            cholesterolGuidelineSysKey = new ArrayList<SYSKEY>();
        }
        return this.cholesterolGuidelineSysKey;
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUGENDER }
     *     
     */
    public OLILUGENDER getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUGENDER }
     *     
     */
    public void setGender(OLILUGENDER value) {
        this.gender = value;
    }

    /**
     * Gets the value of the minTotalCholesterol property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinTotalCholesterol() {
        return minTotalCholesterol;
    }

    /**
     * Sets the value of the minTotalCholesterol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinTotalCholesterol(BigInteger value) {
        this.minTotalCholesterol = value;
    }

    /**
     * Gets the value of the maxTotalCholesterol property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxTotalCholesterol() {
        return maxTotalCholesterol;
    }

    /**
     * Sets the value of the maxTotalCholesterol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxTotalCholesterol(BigInteger value) {
        this.maxTotalCholesterol = value;
    }

    /**
     * Gets the value of the maxCholesterolToHDLRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxCholesterolToHDLRatio() {
        return maxCholesterolToHDLRatio;
    }

    /**
     * Sets the value of the maxCholesterolToHDLRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxCholesterolToHDLRatio(Double value) {
        this.maxCholesterolToHDLRatio = value;
    }

    /**
     * Gets the value of the treatmentGuidelineType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTREATGUIDE }
     *     
     */
    public OLILUTREATGUIDE getTreatmentGuidelineType() {
        return treatmentGuidelineType;
    }

    /**
     * Sets the value of the treatmentGuidelineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTREATGUIDE }
     *     
     */
    public void setTreatmentGuidelineType(OLILUTREATGUIDE value) {
        this.treatmentGuidelineType = value;
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
