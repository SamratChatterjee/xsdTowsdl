//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

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
 * <p>Java class for FinancialGuideline_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialGuideline_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FinancialGuidelineKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FinancialGuidelineSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}GuidelineDescription" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}HistoryDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}HistoryDurationQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IntentCategory" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpenseNeedTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}NeedsGuideline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Attachment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FinancialGuideline_Type", propOrder = {
    "financialGuidelineKey",
    "financialGuidelineSysKey",
    "guidelineDescription",
    "historyDuration",
    "historyDurationQualifier",
    "intentCategory",
    "expenseNeedTypeCode",
    "needsGuideline",
    "attachment",
    "oLifEExtension"
})
public class FinancialGuidelineType {

    @XmlElement(name = "FinancialGuidelineKey")
    protected PERSISTKEY financialGuidelineKey;
    @XmlElement(name = "FinancialGuidelineSysKey")
    protected List<SYSKEY> financialGuidelineSysKey;
    @XmlElement(name = "GuidelineDescription")
    protected String guidelineDescription;
    @XmlElement(name = "HistoryDuration")
    protected BigInteger historyDuration;
    @XmlElement(name = "HistoryDurationQualifier")
    protected OLILUMEASUNITS historyDurationQualifier;
    @XmlElement(name = "IntentCategory")
    protected OLILUINTENTCATEGORY intentCategory;
    @XmlElement(name = "ExpenseNeedTypeCode")
    protected OLILUNEED expenseNeedTypeCode;
    @XmlElement(name = "NeedsGuideline")
    protected List<NeedsGuidelineType> needsGuideline;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
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
     * Gets the value of the financialGuidelineKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getFinancialGuidelineKey() {
        return financialGuidelineKey;
    }

    /**
     * Sets the value of the financialGuidelineKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setFinancialGuidelineKey(PERSISTKEY value) {
        this.financialGuidelineKey = value;
    }

    /**
     * Gets the value of the financialGuidelineSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialGuidelineSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialGuidelineSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getFinancialGuidelineSysKey() {
        if (financialGuidelineSysKey == null) {
            financialGuidelineSysKey = new ArrayList<SYSKEY>();
        }
        return this.financialGuidelineSysKey;
    }

    /**
     * Gets the value of the guidelineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidelineDescription() {
        return guidelineDescription;
    }

    /**
     * Sets the value of the guidelineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidelineDescription(String value) {
        this.guidelineDescription = value;
    }

    /**
     * Gets the value of the historyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHistoryDuration() {
        return historyDuration;
    }

    /**
     * Sets the value of the historyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHistoryDuration(BigInteger value) {
        this.historyDuration = value;
    }

    /**
     * Gets the value of the historyDurationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getHistoryDurationQualifier() {
        return historyDurationQualifier;
    }

    /**
     * Sets the value of the historyDurationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setHistoryDurationQualifier(OLILUMEASUNITS value) {
        this.historyDurationQualifier = value;
    }

    /**
     * Gets the value of the intentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUINTENTCATEGORY }
     *     
     */
    public OLILUINTENTCATEGORY getIntentCategory() {
        return intentCategory;
    }

    /**
     * Sets the value of the intentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUINTENTCATEGORY }
     *     
     */
    public void setIntentCategory(OLILUINTENTCATEGORY value) {
        this.intentCategory = value;
    }

    /**
     * Gets the value of the expenseNeedTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUNEED }
     *     
     */
    public OLILUNEED getExpenseNeedTypeCode() {
        return expenseNeedTypeCode;
    }

    /**
     * Sets the value of the expenseNeedTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUNEED }
     *     
     */
    public void setExpenseNeedTypeCode(OLILUNEED value) {
        this.expenseNeedTypeCode = value;
    }

    /**
     * Gets the value of the needsGuideline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the needsGuideline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeedsGuideline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeedsGuidelineType }
     * 
     * 
     */
    public List<NeedsGuidelineType> getNeedsGuideline() {
        if (needsGuideline == null) {
            needsGuideline = new ArrayList<NeedsGuidelineType>();
        }
        return this.needsGuideline;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
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
