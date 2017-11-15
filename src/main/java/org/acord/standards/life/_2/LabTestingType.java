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
 * <p>Java class for LabTesting_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabTesting_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LabTestingKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LabTestingSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TestUpdateDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SensitiveResultsInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CertifiedOrg" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CertNo" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}TestDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}TestPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LabTestResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LabTestRemark" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LabTesting_Type", propOrder = {
    "labTestingKey",
    "labTestingSysKey",
    "testUpdateDate",
    "sensitiveResultsInd",
    "certifiedOrg",
    "certNo",
    "testDate",
    "testPartialDate",
    "labTestResult",
    "labTestRemark",
    "oLifEExtension"
})
public class LabTestingType {

    @XmlElement(name = "LabTestingKey")
    protected PERSISTKEY labTestingKey;
    @XmlElement(name = "LabTestingSysKey")
    protected List<SYSKEY> labTestingSysKey;
    @XmlElement(name = "TestUpdateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar testUpdateDate;
    @XmlElement(name = "SensitiveResultsInd")
    protected OLILUBOOLEAN sensitiveResultsInd;
    @XmlElement(name = "CertifiedOrg")
    protected String certifiedOrg;
    @XmlElement(name = "CertNo")
    protected String certNo;
    @XmlElement(name = "TestDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar testDate;
    @XmlElement(name = "TestPartialDate")
    protected String testPartialDate;
    @XmlElement(name = "LabTestResult")
    protected List<LabTestResultType> labTestResult;
    @XmlElement(name = "LabTestRemark")
    protected List<LabTestRemarkType> labTestRemark;
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
     * Gets the value of the labTestingKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getLabTestingKey() {
        return labTestingKey;
    }

    /**
     * Sets the value of the labTestingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setLabTestingKey(PERSISTKEY value) {
        this.labTestingKey = value;
    }

    /**
     * Gets the value of the labTestingSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labTestingSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabTestingSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getLabTestingSysKey() {
        if (labTestingSysKey == null) {
            labTestingSysKey = new ArrayList<SYSKEY>();
        }
        return this.labTestingSysKey;
    }

    /**
     * Gets the value of the testUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestUpdateDate() {
        return testUpdateDate;
    }

    /**
     * Sets the value of the testUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestUpdateDate(XMLGregorianCalendar value) {
        this.testUpdateDate = value;
    }

    /**
     * Gets the value of the sensitiveResultsInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getSensitiveResultsInd() {
        return sensitiveResultsInd;
    }

    /**
     * Sets the value of the sensitiveResultsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setSensitiveResultsInd(OLILUBOOLEAN value) {
        this.sensitiveResultsInd = value;
    }

    /**
     * Gets the value of the certifiedOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifiedOrg() {
        return certifiedOrg;
    }

    /**
     * Sets the value of the certifiedOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifiedOrg(String value) {
        this.certifiedOrg = value;
    }

    /**
     * Gets the value of the certNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * Sets the value of the certNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertNo(String value) {
        this.certNo = value;
    }

    /**
     * Gets the value of the testDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestDate() {
        return testDate;
    }

    /**
     * Sets the value of the testDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestDate(XMLGregorianCalendar value) {
        this.testDate = value;
    }

    /**
     * Gets the value of the testPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestPartialDate() {
        return testPartialDate;
    }

    /**
     * Sets the value of the testPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestPartialDate(String value) {
        this.testPartialDate = value;
    }

    /**
     * Gets the value of the labTestResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labTestResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabTestResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabTestResultType }
     * 
     * 
     */
    public List<LabTestResultType> getLabTestResult() {
        if (labTestResult == null) {
            labTestResult = new ArrayList<LabTestResultType>();
        }
        return this.labTestResult;
    }

    /**
     * Gets the value of the labTestRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labTestRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabTestRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabTestRemarkType }
     * 
     * 
     */
    public List<LabTestRemarkType> getLabTestRemark() {
        if (labTestRemark == null) {
            labTestRemark = new ArrayList<LabTestRemarkType>();
        }
        return this.labTestRemark;
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