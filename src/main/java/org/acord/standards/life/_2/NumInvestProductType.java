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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NumInvestProduct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumInvestProduct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NumInvestProductKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NumInvestProductSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AssetClass" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxNumDestinationInvestProd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxNumSourceInvestProd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DestInvestProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SourceInvestProduct" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "NumInvestProduct_Type", propOrder = {
    "numInvestProductKey",
    "numInvestProductSysKey",
    "assetClass",
    "maxNumDestinationInvestProd",
    "maxNumSourceInvestProd",
    "minAmt",
    "maxAmt",
    "minPct",
    "maxPct",
    "destInvestProduct",
    "sourceInvestProduct",
    "oLifEExtension"
})
public class NumInvestProductType {

    @XmlElement(name = "NumInvestProductKey")
    protected PERSISTKEY numInvestProductKey;
    @XmlElement(name = "NumInvestProductSysKey")
    protected List<SYSKEY> numInvestProductSysKey;
    @XmlElement(name = "AssetClass")
    protected OLILUASSETCLASS assetClass;
    @XmlElement(name = "MaxNumDestinationInvestProd")
    protected BigInteger maxNumDestinationInvestProd;
    @XmlElement(name = "MaxNumSourceInvestProd")
    protected BigInteger maxNumSourceInvestProd;
    @XmlElement(name = "MinAmt")
    protected BigDecimal minAmt;
    @XmlElement(name = "MaxAmt")
    protected BigDecimal maxAmt;
    @XmlElement(name = "MinPct")
    protected Double minPct;
    @XmlElement(name = "MaxPct")
    protected Double maxPct;
    @XmlElement(name = "DestInvestProduct")
    protected List<DestInvestProductType> destInvestProduct;
    @XmlElement(name = "SourceInvestProduct")
    protected List<SourceInvestProductType> sourceInvestProduct;
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
     * Gets the value of the numInvestProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getNumInvestProductKey() {
        return numInvestProductKey;
    }

    /**
     * Sets the value of the numInvestProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setNumInvestProductKey(PERSISTKEY value) {
        this.numInvestProductKey = value;
    }

    /**
     * Gets the value of the numInvestProductSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numInvestProductSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumInvestProductSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getNumInvestProductSysKey() {
        if (numInvestProductSysKey == null) {
            numInvestProductSysKey = new ArrayList<SYSKEY>();
        }
        return this.numInvestProductSysKey;
    }

    /**
     * Gets the value of the assetClass property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUASSETCLASS }
     *     
     */
    public OLILUASSETCLASS getAssetClass() {
        return assetClass;
    }

    /**
     * Sets the value of the assetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUASSETCLASS }
     *     
     */
    public void setAssetClass(OLILUASSETCLASS value) {
        this.assetClass = value;
    }

    /**
     * Gets the value of the maxNumDestinationInvestProd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumDestinationInvestProd() {
        return maxNumDestinationInvestProd;
    }

    /**
     * Sets the value of the maxNumDestinationInvestProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumDestinationInvestProd(BigInteger value) {
        this.maxNumDestinationInvestProd = value;
    }

    /**
     * Gets the value of the maxNumSourceInvestProd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumSourceInvestProd() {
        return maxNumSourceInvestProd;
    }

    /**
     * Sets the value of the maxNumSourceInvestProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumSourceInvestProd(BigInteger value) {
        this.maxNumSourceInvestProd = value;
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
     * Gets the value of the destInvestProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destInvestProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestInvestProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestInvestProductType }
     * 
     * 
     */
    public List<DestInvestProductType> getDestInvestProduct() {
        if (destInvestProduct == null) {
            destInvestProduct = new ArrayList<DestInvestProductType>();
        }
        return this.destInvestProduct;
    }

    /**
     * Gets the value of the sourceInvestProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceInvestProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceInvestProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceInvestProductType }
     * 
     * 
     */
    public List<SourceInvestProductType> getSourceInvestProduct() {
        if (sourceInvestProduct == null) {
            sourceInvestProduct = new ArrayList<SourceInvestProductType>();
        }
        return this.sourceInvestProduct;
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