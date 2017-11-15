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
 * <p>Java class for Exclusion_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exclusion_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExclusionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExclusionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LifeCovOptTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RelatedObjectType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LifeCovTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RiderTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RiderSubTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}KeyedValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="RelatedCovOptionID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exclusion_Type", propOrder = {
    "exclusionKey",
    "exclusionSysKey",
    "lifeCovOptTypeCode",
    "relatedObjectType",
    "lifeCovTypeCode",
    "riderTypeCode",
    "riderSubTypeCode",
    "keyedValue",
    "oLifEExtension"
})
public class ExclusionType {

    @XmlElement(name = "ExclusionKey")
    protected PERSISTKEY exclusionKey;
    @XmlElement(name = "ExclusionSysKey")
    protected List<SYSKEY> exclusionSysKey;
    @XmlElement(name = "LifeCovOptTypeCode")
    protected OLILUOPTTYPE lifeCovOptTypeCode;
    @XmlElement(name = "RelatedObjectType")
    protected OLILUOBJECTTYPE relatedObjectType;
    @XmlElement(name = "LifeCovTypeCode")
    protected OLILUCOVTYPE lifeCovTypeCode;
    @XmlElement(name = "RiderTypeCode")
    protected OLILURIDERTYPE riderTypeCode;
    @XmlElement(name = "RiderSubTypeCode")
    protected OLILURIDERSUBTYPE riderSubTypeCode;
    @XmlElement(name = "KeyedValue")
    protected List<KeyedValueType> keyedValue;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "RelatedCovOptionID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object relatedCovOptionID;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;

    /**
     * Gets the value of the exclusionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getExclusionKey() {
        return exclusionKey;
    }

    /**
     * Sets the value of the exclusionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setExclusionKey(PERSISTKEY value) {
        this.exclusionKey = value;
    }

    /**
     * Gets the value of the exclusionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getExclusionSysKey() {
        if (exclusionSysKey == null) {
            exclusionSysKey = new ArrayList<SYSKEY>();
        }
        return this.exclusionSysKey;
    }

    /**
     * Gets the value of the lifeCovOptTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUOPTTYPE }
     *     
     */
    public OLILUOPTTYPE getLifeCovOptTypeCode() {
        return lifeCovOptTypeCode;
    }

    /**
     * Sets the value of the lifeCovOptTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUOPTTYPE }
     *     
     */
    public void setLifeCovOptTypeCode(OLILUOPTTYPE value) {
        this.lifeCovOptTypeCode = value;
    }

    /**
     * Gets the value of the relatedObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUOBJECTTYPE }
     *     
     */
    public OLILUOBJECTTYPE getRelatedObjectType() {
        return relatedObjectType;
    }

    /**
     * Sets the value of the relatedObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUOBJECTTYPE }
     *     
     */
    public void setRelatedObjectType(OLILUOBJECTTYPE value) {
        this.relatedObjectType = value;
    }

    /**
     * Gets the value of the lifeCovTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOVTYPE }
     *     
     */
    public OLILUCOVTYPE getLifeCovTypeCode() {
        return lifeCovTypeCode;
    }

    /**
     * Sets the value of the lifeCovTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOVTYPE }
     *     
     */
    public void setLifeCovTypeCode(OLILUCOVTYPE value) {
        this.lifeCovTypeCode = value;
    }

    /**
     * Gets the value of the riderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURIDERTYPE }
     *     
     */
    public OLILURIDERTYPE getRiderTypeCode() {
        return riderTypeCode;
    }

    /**
     * Sets the value of the riderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURIDERTYPE }
     *     
     */
    public void setRiderTypeCode(OLILURIDERTYPE value) {
        this.riderTypeCode = value;
    }

    /**
     * Gets the value of the riderSubTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURIDERSUBTYPE }
     *     
     */
    public OLILURIDERSUBTYPE getRiderSubTypeCode() {
        return riderSubTypeCode;
    }

    /**
     * Sets the value of the riderSubTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURIDERSUBTYPE }
     *     
     */
    public void setRiderSubTypeCode(OLILURIDERSUBTYPE value) {
        this.riderSubTypeCode = value;
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
     * Gets the value of the relatedCovOptionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRelatedCovOptionID() {
        return relatedCovOptionID;
    }

    /**
     * Sets the value of the relatedCovOptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRelatedCovOptionID(Object value) {
        this.relatedCovOptionID = value;
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
