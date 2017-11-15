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
 * <p>Java class for NonForProvision_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonForProvision_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NonForProvisionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NonForProvisionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BenefitType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InitialAmtType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LoanAdjType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NFOModeMethods" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ConsecutiveLimit" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxMonthsLimit" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxConstantLimit" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Limitations" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NetSinglePremIntRate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NonFortProv" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DefaultInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ValuePerUnit" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MortalityOrMorbidityTable" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedSubstandard" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "NonForProvision_Type", propOrder = {
    "nonForProvisionKey",
    "nonForProvisionSysKey",
    "benefitType",
    "initialAmtType",
    "loanAdjType",
    "nfoModeMethods",
    "consecutiveLimit",
    "maxMonthsLimit",
    "maxConstantLimit",
    "limitations",
    "netSinglePremIntRate",
    "nonFortProv",
    "defaultInd",
    "valuePerUnit",
    "mortalityOrMorbidityTable",
    "allowedSubstandard",
    "oLifEExtension"
})
public class NonForProvisionType {

    @XmlElement(name = "NonForProvisionKey")
    protected PERSISTKEY nonForProvisionKey;
    @XmlElement(name = "NonForProvisionSysKey")
    protected List<SYSKEY> nonForProvisionSysKey;
    @XmlElement(name = "BenefitType")
    protected OLILUBENEFITCODE benefitType;
    @XmlElement(name = "InitialAmtType")
    protected OLILUAMTCALCMETHOD initialAmtType;
    @XmlElement(name = "LoanAdjType")
    protected OLILULOANADJCODE loanAdjType;
    @XmlElement(name = "NFOModeMethods")
    protected OLILUNFOMODEMETHODS nfoModeMethods;
    @XmlElement(name = "ConsecutiveLimit")
    protected BigInteger consecutiveLimit;
    @XmlElement(name = "MaxMonthsLimit")
    protected BigInteger maxMonthsLimit;
    @XmlElement(name = "MaxConstantLimit")
    protected BigInteger maxConstantLimit;
    @XmlElement(name = "Limitations")
    protected OLILUNFOLIMITTYPES limitations;
    @XmlElement(name = "NetSinglePremIntRate")
    protected Double netSinglePremIntRate;
    @XmlElement(name = "NonFortProv")
    protected OLILUNONFORTPROV nonFortProv;
    @XmlElement(name = "DefaultInd")
    protected OLILUBOOLEAN defaultInd;
    @XmlElement(name = "ValuePerUnit")
    protected BigDecimal valuePerUnit;
    @XmlElement(name = "MortalityOrMorbidityTable")
    protected OLILUMORTALITYTBL mortalityOrMorbidityTable;
    @XmlElement(name = "AllowedSubstandard")
    protected List<AllowedSubstandardType> allowedSubstandard;
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
     * Gets the value of the nonForProvisionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getNonForProvisionKey() {
        return nonForProvisionKey;
    }

    /**
     * Sets the value of the nonForProvisionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setNonForProvisionKey(PERSISTKEY value) {
        this.nonForProvisionKey = value;
    }

    /**
     * Gets the value of the nonForProvisionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonForProvisionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonForProvisionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getNonForProvisionSysKey() {
        if (nonForProvisionSysKey == null) {
            nonForProvisionSysKey = new ArrayList<SYSKEY>();
        }
        return this.nonForProvisionSysKey;
    }

    /**
     * Gets the value of the benefitType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBENEFITCODE }
     *     
     */
    public OLILUBENEFITCODE getBenefitType() {
        return benefitType;
    }

    /**
     * Sets the value of the benefitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBENEFITCODE }
     *     
     */
    public void setBenefitType(OLILUBENEFITCODE value) {
        this.benefitType = value;
    }

    /**
     * Gets the value of the initialAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUAMTCALCMETHOD }
     *     
     */
    public OLILUAMTCALCMETHOD getInitialAmtType() {
        return initialAmtType;
    }

    /**
     * Sets the value of the initialAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUAMTCALCMETHOD }
     *     
     */
    public void setInitialAmtType(OLILUAMTCALCMETHOD value) {
        this.initialAmtType = value;
    }

