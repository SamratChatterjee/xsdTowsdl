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
 * <p>Java class for CauseOfDeath_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CauseOfDeath_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CauseOfDeathKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CauseOfDeathSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CauseOfDeathTC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CauseOfDeathTCDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CausePrecedence"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MannerofLoss" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MannerofLossDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CauseOfDeathStatus" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CauseOfDeathStatusDesc" minOccurs="0"/>
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
@XmlType(name = "CauseOfDeath_Type", propOrder = {
    "causeOfDeathKey",
    "causeOfDeathSysKey",
    "causeOfDeathTC",
    "causeOfDeathTCDesc",
    "causePrecedence",
    "mannerofLoss",
    "mannerofLossDesc",
    "causeOfDeathStatus",
    "causeOfDeathStatusDesc",
    "oLifEExtension"
})
public class CauseOfDeathType {

    @XmlElement(name = "CauseOfDeathKey")
    protected PERSISTKEY causeOfDeathKey;
    @XmlElement(name = "CauseOfDeathSysKey")
    protected List<SYSKEY> causeOfDeathSysKey;
    @XmlElement(name = "CauseOfDeathTC")
    protected OLILUMEDCOND causeOfDeathTC;
    @XmlElement(name = "CauseOfDeathTCDesc")
    protected String causeOfDeathTCDesc;
    @XmlElement(name = "CausePrecedence", required = true)
    protected OLILUPRECEDENCE causePrecedence;
    @XmlElement(name = "MannerofLoss")
    protected OLILUMANNERLOSS mannerofLoss;
    @XmlElement(name = "MannerofLossDesc")
    protected String mannerofLossDesc;
    @XmlElement(name = "CauseOfDeathStatus")
    protected OLILUCAUSEDTHSTATUS causeOfDeathStatus;
    @XmlElement(name = "CauseOfDeathStatusDesc")
    protected String causeOfDeathStatusDesc;
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
     * Gets the value of the causeOfDeathKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getCauseOfDeathKey() {
        return causeOfDeathKey;
    }

    /**
     * Sets the value of the causeOfDeathKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setCauseOfDeathKey(PERSISTKEY value) {
        this.causeOfDeathKey = value;
    }

    /**
     * Gets the value of the causeOfDeathSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causeOfDeathSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCauseOfDeathSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getCauseOfDeathSysKey() {
        if (causeOfDeathSysKey == null) {
            causeOfDeathSysKey = new ArrayList<SYSKEY>();
        }
        return this.causeOfDeathSysKey;
    }

    /**
     * Gets the value of the causeOfDeathTC property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEDCOND }
     *     
     */
    public OLILUMEDCOND getCauseOfDeathTC() {
        return causeOfDeathTC;
    }

    /**
     * Sets the value of the causeOfDeathTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEDCOND }
     *     
     */
    public void setCauseOfDeathTC(OLILUMEDCOND value) {
        this.causeOfDeathTC = value;
    }

    /**
     * Gets the value of the causeOfDeathTCDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseOfDeathTCDesc() {
        return causeOfDeathTCDesc;
    }

    /**
     * Sets the value of the causeOfDeathTCDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseOfDeathTCDesc(String value) {
        this.causeOfDeathTCDesc = value;
    }

    /**
     * Gets the value of the causePrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPRECEDENCE }
     *     
     */
    public OLILUPRECEDENCE getCausePrecedence() {
        return causePrecedence;
    }

    /**
     * Sets the value of the causePrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPRECEDENCE }
     *     
     */
    public void setCausePrecedence(OLILUPRECEDENCE value) {
        this.causePrecedence = value;
    }

    /**
     * Gets the value of the mannerofLoss property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMANNERLOSS }
     *     
     */
    public OLILUMANNERLOSS getMannerofLoss() {
        return mannerofLoss;
    }

    /**
     * Sets the value of the mannerofLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMANNERLOSS }
     *     
     */
    public void setMannerofLoss(OLILUMANNERLOSS value) {
        this.mannerofLoss = value;
    }

    /**
     * Gets the value of the mannerofLossDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMannerofLossDesc() {
        return mannerofLossDesc;
    }

    /**
     * Sets the value of the mannerofLossDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMannerofLossDesc(String value) {
        this.mannerofLossDesc = value;
    }

    /**
     * Gets the value of the causeOfDeathStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCAUSEDTHSTATUS }
     *     
     */
    public OLILUCAUSEDTHSTATUS getCauseOfDeathStatus() {
        return causeOfDeathStatus;
    }

    /**
     * Sets the value of the causeOfDeathStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCAUSEDTHSTATUS }
     *     
     */
    public void setCauseOfDeathStatus(OLILUCAUSEDTHSTATUS value) {
        this.causeOfDeathStatus = value;
    }

    /**
     * Gets the value of the causeOfDeathStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseOfDeathStatusDesc() {
        return causeOfDeathStatusDesc;
    }

    /**
     * Sets the value of the causeOfDeathStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseOfDeathStatusDesc(String value) {
        this.causeOfDeathStatusDesc = value;
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
