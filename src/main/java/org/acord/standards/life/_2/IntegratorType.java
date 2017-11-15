//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

import java.math.BigDecimal;
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
 * <p>Java class for Integrator_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Integrator_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IntegratorKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IntegratorSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IntegratorType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IntegratorAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IntegratorPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="AppliesToHoldingID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Integrator_Type", propOrder = {
    "integratorKey",
    "integratorSysKey",
    "integratorType",
    "integratorAmt",
    "integratorPct",
    "oLifEExtension"
})
public class IntegratorType {

    @XmlElement(name = "IntegratorKey")
    protected PERSISTKEY integratorKey;
    @XmlElement(name = "IntegratorSysKey")
    protected List<SYSKEY> integratorSysKey;
    @XmlElement(name = "IntegratorType")
    protected OLILUINTEGRATOR integratorType;
    @XmlElement(name = "IntegratorAmt")
    protected BigDecimal integratorAmt;
    @XmlElement(name = "IntegratorPct")
    protected Double integratorPct;
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
    @XmlAttribute(name = "AppliesToHoldingID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object appliesToHoldingID;

    /**
     * Gets the value of the integratorKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getIntegratorKey() {
        return integratorKey;
    }

    /**
     * Sets the value of the integratorKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setIntegratorKey(PERSISTKEY value) {
        this.integratorKey = value;
    }

    /**
     * Gets the value of the integratorSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integratorSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegratorSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getIntegratorSysKey() {
        if (integratorSysKey == null) {
            integratorSysKey = new ArrayList<SYSKEY>();
        }
        return this.integratorSysKey;
    }

    /**
     * Gets the value of the integratorType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUINTEGRATOR }
     *     
     */
    public OLILUINTEGRATOR getIntegratorType() {
        return integratorType;
    }

    /**
     * Sets the value of the integratorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUINTEGRATOR }
     *     
     */
    public void setIntegratorType(OLILUINTEGRATOR value) {
        this.integratorType = value;
    }

    /**
     * Gets the value of the integratorAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntegratorAmt() {
        return integratorAmt;
    }

    /**
     * Sets the value of the integratorAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntegratorAmt(BigDecimal value) {
        this.integratorAmt = value;
    }

    /**
     * Gets the value of the integratorPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIntegratorPct() {
        return integratorPct;
    }

    /**
     * Sets the value of the integratorPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntegratorPct(Double value) {
        this.integratorPct = value;
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

    /**
     * Gets the value of the appliesToHoldingID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAppliesToHoldingID() {
        return appliesToHoldingID;
    }

    /**
     * Sets the value of the appliesToHoldingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAppliesToHoldingID(Object value) {
        this.appliesToHoldingID = value;
    }

}