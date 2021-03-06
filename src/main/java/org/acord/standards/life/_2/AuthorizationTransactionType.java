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
 * <p>Java class for AuthorizationTransaction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationTransaction_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuthorizationTransactionKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuthorizationTransactionSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuthorizationMappingCodeInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AdministrativeTransaction" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AdministrativeTransactionSubType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FinActivityType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuthorizationChangeDetail" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AuthorizationTransaction_Type", propOrder = {
    "authorizationTransactionKey",
    "authorizationTransactionSysKey",
    "authorizationMappingCodeInd",
    "administrativeTransaction",
    "administrativeTransactionSubType",
    "finActivityType",
    "authorizationChangeDetail",
    "oLifEExtension"
})
public class AuthorizationTransactionType {

    @XmlElement(name = "AuthorizationTransactionKey")
    protected PERSISTKEY authorizationTransactionKey;
    @XmlElement(name = "AuthorizationTransactionSysKey")
    protected List<SYSKEY> authorizationTransactionSysKey;
    @XmlElement(name = "AuthorizationMappingCodeInd")
    protected OLILUBOOLEAN authorizationMappingCodeInd;
    @XmlElement(name = "AdministrativeTransaction")
    protected OLILUTRANSTYPECODES administrativeTransaction;
    @XmlElement(name = "AdministrativeTransactionSubType")
    protected TRANSSUBTYPECODES administrativeTransactionSubType;
    @XmlElement(name = "FinActivityType")
    protected OLILUFINACTTYPE finActivityType;
    @XmlElement(name = "AuthorizationChangeDetail")
    protected List<AuthorizationChangeDetailType> authorizationChangeDetail;
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
     * Gets the value of the authorizationTransactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getAuthorizationTransactionKey() {
        return authorizationTransactionKey;
    }

    /**
     * Sets the value of the authorizationTransactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setAuthorizationTransactionKey(PERSISTKEY value) {
        this.authorizationTransactionKey = value;
    }

    /**
     * Gets the value of the authorizationTransactionSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationTransactionSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationTransactionSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getAuthorizationTransactionSysKey() {
        if (authorizationTransactionSysKey == null) {
            authorizationTransactionSysKey = new ArrayList<SYSKEY>();
        }
        return this.authorizationTransactionSysKey;
    }

    /**
     * Gets the value of the authorizationMappingCodeInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getAuthorizationMappingCodeInd() {
        return authorizationMappingCodeInd;
    }

    /**
     * Sets the value of the authorizationMappingCodeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setAuthorizationMappingCodeInd(OLILUBOOLEAN value) {
        this.authorizationMappingCodeInd = value;
    }

    /**
     * Gets the value of the administrativeTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTRANSTYPECODES }
     *     
     */
    public OLILUTRANSTYPECODES getAdministrativeTransaction() {
        return administrativeTransaction;
    }

    /**
     * Sets the value of the administrativeTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTRANSTYPECODES }
     *     
     */
    public void setAdministrativeTransaction(OLILUTRANSTYPECODES value) {
        this.administrativeTransaction = value;
    }

    /**
     * Gets the value of the administrativeTransactionSubType property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSSUBTYPECODES }
     *     
     */
    public TRANSSUBTYPECODES getAdministrativeTransactionSubType() {
        return administrativeTransactionSubType;
    }

    /**
     * Sets the value of the administrativeTransactionSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSSUBTYPECODES }
     *     
     */
    public void setAdministrativeTransactionSubType(TRANSSUBTYPECODES value) {
        this.administrativeTransactionSubType = value;
    }

    /**
     * Gets the value of the finActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUFINACTTYPE }
     *     
     */
    public OLILUFINACTTYPE getFinActivityType() {
        return finActivityType;
    }

    /**
     * Sets the value of the finActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUFINACTTYPE }
     *     
     */
    public void setFinActivityType(OLILUFINACTTYPE value) {
        this.finActivityType = value;
    }

    /**
     * Gets the value of the authorizationChangeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationChangeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationChangeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizationChangeDetailType }
     * 
     * 
     */
    public List<AuthorizationChangeDetailType> getAuthorizationChangeDetail() {
        if (authorizationChangeDetail == null) {
            authorizationChangeDetail = new ArrayList<AuthorizationChangeDetailType>();
        }
        return this.authorizationChangeDetail;
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
