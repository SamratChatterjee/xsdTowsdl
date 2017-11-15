//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * <p>Java class for ScheduledChange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledChange_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ScheduledChangeKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ScheduledChangeSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ChangeAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StartAge" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StartDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SmokerStat" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TobaccoPremiumBasis" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UnderwritingClass" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UnderwritingSubClass" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ReversalInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TranContentCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ChangeUnits" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ChangeID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledChange_Type", propOrder = {
    "scheduledChangeKey",
    "scheduledChangeSysKey",
    "changeAmt",
    "startAge",
    "startDuration",
    "smokerStat",
    "tobaccoPremiumBasis",
    "underwritingClass",
    "underwritingSubClass",
    "reversalInd",
    "tranContentCode",
    "changeUnits",
    "oLifEExtension"
})
public class ScheduledChangeType {

    @XmlElement(name = "ScheduledChangeKey")
    protected PERSISTKEY scheduledChangeKey;
    @XmlElement(name = "ScheduledChangeSysKey")
    protected List<SYSKEY> scheduledChangeSysKey;
    @XmlElement(name = "ChangeAmt")
    protected BigDecimal changeAmt;
    @XmlElement(name = "StartAge")
    protected BigInteger startAge;
    @XmlElement(name = "StartDuration")
    protected BigInteger startDuration;
    @XmlElement(name = "SmokerStat")
    protected OLILUSMOKERSTAT smokerStat;
    @XmlElement(name = "TobaccoPremiumBasis")
    protected OLILUTOBPREMBASIS tobaccoPremiumBasis;
    @XmlElement(name = "UnderwritingClass")
    protected OLILUUNWRITECLASS underwritingClass;
    @XmlElement(name = "UnderwritingSubClass")
    protected OLILUUNWRITESUBCLASS underwritingSubClass;
    @XmlElement(name = "ReversalInd")
    protected OLILUBOOLEAN reversalInd;
    @XmlElement(name = "TranContentCode")
    protected TRANCONTENTCODES tranContentCode;
    @XmlElement(name = "ChangeUnits")
    protected BigDecimal changeUnits;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ChangeID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object changeID;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;

    /**
     * Gets the value of the scheduledChangeKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getScheduledChangeKey() {
        return scheduledChangeKey;
    }

    /**
     * Sets the value of the scheduledChangeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setScheduledChangeKey(PERSISTKEY value) {
        this.scheduledChangeKey = value;
    }

    /**
     * Gets the value of the scheduledChangeSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledChangeSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledChangeSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getScheduledChangeSysKey() {
        if (scheduledChangeSysKey == null) {
            scheduledChangeSysKey = new ArrayList<SYSKEY>();
        }
        return this.scheduledChangeSysKey;
    }

    /**
     * Gets the value of the changeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeAmt() {
        return changeAmt;
    }

    /**
     * Sets the value of the changeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeAmt(BigDecimal value) {
        this.changeAmt = value;
    }

    /**
     * Gets the value of the startAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartAge() {
        return startAge;
    }

    /**
     * Sets the value of the startAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartAge(BigInteger value) {
        this.startAge = value;
    }

    /**
     * Gets the value of the startDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartDuration() {
        return startDuration;
    }

    /**
     * Sets the value of the startDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartDuration(BigInteger value) {
        this.startDuration = value;
    }

    /**
     * Gets the value of the smokerStat property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSMOKERSTAT }
     *     
     */
    public OLILUSMOKERSTAT getSmokerStat() {
        return smokerStat;
    }

    /**
     * Sets the value of the smokerStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSMOKERSTAT }
     *     
     */
    public void setSmokerStat(OLILUSMOKERSTAT value) {
        this.smokerStat = value;
    }

    /**
     * Gets the value of the tobaccoPremiumBasis property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTOBPREMBASIS }
     *     
     */
    public OLILUTOBPREMBASIS getTobaccoPremiumBasis() {
        return tobaccoPremiumBasis;
    }

    /**
     * Sets the value of the tobaccoPremiumBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTOBPREMBASIS }
     *     
     */
    public void setTobaccoPremiumBasis(OLILUTOBPREMBASIS value) {
        this.tobaccoPremiumBasis = value;
    }

    /**
     * Gets the value of the underwritingClass property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUUNWRITECLASS }
     *     
     */
    public OLILUUNWRITECLASS getUnderwritingClass() {
        return underwritingClass;
    }

    /**
     * Sets the value of the underwritingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUUNWRITECLASS }
     *     
     */
    public void setUnderwritingClass(OLILUUNWRITECLASS value) {
        this.underwritingClass = value;
    }

    /**
     * Gets the value of the underwritingSubClass property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUUNWRITESUBCLASS }
     *     
     */
    public OLILUUNWRITESUBCLASS getUnderwritingSubClass() {
        return underwritingSubClass;
    }

    /**
     * Sets the value of the underwritingSubClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUUNWRITESUBCLASS }
     *     
     */
    public void setUnderwritingSubClass(OLILUUNWRITESUBCLASS value) {
        this.underwritingSubClass = value;
    }

    /**
     * Gets the value of the reversalInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getReversalInd() {
        return reversalInd;
    }

    /**
     * Sets the value of the reversalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setReversalInd(OLILUBOOLEAN value) {
        this.reversalInd = value;
    }

    /**
     * Gets the value of the tranContentCode property.
     * 
     * @return
     *     possible object is
     *     {@link TRANCONTENTCODES }
     *     
     */
    public TRANCONTENTCODES getTranContentCode() {
        return tranContentCode;
    }

    /**
     * Sets the value of the tranContentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANCONTENTCODES }
     *     
     */
    public void setTranContentCode(TRANCONTENTCODES value) {
        this.tranContentCode = value;
    }

    /**
     * Gets the value of the changeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeUnits() {
        return changeUnits;
    }

    /**
     * Sets the value of the changeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeUnits(BigDecimal value) {
        this.changeUnits = value;
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
     * Gets the value of the changeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeID() {
        return changeID;
    }

    /**
     * Sets the value of the changeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeID(Object value) {
        this.changeID = value;
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
