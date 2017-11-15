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
 * <p>Java class for DiveTraining_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiveTraining_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveTrainingKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveTrainingSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveTrainingType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveTrainingDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveTrainingDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveTrainingProvider" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveTrainingAuthority" minOccurs="0"/>
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
@XmlType(name = "DiveTraining_Type", propOrder = {
    "diveTrainingKey",
    "diveTrainingSysKey",
    "diveTrainingType",
    "diveTrainingDesc",
    "diveTrainingDate",
    "diveTrainingProvider",
    "diveTrainingAuthority",
    "oLifEExtension"
})
public class DiveTrainingType {

    @XmlElement(name = "DiveTrainingKey")
    protected PERSISTKEY diveTrainingKey;
    @XmlElement(name = "DiveTrainingSysKey")
    protected List<SYSKEY> diveTrainingSysKey;
    @XmlElement(name = "DiveTrainingType")
    protected OLILUDIVETRAINCERTTYPE diveTrainingType;
    @XmlElement(name = "DiveTrainingDesc")
    protected String diveTrainingDesc;
    @XmlElement(name = "DiveTrainingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar diveTrainingDate;
    @XmlElement(name = "DiveTrainingProvider")
    protected String diveTrainingProvider;
    @XmlElement(name = "DiveTrainingAuthority")
    protected String diveTrainingAuthority;
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
     * Gets the value of the diveTrainingKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getDiveTrainingKey() {
        return diveTrainingKey;
    }

    /**
     * Sets the value of the diveTrainingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setDiveTrainingKey(PERSISTKEY value) {
        this.diveTrainingKey = value;
    }

    /**
     * Gets the value of the diveTrainingSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diveTrainingSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiveTrainingSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getDiveTrainingSysKey() {
        if (diveTrainingSysKey == null) {
            diveTrainingSysKey = new ArrayList<SYSKEY>();
        }
        return this.diveTrainingSysKey;
    }

    /**
     * Gets the value of the diveTrainingType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDIVETRAINCERTTYPE }
     *     
     */
    public OLILUDIVETRAINCERTTYPE getDiveTrainingType() {
        return diveTrainingType;
    }

    /**
     * Sets the value of the diveTrainingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDIVETRAINCERTTYPE }
     *     
     */
    public void setDiveTrainingType(OLILUDIVETRAINCERTTYPE value) {
        this.diveTrainingType = value;
    }

    /**
     * Gets the value of the diveTrainingDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiveTrainingDesc() {
        return diveTrainingDesc;
    }

    /**
     * Sets the value of the diveTrainingDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiveTrainingDesc(String value) {
        this.diveTrainingDesc = value;
    }

    /**
     * Gets the value of the diveTrainingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiveTrainingDate() {
        return diveTrainingDate;
    }

    /**
     * Sets the value of the diveTrainingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiveTrainingDate(XMLGregorianCalendar value) {
        this.diveTrainingDate = value;
    }

    /**
     * Gets the value of the diveTrainingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiveTrainingProvider() {
        return diveTrainingProvider;
    }

    /**
     * Sets the value of the diveTrainingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiveTrainingProvider(String value) {
        this.diveTrainingProvider = value;
    }

    /**
     * Gets the value of the diveTrainingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiveTrainingAuthority() {
        return diveTrainingAuthority;
    }

    /**
     * Sets the value of the diveTrainingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiveTrainingAuthority(String value) {
        this.diveTrainingAuthority = value;
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