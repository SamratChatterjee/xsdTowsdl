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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BusinessService_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessService_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BusinessServiceKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BusinessServiceSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceStatus" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceRequired" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceRole" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SpecificationName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SpecificationDescription" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SpecificationSource" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SpecificationFileName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IntermediaryName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IntermediaryProviderID" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}IntermediaryDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceVersion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ServiceProtocol" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}BusinessContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *       &lt;attribute name="IntermediaryID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessService_Type", propOrder = {
    "businessServiceKey",
    "businessServiceSysKey",
    "serviceStatus",
    "serviceName",
    "serviceDesc",
    "serviceRequired",
    "serviceRole",
    "specificationName",
    "specificationDescription",
    "specificationSource",
    "specificationFileName",
    "intermediaryName",
    "intermediaryProviderID",
    "intermediaryDesc",
    "serviceParameter",
    "serviceVersion",
    "serviceProtocol",
    "businessContact",
    "oLifEExtension"
})
public class BusinessServiceType {

    @XmlElement(name = "BusinessServiceKey")
    protected PERSISTKEY businessServiceKey;
    @XmlElement(name = "BusinessServiceSysKey")
    protected List<SYSKEY> businessServiceSysKey;
    @XmlElement(name = "ServiceStatus")
    protected OLILUSERVICESTATUS serviceStatus;
    @XmlElement(name = "ServiceName")
    protected String serviceName;
    @XmlElement(name = "ServiceDesc")
    protected String serviceDesc;
    @XmlElement(name = "ServiceRequired")
    protected OLILUBOOLEAN serviceRequired;
    @XmlElement(name = "ServiceRole")
    protected OLILUSERVICEROLE serviceRole;
    @XmlElement(name = "SpecificationName")
    protected String specificationName;
    @XmlElement(name = "SpecificationDescription")
    protected String specificationDescription;
    @XmlElement(name = "SpecificationSource")
    protected String specificationSource;
    @XmlElement(name = "SpecificationFileName")
    protected String specificationFileName;
    @XmlElement(name = "IntermediaryName")
    protected String intermediaryName;
    @XmlElement(name = "IntermediaryProviderID")
    protected String intermediaryProviderID;
    @XmlElement(name = "IntermediaryDesc")
    protected String intermediaryDesc;
    @XmlElement(name = "ServiceParameter")
    protected List<ServiceParameterType> serviceParameter;
    @XmlElement(name = "ServiceVersion")
    protected List<ServiceVersionType> serviceVersion;
    @XmlElement(name = "ServiceProtocol")
    protected List<ServiceProtocolType> serviceProtocol;
    @XmlElement(name = "BusinessContact")
    protected List<BusinessContactType> businessContact;
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
    @XmlAttribute(name = "IntermediaryID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object intermediaryID;

    /**
     * Gets the value of the businessServiceKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getBusinessServiceKey() {
        return businessServiceKey;
    }

    /**
     * Sets the value of the businessServiceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setBusinessServiceKey(PERSISTKEY value) {
        this.businessServiceKey = value;
    }

    /**
     * Gets the value of the businessServiceSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessServiceSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessServiceSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getBusinessServiceSysKey() {
        if (businessServiceSysKey == null) {
            businessServiceSysKey = new ArrayList<SYSKEY>();
        }
        return this.businessServiceSysKey;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSERVICESTATUS }
     *     
     */
    public OLILUSERVICESTATUS getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSERVICESTATUS }
     *     
     */
    public void setServiceStatus(OLILUSERVICESTATUS value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDesc() {
        return serviceDesc;
    }

    /**
     * Sets the value of the serviceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDesc(String value) {
        this.serviceDesc = value;
    }

    /**
     * Gets the value of the serviceRequired property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getServiceRequired() {
        return serviceRequired;
    }

    /**
     * Sets the value of the serviceRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setServiceRequired(OLILUBOOLEAN value) {
        this.serviceRequired = value;
    }

    /**
     * Gets the value of the serviceRole property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSERVICEROLE }
     *     
     */
    public OLILUSERVICEROLE getServiceRole() {
        return serviceRole;
    }

    /**
     * Sets the value of the serviceRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSERVICEROLE }
     *     
     */
    public void setServiceRole(OLILUSERVICEROLE value) {
        this.serviceRole = value;
    }

    /**
     * Gets the value of the specificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationName() {
        return specificationName;
    }

    /**
     * Sets the value of the specificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationName(String value) {
        this.specificationName = value;
    }

    /**
     * Gets the value of the specificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationDescription() {
        return specificationDescription;
    }

    /**
     * Sets the value of the specificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationDescription(String value) {
        this.specificationDescription = value;
    }

    /**
     * Gets the value of the specificationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationSource() {
        return specificationSource;
    }

    /**
     * Sets the value of the specificationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationSource(String value) {
        this.specificationSource = value;
    }

    /**
     * Gets the value of the specificationFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationFileName() {
        return specificationFileName;
    }

    /**
     * Sets the value of the specificationFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationFileName(String value) {
        this.specificationFileName = value;
    }

    /**
     * Gets the value of the intermediaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediaryName() {
        return intermediaryName;
    }

    /**
     * Sets the value of the intermediaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediaryName(String value) {
        this.intermediaryName = value;
    }

    /**
     * Gets the value of the intermediaryProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediaryProviderID() {
        return intermediaryProviderID;
    }

    /**
     * Sets the value of the intermediaryProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediaryProviderID(String value) {
        this.intermediaryProviderID = value;
    }

    /**
     * Gets the value of the intermediaryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediaryDesc() {
        return intermediaryDesc;
    }

    /**
     * Sets the value of the intermediaryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediaryDesc(String value) {
        this.intermediaryDesc = value;
    }

    /**
     * Gets the value of the serviceParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceParameterType }
     * 
     * 
     */
    public List<ServiceParameterType> getServiceParameter() {
        if (serviceParameter == null) {
            serviceParameter = new ArrayList<ServiceParameterType>();
        }
        return this.serviceParameter;
    }

    /**
     * Gets the value of the serviceVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceVersionType }
     * 
     * 
     */
    public List<ServiceVersionType> getServiceVersion() {
        if (serviceVersion == null) {
            serviceVersion = new ArrayList<ServiceVersionType>();
        }
        return this.serviceVersion;
    }

    /**
     * Gets the value of the serviceProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProtocolType }
     * 
     * 
     */
    public List<ServiceProtocolType> getServiceProtocol() {
        if (serviceProtocol == null) {
            serviceProtocol = new ArrayList<ServiceProtocolType>();
        }
        return this.serviceProtocol;
    }

    /**
     * Gets the value of the businessContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessContactType }
     * 
     * 
     */
    public List<BusinessContactType> getBusinessContact() {
        if (businessContact == null) {
            businessContact = new ArrayList<BusinessContactType>();
        }
        return this.businessContact;
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

    /**
     * Gets the value of the intermediaryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIntermediaryID() {
        return intermediaryID;
    }

    /**
     * Sets the value of the intermediaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIntermediaryID(Object value) {
        this.intermediaryID = value;
    }

}
