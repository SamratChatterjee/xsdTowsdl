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
 * <p>Java class for TargetAgeRestriction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetAgeRestriction_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TargetAgeRestrictionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TargetAgeRestrictionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TargetAgeRule" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TargetAgeRuleValue" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TargetAgeRuleEntity" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AgeCalculationType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AgeRestrictionRule" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TargetAgeRuleEntityInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}JurisdictionApproval" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TargetAgeRestriction_Type", propOrder = {
    "targetAgeRestrictionKey",
    "targetAgeRestrictionSysKey",
    "targetAgeRule",
    "targetAgeRuleValue",
    "targetAgeRuleEntity",
    "ageCalculationType",
    "ageRestrictionRule",
    "targetAgeRuleEntityInfo",
    "jurisdictionApproval",
    "oLifEExtension"
})
public class TargetAgeRestrictionType {

    @XmlElement(name = "TargetAgeRestrictionKey")
    protected PERSISTKEY targetAgeRestrictionKey;
    @XmlElement(name = "TargetAgeRestrictionSysKey")
    protected List<SYSKEY> targetAgeRestrictionSysKey;
    @XmlElement(name = "TargetAgeRule")
    protected OLILUTARGETAGERULE targetAgeRule;
    @XmlElement(name = "TargetAgeRuleValue")
    protected Double targetAgeRuleValue;
    @XmlElement(name = "TargetAgeRuleEntity")
    protected OLILUPARTICROLE targetAgeRuleEntity;
    @XmlElement(name = "AgeCalculationType")
    protected OLILUAGECALCMETH ageCalculationType;
    @XmlElement(name = "AgeRestrictionRule")
    protected OLILUPARTYSELECT ageRestrictionRule;
    @XmlElement(name = "TargetAgeRuleEntityInfo")
    protected List<TargetAgeRuleEntityInfoType> targetAgeRuleEntityInfo;
    @XmlElement(name = "JurisdictionApproval")
    protected List<JurisdictionApprovalType> jurisdictionApproval;
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
     * Gets the value of the targetAgeRestrictionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getTargetAgeRestrictionKey() {
        return targetAgeRestrictionKey;
    }

    /**
     * Sets the value of the targetAgeRestrictionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setTargetAgeRestrictionKey(PERSISTKEY value) {
        this.targetAgeRestrictionKey = value;
    }

    /**
     * Gets the value of the targetAgeRestrictionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetAgeRestrictionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetAgeRestrictionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getTargetAgeRestrictionSysKey() {
        if (targetAgeRestrictionSysKey == null) {
            targetAgeRestrictionSysKey = new ArrayList<SYSKEY>();
        }
        return this.targetAgeRestrictionSysKey;
    }

    /**
     * Gets the value of the targetAgeRule property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTARGETAGERULE }
     *     
     */
    public OLILUTARGETAGERULE getTargetAgeRule() {
        return targetAgeRule;
    }

    /**
     * Sets the value of the targetAgeRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTARGETAGERULE }
     *     
     */
    public void setTargetAgeRule(OLILUTARGETAGERULE value) {
        this.targetAgeRule = value;
    }

    /**
     * Gets the value of the targetAgeRuleValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetAgeRuleValue() {
        return targetAgeRuleValue;
    }

    /**
     * Sets the value of the targetAgeRuleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetAgeRuleValue(Double value) {
        this.targetAgeRuleValue = value;
    }

    /**
     * Gets the value of the targetAgeRuleEntity property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPARTICROLE }
     *     
     */
    public OLILUPARTICROLE getTargetAgeRuleEntity() {
        return targetAgeRuleEntity;
    }

    /**
     * Sets the value of the targetAgeRuleEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPARTICROLE }
     *     
     */
    public void setTargetAgeRuleEntity(OLILUPARTICROLE value) {
        this.targetAgeRuleEntity = value;
    }

    /**
     * Gets the value of the ageCalculationType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUAGECALCMETH }
     *     
     */
    public OLILUAGECALCMETH getAgeCalculationType() {
        return ageCalculationType;
    }

    /**
     * Sets the value of the ageCalculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUAGECALCMETH }
     *     
     */
    public void setAgeCalculationType(OLILUAGECALCMETH value) {
        this.ageCalculationType = value;
    }

    /**
     * Gets the value of the ageRestrictionRule property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPARTYSELECT }
     *     
     */
    public OLILUPARTYSELECT getAgeRestrictionRule() {
        return ageRestrictionRule;
    }

    /**
     * Sets the value of the ageRestrictionRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPARTYSELECT }
     *     
     */
    public void setAgeRestrictionRule(OLILUPARTYSELECT value) {
        this.ageRestrictionRule = value;
    }

    /**
     * Gets the value of the targetAgeRuleEntityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetAgeRuleEntityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetAgeRuleEntityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetAgeRuleEntityInfoType }
     * 
     * 
     */
    public List<TargetAgeRuleEntityInfoType> getTargetAgeRuleEntityInfo() {
        if (targetAgeRuleEntityInfo == null) {
            targetAgeRuleEntityInfo = new ArrayList<TargetAgeRuleEntityInfoType>();
        }
        return this.targetAgeRuleEntityInfo;
    }

    /**
     * Gets the value of the jurisdictionApproval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdictionApproval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdictionApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JurisdictionApprovalType }
     * 
     * 
     */
    public List<JurisdictionApprovalType> getJurisdictionApproval() {
        if (jurisdictionApproval == null) {
            jurisdictionApproval = new ArrayList<JurisdictionApprovalType>();
        }
        return this.jurisdictionApproval;
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
