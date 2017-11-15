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
 * <p>Java class for AdminTransactionProduct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminTransactionProduct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AdminTransactionProductKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AdminTransactionProductSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransAvailableDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransEndAvailableDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IssueEffectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IssueExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyStatusCC" minOccurs="0"/>
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
@XmlType(name = "AdminTransactionProduct_Type", propOrder = {
    "adminTransactionProductKey",
    "adminTransactionProductSysKey",
    "transAvailableDate",
    "transEndAvailableDate",
    "issueEffectiveDate",
    "issueExpirationDate",
    "transType",
    "qualifiedPlanEntity",
    "policyStatusCC",
    "oLifEExtension"
})
public class AdminTransactionProductType {

    @XmlElement(name = "AdminTransactionProductKey")
    protected PERSISTKEY adminTransactionProductKey;
    @XmlElement(name = "AdminTransactionProductSysKey")
    protected List<SYSKEY> adminTransactionProductSysKey;
    @XmlElement(name = "TransAvailableDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transAvailableDate;
    @XmlElement(name = "TransEndAvailableDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transEndAvailableDate;
    @XmlElement(name = "IssueEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueEffectiveDate;
    @XmlElement(name = "IssueExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueExpirationDate;
    @XmlElement(name = "TransType")
    protected OLILUTRANSTYPECODES transType;
    @XmlElement(name = "QualifiedPlanEntity")
    protected List<QualifiedPlanEntityType> qualifiedPlanEntity;
    @XmlElement(name = "PolicyStatusCC")
    protected PolicyStatusCCType policyStatusCC;
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
     * Gets the value of the adminTransactionProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getAdminTransactionProductKey() {
        return adminTransactionProductKey;
    }

    /**
     * Sets the value of the adminTransactionProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setAdminTransactionProductKey(PERSISTKEY value) {
        this.adminTransactionProductKey = value;
    }

    /**
     * Gets the value of the adminTransactionProductSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adminTransactionProductSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdminTransactionProductSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getAdminTransactionProductSysKey() {
        if (adminTransactionProductSysKey == null) {
            adminTransactionProductSysKey = new ArrayList<SYSKEY>();
        }
        return this.adminTransactionProductSysKey;
    }

    /**
     * Gets the value of the transAvailableDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransAvailableDate() {
        return transAvailableDate;
    }

    /**
     * Sets the value of the transAvailableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransAvailableDate(XMLGregorianCalendar value) {
        this.transAvailableDate = value;
    }

    /**
     * Gets the value of the transEndAvailableDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransEndAvailableDate() {
        return transEndAvailableDate;
    }

    /**
     * Sets the value of the transEndAvailableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransEndAvailableDate(XMLGregorianCalendar value) {
        this.transEndAvailableDate = value;
    }

    /**
     * Gets the value of the issueEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueEffectiveDate() {
        return issueEffectiveDate;
    }

    /**
     * Sets the value of the issueEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueEffectiveDate(XMLGregorianCalendar value) {
        this.issueEffectiveDate = value;
    }

    /**
     * Gets the value of the issueExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueExpirationDate() {
        return issueExpirationDate;
    }

    /**
     * Sets the value of the issueExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueExpirationDate(XMLGregorianCalendar value) {
        this.issueExpirationDate = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTRANSTYPECODES }
     *     
     */
    public OLILUTRANSTYPECODES getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTRANSTYPECODES }
     *     
     */
    public void setTransType(OLILUTRANSTYPECODES value) {
        this.transType = value;
    }

    /**
     * Gets the value of the qualifiedPlanEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedPlanEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedPlanEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPlanEntityType }
     * 
     * 
     */
    public List<QualifiedPlanEntityType> getQualifiedPlanEntity() {
        if (qualifiedPlanEntity == null) {
            qualifiedPlanEntity = new ArrayList<QualifiedPlanEntityType>();
        }
        return this.qualifiedPlanEntity;
    }

    /**
     * Gets the value of the policyStatusCC property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyStatusCCType }
     *     
     */
    public PolicyStatusCCType getPolicyStatusCC() {
        return policyStatusCC;
    }

    /**
     * Sets the value of the policyStatusCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyStatusCCType }
     *     
     */
    public void setPolicyStatusCC(PolicyStatusCCType value) {
        this.policyStatusCC = value;
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
