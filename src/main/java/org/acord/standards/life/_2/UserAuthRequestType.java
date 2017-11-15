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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserAuthRequest_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAuthRequest_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element ref="{http://ACORD.org/Standards/Life/2}UserLoginName" minOccurs="0"/>
 *             &lt;choice minOccurs="0">
 *               &lt;element ref="{http://ACORD.org/Standards/Life/2}UserPswd" minOccurs="0"/>
 *               &lt;element ref="{http://ACORD.org/Standards/Life/2}UserAuthentication" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}UserSessionKey" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserDomain" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}VendorApp" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProxyVendor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAuthRequest_Type", propOrder = {
    "userLoginName",
    "userPswd",
    "userAuthentication",
    "userSessionKey",
    "userDomain",
    "userDate",
    "userTime",
    "vendorApp",
    "proxyVendor",
    "oLifEExtension"
})
public class UserAuthRequestType {

    @XmlElement(name = "UserLoginName")
    protected String userLoginName;
    @XmlElement(name = "UserPswd")
    protected UserPswdType userPswd;
    @XmlElement(name = "UserAuthentication")
    protected List<UserAuthenticationType> userAuthentication;
    @XmlElement(name = "UserSessionKey")
    protected String userSessionKey;
    @XmlElement(name = "UserDomain")
    protected String userDomain;
    @XmlElement(name = "UserDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar userDate;
    @XmlElement(name = "UserTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar userTime;
    @XmlElement(name = "VendorApp")
    protected VendorAppType vendorApp;
    @XmlElement(name = "ProxyVendor")
    protected List<ProxyVendorType> proxyVendor;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;

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
     * Gets the value of the userSessionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSessionKey() {
        return userSessionKey;
    }

    /**
     * Sets the value of the userSessionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSessionKey(String value) {
        this.userSessionKey = value;
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
     * Gets the value of the userDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserDate() {
        return userDate;
    }

    /**
     * Sets the value of the userDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserDate(XMLGregorianCalendar value) {
        this.userDate = value;
    }

    /**
     * Gets the value of the userTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserTime() {
        return userTime;
    }

    /**
     * Sets the value of the userTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserTime(XMLGregorianCalendar value) {
        this.userTime = value;
    }

    /**
     * Gets the value of the vendorApp property.
     * 
     * @return
     *     possible object is
     *     {@link VendorAppType }
     *     
     */
    public VendorAppType getVendorApp() {
        return vendorApp;
    }

    /**
     * Sets the value of the vendorApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorAppType }
     *     
     */
    public void setVendorApp(VendorAppType value) {
        this.vendorApp = value;
    }

    /**
     * Gets the value of the proxyVendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxyVendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxyVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProxyVendorType }
     * 
     * 
     */
    public List<ProxyVendorType> getProxyVendor() {
        if (proxyVendor == null) {
            proxyVendor = new ArrayList<ProxyVendorType>();
        }
        return this.proxyVendor;
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

}