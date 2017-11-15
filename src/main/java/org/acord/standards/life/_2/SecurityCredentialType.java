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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SecurityCredential_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityCredential_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SecurityCredentialKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SecurityCredentialSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserLoginName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserDomain" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Comments" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ActivationDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ActivationTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SecCredStatus" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SecCredStatusReason" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StatusDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SecurityAccessLevel" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SecurityAccessLevelDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CreationDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CreationTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastUpdate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastUpdateTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DaysToExpiration" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastSignInDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastSignInTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastSignInDayOfWeekTC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InvalidSignOnCount" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserPswd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserAuthentication" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SecurityCredential_Type", propOrder = {
    "securityCredentialKey",
    "securityCredentialSysKey",
    "userLoginName",
    "userDomain",
    "description",
    "comments",
    "activationDate",
    "activationTime",
    "secCredStatus",
    "secCredStatusReason",
    "statusDesc",
    "securityAccessLevel",
    "securityAccessLevelDesc",
    "expDate",
    "creationDate",
    "creationTime",
    "lastUpdate",
    "lastUpdateTime",
    "daysToExpiration",
    "lastSignInDate",
    "lastSignInTime",
    "lastSignInDayOfWeekTC",
    "invalidSignOnCount",
    "userCode",
    "userPswd",
    "userAuthentication",
    "oLifEExtension"
})
public class SecurityCredentialType {

    @XmlElement(name = "SecurityCredentialKey")
    protected PERSISTKEY securityCredentialKey;
    @XmlElement(name = "SecurityCredentialSysKey")
    protected List<SYSKEY> securityCredentialSysKey;
    @XmlElement(name = "UserLoginName")
    protected String userLoginName;
    @XmlElement(name = "UserDomain")
    protected String userDomain;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ActivationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(name = "ActivationTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar activationTime;
    @XmlElement(name = "SecCredStatus")
    protected OLILUSECCREDSTAT secCredStatus;
    @XmlElement(name = "SecCredStatusReason")
    protected OLILUSECCREDSTATREASON secCredStatusReason;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "SecurityAccessLevel")
    protected String securityAccessLevel;
    @XmlElement(name = "SecurityAccessLevelDesc")
    protected String securityAccessLevelDesc;
    @XmlElement(name = "ExpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDate;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreationTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "LastUpdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdate;
    @XmlElement(name = "LastUpdateTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lastUpdateTime;
    @XmlElement(name = "DaysToExpiration")
    protected BigInteger daysToExpiration;
    @XmlElement(name = "LastSignInDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastSignInDate;
    @XmlElement(name = "LastSignInTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lastSignInTime;
    @XmlElement(name = "LastSignInDayOfWeekTC")
    protected OLILUDAY lastSignInDayOfWeekTC;
    @XmlElement(name = "InvalidSignOnCount")
    protected BigInteger invalidSignOnCount;
    @XmlElement(name = "UserCode")
    protected String userCode;
    @XmlElement(name = "UserPswd")
    protected UserPswdType userPswd;
    @XmlElement(name = "UserAuthentication")
    protected List<UserAuthenticationType> userAuthentication;
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
     * Gets the value of the securityCredentialKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getSecurityCredentialKey() {
        return securityCredentialKey;
    }

    /**
     * Sets the value of the securityCredentialKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setSecurityCredentialKey(PERSISTKEY value) {
        this.securityCredentialKey = value;
    }

    /**
     * Gets the value of the securityCredentialSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityCredentialSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityCredentialSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getSecurityCredentialSysKey() {
        if (securityCredentialSysKey == null) {
            securityCredentialSysKey = new ArrayList<SYSKEY>();
        }
        return this.securityCredentialSysKey;
    }

    /**
     * Gets the value of the userLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLoginName() {
        return userLoginName;
    }

    /**
     * Sets the value of the userLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLoginName(String value) {
        this.userLoginName = value;
    }

    /**
     * Gets the value of the userDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDomain() {
        return userDomain;
    }

    /**
     * Sets the value of the userDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDomain(String value) {
        this.userDomain = value;
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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the activationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationTime() {
        return activationTime;
    }

    /**
     * Sets the value of the activationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationTime(XMLGregorianCalendar value) {
        this.activationTime = value;
    }

    /**
     * Gets the value of the secCredStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSECCREDSTAT }
     *     
     */
    public OLILUSECCREDSTAT getSecCredStatus() {
        return secCredStatus;
    }

    /**
     * Sets the value of the secCredStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSECCREDSTAT }
     *     
     */
    public void setSecCredStatus(OLILUSECCREDSTAT value) {
        this.secCredStatus = value;
    }

    /**
     * Gets the value of the secCredStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUSECCREDSTATREASON }
     *     
     */
    public OLILUSECCREDSTATREASON getSecCredStatusReason() {
        return secCredStatusReason;
    }

    /**
     * Sets the value of the secCredStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUSECCREDSTATREASON }
     *     
     */
    public void setSecCredStatusReason(OLILUSECCREDSTATREASON value) {
        this.secCredStatusReason = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the securityAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAccessLevel() {
        return securityAccessLevel;
    }

    /**
     * Sets the value of the securityAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAccessLevel(String value) {
        this.securityAccessLevel = value;
    }

    /**
     * Gets the value of the securityAccessLevelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAccessLevelDesc() {
        return securityAccessLevelDesc;
    }

    /**
     * Sets the value of the securityAccessLevelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAccessLevelDesc(String value) {
        this.securityAccessLevelDesc = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTime(XMLGregorianCalendar value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the daysToExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysToExpiration() {
        return daysToExpiration;
    }

    /**
     * Sets the value of the daysToExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysToExpiration(BigInteger value) {
        this.daysToExpiration = value;
    }

    /**
     * Gets the value of the lastSignInDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSignInDate() {
        return lastSignInDate;
    }

    /**
     * Sets the value of the lastSignInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSignInDate(XMLGregorianCalendar value) {
        this.lastSignInDate = value;
    }

    /**
     * Gets the value of the lastSignInTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSignInTime() {
        return lastSignInTime;
    }

    /**
     * Sets the value of the lastSignInTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSignInTime(XMLGregorianCalendar value) {
        this.lastSignInTime = value;
    }

    /**
     * Gets the value of the lastSignInDayOfWeekTC property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDAY }
     *     
     */
    public OLILUDAY getLastSignInDayOfWeekTC() {
        return lastSignInDayOfWeekTC;
    }

    /**
     * Sets the value of the lastSignInDayOfWeekTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDAY }
     *     
     */
    public void setLastSignInDayOfWeekTC(OLILUDAY value) {
        this.lastSignInDayOfWeekTC = value;
    }

    /**
     * Gets the value of the invalidSignOnCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInvalidSignOnCount() {
        return invalidSignOnCount;
    }

    /**
     * Sets the value of the invalidSignOnCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInvalidSignOnCount(BigInteger value) {
        this.invalidSignOnCount = value;
    }

    /**
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the userPswd property.
     * 
     * @return
     *     possible object is
     *     {@link UserPswdType }
     *     
     */
    public UserPswdType getUserPswd() {
        return userPswd;
    }

    /**
     * Sets the value of the userPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPswdType }
     *     
     */
    public void setUserPswd(UserPswdType value) {
        this.userPswd = value;
    }

    /**
     * Gets the value of the userAuthentication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAuthentication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAuthentication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAuthenticationType }
     * 
     * 
     */
    public List<UserAuthenticationType> getUserAuthentication() {
        if (userAuthentication == null) {
            userAuthentication = new ArrayList<UserAuthenticationType>();
        }
        return this.userAuthentication;
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