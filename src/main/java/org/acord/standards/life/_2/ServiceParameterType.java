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
 * <p>Java class for ServiceParameter_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceParameter_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceParameterKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceParameterSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceParameterType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceParameterInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceParameterValue" minOccurs="0"/>
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
@XmlType(name = "ServiceParameter_Type", propOrder = {
    "serviceParameterKey",
    "serviceParameterSysKey",
    "serviceParameterType",
    "serviceParameterInd",
    "serviceParameterValue",
    "oLifEExtension"
})
public class ServiceParameterType {

    @XmlElement(name = "ServiceParameterKey")
    protected PERSISTKEY serviceParameterKey;
    @XmlElement(name = "ServiceParameterSysKey")
    protected List<SYSKEY> serviceParameterSysKey;
    @XmlElement(name = "ServiceParameterType")
    protected OLILUSERVICEPARAMETERS serviceParameterType;
    @XmlElement(name = "ServiceParameterInd")
    protected OLILUBOOLEAN serviceParameterInd;
    @XmlElement(name = "ServiceParameterValue")
    protected String serviceParameterValue;
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
     * Gets the value of the serviceParameterKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getServiceParameterKey() {
        return serviceParameterKey;
    }

    /**
     * Sets the value of the serviceParameterKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setServiceParameterKey(PERSISTKEY value) {
        this.serviceParameterKey = value;
    }

    /**
     * Gets the value of the serviceParameterSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceParameterSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceParameterSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getServiceParameterSysKey() {
        if (serviceParameterSysKey == null) {
            serviceParameterSysKey = new ArrayList<SYSKEY>();
        }
        return this.serviceParameterSysKey;
    }

    /**
     * Gets the value of the serviceParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSERVICEPARAMETERS }
     *     
     */
    public OLILUSERVICEPARAMETERS getServiceParameterType() {
        return serviceParameterType;
    }

    /**
     * Sets the value of the serviceParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSERVICEPARAMETERS }
     *     
     */
    public void setServiceParameterType(OLILUSERVICEPARAMETERS value) {
        this.serviceParameterType = value;
    }

    /**
     * Gets the value of the serviceParameterInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getServiceParameterInd() {
        return serviceParameterInd;
    }

    /**
     * Sets the value of the serviceParameterInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setServiceParameterInd(OLILUBOOLEAN value) {
        this.serviceParameterInd = value;
    }

    /**
     * Gets the value of the serviceParameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceParameterValue() {
        return serviceParameterValue;
    }

    /**
     * Sets the value of the serviceParameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceParameterValue(String value) {
        this.serviceParameterValue = value;
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