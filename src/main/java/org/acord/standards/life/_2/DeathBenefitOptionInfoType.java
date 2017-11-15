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


/**
 * <p>Java class for DeathBenefitOptionInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeathBenefitOptionInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DeathBenefitOptionInfoKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DeathBenefitOptionInfoSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DefaultInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DeathBenefitOptType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DeathBenefitOptionName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AdditionalInterestRateInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DefLifeInsMethodCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ConflictObjectInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RequisiteObjectInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AgeAmtProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DefLifeInsMethodInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DeathBenefitOptionInfo_Type", propOrder = {
    "deathBenefitOptionInfoKey",
    "deathBenefitOptionInfoSysKey",
    "defaultInd",
    "deathBenefitOptType",
    "deathBenefitOptionName",
    "additionalInterestRateInfo",
    "defLifeInsMethodCC",
    "conflictObjectInfo",
    "requisiteObjectInfo",
    "ageAmtProduct",
    "defLifeInsMethodInfo",
    "attachment",
    "oLifEExtension"
})
public class DeathBenefitOptionInfoType {

    @XmlElement(name = "DeathBenefitOptionInfoKey")
    protected PERSISTKEY deathBenefitOptionInfoKey;
    @XmlElement(name = "DeathBenefitOptionInfoSysKey")
    protected List<SYSKEY> deathBenefitOptionInfoSysKey;
    @XmlElement(name = "DefaultInd")
    protected OLILUBOOLEAN defaultInd;
    @XmlElement(name = "DeathBenefitOptType")
    protected OLILUDTHBENETYPE deathBenefitOptType;
    @XmlElement(name = "DeathBenefitOptionName")
    protected String deathBenefitOptionName;
    @XmlElement(name = "AdditionalInterestRateInfo")
    protected List<AdditionalInterestRateInfoType> additionalInterestRateInfo;
    @XmlElement(name = "DefLifeInsMethodCC")
    protected DefLifeInsMethodCCType defLifeInsMethodCC;
    @XmlElement(name = "ConflictObjectInfo")
    protected List<ConflictObjectInfoType> conflictObjectInfo;
    @XmlElement(name = "RequisiteObjectInfo")
    protected List<RequisiteObjectInfoType> requisiteObjectInfo;
    @XmlElement(name = "AgeAmtProduct")
    protected List<AgeAmtProductType> ageAmtProduct;
    @XmlElement(name = "DefLifeInsMethodInfo")
    protected List<DefLifeInsMethodInfoType> defLifeInsMethodInfo;
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
     * Gets the value of the deathBenefitOptionInfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getDeathBenefitOptionInfoKey() {
        return deathBenefitOptionInfoKey;
    }

    /**
     * Sets the value of the deathBenefitOptionInfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setDeathBenefitOptionInfoKey(PERSISTKEY value) {
        this.deathBenefitOptionInfoKey = value;
    }

    /**
     * Gets the value of the deathBenefitOptionInfoSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deathBenefitOptionInfoSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeathBenefitOptionInfoSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getDeathBenefitOptionInfoSysKey() {
        if (deathBenefitOptionInfoSysKey == null) {
            deathBenefitOptionInfoSysKey = new ArrayList<SYSKEY>();
        }
        return this.deathBenefitOptionInfoSysKey;
    }

    /**
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getDefaultInd() {
        return defaultInd;
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setDefaultInd(OLILUBOOLEAN value) {
        this.defaultInd = value;
    }

    /**
     * Gets the value of the deathBenefitOptType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDTHBENETYPE }
     *     
     */
    public OLILUDTHBENETYPE getDeathBenefitOptType() {
        return deathBenefitOptType;
    }

    /**
     * Sets the value of the deathBenefitOptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDTHBENETYPE }
     *     
     */
    public void setDeathBenefitOptType(OLILUDTHBENETYPE value) {
        this.deathBenefitOptType = value;
    }

    /**
     * Gets the value of the deathBenefitOptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathBenefitOptionName() {
        return deathBenefitOptionName;
    }

    /**
     * Sets the value of the deathBenefitOptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathBenefitOptionName(String value) {
        this.deathBenefitOptionName = value;
    }

    /**
     * Gets the value of the additionalInterestRateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInterestRateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInterestRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInterestRateInfoType }
     * 
     * 
     */
    public List<AdditionalInterestRateInfoType> getAdditionalInterestRateInfo() {
        if (additionalInterestRateInfo == null) {
            additionalInterestRateInfo = new ArrayList<AdditionalInterestRateInfoType>();
        }
        return this.additionalInterestRateInfo;
    }

    /**
     * Gets the value of the defLifeInsMethodCC property.
     * 
     * @return
     *     possible object is
     *     {@link DefLifeInsMethodCCType }
     *     
     */
    public DefLifeInsMethodCCType getDefLifeInsMethodCC() {
        return defLifeInsMethodCC;
    }

    /**
     * Sets the value of the defLifeInsMethodCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefLifeInsMethodCCType }
     *     
     */
    public void setDefLifeInsMethodCC(DefLifeInsMethodCCType value) {
        this.defLifeInsMethodCC = value;
    }

    /**
     * Gets the value of the conflictObjectInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conflictObjectInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConflictObjectInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConflictObjectInfoType }
     * 
     * 
     */
    public List<ConflictObjectInfoType> getConflictObjectInfo() {
        if (conflictObjectInfo == null) {
            conflictObjectInfo = new ArrayList<ConflictObjectInfoType>();
        }
        return this.conflictObjectInfo;
    }

    /**
     * Gets the value of the requisiteObjectInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requisiteObjectInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequisiteObjectInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequisiteObjectInfoType }
     * 
     * 
     */
    public List<RequisiteObjectInfoType> getRequisiteObjectInfo() {
        if (requisiteObjectInfo == null) {
            requisiteObjectInfo = new ArrayList<RequisiteObjectInfoType>();
        }
        return this.requisiteObjectInfo;
    }

    /**
     * Gets the value of the ageAmtProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageAmtProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeAmtProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgeAmtProductType }
     * 
     * 
     */
    public List<AgeAmtProductType> getAgeAmtProduct() {
        if (ageAmtProduct == null) {
            ageAmtProduct = new ArrayList<AgeAmtProductType>();
        }
        return this.ageAmtProduct;
    }

    /**
     * Gets the value of the defLifeInsMethodInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defLifeInsMethodInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefLifeInsMethodInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefLifeInsMethodInfoType }
     * 
     * 
     */
    public List<DefLifeInsMethodInfoType> getDefLifeInsMethodInfo() {
        if (defLifeInsMethodInfo == null) {
            defLifeInsMethodInfo = new ArrayList<DefLifeInsMethodInfoType>();
        }
        return this.defLifeInsMethodInfo;
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