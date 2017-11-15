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
 * <p>Java class for PolicyStatement_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyStatement_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyStatementKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyStatementSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalGrossPremAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalNetPremAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalDeductedCOIChgs" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalAmtWthdrwn" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CashSurrValue" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NetSurrValueAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LoanBalance" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalIntUnloanedFundAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalIntLoanedFundAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalLoanAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalLoanPaymentAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalLoanIntAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxableInterestEarned" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TaxableInterestDue" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InternalInterestTransferAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TotalAdjustmentAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UnloanedPolicyValue" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}WeightedAvgIntRate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyValueAtStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyValueAtEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyStatementDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="HoldingID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyStatement_Type", propOrder = {
    "policyStatementKey",
    "policyStatementSysKey",
    "polNumber",
    "totalGrossPremAmt",
    "totalNetPremAmt",
    "totalDeductedCOIChgs",
    "totalAmtWthdrwn",
    "cashSurrValue",
    "netSurrValueAmt",
    "loanBalance",
    "totalIntUnloanedFundAmt",
    "totalIntLoanedFundAmt",
    "totalLoanAmt",
    "totalLoanPaymentAmt",
    "totalLoanIntAmt",
    "taxableInterestEarned",
    "taxableInterestDue",
    "internalInterestTransferAmt",
    "totalAdjustmentAmt",
    "unloanedPolicyValue",
    "weightedAvgIntRate",
    "policyValueAtStartDate",
    "policyValueAtEndDate",
    "fee",
    "policyStatementDetail",
    "oLifEExtension"
})
public class PolicyStatementType {

