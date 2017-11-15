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
 * <p>Java class for LoanActivity_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanActivity_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LoanActivityKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LoanActivitySysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LoanIntAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LoanBalance" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LoanNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LoanPrincipal" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LoanIntAmtDue" minOccurs="0"/>
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
@XmlType(name = "LoanActivity_Type", propOrder = {
    "loanActivityKey",
    "loanActivitySysKey",
    "loanIntAmt",
    "loanBalance",
    "loanNumber",
    "loanPrincipal",
    "loanIntAmtDue",
    "oLifEExtension"
})
public class LoanActivityType {

    @XmlElement(name = "LoanActivityKey")
    protected PERSISTKEY loanActivityKey;
    @XmlElement(name = "LoanActivitySysKey")
    protected List<SYSKEY> loanActivitySysKey;
    @XmlElement(name = "LoanIntAmt")
    protected BigDecimal loanIntAmt;
    @XmlElement(name = "LoanBalance")
    protected BigDecimal loanBalance;
    @XmlElement(name = "LoanNumber")
    protected String loanNumber;
    @XmlElement(name = "LoanPrincipal")
    protected BigDecimal loanPrincipal;
    @XmlElement(name = "LoanIntAmtDue")
    protected Double loanIntAmtDue;
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
     * Gets the value of the loanActivityKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getLoanActivityKey() {
        return loanActivityKey;
    }

    /**
     * Sets the value of the loanActivityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setLoanActivityKey(PERSISTKEY value) {
        this.loanActivityKey = value;
    }

    /**
     * Gets the value of the loanActivitySysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanActivitySysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanActivitySysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getLoanActivitySysKey() {
        if (loanActivitySysKey == null) {
            loanActivitySysKey = new ArrayList<SYSKEY>();
        }
        return this.loanActivitySysKey;
    }

    /**
     * Gets the value of the loanIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanIntAmt() {
        return loanIntAmt;
    }

    /**
     * Sets the value of the loanIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanIntAmt(BigDecimal value) {
        this.loanIntAmt = value;
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
     * Gets the value of the loanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNumber() {
        return loanNumber;
    }

    /**
     * Sets the value of the loanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNumber(String value) {
        this.loanNumber = value;
    }

    /**
     * Gets the value of the loanPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanPrincipal() {
        return loanPrincipal;
    }

    /**
     * Sets the value of the loanPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanPrincipal(BigDecimal value) {
        this.loanPrincipal = value;
    }

    /**
     * Gets the value of the loanIntAmtDue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoanIntAmtDue() {
        return loanIntAmtDue;
    }

    /**
     * Sets the value of the loanIntAmtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoanIntAmtDue(Double value) {
        this.loanIntAmtDue = value;
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