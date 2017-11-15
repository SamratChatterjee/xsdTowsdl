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
 * <p>Java class for QualifiedPlanOption_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifiedPlanOption_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanOptionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanOptionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanOptionCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlan" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualPlanSubType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SaleEffectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SaleExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NoNewMoneyDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InheritedTimingAllowed" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QLACInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "QualifiedPlanOption_Type", propOrder = {
    "qualifiedPlanOptionKey",
    "qualifiedPlanOptionSysKey",
    "qualifiedPlanOptionCode",
    "qualifiedPlan",
    "qualPlanSubType",
    "saleEffectiveDate",
    "saleExpirationDate",
    "noNewMoneyDate",
    "inheritedTimingAllowed",
    "qlacInfo",
    "oLifEExtension"
})
public class QualifiedPlanOptionType {

    @XmlElement(name = "QualifiedPlanOptionKey")
    protected PERSISTKEY qualifiedPlanOptionKey;
    @XmlElement(name = "QualifiedPlanOptionSysKey")
    protected List<SYSKEY> qualifiedPlanOptionSysKey;
    @XmlElement(name = "QualifiedPlanOptionCode")
    protected String qualifiedPlanOptionCode;
    @XmlElement(name = "QualifiedPlan")
    protected OLILUQUALPLAN qualifiedPlan;
    @XmlElement(name = "QualPlanSubType")
    protected OLILUQUALPLANSUBTYPE qualPlanSubType;
    @XmlElement(name = "SaleEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleEffectiveDate;
    @XmlElement(name = "SaleExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleExpirationDate;
    @XmlElement(name = "NoNewMoneyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar noNewMoneyDate;
    @XmlElement(name = "InheritedTimingAllowed")
    protected List<InheritedTimingAllowedType> inheritedTimingAllowed;
    @XmlElement(name = "QLACInfo")
    protected List<QLACInfoType> qlacInfo;
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
     * Gets the value of the qualifiedPlanOptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getQualifiedPlanOptionKey() {
        return qualifiedPlanOptionKey;
    }

    /**
     * Sets the value of the qualifiedPlanOptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setQualifiedPlanOptionKey(PERSISTKEY value) {
        this.qualifiedPlanOptionKey = value;
    }

    /**
     * Gets the value of the qualifiedPlanOptionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedPlanOptionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedPlanOptionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getQualifiedPlanOptionSysKey() {
        if (qualifiedPlanOptionSysKey == null) {
            qualifiedPlanOptionSysKey = new ArrayList<SYSKEY>();
        }
        return this.qualifiedPlanOptionSysKey;
    }

    /**
     * Gets the value of the qualifiedPlanOptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedPlanOptionCode() {
        return qualifiedPlanOptionCode;
    }

    /**
     * Sets the value of the qualifiedPlanOptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedPlanOptionCode(String value) {
        this.qualifiedPlanOptionCode = value;
    }

    /**
     * Gets the value of the qualifiedPlan property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUQUALPLAN }
     *     
     */
    public OLILUQUALPLAN getQualifiedPlan() {
        return qualifiedPlan;
    }

    /**
     * Sets the value of the qualifiedPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUQUALPLAN }
     *     
     */
    public void setQualifiedPlan(OLILUQUALPLAN value) {
        this.qualifiedPlan = value;
    }

    /**
     * Gets the value of the qualPlanSubType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUQUALPLANSUBTYPE }
     *     
     */
    public OLILUQUALPLANSUBTYPE getQualPlanSubType() {
        return qualPlanSubType;
    }

    /**
     * Sets the value of the qualPlanSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUQUALPLANSUBTYPE }
     *     
     */
    public void setQualPlanSubType(OLILUQUALPLANSUBTYPE value) {
        this.qualPlanSubType = value;
    }

    /**
     * Gets the value of the saleEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleEffectiveDate() {
        return saleEffectiveDate;
    }

    /**
     * Sets the value of the saleEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleEffectiveDate(XMLGregorianCalendar value) {
        this.saleEffectiveDate = value;
    }

    /**
     * Gets the value of the saleExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleExpirationDate() {
        return saleExpirationDate;
    }

    /**
     * Sets the value of the saleExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleExpirationDate(XMLGregorianCalendar value) {
        this.saleExpirationDate = value;
    }

    /**
     * Gets the value of the noNewMoneyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNoNewMoneyDate() {
        return noNewMoneyDate;
    }

    /**
     * Sets the value of the noNewMoneyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNoNewMoneyDate(XMLGregorianCalendar value) {
        this.noNewMoneyDate = value;
    }

    /**
     * Gets the value of the inheritedTimingAllowed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inheritedTimingAllowed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInheritedTimingAllowed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InheritedTimingAllowedType }
     * 
     * 
     */
    public List<InheritedTimingAllowedType> getInheritedTimingAllowed() {
        if (inheritedTimingAllowed == null) {
            inheritedTimingAllowed = new ArrayList<InheritedTimingAllowedType>();
        }
        return this.inheritedTimingAllowed;
    }

    /**
     * Gets the value of the qlacInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qlacInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQLACInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QLACInfoType }
     * 
     * 
     */
    public List<QLACInfoType> getQLACInfo() {
        if (qlacInfo == null) {
            qlacInfo = new ArrayList<QLACInfoType>();
        }
        return this.qlacInfo;
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