    /**
     * Gets the value of the loanAdjType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILULOANADJCODE }
     *     
     */
    public OLILULOANADJCODE getLoanAdjType() {
        return loanAdjType;
    }

    /**
     * Sets the value of the loanAdjType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILULOANADJCODE }
     *     
     */
    public void setLoanAdjType(OLILULOANADJCODE value) {
        this.loanAdjType = value;
    }

    /**
     * Gets the value of the nfoModeMethods property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNFOMODEMETHODS }
     *     
     */
    public OLILUNFOMODEMETHODS getNFOModeMethods() {
        return nfoModeMethods;
    }

    /**
     * Sets the value of the nfoModeMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNFOMODEMETHODS }
     *     
     */
    public void setNFOModeMethods(OLILUNFOMODEMETHODS value) {
        this.nfoModeMethods = value;
    }

    /**
     * Gets the value of the consecutiveLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsecutiveLimit() {
        return consecutiveLimit;
    }

    /**
     * Sets the value of the consecutiveLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsecutiveLimit(BigInteger value) {
        this.consecutiveLimit = value;
    }

    /**
     * Gets the value of the maxMonthsLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxMonthsLimit() {
        return maxMonthsLimit;
    }

    /**
     * Sets the value of the maxMonthsLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxMonthsLimit(BigInteger value) {
        this.maxMonthsLimit = value;
    }

    /**
     * Gets the value of the maxConstantLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxConstantLimit() {
        return maxConstantLimit;
    }

    /**
     * Sets the value of the maxConstantLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxConstantLimit(BigInteger value) {
        this.maxConstantLimit = value;
    }

    /**
     * Gets the value of the limitations property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNFOLIMITTYPES }
     *     
     */
    public OLILUNFOLIMITTYPES getLimitations() {
        return limitations;
    }

    /**
     * Sets the value of the limitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNFOLIMITTYPES }
     *     
     */
    public void setLimitations(OLILUNFOLIMITTYPES value) {
        this.limitations = value;
    }

    /**
     * Gets the value of the netSinglePremIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetSinglePremIntRate() {
        return netSinglePremIntRate;
    }

    /**
     * Sets the value of the netSinglePremIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetSinglePremIntRate(Double value) {
        this.netSinglePremIntRate = value;
    }

    /**
     * Gets the value of the nonFortProv property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNONFORTPROV }
     *     
     */
    public OLILUNONFORTPROV getNonFortProv() {
        return nonFortProv;
    }

    /**
     * Sets the value of the nonFortProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNONFORTPROV }
     *     
     */
    public void setNonFortProv(OLILUNONFORTPROV value) {
        this.nonFortProv = value;
    }

    /**
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getDefaultInd() {
        return defaultInd;
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setDefaultInd(OLILUBOOLEAN value) {
        this.defaultInd = value;
    }

    /**
     * Gets the value of the valuePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValuePerUnit() {
        return valuePerUnit;
    }

    /**
     * Sets the value of the valuePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValuePerUnit(BigDecimal value) {
        this.valuePerUnit = value;
    }

    /**
     * Gets the value of the mortalityOrMorbidityTable property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMORTALITYTBL }
     *     
     */
    public OLILUMORTALITYTBL getMortalityOrMorbidityTable() {
        return mortalityOrMorbidityTable;
    }

    /**
     * Sets the value of the mortalityOrMorbidityTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMORTALITYTBL }
     *     
     */
    public void setMortalityOrMorbidityTable(OLILUMORTALITYTBL value) {
        this.mortalityOrMorbidityTable = value;
    }

    /**
     * Gets the value of the allowedSubstandard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedSubstandard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedSubstandard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedSubstandardType }
     * 
     * 
     */
    public List<AllowedSubstandardType> getAllowedSubstandard() {
        if (allowedSubstandard == null) {
            allowedSubstandard = new ArrayList<AllowedSubstandardType>();
        }
        return this.allowedSubstandard;
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
