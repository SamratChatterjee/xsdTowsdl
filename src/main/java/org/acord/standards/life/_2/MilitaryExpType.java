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
 * <p>Java class for MilitaryExp_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MilitaryExp_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MilitaryExpKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MilitaryExpSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Applicability" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MilitaryRank" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Duties" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MilitaryStatus" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MilitaryOrganizationType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MilitaryPayGrade" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TimeInCurrentAssignment" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransferAlertInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransferDetails" minOccurs="0"/>
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
@XmlType(name = "MilitaryExp_Type", propOrder = {
    "militaryExpKey",
    "militaryExpSysKey",
    "applicability",
    "militaryRank",
    "duties",
    "militaryStatus",
    "militaryOrganizationType",
    "militaryPayGrade",
    "timeInCurrentAssignment",
    "transferAlertInd",
    "transferDetails",
    "oLifEExtension"
})
public class MilitaryExpType {

    @XmlElement(name = "MilitaryExpKey")
    protected PERSISTKEY militaryExpKey;
    @XmlElement(name = "MilitaryExpSysKey")
    protected List<SYSKEY> militaryExpSysKey;
    @XmlElement(name = "Applicability")
    protected OLILUAPPLICABILITY applicability;
    @XmlElement(name = "MilitaryRank")
    protected OLILUMILITARYRANK militaryRank;
    @XmlElement(name = "Duties")
    protected String duties;
    @XmlElement(name = "MilitaryStatus")
    protected OLILUMILITARYSTAT militaryStatus;
    @XmlElement(name = "MilitaryOrganizationType")
    protected OLILUMILITARYORGTYPE militaryOrganizationType;
    @XmlElement(name = "MilitaryPayGrade")
    protected OLILUMILPAYGR militaryPayGrade;
    @XmlElement(name = "TimeInCurrentAssignment")
    protected BigInteger timeInCurrentAssignment;
    @XmlElement(name = "TransferAlertInd")
    protected OLILUBOOLEAN transferAlertInd;
    @XmlElement(name = "TransferDetails")
    protected String transferDetails;
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
     * Gets the value of the militaryExpKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getMilitaryExpKey() {
        return militaryExpKey;
    }

    /**
     * Sets the value of the militaryExpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setMilitaryExpKey(PERSISTKEY value) {
        this.militaryExpKey = value;
    }

    /**
     * Gets the value of the militaryExpSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the militaryExpSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilitaryExpSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getMilitaryExpSysKey() {
        if (militaryExpSysKey == null) {
            militaryExpSysKey = new ArrayList<SYSKEY>();
        }
        return this.militaryExpSysKey;
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
     * Gets the value of the militaryRank property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMILITARYRANK }
     *     
     */
    public OLILUMILITARYRANK getMilitaryRank() {
        return militaryRank;
    }

    /**
     * Sets the value of the militaryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMILITARYRANK }
     *     
     */
    public void setMilitaryRank(OLILUMILITARYRANK value) {
        this.militaryRank = value;
    }

    /**
     * Gets the value of the duties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuties() {
        return duties;
    }

    /**
     * Sets the value of the duties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuties(String value) {
        this.duties = value;
    }

    /**
     * Gets the value of the militaryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMILITARYSTAT }
     *     
     */
    public OLILUMILITARYSTAT getMilitaryStatus() {
        return militaryStatus;
    }

    /**
     * Sets the value of the militaryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMILITARYSTAT }
     *     
     */
    public void setMilitaryStatus(OLILUMILITARYSTAT value) {
        this.militaryStatus = value;
    }

    /**
     * Gets the value of the militaryOrganizationType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMILITARYORGTYPE }
     *     
     */
    public OLILUMILITARYORGTYPE getMilitaryOrganizationType() {
        return militaryOrganizationType;
    }

    /**
     * Sets the value of the militaryOrganizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMILITARYORGTYPE }
     *     
     */
    public void setMilitaryOrganizationType(OLILUMILITARYORGTYPE value) {
        this.militaryOrganizationType = value;
    }

    /**
     * Gets the value of the militaryPayGrade property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMILPAYGR }
     *     
     */
    public OLILUMILPAYGR getMilitaryPayGrade() {
        return militaryPayGrade;
    }

    /**
     * Sets the value of the militaryPayGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMILPAYGR }
     *     
     */
    public void setMilitaryPayGrade(OLILUMILPAYGR value) {
        this.militaryPayGrade = value;
    }

    /**
     * Gets the value of the timeInCurrentAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeInCurrentAssignment() {
        return timeInCurrentAssignment;
    }

    /**
     * Sets the value of the timeInCurrentAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeInCurrentAssignment(BigInteger value) {
        this.timeInCurrentAssignment = value;
    }

    /**
     * Gets the value of the transferAlertInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getTransferAlertInd() {
        return transferAlertInd;
    }

    /**
     * Sets the value of the transferAlertInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setTransferAlertInd(OLILUBOOLEAN value) {
        this.transferAlertInd = value;
    }

    /**
     * Gets the value of the transferDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDetails() {
        return transferDetails;
    }

    /**
     * Sets the value of the transferDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferDetails(String value) {
        this.transferDetails = value;
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