    @XmlElement(name = "PolicyStatementKey")
    protected PERSISTKEY policyStatementKey;
    @XmlElement(name = "PolicyStatementSysKey")
    protected List<SYSKEY> policyStatementSysKey;
    @XmlElement(name = "PolNumber")
    protected String polNumber;
    @XmlElement(name = "TotalGrossPremAmt")
    protected BigDecimal totalGrossPremAmt;
    @XmlElement(name = "TotalNetPremAmt")
    protected BigDecimal totalNetPremAmt;
    @XmlElement(name = "TotalDeductedCOIChgs")
    protected BigDecimal totalDeductedCOIChgs;
    @XmlElement(name = "TotalAmtWthdrwn")
    protected BigDecimal totalAmtWthdrwn;
    @XmlElement(name = "CashSurrValue")
    protected BigDecimal cashSurrValue;
    @XmlElement(name = "NetSurrValueAmt")
    protected BigDecimal netSurrValueAmt;
    @XmlElement(name = "LoanBalance")
    protected BigDecimal loanBalance;
    @XmlElement(name = "TotalIntUnloanedFundAmt")
    protected BigDecimal totalIntUnloanedFundAmt;
    @XmlElement(name = "TotalIntLoanedFundAmt")
    protected BigDecimal totalIntLoanedFundAmt;
    @XmlElement(name = "TotalLoanAmt")
    protected BigDecimal totalLoanAmt;
    @XmlElement(name = "TotalLoanPaymentAmt")
    protected BigDecimal totalLoanPaymentAmt;
    @XmlElement(name = "TotalLoanIntAmt")
    protected BigDecimal totalLoanIntAmt;
    @XmlElement(name = "TaxableInterestEarned")
    protected BigDecimal taxableInterestEarned;
    @XmlElement(name = "TaxableInterestDue")
    protected BigDecimal taxableInterestDue;
    @XmlElement(name = "InternalInterestTransferAmt")
    protected BigDecimal internalInterestTransferAmt;
    @XmlElement(name = "TotalAdjustmentAmt")
    protected BigDecimal totalAdjustmentAmt;
    @XmlElement(name = "UnloanedPolicyValue")
    protected BigDecimal unloanedPolicyValue;
    @XmlElement(name = "WeightedAvgIntRate")
    protected Double weightedAvgIntRate;
    @XmlElement(name = "PolicyValueAtStartDate")
    protected BigDecimal policyValueAtStartDate;
    @XmlElement(name = "PolicyValueAtEndDate")
    protected BigDecimal policyValueAtEndDate;
    @XmlElement(name = "Fee")
    protected List<FeeType> fee;
    @XmlElement(name = "PolicyStatementDetail")
    protected List<PolicyStatementDetailType> policyStatementDetail;
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
    @XmlAttribute(name = "HoldingID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object holdingID;

    /**
     * Gets the value of the policyStatementKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getPolicyStatementKey() {
        return policyStatementKey;
    }

    /**
     * Sets the value of the policyStatementKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setPolicyStatementKey(PERSISTKEY value) {
        this.policyStatementKey = value;
    }

    /**
     * Gets the value of the policyStatementSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyStatementSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyStatementSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getPolicyStatementSysKey() {
        if (policyStatementSysKey == null) {
            policyStatementSysKey = new ArrayList<SYSKEY>();
        }
        return this.policyStatementSysKey;
    }

    /**
     * Gets the value of the polNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolNumber() {
        return polNumber;
    }

    /**
     * Sets the value of the polNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolNumber(String value) {
        this.polNumber = value;
    }

    /**
     * Gets the value of the totalGrossPremAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGrossPremAmt() {
        return totalGrossPremAmt;
    }

    /**
     * Sets the value of the totalGrossPremAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGrossPremAmt(BigDecimal value) {
        this.totalGrossPremAmt = value;
    }

    /**
     * Gets the value of the totalNetPremAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNetPremAmt() {
        return totalNetPremAmt;
    }

    /**
     * Sets the value of the totalNetPremAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNetPremAmt(BigDecimal value) {
        this.totalNetPremAmt = value;
    }

    /**
     * Gets the value of the totalDeductedCOIChgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDeductedCOIChgs() {
        return totalDeductedCOIChgs;
    }

    /**
     * Sets the value of the totalDeductedCOIChgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDeductedCOIChgs(BigDecimal value) {
        this.totalDeductedCOIChgs = value;
    }

    /**
     * Gets the value of the totalAmtWthdrwn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmtWthdrwn() {
        return totalAmtWthdrwn;
    }

    /**
     * Sets the value of the totalAmtWthdrwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmtWthdrwn(BigDecimal value) {
        this.totalAmtWthdrwn = value;
    }

    /**
     * Gets the value of the cashSurrValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashSurrValue() {
        return cashSurrValue;
    }

    /**
     * Sets the value of the cashSurrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashSurrValue(BigDecimal value) {
        this.cashSurrValue = value;
    }

    /**
     * Gets the value of the netSurrValueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetSurrValueAmt() {
        return netSurrValueAmt;
    }

    /**
     * Sets the value of the netSurrValueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetSurrValueAmt(BigDecimal value) {
        this.netSurrValueAmt = value;
    }

    /**
     * Gets the value of the loanBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanBalance() {
        return loanBalance;
    }

    /**
     * Sets the value of the loanBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanBalance(BigDecimal value) {
        this.loanBalance = value;
    }

    /**
     * Gets the value of the totalIntUnloanedFundAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalIntUnloanedFundAmt() {
        return totalIntUnloanedFundAmt;
    }

    /**
     * Sets the value of the totalIntUnloanedFundAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalIntUnloanedFundAmt(BigDecimal value) {
        this.totalIntUnloanedFundAmt = value;
    }

    /**
     * Gets the value of the totalIntLoanedFundAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalIntLoanedFundAmt() {
        return totalIntLoanedFundAmt;
    }

    /**
     * Sets the value of the totalIntLoanedFundAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalIntLoanedFundAmt(BigDecimal value) {
        this.totalIntLoanedFundAmt = value;
    }

    /**
     * Gets the value of the totalLoanAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoanAmt() {
        return totalLoanAmt;
    }

    /**
     * Sets the value of the totalLoanAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLoanAmt(BigDecimal value) {
        this.totalLoanAmt = value;
    }

    /**
     * Gets the value of the totalLoanPaymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoanPaymentAmt() {
        return totalLoanPaymentAmt;
    }

    /**
     * Sets the value of the totalLoanPaymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLoanPaymentAmt(BigDecimal value) {
        this.totalLoanPaymentAmt = value;
    }

    /**
     * Gets the value of the totalLoanIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoanIntAmt() {
        return totalLoanIntAmt;
    }

    /**
     * Sets the value of the totalLoanIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLoanIntAmt(BigDecimal value) {
        this.totalLoanIntAmt = value;
    }

    /**
     * Gets the value of the taxableInterestEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableInterestEarned() {
        return taxableInterestEarned;
    }

    /**
     * Sets the value of the taxableInterestEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableInterestEarned(BigDecimal value) {
        this.taxableInterestEarned = value;
    }

    /**
     * Gets the value of the taxableInterestDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableInterestDue() {
        return taxableInterestDue;
    }

    /**
     * Sets the value of the taxableInterestDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableInterestDue(BigDecimal value) {
        this.taxableInterestDue = value;
    }

    /**
     * Gets the value of the internalInterestTransferAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInternalInterestTransferAmt() {
        return internalInterestTransferAmt;
    }

    /**
     * Sets the value of the internalInterestTransferAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInternalInterestTransferAmt(BigDecimal value) {
        this.internalInterestTransferAmt = value;
    }

    /**
     * Gets the value of the totalAdjustmentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAdjustmentAmt() {
        return totalAdjustmentAmt;
    }

    /**
     * Sets the value of the totalAdjustmentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAdjustmentAmt(BigDecimal value) {
        this.totalAdjustmentAmt = value;
    }

    /**
     * Gets the value of the unloanedPolicyValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnloanedPolicyValue() {
        return unloanedPolicyValue;
    }

    /**
     * Sets the value of the unloanedPolicyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnloanedPolicyValue(BigDecimal value) {
        this.unloanedPolicyValue = value;
    }

    /**
     * Gets the value of the weightedAvgIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightedAvgIntRate() {
        return weightedAvgIntRate;
    }

    /**
     * Sets the value of the weightedAvgIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightedAvgIntRate(Double value) {
        this.weightedAvgIntRate = value;
    }

    /**
     * Gets the value of the policyValueAtStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPolicyValueAtStartDate() {
        return policyValueAtStartDate;
    }

    /**
     * Sets the value of the policyValueAtStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPolicyValueAtStartDate(BigDecimal value) {
        this.policyValueAtStartDate = value;
    }

    /**
     * Gets the value of the policyValueAtEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPolicyValueAtEndDate() {
        return policyValueAtEndDate;
    }

    /**
     * Sets the value of the policyValueAtEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPolicyValueAtEndDate(BigDecimal value) {
        this.policyValueAtEndDate = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeType>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the policyStatementDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyStatementDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyStatementDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyStatementDetailType }
     * 
     * 
     */
    public List<PolicyStatementDetailType> getPolicyStatementDetail() {
        if (policyStatementDetail == null) {
            policyStatementDetail = new ArrayList<PolicyStatementDetailType>();
        }
        return this.policyStatementDetail;
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
