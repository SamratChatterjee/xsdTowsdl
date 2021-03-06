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
 * <p>Java class for DateCollection_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateCollection_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DateCollectionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DateCollectionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDateEntryRule" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EndDateEntryRule" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinDurationQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxDurationQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DateCollectionBasedOn" minOccurs="0"/>
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
@XmlType(name = "DateCollection_Type", propOrder = {
    "dateCollectionKey",
    "dateCollectionSysKey",
    "effDateEntryRule",
    "endDateEntryRule",
    "minDuration",
    "maxDuration",
    "minDurationQualifier",
    "maxDurationQualifier",
    "dateCollectionBasedOn",
    "oLifEExtension"
})
public class DateCollectionType {

    @XmlElement(name = "DateCollectionKey")
    protected PERSISTKEY dateCollectionKey;
    @XmlElement(name = "DateCollectionSysKey")
    protected List<SYSKEY> dateCollectionSysKey;
    @XmlElement(name = "EffDateEntryRule")
    protected OLILUDATECOLLECT effDateEntryRule;
    @XmlElement(name = "EndDateEntryRule")
    protected OLILUDATECOLLECT endDateEntryRule;
    @XmlElement(name = "MinDuration")
    protected Double minDuration;
    @XmlElement(name = "MaxDuration")
    protected Double maxDuration;
    @XmlElement(name = "MinDurationQualifier")
    protected OLILUMEASUNITS minDurationQualifier;
    @XmlElement(name = "MaxDurationQualifier")
    protected OLILUMEASUNITS maxDurationQualifier;
    @XmlElement(name = "DateCollectionBasedOn")
    protected OLILUDATECOLLBASEDON dateCollectionBasedOn;
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
     * Gets the value of the dateCollectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getDateCollectionKey() {
        return dateCollectionKey;
    }

    /**
     * Sets the value of the dateCollectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setDateCollectionKey(PERSISTKEY value) {
        this.dateCollectionKey = value;
    }

    /**
     * Gets the value of the dateCollectionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateCollectionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateCollectionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getDateCollectionSysKey() {
        if (dateCollectionSysKey == null) {
            dateCollectionSysKey = new ArrayList<SYSKEY>();
        }
        return this.dateCollectionSysKey;
    }

    /**
     * Gets the value of the effDateEntryRule property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDATECOLLECT }
     *     
     */
    public OLILUDATECOLLECT getEffDateEntryRule() {
        return effDateEntryRule;
    }

    /**
     * Sets the value of the effDateEntryRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDATECOLLECT }
     *     
     */
    public void setEffDateEntryRule(OLILUDATECOLLECT value) {
        this.effDateEntryRule = value;
    }

    /**
     * Gets the value of the endDateEntryRule property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDATECOLLECT }
     *     
     */
    public OLILUDATECOLLECT getEndDateEntryRule() {
        return endDateEntryRule;
    }

    /**
     * Sets the value of the endDateEntryRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDATECOLLECT }
     *     
     */
    public void setEndDateEntryRule(OLILUDATECOLLECT value) {
        this.endDateEntryRule = value;
    }

    /**
     * Gets the value of the minDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDuration() {
        return minDuration;
    }

    /**
     * Sets the value of the minDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDuration(Double value) {
        this.minDuration = value;
    }

    /**
     * Gets the value of the maxDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets the value of the maxDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDuration(Double value) {
        this.maxDuration = value;
    }

    /**
     * Gets the value of the minDurationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getMinDurationQualifier() {
        return minDurationQualifier;
    }

    /**
     * Sets the value of the minDurationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setMinDurationQualifier(OLILUMEASUNITS value) {
        this.minDurationQualifier = value;
    }

    /**
     * Gets the value of the maxDurationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getMaxDurationQualifier() {
        return maxDurationQualifier;
    }

    /**
     * Sets the value of the maxDurationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setMaxDurationQualifier(OLILUMEASUNITS value) {
        this.maxDurationQualifier = value;
    }

    /**
     * Gets the value of the dateCollectionBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDATECOLLBASEDON }
     *     
     */
    public OLILUDATECOLLBASEDON getDateCollectionBasedOn() {
        return dateCollectionBasedOn;
    }

    /**
     * Sets the value of the dateCollectionBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDATECOLLBASEDON }
     *     
     */
    public void setDateCollectionBasedOn(OLILUDATECOLLBASEDON value) {
        this.dateCollectionBasedOn = value;
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
