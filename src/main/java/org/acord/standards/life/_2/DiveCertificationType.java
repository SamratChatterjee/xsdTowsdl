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
 * <p>Java class for DiveCertification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiveCertification_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveCertificationKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveCertificationSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveCertificationType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveCertificationDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveCertificationDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveCertificationProvider" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DiveCertificationAuthority" minOccurs="0"/>
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
@XmlType(name = "DiveCertification_Type", propOrder = {
    "diveCertificationKey",
    "diveCertificationSysKey",
    "diveCertificationType",
    "diveCertificationDesc",
    "diveCertificationDate",
    "diveCertificationProvider",
    "diveCertificationAuthority",
    "oLifEExtension"
})
public class DiveCertificationType {

    @XmlElement(name = "DiveCertificationKey")
    protected PERSISTKEY diveCertificationKey;
    @XmlElement(name = "DiveCertificationSysKey")
    protected List<SYSKEY> diveCertificationSysKey;
    @XmlElement(name = "DiveCertificationType")
    protected OLILUDIVETRAINCERTTYPE diveCertificationType;
    @XmlElement(name = "DiveCertificationDesc")
    protected String diveCertificationDesc;
    @XmlElement(name = "DiveCertificationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar diveCertificationDate;
    @XmlElement(name = "DiveCertificationProvider")
    protected String diveCertificationProvider;
    @XmlElement(name = "DiveCertificationAuthority")
    protected String diveCertificationAuthority;
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
     * Gets the value of the diveCertificationKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getDiveCertificationKey() {
        return diveCertificationKey;
    }

    /**
     * Sets the value of the diveCertificationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setDiveCertificationKey(PERSISTKEY value) {
        this.diveCertificationKey = value;
    }

    /**
     * Gets the value of the diveCertificationSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diveCertificationSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiveCertificationSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getDiveCertificationSysKey() {
        if (diveCertificationSysKey == null) {
            diveCertificationSysKey = new ArrayList<SYSKEY>();
        }
        return this.diveCertificationSysKey;
    }

    /**
     * Gets the value of the diveCertificationType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDIVETRAINCERTTYPE }
     *     
     */
    public OLILUDIVETRAINCERTTYPE getDiveCertificationType() {
        return diveCertificationType;
    }

    /**
     * Sets the value of the diveCertificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDIVETRAINCERTTYPE }
     *     
     */
    public void setDiveCertificationType(OLILUDIVETRAINCERTTYPE value) {
        this.diveCertificationType = value;
    }

    /**
     * Gets the value of the diveCertificationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiveCertificationDesc() {
        return diveCertificationDesc;
    }

    /**
     * Sets the value of the diveCertificationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiveCertificationDesc(String value) {
        this.diveCertificationDesc = value;
    }

    /**
     * Gets the value of the diveCertificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiveCertificationDate() {
        return diveCertificationDate;
    }

    /**
     * Sets the value of the diveCertificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiveCertificationDate(XMLGregorianCalendar value) {
        this.diveCertificationDate = value;
    }

    /**
     * Gets the value of the diveCertificationProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiveCertificationProvider() {
        return diveCertificationProvider;
    }

    /**
     * Sets the value of the diveCertificationProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiveCertificationProvider(String value) {
        this.diveCertificationProvider = value;
    }

    /**
     * Gets the value of the diveCertificationAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiveCertificationAuthority() {
        return diveCertificationAuthority;
    }

    /**
     * Sets the value of the diveCertificationAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiveCertificationAuthority(String value) {
        this.diveCertificationAuthority = value;
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
