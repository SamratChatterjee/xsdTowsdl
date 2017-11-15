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
 * <p>Java class for SettlementInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SettlementInfoKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SettlementInfoSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AccountNumberSubmitter" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NameSubmitter" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ReferenceNo" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RelatedRefIDType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SettlementDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SettlementDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}KeyedValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="SubmitterPartyID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="RelatedRefID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="SettlementVendorID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInfo_Type", propOrder = {
    "settlementInfoKey",
    "settlementInfoSysKey",
    "accountNumberSubmitter",
    "nameSubmitter",
    "referenceNo",
    "description",
    "relatedRefIDType",
    "settlementDate",
    "settlementDetail",
    "keyedValue",
    "oLifEExtension"
})
public class SettlementInfoType {

    @XmlElement(name = "SettlementInfoKey")
    protected PERSISTKEY settlementInfoKey;
    @XmlElement(name = "SettlementInfoSysKey")
    protected List<SYSKEY> settlementInfoSysKey;
    @XmlElement(name = "AccountNumberSubmitter")
    protected String accountNumberSubmitter;
    @XmlElement(name = "NameSubmitter")
    protected String nameSubmitter;
    @XmlElement(name = "ReferenceNo")
    protected String referenceNo;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "RelatedRefIDType")
    protected OLILUIDREFTYPE relatedRefIDType;
    @XmlElement(name = "SettlementDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar settlementDate;
    @XmlElement(name = "SettlementDetail")
    protected List<SettlementDetailType> settlementDetail;
    @XmlElement(name = "KeyedValue")
    protected List<KeyedValueType> keyedValue;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "SubmitterPartyID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object submitterPartyID;
    @XmlAttribute(name = "RelatedRefID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object relatedRefID;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;
    @XmlAttribute(name = "SettlementVendorID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object settlementVendorID;

    /**
     * Gets the value of the settlementInfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getSettlementInfoKey() {
        return settlementInfoKey;
    }

    /**
     * Sets the value of the settlementInfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setSettlementInfoKey(PERSISTKEY value) {
        this.settlementInfoKey = value;
    }

    /**
     * Gets the value of the settlementInfoSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementInfoSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementInfoSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getSettlementInfoSysKey() {
        if (settlementInfoSysKey == null) {
            settlementInfoSysKey = new ArrayList<SYSKEY>();
        }
        return this.settlementInfoSysKey;
    }

    /**
     * Gets the value of the accountNumberSubmitter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberSubmitter() {
        return accountNumberSubmitter;
    }

    /**
     * Sets the value of the accountNumberSubmitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberSubmitter(String value) {
        this.accountNumberSubmitter = value;
    }

    /**
     * Gets the value of the nameSubmitter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSubmitter() {
        return nameSubmitter;
    }

    /**
     * Sets the value of the nameSubmitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSubmitter(String value) {
        this.nameSubmitter = value;
    }

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the relatedRefIDType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUIDREFTYPE }
     *     
     */
    public OLILUIDREFTYPE getRelatedRefIDType() {
        return relatedRefIDType;
    }

    /**
     * Sets the value of the relatedRefIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUIDREFTYPE }
     *     
     */
    public void setRelatedRefIDType(OLILUIDREFTYPE value) {
        this.relatedRefIDType = value;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementDate(XMLGregorianCalendar value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the settlementDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementDetailType }
     * 
     * 
     */
    public List<SettlementDetailType> getSettlementDetail() {
        if (settlementDetail == null) {
            settlementDetail = new ArrayList<SettlementDetailType>();
        }
        return this.settlementDetail;
    }

    /**
     * Gets the value of the keyedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyedValueType }
     * 
     * 
     */
    public List<KeyedValueType> getKeyedValue() {
        if (keyedValue == null) {
            keyedValue = new ArrayList<KeyedValueType>();
        }
        return this.keyedValue;
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
     * Gets the value of the submitterPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubmitterPartyID() {
        return submitterPartyID;
    }

    /**
     * Sets the value of the submitterPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubmitterPartyID(Object value) {
        this.submitterPartyID = value;
    }

    /**
     * Gets the value of the relatedRefID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRelatedRefID() {
        return relatedRefID;
    }

    /**
     * Sets the value of the relatedRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRelatedRefID(Object value) {
        this.relatedRefID = value;
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
     * Gets the value of the settlementVendorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSettlementVendorID() {
        return settlementVendorID;
    }

    /**
     * Sets the value of the settlementVendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSettlementVendorID(Object value) {
        this.settlementVendorID = value;
    }

}
