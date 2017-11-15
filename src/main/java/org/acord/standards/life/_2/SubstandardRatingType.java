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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubstandardRating_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstandardRating_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstandardRatingKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SubstandardRatingSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RatingReason" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RatingCommissionRule" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermTableRating" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermTableRatingEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempTableRating" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempTableRatingStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempTableRatingEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempFlatEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempFlatExtraAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FlatExtraPremBasis" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AmtPerThou" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ModalGrossPermFlatExtraAllowanceAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ModalGrossTempFlatExtraAllowanceAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempFlatExtraDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempPercentageLoading" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermPercentageLoading" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EndDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermFlatExtraAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermFlatExtraEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermTableRatingAlphaCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempTableRatingCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastRatingDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempRatingType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermRatingType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempFlatStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Occupation" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OccupRating" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RatingOverriddenInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PermRatingAmtPerThou" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TempRatingAmtPerThou" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ModalPermRatingAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ModalTempRatingAmt" minOccurs="0"/>
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
@XmlType(name = "SubstandardRating_Type", propOrder = {
    "substandardRatingKey",
    "substandardRatingSysKey",
    "ratingReason",
    "ratingCommissionRule",
    "permTableRating",
    "permTableRatingEndDate",
    "tempTableRating",
    "tempTableRatingStartDate",
    "tempTableRatingEndDate",
    "tempFlatEndDate",
    "tempFlatExtraAmt",
    "flatExtraPremBasis",
    "amtPerThou",
    "modalGrossPermFlatExtraAllowanceAmt",
    "modalGrossTempFlatExtraAllowanceAmt",
    "tempFlatExtraDuration",
    "tempPercentageLoading",
    "permPercentageLoading",
    "endDate",
    "effDate",
    "permFlatExtraAmt",
    "permFlatExtraEndDate",
    "permTableRatingAlphaCode",
    "tempTableRatingCode",
    "lastRatingDate",
    "tempRatingType",
    "permRatingType",
    "tempFlatStartDate",
    "occupation",
    "occupRating",
    "ratingOverriddenInd",
    "permRatingAmtPerThou",
    "tempRatingAmtPerThou",
    "modalPermRatingAmt",
    "modalTempRatingAmt",
    "keyedValue",
    "oLifEExtension"
})
public class SubstandardRatingType {

