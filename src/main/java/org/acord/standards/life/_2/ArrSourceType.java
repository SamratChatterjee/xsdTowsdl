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
 * <p>Java class for ArrSource_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrSource_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ArrSourceKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ArrSourceSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransferAmtType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransferAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransferUnits" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransferPct" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubAcctName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AnnualIndex" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="SubAcctID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="PaymentPartyID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="BankingInfoID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
@XmlType(name = "ArrSource_Type", propOrder = {
    "arrSourceKey",
    "arrSourceSysKey",
    "transferAmtType",
    "transferAmt",
    "transferUnits",
    "transferPct",
    "subAcctName",
    "annualIndex",
    "oLifEExtension"
})
public class ArrSourceType {

    @XmlElement(name = "ArrSourceKey")
    protected PERSISTKEY arrSourceKey;
    @XmlElement(name = "ArrSourceSysKey")
    protected List<SYSKEY> arrSourceSysKey;
    @XmlElement(name = "TransferAmtType")
    protected OLILUTRNSFRAMTTYPE transferAmtType;
    @XmlElement(name = "TransferAmt")
    protected BigDecimal transferAmt;
    @XmlElement(name = "TransferUnits")
    protected Double transferUnits;
    @XmlElement(name = "TransferPct")
    protected Double transferPct;
    @XmlElement(name = "SubAcctName")
    protected String subAcctName;
    @XmlElement(name = "AnnualIndex")
    protected Double annualIndex;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "SubAcctID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object subAcctID;
    @XmlAttribute(name = "PaymentPartyID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object paymentPartyID;
    @XmlAttribute(name = "BankingInfoID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object bankingInfoID;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;
    @XmlAttribute(name = "HoldingID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object holdingID;

    /**
     * Gets the value of the arrSourceKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getArrSourceKey() {
        return arrSourceKey;
    }

    /**
     * Sets the value of the arrSourceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setArrSourceKey(PERSISTKEY value) {
        this.arrSourceKey = value;
    }

    /**
     * Gets the value of the arrSourceSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrSourceSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrSourceSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getArrSourceSysKey() {
        if (arrSourceSysKey == null) {
            arrSourceSysKey = new ArrayList<SYSKEY>();
        }
        return this.arrSourceSysKey;
    }

    /**
     * Gets the value of the transferAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTRNSFRAMTTYPE }
     *     
     */
    public OLILUTRNSFRAMTTYPE getTransferAmtType() {
        return transferAmtType;
    }

    /**
     * Sets the value of the transferAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTRNSFRAMTTYPE }
     *     
     */
    public void setTransferAmtType(OLILUTRNSFRAMTTYPE value) {
        this.transferAmtType = value;
    }

    /**
     * Gets the value of the transferAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferAmt() {
        return transferAmt;
    }

    /**
     * Sets the value of the transferAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferAmt(BigDecimal value) {
        this.transferAmt = value;
    }

    /**
     * Gets the value of the transferUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransferUnits() {
        return transferUnits;
    }

    /**
     * Sets the value of the transferUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransferUnits(Double value) {
        this.transferUnits = value;
    }

    /**
     * Gets the value of the transferPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransferPct() {
        return transferPct;
    }

    /**
     * Sets the value of the transferPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransferPct(Double value) {
        this.transferPct = value;
    }

    /**
     * Gets the value of the subAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAcctName() {
        return subAcctName;
    }

    /**
     * Sets the value of the subAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAcctName(String value) {
        this.subAcctName = value;
    }

    /**
     * Gets the value of the annualIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnnualIndex() {
        return annualIndex;
    }

    /**
     * Sets the value of the annualIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnnualIndex(Double value) {
        this.annualIndex = value;
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
     * Gets the value of the subAcctID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubAcctID() {
        return subAcctID;
    }

    /**
     * Sets the value of the subAcctID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubAcctID(Object value) {
        this.subAcctID = value;
    }

    /**
     * Gets the value of the paymentPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPaymentPartyID() {
        return paymentPartyID;
    }

    /**
     * Sets the value of the paymentPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPaymentPartyID(Object value) {
        this.paymentPartyID = value;
    }

    /**
     * Gets the value of the bankingInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBankingInfoID() {
        return bankingInfoID;
    }

    /**
     * Sets the value of the bankingInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBankingInfoID(Object value) {
        this.bankingInfoID = value;
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
