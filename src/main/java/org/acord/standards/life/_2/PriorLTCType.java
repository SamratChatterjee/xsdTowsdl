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
 * <p>Java class for PriorLTC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorLTC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PriorLTCKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PriorLTCSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PriorCompanyName" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}PriorLTCDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}PriorLTCPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MedicaidInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}KeyedValue" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PriorLTC_Type", propOrder = {
    "priorLTCKey",
    "priorLTCSysKey",
    "priorCompanyName",
    "priorLTCDate",
    "priorLTCPartialDate",
    "medicaidInd",
    "keyedValue",
    "oLifEExtension"
})
public class PriorLTCType {

    @XmlElement(name = "PriorLTCKey")
    protected PERSISTKEY priorLTCKey;
    @XmlElement(name = "PriorLTCSysKey")
    protected List<SYSKEY> priorLTCSysKey;
    @XmlElement(name = "PriorCompanyName")
    protected String priorCompanyName;
    @XmlElement(name = "PriorLTCDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priorLTCDate;
    @XmlElement(name = "PriorLTCPartialDate")
    protected String priorLTCPartialDate;
    @XmlElement(name = "MedicaidInd")
    protected OLILUBOOLEAN medicaidInd;
    @XmlElement(name = "KeyedValue")
    protected List<KeyedValueType> keyedValue;
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
     * Gets the value of the priorLTCKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getPriorLTCKey() {
        return priorLTCKey;
    }

    /**
     * Sets the value of the priorLTCKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setPriorLTCKey(PERSISTKEY value) {
        this.priorLTCKey = value;
    }

    /**
     * Gets the value of the priorLTCSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorLTCSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorLTCSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getPriorLTCSysKey() {
        if (priorLTCSysKey == null) {
            priorLTCSysKey = new ArrayList<SYSKEY>();
        }
        return this.priorLTCSysKey;
    }

    /**
     * Gets the value of the priorCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorCompanyName() {
        return priorCompanyName;
    }

    /**
     * Sets the value of the priorCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorCompanyName(String value) {
        this.priorCompanyName = value;
    }

    /**
     * Gets the value of the priorLTCDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriorLTCDate() {
        return priorLTCDate;
    }

    /**
     * Sets the value of the priorLTCDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriorLTCDate(XMLGregorianCalendar value) {
        this.priorLTCDate = value;
    }

    /**
     * Gets the value of the priorLTCPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorLTCPartialDate() {
        return priorLTCPartialDate;
    }

    /**
     * Sets the value of the priorLTCPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorLTCPartialDate(String value) {
        this.priorLTCPartialDate = value;
    }

    /**
     * Gets the value of the medicaidInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getMedicaidInd() {
        return medicaidInd;
    }

    /**
     * Sets the value of the medicaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setMedicaidInd(OLILUBOOLEAN value) {
        this.medicaidInd = value;
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
