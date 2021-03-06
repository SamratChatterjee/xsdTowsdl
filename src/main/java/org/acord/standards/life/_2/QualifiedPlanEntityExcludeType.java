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
 * <p>Java class for QualifiedPlanEntityExclude_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifiedPlanEntityExclude_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanEntityExcludeKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanEntityExcludeSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EntityType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AccountDesignationCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}QualifiedPlanOption" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "QualifiedPlanEntityExclude_Type", propOrder = {
    "qualifiedPlanEntityExcludeKey",
    "qualifiedPlanEntityExcludeSysKey",
    "entityType",
    "accountDesignationCC",
    "qualifiedPlanOption",
    "oLifEExtension"
})
public class QualifiedPlanEntityExcludeType {

    @XmlElement(name = "QualifiedPlanEntityExcludeKey")
    protected PERSISTKEY qualifiedPlanEntityExcludeKey;
    @XmlElement(name = "QualifiedPlanEntityExcludeSysKey")
    protected List<SYSKEY> qualifiedPlanEntityExcludeSysKey;
    @XmlElement(name = "EntityType")
    protected EntityTypeType entityType;
    @XmlElement(name = "AccountDesignationCC")
    protected AccountDesignationCCType accountDesignationCC;
    @XmlElement(name = "QualifiedPlanOption")
    protected List<QualifiedPlanOptionType> qualifiedPlanOption;
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
     * Gets the value of the qualifiedPlanEntityExcludeKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getQualifiedPlanEntityExcludeKey() {
        return qualifiedPlanEntityExcludeKey;
    }

    /**
     * Sets the value of the qualifiedPlanEntityExcludeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setQualifiedPlanEntityExcludeKey(PERSISTKEY value) {
        this.qualifiedPlanEntityExcludeKey = value;
    }

    /**
     * Gets the value of the qualifiedPlanEntityExcludeSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedPlanEntityExcludeSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedPlanEntityExcludeSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getQualifiedPlanEntityExcludeSysKey() {
        if (qualifiedPlanEntityExcludeSysKey == null) {
            qualifiedPlanEntityExcludeSysKey = new ArrayList<SYSKEY>();
        }
        return this.qualifiedPlanEntityExcludeSysKey;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeType }
     *     
     */
    public EntityTypeType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeType }
     *     
     */
    public void setEntityType(EntityTypeType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the accountDesignationCC property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDesignationCCType }
     *     
     */
    public AccountDesignationCCType getAccountDesignationCC() {
        return accountDesignationCC;
    }

    /**
     * Sets the value of the accountDesignationCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDesignationCCType }
     *     
     */
    public void setAccountDesignationCC(AccountDesignationCCType value) {
        this.accountDesignationCC = value;
    }

    /**
     * Gets the value of the qualifiedPlanOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedPlanOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedPlanOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPlanOptionType }
     * 
     * 
     */
    public List<QualifiedPlanOptionType> getQualifiedPlanOption() {
        if (qualifiedPlanOption == null) {
            qualifiedPlanOption = new ArrayList<QualifiedPlanOptionType>();
        }
        return this.qualifiedPlanOption;
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
