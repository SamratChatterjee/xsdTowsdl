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
 * <p>Java class for TaxWithholdingProduct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxWithholdingProduct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxWithholdingProductKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxWithholdingProductSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}WithholdStateIfFederalInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxWithholdingPlace" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxWithholdingCollect" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}WithholdSameStateAsFederalInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RateBasedOn" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}JurisdictionApproval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AmountProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxWithholdingApproval" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TaxWithholdingProduct_Type", propOrder = {
    "taxWithholdingProductKey",
    "taxWithholdingProductSysKey",
    "withholdStateIfFederalInd",
    "taxWithholdingPlace",
    "taxWithholdingCollect",
    "withholdSameStateAsFederalInd",
    "rateBasedOn",
    "jurisdictionApproval",
    "amountProduct",
    "taxWithholdingApproval",
    "oLifEExtension"
})
public class TaxWithholdingProductType {

    @XmlElement(name = "TaxWithholdingProductKey")
    protected PERSISTKEY taxWithholdingProductKey;
    @XmlElement(name = "TaxWithholdingProductSysKey")
    protected List<SYSKEY> taxWithholdingProductSysKey;
    @XmlElement(name = "WithholdStateIfFederalInd")
    protected OLILUBOOLEAN withholdStateIfFederalInd;
    @XmlElement(name = "TaxWithholdingPlace")
    protected OLILUTAXPLACE taxWithholdingPlace;
    @XmlElement(name = "TaxWithholdingCollect")
    protected OLILUDATAREQ taxWithholdingCollect;
    @XmlElement(name = "WithholdSameStateAsFederalInd")
    protected OLILUBOOLEAN withholdSameStateAsFederalInd;
    @XmlElement(name = "RateBasedOn")
    protected OLILURATEBASEDON rateBasedOn;
    @XmlElement(name = "JurisdictionApproval")
    protected List<JurisdictionApprovalType> jurisdictionApproval;
    @XmlElement(name = "AmountProduct")
    protected List<AmountProductType> amountProduct;
    @XmlElement(name = "TaxWithholdingApproval")
    protected List<TaxWithholdingApprovalType> taxWithholdingApproval;
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
     * Gets the value of the taxWithholdingProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getTaxWithholdingProductKey() {
        return taxWithholdingProductKey;
    }

    /**
     * Sets the value of the taxWithholdingProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setTaxWithholdingProductKey(PERSISTKEY value) {
        this.taxWithholdingProductKey = value;
    }

    /**
     * Gets the value of the taxWithholdingProductSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxWithholdingProductSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxWithholdingProductSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getTaxWithholdingProductSysKey() {
        if (taxWithholdingProductSysKey == null) {
            taxWithholdingProductSysKey = new ArrayList<SYSKEY>();
        }
        return this.taxWithholdingProductSysKey;
    }

    /**
     * Gets the value of the withholdStateIfFederalInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getWithholdStateIfFederalInd() {
        return withholdStateIfFederalInd;
    }

    /**
     * Sets the value of the withholdStateIfFederalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setWithholdStateIfFederalInd(OLILUBOOLEAN value) {
        this.withholdStateIfFederalInd = value;
    }

    /**
     * Gets the value of the taxWithholdingPlace property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTAXPLACE }
     *     
     */
    public OLILUTAXPLACE getTaxWithholdingPlace() {
        return taxWithholdingPlace;
    }

    /**
     * Sets the value of the taxWithholdingPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTAXPLACE }
     *     
     */
    public void setTaxWithholdingPlace(OLILUTAXPLACE value) {
        this.taxWithholdingPlace = value;
    }

    /**
     * Gets the value of the taxWithholdingCollect property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDATAREQ }
     *     
     */
    public OLILUDATAREQ getTaxWithholdingCollect() {
        return taxWithholdingCollect;
    }

    /**
     * Sets the value of the taxWithholdingCollect property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDATAREQ }
     *     
     */
    public void setTaxWithholdingCollect(OLILUDATAREQ value) {
        this.taxWithholdingCollect = value;
    }

    /**
     * Gets the value of the withholdSameStateAsFederalInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getWithholdSameStateAsFederalInd() {
        return withholdSameStateAsFederalInd;
    }

    /**
     * Sets the value of the withholdSameStateAsFederalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setWithholdSameStateAsFederalInd(OLILUBOOLEAN value) {
        this.withholdSameStateAsFederalInd = value;
    }

    /**
     * Gets the value of the rateBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURATEBASEDON }
     *     
     */
    public OLILURATEBASEDON getRateBasedOn() {
        return rateBasedOn;
    }

    /**
     * Sets the value of the rateBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURATEBASEDON }
     *     
     */
    public void setRateBasedOn(OLILURATEBASEDON value) {
        this.rateBasedOn = value;
    }

    /**
     * Gets the value of the jurisdictionApproval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdictionApproval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdictionApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JurisdictionApprovalType }
     * 
     * 
     */
    public List<JurisdictionApprovalType> getJurisdictionApproval() {
        if (jurisdictionApproval == null) {
            jurisdictionApproval = new ArrayList<JurisdictionApprovalType>();
        }
        return this.jurisdictionApproval;
    }

    /**
     * Gets the value of the amountProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountProductType }
     * 
     * 
     */
    public List<AmountProductType> getAmountProduct() {
        if (amountProduct == null) {
            amountProduct = new ArrayList<AmountProductType>();
        }
        return this.amountProduct;
    }

    /**
     * Gets the value of the taxWithholdingApproval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxWithholdingApproval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxWithholdingApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxWithholdingApprovalType }
     * 
     * 
     */
    public List<TaxWithholdingApprovalType> getTaxWithholdingApproval() {
        if (taxWithholdingApproval == null) {
            taxWithholdingApproval = new ArrayList<TaxWithholdingApprovalType>();
        }
        return this.taxWithholdingApproval;
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
