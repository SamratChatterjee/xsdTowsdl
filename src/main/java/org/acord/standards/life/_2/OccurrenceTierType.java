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
 * <p>Java class for OccurrenceTier_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OccurrenceTier_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OccurrenceTierKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OccurrenceTierSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinNumberOccurrences" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinNumberOccurrencesQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxNumberOccurrences" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxNumberOccurrencesQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Fee" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OccurrenceTier_Type", propOrder = {
    "occurrenceTierKey",
    "occurrenceTierSysKey",
    "minNumberOccurrences",
    "minNumberOccurrencesQualifier",
    "maxNumberOccurrences",
    "maxNumberOccurrencesQualifier",
    "fee",
    "oLifEExtension"
})
public class OccurrenceTierType {

    @XmlElement(name = "OccurrenceTierKey")
    protected PERSISTKEY occurrenceTierKey;
    @XmlElement(name = "OccurrenceTierSysKey")
    protected List<SYSKEY> occurrenceTierSysKey;
    @XmlElement(name = "MinNumberOccurrences")
    protected BigInteger minNumberOccurrences;
    @XmlElement(name = "MinNumberOccurrencesQualifier")
    protected OLILUMEASUNITS minNumberOccurrencesQualifier;
    @XmlElement(name = "MaxNumberOccurrences")
    protected BigInteger maxNumberOccurrences;
    @XmlElement(name = "MaxNumberOccurrencesQualifier")
    protected OLILUMEASUNITS maxNumberOccurrencesQualifier;
    @XmlElement(name = "Fee")
    protected List<FeeType> fee;
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
     * Gets the value of the occurrenceTierKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getOccurrenceTierKey() {
        return occurrenceTierKey;
    }

    /**
     * Sets the value of the occurrenceTierKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setOccurrenceTierKey(PERSISTKEY value) {
        this.occurrenceTierKey = value;
    }

    /**
     * Gets the value of the occurrenceTierSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrenceTierSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccurrenceTierSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getOccurrenceTierSysKey() {
        if (occurrenceTierSysKey == null) {
            occurrenceTierSysKey = new ArrayList<SYSKEY>();
        }
        return this.occurrenceTierSysKey;
    }

    /**
     * Gets the value of the minNumberOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumberOccurrences() {
        return minNumberOccurrences;
    }

    /**
     * Sets the value of the minNumberOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinNumberOccurrences(BigInteger value) {
        this.minNumberOccurrences = value;
    }

    /**
     * Gets the value of the minNumberOccurrencesQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getMinNumberOccurrencesQualifier() {
        return minNumberOccurrencesQualifier;
    }

    /**
     * Sets the value of the minNumberOccurrencesQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setMinNumberOccurrencesQualifier(OLILUMEASUNITS value) {
        this.minNumberOccurrencesQualifier = value;
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
     * Gets the value of the maxNumberOccurrencesQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getMaxNumberOccurrencesQualifier() {
        return maxNumberOccurrencesQualifier;
    }

    /**
     * Sets the value of the maxNumberOccurrencesQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setMaxNumberOccurrencesQualifier(OLILUMEASUNITS value) {
        this.maxNumberOccurrencesQualifier = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeType>();
        }
        return this.fee;
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
