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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PeriodicBalanceYTDInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicBalanceYTDInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PeriodicBalanceYTDInfoKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PeriodicBalanceYTDInfoSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxableInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BalancePeriod" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BalanceAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionTransactionType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionType" minOccurs="0"/>
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
@XmlType(name = "PeriodicBalanceYTDInfo_Type", propOrder = {
    "periodicBalanceYTDInfoKey",
    "periodicBalanceYTDInfoSysKey",
    "taxableInd",
    "balancePeriod",
    "balanceAmt",
    "commissionTransactionType",
    "commissionType",
    "oLifEExtension"
})
public class PeriodicBalanceYTDInfoType {

    @XmlElement(name = "PeriodicBalanceYTDInfoKey")
    protected PERSISTKEY periodicBalanceYTDInfoKey;
    @XmlElement(name = "PeriodicBalanceYTDInfoSysKey")
    protected List<SYSKEY> periodicBalanceYTDInfoSysKey;
    @XmlElement(name = "TaxableInd")
    protected OLILUBOOLEAN taxableInd;
    @XmlElement(name = "BalancePeriod")
    protected OLILUPAYMODE balancePeriod;
    @XmlElement(name = "BalanceAmt")
    protected BigDecimal balanceAmt;
    @XmlElement(name = "CommissionTransactionType")
    protected OLILUCOMMTRNTYPE commissionTransactionType;
    @XmlElement(name = "CommissionType")
    protected OLILUCOMMTYPE commissionType;
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
     * Gets the value of the periodicBalanceYTDInfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getPeriodicBalanceYTDInfoKey() {
        return periodicBalanceYTDInfoKey;
    }

    /**
     * Sets the value of the periodicBalanceYTDInfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setPeriodicBalanceYTDInfoKey(PERSISTKEY value) {
        this.periodicBalanceYTDInfoKey = value;
    }

    /**
     * Gets the value of the periodicBalanceYTDInfoSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodicBalanceYTDInfoSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodicBalanceYTDInfoSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getPeriodicBalanceYTDInfoSysKey() {
        if (periodicBalanceYTDInfoSysKey == null) {
            periodicBalanceYTDInfoSysKey = new ArrayList<SYSKEY>();
        }
        return this.periodicBalanceYTDInfoSysKey;
    }

    /**
     * Gets the value of the taxableInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setTaxableInd(OLILUBOOLEAN value) {
        this.taxableInd = value;
    }

    /**
     * Gets the value of the balancePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public OLILUPAYMODE getBalancePeriod() {
        return balancePeriod;
    }

    /**
     * Sets the value of the balancePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public void setBalancePeriod(OLILUPAYMODE value) {
        this.balancePeriod = value;
    }

    /**
     * Gets the value of the balanceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceAmt() {
        return balanceAmt;
    }

    /**
     * Sets the value of the balanceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceAmt(BigDecimal value) {
        this.balanceAmt = value;
    }

    /**
     * Gets the value of the commissionTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOMMTRNTYPE }
     *     
     */
    public OLILUCOMMTRNTYPE getCommissionTransactionType() {
        return commissionTransactionType;
    }

    /**
     * Sets the value of the commissionTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOMMTRNTYPE }
     *     
     */
    public void setCommissionTransactionType(OLILUCOMMTRNTYPE value) {
        this.commissionTransactionType = value;
    }

    /**
     * Gets the value of the commissionType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOMMTYPE }
     *     
     */
    public OLILUCOMMTYPE getCommissionType() {
        return commissionType;
    }

    /**
     * Sets the value of the commissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOMMTYPE }
     *     
     */
    public void setCommissionType(OLILUCOMMTYPE value) {
        this.commissionType = value;
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