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
 * <p>Java class for UltraliteExp_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UltraliteExp_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UltraliteExpKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UltraliteExpSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CraftAssembly" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RigidWingInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MotorizedInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LicenseInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExperimentalEquipmentInd" minOccurs="0"/>
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
@XmlType(name = "UltraliteExp_Type", propOrder = {
    "ultraliteExpKey",
    "ultraliteExpSysKey",
    "craftAssembly",
    "rigidWingInd",
    "motorizedInd",
    "licenseInd",
    "experimentalEquipmentInd",
    "oLifEExtension"
})
public class UltraliteExpType {

    @XmlElement(name = "UltraliteExpKey")
    protected PERSISTKEY ultraliteExpKey;
    @XmlElement(name = "UltraliteExpSysKey")
    protected List<SYSKEY> ultraliteExpSysKey;
    @XmlElement(name = "CraftAssembly")
    protected OLILUASSEMBLYTYPE craftAssembly;
    @XmlElement(name = "RigidWingInd")
    protected OLILUBOOLEAN rigidWingInd;
    @XmlElement(name = "MotorizedInd")
    protected OLILUBOOLEAN motorizedInd;
    @XmlElement(name = "LicenseInd")
    protected OLILUBOOLEAN licenseInd;
    @XmlElement(name = "ExperimentalEquipmentInd")
    protected OLILUBOOLEAN experimentalEquipmentInd;
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
     * Gets the value of the ultraliteExpKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getUltraliteExpKey() {
        return ultraliteExpKey;
    }

    /**
     * Sets the value of the ultraliteExpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setUltraliteExpKey(PERSISTKEY value) {
        this.ultraliteExpKey = value;
    }

    /**
     * Gets the value of the ultraliteExpSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ultraliteExpSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUltraliteExpSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getUltraliteExpSysKey() {
        if (ultraliteExpSysKey == null) {
            ultraliteExpSysKey = new ArrayList<SYSKEY>();
        }
        return this.ultraliteExpSysKey;
    }

    /**
     * Gets the value of the craftAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUASSEMBLYTYPE }
     *     
     */
    public OLILUASSEMBLYTYPE getCraftAssembly() {
        return craftAssembly;
    }

    /**
     * Sets the value of the craftAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUASSEMBLYTYPE }
     *     
     */
    public void setCraftAssembly(OLILUASSEMBLYTYPE value) {
        this.craftAssembly = value;
    }

    /**
     * Gets the value of the rigidWingInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getRigidWingInd() {
        return rigidWingInd;
    }

    /**
     * Sets the value of the rigidWingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setRigidWingInd(OLILUBOOLEAN value) {
        this.rigidWingInd = value;
    }

    /**
     * Gets the value of the motorizedInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getMotorizedInd() {
        return motorizedInd;
    }

    /**
     * Sets the value of the motorizedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setMotorizedInd(OLILUBOOLEAN value) {
        this.motorizedInd = value;
    }

    /**
     * Gets the value of the licenseInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getLicenseInd() {
        return licenseInd;
    }

    /**
     * Sets the value of the licenseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setLicenseInd(OLILUBOOLEAN value) {
        this.licenseInd = value;
    }

    /**
     * Gets the value of the experimentalEquipmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getExperimentalEquipmentInd() {
        return experimentalEquipmentInd;
    }

    /**
     * Sets the value of the experimentalEquipmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setExperimentalEquipmentInd(OLILUBOOLEAN value) {
        this.experimentalEquipmentInd = value;
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
