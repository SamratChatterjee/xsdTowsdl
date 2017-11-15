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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MedicalPrevention_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalPrevention_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MedicalPreventionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MedicalPreventionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TestType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TestTypeDesc" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}TestDate" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}TestPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Results" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}VisitReason" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TestDuration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DurationUnitMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastAteDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastAteTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastDrankDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastDrankTime" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}DateLastSeen" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}LastSeenPartialDate" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="LastTestFacility" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="LastTestPhysician" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="MedConditionID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalPrevention_Type", propOrder = {
    "medicalPreventionKey",
    "medicalPreventionSysKey",
    "testType",
    "testTypeDesc",
    "testDate",
    "testPartialDate",
    "results",
    "visitReason",
    "testDuration",
    "durationUnitMeasure",
    "lastAteDate",
    "lastAteTime",
    "lastDrankDate",
    "lastDrankTime",
    "dateLastSeen",
    "lastSeenPartialDate",
    "oLifEExtension"
})
public class MedicalPreventionType {

    @XmlElement(name = "MedicalPreventionKey")
    protected PERSISTKEY medicalPreventionKey;
    @XmlElement(name = "MedicalPreventionSysKey")
    protected List<SYSKEY> medicalPreventionSysKey;
    @XmlElement(name = "TestType")
    protected OLILUTESTTYPE testType;
    @XmlElement(name = "TestTypeDesc")
    protected String testTypeDesc;
    @XmlElement(name = "TestDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar testDate;
    @XmlElement(name = "TestPartialDate")
    protected String testPartialDate;
    @XmlElement(name = "Results")
    protected OLILUBOOLEAN results;
    @XmlElement(name = "VisitReason")
    protected OLILUDRVISITREASON visitReason;
    @XmlElement(name = "TestDuration")
    protected BigInteger testDuration;
    @XmlElement(name = "DurationUnitMeasure")
    protected OLILUMEASUNITS durationUnitMeasure;
    @XmlElement(name = "LastAteDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastAteDate;
    @XmlElement(name = "LastAteTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lastAteTime;
    @XmlElement(name = "LastDrankDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDrankDate;
    @XmlElement(name = "LastDrankTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lastDrankTime;
    @XmlElement(name = "DateLastSeen")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateLastSeen;
    @XmlElement(name = "LastSeenPartialDate")
    protected String lastSeenPartialDate;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "LastTestFacility")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object lastTestFacility;
    @XmlAttribute(name = "LastTestPhysician")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object lastTestPhysician;
    @XmlAttribute(name = "MedConditionID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object medConditionID;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;

    /**
     * Gets the value of the medicalPreventionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getMedicalPreventionKey() {
        return medicalPreventionKey;
    }

    /**
     * Sets the value of the medicalPreventionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setMedicalPreventionKey(PERSISTKEY value) {
        this.medicalPreventionKey = value;
    }

    /**
     * Gets the value of the medicalPreventionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicalPreventionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicalPreventionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getMedicalPreventionSysKey() {
        if (medicalPreventionSysKey == null) {
            medicalPreventionSysKey = new ArrayList<SYSKEY>();
        }
        return this.medicalPreventionSysKey;
    }

    /**
     * Gets the value of the testType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTESTTYPE }
     *     
     */
    public OLILUTESTTYPE getTestType() {
        return testType;
    }

    /**
     * Sets the value of the testType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTESTTYPE }
     *     
     */
    public void setTestType(OLILUTESTTYPE value) {
        this.testType = value;
    }

    /**
     * Gets the value of the testTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestTypeDesc() {
        return testTypeDesc;
    }

    /**
     * Sets the value of the testTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestTypeDesc(String value) {
        this.testTypeDesc = value;
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
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setResults(OLILUBOOLEAN value) {
        this.results = value;
    }

    /**
     * Gets the value of the visitReason property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDRVISITREASON }
     *     
     */
    public OLILUDRVISITREASON getVisitReason() {
        return visitReason;
    }

    /**
     * Sets the value of the visitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDRVISITREASON }
     *     
     */
    public void setVisitReason(OLILUDRVISITREASON value) {
        this.visitReason = value;
    }

    /**
     * Gets the value of the testDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestDuration() {
        return testDuration;
    }

    /**
     * Sets the value of the testDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestDuration(BigInteger value) {
        this.testDuration = value;
    }

    /**
     * Gets the value of the durationUnitMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public OLILUMEASUNITS getDurationUnitMeasure() {
        return durationUnitMeasure;
    }

    /**
     * Sets the value of the durationUnitMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUNITS }
     *     
     */
    public void setDurationUnitMeasure(OLILUMEASUNITS value) {
        this.durationUnitMeasure = value;
    }

    /**
     * Gets the value of the lastAteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAteDate() {
        return lastAteDate;
    }

    /**
     * Sets the value of the lastAteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAteDate(XMLGregorianCalendar value) {
        this.lastAteDate = value;
    }

    /**
     * Gets the value of the lastAteTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAteTime() {
        return lastAteTime;
    }

    /**
     * Sets the value of the lastAteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAteTime(XMLGregorianCalendar value) {
        this.lastAteTime = value;
    }

    /**
     * Gets the value of the lastDrankDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDrankDate() {
        return lastDrankDate;
    }

    /**
     * Sets the value of the lastDrankDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDrankDate(XMLGregorianCalendar value) {
        this.lastDrankDate = value;
    }

    /**
     * Gets the value of the lastDrankTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDrankTime() {
        return lastDrankTime;
    }

    /**
     * Sets the value of the lastDrankTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDrankTime(XMLGregorianCalendar value) {
        this.lastDrankTime = value;
    }

    /**
     * Gets the value of the dateLastSeen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastSeen() {
        return dateLastSeen;
    }

    /**
     * Sets the value of the dateLastSeen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastSeen(XMLGregorianCalendar value) {
        this.dateLastSeen = value;
    }

    /**
     * Gets the value of the lastSeenPartialDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSeenPartialDate() {
        return lastSeenPartialDate;
    }

    /**
     * Sets the value of the lastSeenPartialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSeenPartialDate(String value) {
        this.lastSeenPartialDate = value;
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
     * Gets the value of the lastTestFacility property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastTestFacility() {
        return lastTestFacility;
    }

    /**
     * Sets the value of the lastTestFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastTestFacility(Object value) {
        this.lastTestFacility = value;
    }

    /**
     * Gets the value of the lastTestPhysician property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastTestPhysician() {
        return lastTestPhysician;
    }

    /**
     * Sets the value of the lastTestPhysician property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastTestPhysician(Object value) {
        this.lastTestPhysician = value;
    }

    /**
     * Gets the value of the medConditionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMedConditionID() {
        return medConditionID;
    }

    /**
     * Sets the value of the medConditionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMedConditionID(Object value) {
        this.medConditionID = value;
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
