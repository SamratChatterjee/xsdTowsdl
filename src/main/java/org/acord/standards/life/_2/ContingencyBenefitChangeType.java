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
 * <p>Java class for ContingencyBenefitChange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContingencyBenefitChange_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ContingencyBenefitChangeKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ContingencyBenefitChangeSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BenefitChangeBasedOn" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BenefitChangeDirection" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ContingentJointCC" minOccurs="0"/>
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
@XmlType(name = "ContingencyBenefitChange_Type", propOrder = {
    "contingencyBenefitChangeKey",
    "contingencyBenefitChangeSysKey",
    "benefitChangeBasedOn",
    "benefitChangeDirection",
    "contingentJointCC",
    "oLifEExtension"
})
public class ContingencyBenefitChangeType {

    @XmlElement(name = "ContingencyBenefitChangeKey")
    protected PERSISTKEY contingencyBenefitChangeKey;
    @XmlElement(name = "ContingencyBenefitChangeSysKey")
    protected List<SYSKEY> contingencyBenefitChangeSysKey;
    @XmlElement(name = "BenefitChangeBasedOn")
    protected OLILUBENREDUCEBASEDON benefitChangeBasedOn;
    @XmlElement(name = "BenefitChangeDirection")
    protected OLILUINCRDECR benefitChangeDirection;
    @XmlElement(name = "ContingentJointCC")
    protected ContingentJointCCType contingentJointCC;
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
     * Gets the value of the contingencyBenefitChangeKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getContingencyBenefitChangeKey() {
        return contingencyBenefitChangeKey;
    }

    /**
     * Sets the value of the contingencyBenefitChangeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setContingencyBenefitChangeKey(PERSISTKEY value) {
        this.contingencyBenefitChangeKey = value;
    }

    /**
     * Gets the value of the contingencyBenefitChangeSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contingencyBenefitChangeSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContingencyBenefitChangeSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getContingencyBenefitChangeSysKey() {
        if (contingencyBenefitChangeSysKey == null) {
            contingencyBenefitChangeSysKey = new ArrayList<SYSKEY>();
        }
        return this.contingencyBenefitChangeSysKey;
    }

    /**
     * Gets the value of the benefitChangeBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBENREDUCEBASEDON }
     *     
     */
    public OLILUBENREDUCEBASEDON getBenefitChangeBasedOn() {
        return benefitChangeBasedOn;
    }

    /**
     * Sets the value of the benefitChangeBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBENREDUCEBASEDON }
     *     
     */
    public void setBenefitChangeBasedOn(OLILUBENREDUCEBASEDON value) {
        this.benefitChangeBasedOn = value;
    }

    /**
     * Gets the value of the benefitChangeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUINCRDECR }
     *     
     */
    public OLILUINCRDECR getBenefitChangeDirection() {
        return benefitChangeDirection;
    }

    /**
     * Sets the value of the benefitChangeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUINCRDECR }
     *     
     */
    public void setBenefitChangeDirection(OLILUINCRDECR value) {
        this.benefitChangeDirection = value;
    }

    /**
     * Gets the value of the contingentJointCC property.
     * 
     * @return
     *     possible object is
     *     {@link ContingentJointCCType }
     *     
     */
    public ContingentJointCCType getContingentJointCC() {
        return contingentJointCC;
    }

    /**
     * Sets the value of the contingentJointCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContingentJointCCType }
     *     
     */
    public void setContingentJointCC(ContingentJointCCType value) {
        this.contingentJointCC = value;
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
