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
 * <p>Java class for SourceInvestProduct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceInvestProduct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SourceInvestProductKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SourceInvestProductSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProductCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RateVariationKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxPct" minOccurs="0"/>
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
@XmlType(name = "SourceInvestProduct_Type", propOrder = {
    "sourceInvestProductKey",
    "sourceInvestProductSysKey",
    "carrierCode",
    "productCode",
    "rateVariationKey",
    "minAmt",
    "maxAmt",
    "minPct",
    "maxPct",
    "oLifEExtension"
})
public class SourceInvestProductType {

    @XmlElement(name = "SourceInvestProductKey")
    protected PERSISTKEY sourceInvestProductKey;
    @XmlElement(name = "SourceInvestProductSysKey")
    protected List<SYSKEY> sourceInvestProductSysKey;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "RateVariationKey")
    protected PERSISTKEY rateVariationKey;
    @XmlElement(name = "MinAmt")
    protected BigDecimal minAmt;
    @XmlElement(name = "MaxAmt")
    protected BigDecimal maxAmt;
    @XmlElement(name = "MinPct")
    protected Double minPct;
    @XmlElement(name = "MaxPct")
    protected Double maxPct;
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
     * Gets the value of the sourceInvestProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getSourceInvestProductKey() {
        return sourceInvestProductKey;
    }

    /**
     * Sets the value of the sourceInvestProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setSourceInvestProductKey(PERSISTKEY value) {
        this.sourceInvestProductKey = value;
    }

    /**
     * Gets the value of the sourceInvestProductSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceInvestProductSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceInvestProductSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getSourceInvestProductSysKey() {
        if (sourceInvestProductSysKey == null) {
            sourceInvestProductSysKey = new ArrayList<SYSKEY>();
        }
        return this.sourceInvestProductSysKey;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the rateVariationKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getRateVariationKey() {
        return rateVariationKey;
    }

    /**
     * Sets the value of the rateVariationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setRateVariationKey(PERSISTKEY value) {
        this.rateVariationKey = value;
    }

    /**
     * Gets the value of the minAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmt() {
        return minAmt;
    }

    /**
     * Sets the value of the minAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmt(BigDecimal value) {
        this.minAmt = value;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
    }

    /**
     * Gets the value of the minPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinPct() {
        return minPct;
    }

    /**
     * Sets the value of the minPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinPct(Double value) {
        this.minPct = value;
    }

    /**
     * Gets the value of the maxPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxPct() {
        return maxPct;
    }

    /**
     * Sets the value of the maxPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxPct(Double value) {
        this.maxPct = value;
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