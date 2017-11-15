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
 * <p>Java class for Campaign_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Campaign_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CampaignKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CampaignSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CampaignName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CampaignShortName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CampaignType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CampaignCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierCode" minOccurs="0"/>
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
@XmlType(name = "Campaign_Type", propOrder = {
    "campaignKey",
    "campaignSysKey",
    "campaignName",
    "campaignShortName",
    "campaignType",
    "campaignCode",
    "carrierCode",
    "keyedValue",
    "oLifEExtension"
})
public class CampaignType {

    @XmlElement(name = "CampaignKey")
    protected PERSISTKEY campaignKey;
    @XmlElement(name = "CampaignSysKey")
    protected List<SYSKEY> campaignSysKey;
    @XmlElement(name = "CampaignName")
    protected String campaignName;
    @XmlElement(name = "CampaignShortName")
    protected String campaignShortName;
    @XmlElement(name = "CampaignType")
    protected OLILUCAMPAIGNTYPE campaignType;
    @XmlElement(name = "CampaignCode")
    protected String campaignCode;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
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
     * Gets the value of the campaignKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getCampaignKey() {
        return campaignKey;
    }

    /**
     * Sets the value of the campaignKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setCampaignKey(PERSISTKEY value) {
        this.campaignKey = value;
    }

    /**
     * Gets the value of the campaignSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getCampaignSysKey() {
        if (campaignSysKey == null) {
            campaignSysKey = new ArrayList<SYSKEY>();
        }
        return this.campaignSysKey;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the campaignShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignShortName() {
        return campaignShortName;
    }

    /**
     * Sets the value of the campaignShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignShortName(String value) {
        this.campaignShortName = value;
    }

    /**
     * Gets the value of the campaignType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCAMPAIGNTYPE }
     *     
     */
    public OLILUCAMPAIGNTYPE getCampaignType() {
        return campaignType;
    }

    /**
     * Sets the value of the campaignType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCAMPAIGNTYPE }
     *     
     */
    public void setCampaignType(OLILUCAMPAIGNTYPE value) {
        this.campaignType = value;
    }

    /**
     * Gets the value of the campaignCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignCode() {
        return campaignCode;
    }

    /**
     * Sets the value of the campaignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignCode(String value) {
        this.campaignCode = value;
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