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


/**
 * <p>Java class for AuditTransSummation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditTransSummation_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuditTransSummationKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuditTransSummationSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuditTotalType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuditTotal" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Name" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}AuditTotalCode" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}AuditElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuditTransaction" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AuditTransSummation_Type", propOrder = {
    "auditTransSummationKey",
    "auditTransSummationSysKey",
    "auditTotalType",
    "auditTotal",
    "name",
    "description",
    "auditTotalCode",
    "auditElement",
    "auditTransaction",
    "oLifEExtension"
})
public class AuditTransSummationType {

    @XmlElement(name = "AuditTransSummationKey")
    protected PERSISTKEY auditTransSummationKey;
    @XmlElement(name = "AuditTransSummationSysKey")
    protected List<SYSKEY> auditTransSummationSysKey;
    @XmlElement(name = "AuditTotalType")
    protected OLILUAUDTOT auditTotalType;
    @XmlElement(name = "AuditTotal")
    protected String auditTotal;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AuditTotalCode")
    protected String auditTotalCode;
    @XmlElement(name = "AuditElement")
    protected List<AuditElementType> auditElement;
    @XmlElement(name = "AuditTransaction")
    protected List<AuditTransactionType> auditTransaction;
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
     * Gets the value of the auditTransSummationKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getAuditTransSummationKey() {
        return auditTransSummationKey;
    }

    /**
     * Sets the value of the auditTransSummationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setAuditTransSummationKey(PERSISTKEY value) {
        this.auditTransSummationKey = value;
    }

    /**
     * Gets the value of the auditTransSummationSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditTransSummationSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditTransSummationSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getAuditTransSummationSysKey() {
        if (auditTransSummationSysKey == null) {
            auditTransSummationSysKey = new ArrayList<SYSKEY>();
        }
        return this.auditTransSummationSysKey;
    }

    /**
     * Gets the value of the auditTotalType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUAUDTOT }
     *     
     */
    public OLILUAUDTOT getAuditTotalType() {
        return auditTotalType;
    }

    /**
     * Sets the value of the auditTotalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUAUDTOT }
     *     
     */
    public void setAuditTotalType(OLILUAUDTOT value) {
        this.auditTotalType = value;
    }

    /**
     * Gets the value of the auditTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditTotal() {
        return auditTotal;
    }

    /**
     * Sets the value of the auditTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditTotal(String value) {
        this.auditTotal = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the auditTotalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditTotalCode() {
        return auditTotalCode;
    }

    /**
     * Sets the value of the auditTotalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditTotalCode(String value) {
        this.auditTotalCode = value;
    }

    /**
     * Gets the value of the auditElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditElementType }
     * 
     * 
     */
    public List<AuditElementType> getAuditElement() {
        if (auditElement == null) {
            auditElement = new ArrayList<AuditElementType>();
        }
        return this.auditElement;
    }

    /**
     * Gets the value of the auditTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditTransactionType }
     * 
     * 
     */
    public List<AuditTransactionType> getAuditTransaction() {
        if (auditTransaction == null) {
            auditTransaction = new ArrayList<AuditTransactionType>();
        }
        return this.auditTransaction;
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