    @XmlElement(name = "SubstandardRatingKey")
    protected PERSISTKEY substandardRatingKey;
    @XmlElement(name = "SubstandardRatingSysKey")
    protected List<SYSKEY> substandardRatingSysKey;
    @XmlElement(name = "RatingReason")
    protected String ratingReason;
    @XmlElement(name = "RatingCommissionRule")
    protected OLILURATCOMMRUL ratingCommissionRule;
    @XmlElement(name = "PermTableRating")
    protected OLILURATINGS permTableRating;
    @XmlElement(name = "PermTableRatingEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar permTableRatingEndDate;
    @XmlElement(name = "TempTableRating")
    protected OLILURATINGS tempTableRating;
    @XmlElement(name = "TempTableRatingStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tempTableRatingStartDate;
    @XmlElement(name = "TempTableRatingEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tempTableRatingEndDate;
    @XmlElement(name = "TempFlatEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tempFlatEndDate;
    @XmlElement(name = "TempFlatExtraAmt")
    protected BigDecimal tempFlatExtraAmt;
    @XmlElement(name = "FlatExtraPremBasis")
    protected OLILUFLATEXTRAPREMBASISCODE flatExtraPremBasis;
    @XmlElement(name = "AmtPerThou")
    protected BigDecimal amtPerThou;
    @XmlElement(name = "ModalGrossPermFlatExtraAllowanceAmt")
    protected BigDecimal modalGrossPermFlatExtraAllowanceAmt;
    @XmlElement(name = "ModalGrossTempFlatExtraAllowanceAmt")
    protected BigDecimal modalGrossTempFlatExtraAllowanceAmt;
    @XmlElement(name = "TempFlatExtraDuration")
    protected BigInteger tempFlatExtraDuration;
    @XmlElement(name = "TempPercentageLoading")
    protected Double tempPercentageLoading;
    @XmlElement(name = "PermPercentageLoading")
    protected Double permPercentageLoading;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "EffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDate;
    @XmlElement(name = "PermFlatExtraAmt")
    protected BigDecimal permFlatExtraAmt;
    @XmlElement(name = "PermFlatExtraEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar permFlatExtraEndDate;
    @XmlElement(name = "PermTableRatingAlphaCode")
    protected String permTableRatingAlphaCode;
    @XmlElement(name = "TempTableRatingCode")
    protected String tempTableRatingCode;
    @XmlElement(name = "LastRatingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastRatingDate;
    @XmlElement(name = "TempRatingType")
    protected OLILURATINGTYPE tempRatingType;
    @XmlElement(name = "PermRatingType")
    protected OLILURATINGTYPE permRatingType;
    @XmlElement(name = "TempFlatStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tempFlatStartDate;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "OccupRating")
    protected OLILUOCCUPRATING occupRating;
    @XmlElement(name = "RatingOverriddenInd")
    protected OLILUBOOLEAN ratingOverriddenInd;
    @XmlElement(name = "PermRatingAmtPerThou")
    protected BigDecimal permRatingAmtPerThou;
    @XmlElement(name = "TempRatingAmtPerThou")
    protected BigDecimal tempRatingAmtPerThou;
    @XmlElement(name = "ModalPermRatingAmt")
    protected BigDecimal modalPermRatingAmt;
    @XmlElement(name = "ModalTempRatingAmt")
    protected BigDecimal modalTempRatingAmt;
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
     * Gets the value of the substandardRatingKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getSubstandardRatingKey() {
        return substandardRatingKey;
    }

    /**
     * Sets the value of the substandardRatingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setSubstandardRatingKey(PERSISTKEY value) {
        this.substandardRatingKey = value;
    }

    /**
     * Gets the value of the substandardRatingSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substandardRatingSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstandardRatingSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getSubstandardRatingSysKey() {
        if (substandardRatingSysKey == null) {
            substandardRatingSysKey = new ArrayList<SYSKEY>();
        }
        return this.substandardRatingSysKey;
    }

    /**
     * Gets the value of the ratingReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingReason() {
        return ratingReason;
    }

    /**
     * Sets the value of the ratingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingReason(String value) {
        this.ratingReason = value;
    }

    /**
     * Gets the value of the ratingCommissionRule property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURATCOMMRUL }
     *     
     */
    public OLILURATCOMMRUL getRatingCommissionRule() {
        return ratingCommissionRule;
    }

    /**
     * Sets the value of the ratingCommissionRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURATCOMMRUL }
     *     
     */
    public void setRatingCommissionRule(OLILURATCOMMRUL value) {
        this.ratingCommissionRule = value;
    }

    /**
     * Gets the value of the permTableRating property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURATINGS }
     *     
     */
    public OLILURATINGS getPermTableRating() {
        return permTableRating;
    }

    /**
     * Sets the value of the permTableRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURATINGS }
     *     
     */
    public void setPermTableRating(OLILURATINGS value) {
        this.permTableRating = value;
    }

    /**
     * Gets the value of the permTableRatingEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPermTableRatingEndDate() {
        return permTableRatingEndDate;
    }

    /**
     * Sets the value of the permTableRatingEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPermTableRatingEndDate(XMLGregorianCalendar value) {
        this.permTableRatingEndDate = value;
    }

    /**
     * Gets the value of the tempTableRating property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURATINGS }
     *     
     */
    public OLILURATINGS getTempTableRating() {
        return tempTableRating;
    }

    /**
     * Sets the value of the tempTableRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURATINGS }
     *     
     */
    public void setTempTableRating(OLILURATINGS value) {
        this.tempTableRating = value;
    }

    /**
     * Gets the value of the tempTableRatingStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempTableRatingStartDate() {
        return tempTableRatingStartDate;
    }

    /**
     * Sets the value of the tempTableRatingStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempTableRatingStartDate(XMLGregorianCalendar value) {
        this.tempTableRatingStartDate = value;
    }

    /**
     * Gets the value of the tempTableRatingEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempTableRatingEndDate() {
        return tempTableRatingEndDate;
    }

    /**
     * Sets the value of the tempTableRatingEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempTableRatingEndDate(XMLGregorianCalendar value) {
        this.tempTableRatingEndDate = value;
    }

    /**
     * Gets the value of the tempFlatEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempFlatEndDate() {
        return tempFlatEndDate;
    }

    /**
     * Sets the value of the tempFlatEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempFlatEndDate(XMLGregorianCalendar value) {
        this.tempFlatEndDate = value;
    }

    /**
     * Gets the value of the tempFlatExtraAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTempFlatExtraAmt() {
        return tempFlatExtraAmt;
    }

    /**
     * Sets the value of the tempFlatExtraAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTempFlatExtraAmt(BigDecimal value) {
        this.tempFlatExtraAmt = value;
    }

    /**
     * Gets the value of the flatExtraPremBasis property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUFLATEXTRAPREMBASISCODE }
     *     
     */
    public OLILUFLATEXTRAPREMBASISCODE getFlatExtraPremBasis() {
        return flatExtraPremBasis;
    }

    /**
     * Sets the value of the flatExtraPremBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUFLATEXTRAPREMBASISCODE }
     *     
     */
    public void setFlatExtraPremBasis(OLILUFLATEXTRAPREMBASISCODE value) {
        this.flatExtraPremBasis = value;
    }

    /**
     * Gets the value of the amtPerThou property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtPerThou() {
        return amtPerThou;
    }

    /**
     * Sets the value of the amtPerThou property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtPerThou(BigDecimal value) {
        this.amtPerThou = value;
    }

    /**
     * Gets the value of the modalGrossPermFlatExtraAllowanceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getModalGrossPermFlatExtraAllowanceAmt() {
        return modalGrossPermFlatExtraAllowanceAmt;
    }

    /**
     * Sets the value of the modalGrossPermFlatExtraAllowanceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setModalGrossPermFlatExtraAllowanceAmt(BigDecimal value) {
        this.modalGrossPermFlatExtraAllowanceAmt = value;
    }

    /**
     * Gets the value of the modalGrossTempFlatExtraAllowanceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getModalGrossTempFlatExtraAllowanceAmt() {
        return modalGrossTempFlatExtraAllowanceAmt;
    }

    /**
     * Sets the value of the modalGrossTempFlatExtraAllowanceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setModalGrossTempFlatExtraAllowanceAmt(BigDecimal value) {
        this.modalGrossTempFlatExtraAllowanceAmt = value;
    }

    /**
     * Gets the value of the tempFlatExtraDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTempFlatExtraDuration() {
        return tempFlatExtraDuration;
    }

    /**
     * Sets the value of the tempFlatExtraDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTempFlatExtraDuration(BigInteger value) {
        this.tempFlatExtraDuration = value;
    }

    /**
     * Gets the value of the tempPercentageLoading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTempPercentageLoading() {
        return tempPercentageLoading;
    }

    /**
     * Sets the value of the tempPercentageLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTempPercentageLoading(Double value) {
        this.tempPercentageLoading = value;
    }

    /**
     * Gets the value of the permPercentageLoading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPermPercentageLoading() {
        return permPercentageLoading;
    }

    /**
     * Sets the value of the permPercentageLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPermPercentageLoading(Double value) {
        this.permPercentageLoading = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the effDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Sets the value of the effDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Gets the value of the permFlatExtraAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPermFlatExtraAmt() {
        return permFlatExtraAmt;
    }

    /**
     * Sets the value of the permFlatExtraAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPermFlatExtraAmt(BigDecimal value) {
        this.permFlatExtraAmt = value;
    }

    /**
     * Gets the value of the permFlatExtraEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPermFlatExtraEndDate() {
        return permFlatExtraEndDate;
    }

    /**
     * Sets the value of the permFlatExtraEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPermFlatExtraEndDate(XMLGregorianCalendar value) {
        this.permFlatExtraEndDate = value;
    }

    /**
     * Gets the value of the permTableRatingAlphaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermTableRatingAlphaCode() {
        return permTableRatingAlphaCode;
    }

    /**
     * Sets the value of the permTableRatingAlphaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermTableRatingAlphaCode(String value) {
        this.permTableRatingAlphaCode = value;
    }

    /**
     * Gets the value of the tempTableRatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempTableRatingCode() {
        return tempTableRatingCode;
    }

    /**
     * Sets the value of the tempTableRatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempTableRatingCode(String value) {
        this.tempTableRatingCode = value;
    }

    /**
     * Gets the value of the lastRatingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRatingDate() {
        return lastRatingDate;
    }

    /**
     * Sets the value of the lastRatingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRatingDate(XMLGregorianCalendar value) {
        this.lastRatingDate = value;
    }

    /**
     * Gets the value of the tempRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURATINGTYPE }
     *     
     */
    public OLILURATINGTYPE getTempRatingType() {
        return tempRatingType;
    }

    /**
     * Sets the value of the tempRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURATINGTYPE }
     *     
     */
    public void setTempRatingType(OLILURATINGTYPE value) {
        this.tempRatingType = value;
    }

    /**
     * Gets the value of the permRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURATINGTYPE }
     *     
     */
    public OLILURATINGTYPE getPermRatingType() {
        return permRatingType;
    }

    /**
     * Sets the value of the permRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURATINGTYPE }
     *     
     */
    public void setPermRatingType(OLILURATINGTYPE value) {
        this.permRatingType = value;
    }

    /**
     * Gets the value of the tempFlatStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempFlatStartDate() {
        return tempFlatStartDate;
    }

    /**
     * Sets the value of the tempFlatStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempFlatStartDate(XMLGregorianCalendar value) {
        this.tempFlatStartDate = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the occupRating property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUOCCUPRATING }
     *     
     */
    public OLILUOCCUPRATING getOccupRating() {
        return occupRating;
    }

    /**
     * Sets the value of the occupRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUOCCUPRATING }
     *     
     */
    public void setOccupRating(OLILUOCCUPRATING value) {
        this.occupRating = value;
    }

    /**
     * Gets the value of the ratingOverriddenInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getRatingOverriddenInd() {
        return ratingOverriddenInd;
    }

    /**
     * Sets the value of the ratingOverriddenInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setRatingOverriddenInd(OLILUBOOLEAN value) {
        this.ratingOverriddenInd = value;
    }

    /**
     * Gets the value of the permRatingAmtPerThou property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPermRatingAmtPerThou() {
        return permRatingAmtPerThou;
    }

    /**
     * Sets the value of the permRatingAmtPerThou property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPermRatingAmtPerThou(BigDecimal value) {
        this.permRatingAmtPerThou = value;
    }

    /**
     * Gets the value of the tempRatingAmtPerThou property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTempRatingAmtPerThou() {
        return tempRatingAmtPerThou;
    }

    /**
     * Sets the value of the tempRatingAmtPerThou property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTempRatingAmtPerThou(BigDecimal value) {
        this.tempRatingAmtPerThou = value;
    }

    /**
     * Gets the value of the modalPermRatingAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getModalPermRatingAmt() {
        return modalPermRatingAmt;
    }

    /**
     * Sets the value of the modalPermRatingAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setModalPermRatingAmt(BigDecimal value) {
        this.modalPermRatingAmt = value;
    }

    /**
     * Gets the value of the modalTempRatingAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getModalTempRatingAmt() {
        return modalTempRatingAmt;
    }

    /**
     * Sets the value of the modalTempRatingAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setModalTempRatingAmt(BigDecimal value) {
        this.modalTempRatingAmt = value;
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