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
 * <p>Java class for LogicalCriteria_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalCriteria_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LogicalCriteriaKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LogicalCriteriaSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Operation" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}EnumeratedStringValue" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}EnumeratedTypeCodeValue" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EnumeratedValue" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}KeyDef" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AxisDef" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LogicalCriteria_Type", propOrder = {
    "logicalCriteriaKey",
    "logicalCriteriaSysKey",
    "operation",
    "enumeratedStringValue",
    "enumeratedTypeCodeValue",
    "enumeratedValue",
    "keyDef",
    "axisDef",
    "oLifEExtension"
})
public class LogicalCriteriaType {

    @XmlElement(name = "LogicalCriteriaKey")
    protected PERSISTKEY logicalCriteriaKey;
    @XmlElement(name = "LogicalCriteriaSysKey")
    protected List<SYSKEY> logicalCriteriaSysKey;
    @XmlElement(name = "Operation")
    protected OLILUOPERATION operation;
    @XmlElement(name = "EnumeratedStringValue")
    protected String enumeratedStringValue;
    @XmlElement(name = "EnumeratedTypeCodeValue")
    protected ENUMERATEDTYPECODEVALUETYPE enumeratedTypeCodeValue;
    @XmlElement(name = "EnumeratedValue")
    protected EnumeratedValueType enumeratedValue;
    @XmlElement(name = "KeyDef")
    protected KeyDefType keyDef;
    @XmlElement(name = "AxisDef")
    protected List<AxisDefType> axisDef;
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
     * Gets the value of the logicalCriteriaKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getLogicalCriteriaKey() {
        return logicalCriteriaKey;
    }

    /**
     * Sets the value of the logicalCriteriaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setLogicalCriteriaKey(PERSISTKEY value) {
        this.logicalCriteriaKey = value;
    }

    /**
     * Gets the value of the logicalCriteriaSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalCriteriaSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalCriteriaSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getLogicalCriteriaSysKey() {
        if (logicalCriteriaSysKey == null) {
            logicalCriteriaSysKey = new ArrayList<SYSKEY>();
        }
        return this.logicalCriteriaSysKey;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUOPERATION }
     *     
     */
    public OLILUOPERATION getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUOPERATION }
     *     
     */
    public void setOperation(OLILUOPERATION value) {
        this.operation = value;
    }

    /**
     * Gets the value of the enumeratedStringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumeratedStringValue() {
        return enumeratedStringValue;
    }

    /**
     * Sets the value of the enumeratedStringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumeratedStringValue(String value) {
        this.enumeratedStringValue = value;
    }

    /**
     * Gets the value of the enumeratedTypeCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link ENUMERATEDTYPECODEVALUETYPE }
     *     
     */
    public ENUMERATEDTYPECODEVALUETYPE getEnumeratedTypeCodeValue() {
        return enumeratedTypeCodeValue;
    }

    /**
     * Sets the value of the enumeratedTypeCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENUMERATEDTYPECODEVALUETYPE }
     *     
     */
    public void setEnumeratedTypeCodeValue(ENUMERATEDTYPECODEVALUETYPE value) {
        this.enumeratedTypeCodeValue = value;
    }

    /**
     * Gets the value of the enumeratedValue property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratedValueType }
     *     
     */
    public EnumeratedValueType getEnumeratedValue() {
        return enumeratedValue;
    }

    /**
     * Sets the value of the enumeratedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratedValueType }
     *     
     */
    public void setEnumeratedValue(EnumeratedValueType value) {
        this.enumeratedValue = value;
    }

    /**
     * Gets the value of the keyDef property.
     * 
     * @return
     *     possible object is
     *     {@link KeyDefType }
     *     
     */
    public KeyDefType getKeyDef() {
        return keyDef;
    }

    /**
     * Sets the value of the keyDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyDefType }
     *     
     */
    public void setKeyDef(KeyDefType value) {
        this.keyDef = value;
    }

    /**
     * Gets the value of the axisDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxisDefType }
     * 
     * 
     */
    public List<AxisDefType> getAxisDef() {
        if (axisDef == null) {
            axisDef = new ArrayList<AxisDefType>();
        }
        return this.axisDef;
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
