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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FinancialBenefit_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialBenefit_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FinancialBenefitKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FinancialBenefitSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Applicability" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FinancialBenefitType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}StartDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}StartPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}EndDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}EndPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
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
@XmlType(name = "FinancialBenefit_Type", propOrder = {
    "financialBenefitKey",
    "financialBenefitSysKey",
    "applicability",
    "financialBenefitType",
    "startDate",
    "startPartialDate",
    "endDate",
    "endPartialDate",
    "description",
    "oLifEExtension"
})
public class FinancialBenefitType {

    @XmlElement(name = "FinancialBenefitKey")
    protected PERSISTKEY financialBenefitKey;
    @XmlElement(name = "FinancialBenefitSysKey")
    protected List<SYSKEY> financialBenefitSysKey;
    @XmlElement(name = "Applicability")
    protected OLILUAPPLICABILITY applicability;
    @XmlElement(name = "FinancialBenefitType")
    protected OLILUFINBENETYPE financialBenefitType;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StartPartialDate")
    protected String startPartialDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "EndPartialDate")
    protected String endPartialDate;
    @XmlElement(name = "Description")
    protected String description;
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
     * Gets the value of the financialBenefitKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getFinancialBenefitKey() {
        return financialBenefitKey;
    }

    /**
     * Sets the value of the financialBenefitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setFinancialBenefitKey(PERSISTKEY value) {
        this.financialBenefitKey = value;
    }

    /**
     * Gets the value of the financialBenefitSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialBenefitSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialBenefitSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getFinancialBenefitSysKey() {
        if (financialBenefitSysKey == null) {
            financialBenefitSysKey = new ArrayList<SYSKEY>();
        }
        return this.financialBenefitSysKey;
    }

    /**
     * Gets the value of the applicability property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUAPPLICABILITY }
     *     
     */
    public OLILUAPPLICABILITY getApplicability() {
        return applicability;
    }

    /**
     * Sets the value of the applicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUAPPLICABILITY }
     *     
     */
    public void setApplicability(OLILUAPPLICABILITY value) {
        this.applicability = value;
    }

    /**
     * Gets the value of the financialBenefitType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUFINBENETYPE }
     *     
     */
    public OLILUFINBENETYPE getFinancialBenefitType() {
        return financialBenefitType;
    }

    /**
     * Sets the value of the financialBenefitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUFINBENETYPE }
     *     
     */
    public void setFinancialBenefitType(OLILUFINBENETYPE value) {
        this.financialBenefitType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPartialDate() {
        return startPartialDate;
    }

    /**
     * Sets the value of the startPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPartialDate(String value) {
        this.startPartialDate = value;
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
     * Gets the value of the endPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPartialDate() {
        return endPartialDate;
    }

    /**
     * Sets the value of the endPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPartialDate(String value) {
        this.endPartialDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
