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
 * <p>Java class for BeneIncomeRestriction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneIncomeRestriction_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BeneIncomeRestrictionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BeneIncomeRestrictionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BeneIncomeWthdrwRestrict" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BeneIncomeWthdrwRestrictDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BeneIncomeMaxWithdrawalAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BeneIncomeMaxWithdrawalMode" minOccurs="0"/>
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
@XmlType(name = "BeneIncomeRestriction_Type", propOrder = {
    "beneIncomeRestrictionKey",
    "beneIncomeRestrictionSysKey",
    "beneIncomeWthdrwRestrict",
    "beneIncomeWthdrwRestrictDesc",
    "beneIncomeMaxWithdrawalAmt",
    "beneIncomeMaxWithdrawalMode",
    "oLifEExtension"
})
public class BeneIncomeRestrictionType {

    @XmlElement(name = "BeneIncomeRestrictionKey")
    protected PERSISTKEY beneIncomeRestrictionKey;
    @XmlElement(name = "BeneIncomeRestrictionSysKey")
    protected List<SYSKEY> beneIncomeRestrictionSysKey;
    @XmlElement(name = "BeneIncomeWthdrwRestrict")
    protected OLILUBENINWTDHREST beneIncomeWthdrwRestrict;
    @XmlElement(name = "BeneIncomeWthdrwRestrictDesc")
    protected String beneIncomeWthdrwRestrictDesc;
    @XmlElement(name = "BeneIncomeMaxWithdrawalAmt")
    protected BigDecimal beneIncomeMaxWithdrawalAmt;
    @XmlElement(name = "BeneIncomeMaxWithdrawalMode")
    protected OLILUPAYMODE beneIncomeMaxWithdrawalMode;
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
     * Gets the value of the beneIncomeRestrictionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getBeneIncomeRestrictionKey() {
        return beneIncomeRestrictionKey;
    }

    /**
     * Sets the value of the beneIncomeRestrictionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setBeneIncomeRestrictionKey(PERSISTKEY value) {
        this.beneIncomeRestrictionKey = value;
    }

    /**
     * Gets the value of the beneIncomeRestrictionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneIncomeRestrictionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneIncomeRestrictionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getBeneIncomeRestrictionSysKey() {
        if (beneIncomeRestrictionSysKey == null) {
            beneIncomeRestrictionSysKey = new ArrayList<SYSKEY>();
        }
        return this.beneIncomeRestrictionSysKey;
    }

    /**
     * Gets the value of the beneIncomeWthdrwRestrict property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBENINWTDHREST }
     *     
     */
    public OLILUBENINWTDHREST getBeneIncomeWthdrwRestrict() {
        return beneIncomeWthdrwRestrict;
    }

    /**
     * Sets the value of the beneIncomeWthdrwRestrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBENINWTDHREST }
     *     
     */
    public void setBeneIncomeWthdrwRestrict(OLILUBENINWTDHREST value) {
        this.beneIncomeWthdrwRestrict = value;
    }

    /**
     * Gets the value of the beneIncomeWthdrwRestrictDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneIncomeWthdrwRestrictDesc() {
        return beneIncomeWthdrwRestrictDesc;
    }

    /**
     * Sets the value of the beneIncomeWthdrwRestrictDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneIncomeWthdrwRestrictDesc(String value) {
        this.beneIncomeWthdrwRestrictDesc = value;
    }

    /**
     * Gets the value of the beneIncomeMaxWithdrawalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeneIncomeMaxWithdrawalAmt() {
        return beneIncomeMaxWithdrawalAmt;
    }

    /**
     * Sets the value of the beneIncomeMaxWithdrawalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeneIncomeMaxWithdrawalAmt(BigDecimal value) {
        this.beneIncomeMaxWithdrawalAmt = value;
    }

    /**
     * Gets the value of the beneIncomeMaxWithdrawalMode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public OLILUPAYMODE getBeneIncomeMaxWithdrawalMode() {
        return beneIncomeMaxWithdrawalMode;
    }

    /**
     * Sets the value of the beneIncomeMaxWithdrawalMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPAYMODE }
     *     
     */
    public void setBeneIncomeMaxWithdrawalMode(OLILUPAYMODE value) {
        this.beneIncomeMaxWithdrawalMode = value;
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
