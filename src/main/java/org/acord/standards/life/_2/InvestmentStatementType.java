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
 * <p>Java class for InvestmentStatement_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentStatement_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InvestmentStatementKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InvestmentStatementSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AcctNum" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}VolDedContribPriorPeriodAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}VolDedContribAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}VolNonDedContribPriorPeriodAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}VolNonDedContribAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EEContribAmtPriorPeriodAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EEContribAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxQualRolloverAmtPriorPerAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxQualRolloverAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubAccountStatement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InvestmentStatementDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="AccountHolderPartyID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="HoldingID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentStatement_Type", propOrder = {
    "investmentStatementKey",
    "investmentStatementSysKey",
    "acctNum",
    "volDedContribPriorPeriodAmt",
    "volDedContribAmt",
    "volNonDedContribPriorPeriodAmt",
    "volNonDedContribAmt",
    "eeContribAmtPriorPeriodAmt",
    "eeContribAmt",
    "taxQualRolloverAmtPriorPerAmt",
    "taxQualRolloverAmt",
    "subAccountStatement",
    "investmentStatementDetail",
    "oLifEExtension"
})
public class InvestmentStatementType {

    @XmlElement(name = "InvestmentStatementKey")
    protected PERSISTKEY investmentStatementKey;
    @XmlElement(name = "InvestmentStatementSysKey")
    protected List<SYSKEY> investmentStatementSysKey;
    @XmlElement(name = "AcctNum")
    protected String acctNum;
    @XmlElement(name = "VolDedContribPriorPeriodAmt")
    protected BigDecimal volDedContribPriorPeriodAmt;
    @XmlElement(name = "VolDedContribAmt")
    protected BigDecimal volDedContribAmt;
    @XmlElement(name = "VolNonDedContribPriorPeriodAmt")
    protected BigDecimal volNonDedContribPriorPeriodAmt;
    @XmlElement(name = "VolNonDedContribAmt")
    protected BigDecimal volNonDedContribAmt;
    @XmlElement(name = "EEContribAmtPriorPeriodAmt")
    protected BigDecimal eeContribAmtPriorPeriodAmt;
    @XmlElement(name = "EEContribAmt")
    protected BigDecimal eeContribAmt;
    @XmlElement(name = "TaxQualRolloverAmtPriorPerAmt")
    protected BigDecimal taxQualRolloverAmtPriorPerAmt;
    @XmlElement(name = "TaxQualRolloverAmt")
    protected BigDecimal taxQualRolloverAmt;
    @XmlElement(name = "SubAccountStatement")
    protected List<SubAccountStatementType> subAccountStatement;
    @XmlElement(name = "InvestmentStatementDetail")
    protected List<InvestmentStatementDetailType> investmentStatementDetail;
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
    @XmlAttribute(name = "AccountHolderPartyID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object accountHolderPartyID;
    @XmlAttribute(name = "HoldingID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object holdingID;

    /**
     * Gets the value of the investmentStatementKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getInvestmentStatementKey() {
        return investmentStatementKey;
    }

    /**
     * Sets the value of the investmentStatementKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setInvestmentStatementKey(PERSISTKEY value) {
        this.investmentStatementKey = value;
    }

    /**
     * Gets the value of the investmentStatementSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investmentStatementSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestmentStatementSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getInvestmentStatementSysKey() {
        if (investmentStatementSysKey == null) {
            investmentStatementSysKey = new ArrayList<SYSKEY>();
        }
        return this.investmentStatementSysKey;
    }

    /**
     * Gets the value of the acctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNum() {
        return acctNum;
    }

    /**
     * Sets the value of the acctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNum(String value) {
        this.acctNum = value;
    }

    /**
     * Gets the value of the volDedContribPriorPeriodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolDedContribPriorPeriodAmt() {
        return volDedContribPriorPeriodAmt;
    }

    /**
     * Sets the value of the volDedContribPriorPeriodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolDedContribPriorPeriodAmt(BigDecimal value) {
        this.volDedContribPriorPeriodAmt = value;
    }

    /**
     * Gets the value of the volDedContribAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolDedContribAmt() {
        return volDedContribAmt;
    }

    /**
     * Sets the value of the volDedContribAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolDedContribAmt(BigDecimal value) {
        this.volDedContribAmt = value;
    }

    /**
     * Gets the value of the volNonDedContribPriorPeriodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolNonDedContribPriorPeriodAmt() {
        return volNonDedContribPriorPeriodAmt;
    }

    /**
     * Sets the value of the volNonDedContribPriorPeriodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolNonDedContribPriorPeriodAmt(BigDecimal value) {
        this.volNonDedContribPriorPeriodAmt = value;
    }

    /**
     * Gets the value of the volNonDedContribAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolNonDedContribAmt() {
        return volNonDedContribAmt;
    }

    /**
     * Sets the value of the volNonDedContribAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolNonDedContribAmt(BigDecimal value) {
        this.volNonDedContribAmt = value;
    }

    /**
     * Gets the value of the eeContribAmtPriorPeriodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEEContribAmtPriorPeriodAmt() {
        return eeContribAmtPriorPeriodAmt;
    }

    /**
     * Sets the value of the eeContribAmtPriorPeriodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEEContribAmtPriorPeriodAmt(BigDecimal value) {
        this.eeContribAmtPriorPeriodAmt = value;
    }

    /**
     * Gets the value of the eeContribAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEEContribAmt() {
        return eeContribAmt;
    }

    /**
     * Sets the value of the eeContribAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEEContribAmt(BigDecimal value) {
        this.eeContribAmt = value;
    }

    /**
     * Gets the value of the taxQualRolloverAmtPriorPerAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxQualRolloverAmtPriorPerAmt() {
        return taxQualRolloverAmtPriorPerAmt;
    }

    /**
     * Sets the value of the taxQualRolloverAmtPriorPerAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxQualRolloverAmtPriorPerAmt(BigDecimal value) {
        this.taxQualRolloverAmtPriorPerAmt = value;
    }

    /**
     * Gets the value of the taxQualRolloverAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxQualRolloverAmt() {
        return taxQualRolloverAmt;
    }

    /**
     * Sets the value of the taxQualRolloverAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxQualRolloverAmt(BigDecimal value) {
        this.taxQualRolloverAmt = value;
    }

    /**
     * Gets the value of the subAccountStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAccountStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAccountStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAccountStatementType }
     * 
     * 
     */
    public List<SubAccountStatementType> getSubAccountStatement() {
        if (subAccountStatement == null) {
            subAccountStatement = new ArrayList<SubAccountStatementType>();
        }
        return this.subAccountStatement;
    }

    /**
     * Gets the value of the investmentStatementDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investmentStatementDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestmentStatementDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentStatementDetailType }
     * 
     * 
     */
    public List<InvestmentStatementDetailType> getInvestmentStatementDetail() {
        if (investmentStatementDetail == null) {
            investmentStatementDetail = new ArrayList<InvestmentStatementDetailType>();
        }
        return this.investmentStatementDetail;
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
     * Gets the value of the accountHolderPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountHolderPartyID() {
        return accountHolderPartyID;
    }

    /**
     * Sets the value of the accountHolderPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountHolderPartyID(Object value) {
        this.accountHolderPartyID = value;
    }

    /**
     * Gets the value of the holdingID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHoldingID() {
        return holdingID;
    }

    /**
     * Sets the value of the holdingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHoldingID(Object value) {
        this.holdingID = value;
    }

}
