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
 * <p>Java class for ComplexContentDescriptor_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexContentDescriptor_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ComplexContentDescriptorKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ComplexContentDescriptorSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ComplexContentCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ContentSubType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ScalingFactor" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DataType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ContentCodeType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CurrencyTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Mode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Sequence" minOccurs="0"/>
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
@XmlType(name = "ComplexContentDescriptor_Type", propOrder = {
    "complexContentDescriptorKey",
    "complexContentDescriptorSysKey",
    "complexContentCode",
    "contentSubType",
    "scalingFactor",
    "dataType",
    "contentCodeType",
    "currencyTypeCode",
    "mode",
    "description",
    "sequence",
    "oLifEExtension"
})
public class ComplexContentDescriptorType {

    @XmlElement(name = "ComplexContentDescriptorKey")
    protected PERSISTKEY complexContentDescriptorKey;
    @XmlElement(name = "ComplexContentDescriptorSysKey")
    protected List<SYSKEY> complexContentDescriptorSysKey;
    @XmlElement(name = "ComplexContentCode")
    protected String complexContentCode;
    @XmlElement(name = "ContentSubType")
    protected CONTENTSUBTYPETYPE contentSubType;
    @XmlElement(name = "ScalingFactor")
    protected BigInteger scalingFactor;
    @XmlElement(name = "DataType")
    protected OLILUDATATYPE dataType;
    @XmlElement(name = "ContentCodeType")
    protected OLILULOOKUP contentCodeType;
    @XmlElement(name = "CurrencyTypeCode")
    protected OLILUCURRENCYTYPE currencyTypeCode;
    @XmlElement(name = "Mode")
    protected OLILUPAYMODE mode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Sequence")
    protected BigInteger sequence;
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
     * Gets the value of the complexContentDescriptorKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getComplexContentDescriptorKey() {
        return complexContentDescriptorKey;
    }

    /**
     * Sets the value of the complexContentDescriptorKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setComplexContentDescriptorKey(PERSISTKEY value) {
        this.complexContentDescriptorKey = value;
    }

    /**
     * Gets the value of the complexContentDescriptorSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complexContentDescriptorSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexContentDescriptorSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getComplexContentDescriptorSysKey() {
        if (complexContentDescriptorSysKey == null) {
            complexContentDescriptorSysKey = new ArrayList<SYSKEY>();
        }
        return this.complexContentDescriptorSysKey;
    }

    /**
     * Gets the value of the complexContentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexContentCode() {
        return complexContentCode;
    }

    /**
     * Sets the value of the complexContentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexContentCode(String value) {
        this.complexContentCode = value;
    }

    /**
     * Gets the value of the contentSubType property.
     * 
     * @return
     *     possible object is
     *     {@link CONTENTSUBTYPETYPE }
     *     
     */
    public CONTENTSUBTYPETYPE getContentSubType() {
        return contentSubType;
    }

    /**
     * Sets the value of the contentSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTENTSUBTYPETYPE }
     *     
     */
    public void setContentSubType(CONTENTSUBTYPETYPE value) {
        this.contentSubType = value;
    }

    /**
     * Gets the value of the scalingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScalingFactor() {
        return scalingFactor;
    }

    /**
     * Sets the value of the scalingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScalingFactor(BigInteger value) {
        this.scalingFactor = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDATATYPE }
     *     
     */
    public OLILUDATATYPE getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDATATYPE }
     *     
     */
    public void setDataType(OLILUDATATYPE value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the contentCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILULOOKUP }
     *     
     */
    public OLILULOOKUP getContentCodeType() {
        return contentCodeType;
    }

    /**
     * Sets the value of the contentCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILULOOKUP }
     *     
     */
    public void setContentCodeType(OLILULOOKUP value) {
        this.contentCodeType = value;
    }

    /**
     * Gets the value of the currencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCURRENCYTYPE }
     *     
     */
    public OLILUCURRENCYTYPE getCurrencyTypeCode() {
        return currencyTypeCode;
    }

    /**
     * Sets the value of the currencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCURRENCYTYPE }
     *     
     */
    public void setCurrencyTypeCode(OLILUCURRENCYTYPE value) {
        this.currencyTypeCode = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public OLILUPAYMODE getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public void setMode(OLILUPAYMODE value) {
        this.mode = value;
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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
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
