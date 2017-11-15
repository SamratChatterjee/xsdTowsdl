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
 * <p>Java class for AuthorizationChangeDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationChangeDetail_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuthorizationChangeDetailKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuthorizationChangeDetailSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RelatedRole" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AuthorizeAllChangesInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ChangeInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AuthorizationChangeDetail_Type", propOrder = {
    "authorizationChangeDetailKey",
    "authorizationChangeDetailSysKey",
    "relatedRole",
    "authorizeAllChangesInd",
    "changeInfo",
    "oLifEExtension"
})
public class AuthorizationChangeDetailType {

    @XmlElement(name = "AuthorizationChangeDetailKey")
    protected PERSISTKEY authorizationChangeDetailKey;
    @XmlElement(name = "AuthorizationChangeDetailSysKey")
    protected List<SYSKEY> authorizationChangeDetailSysKey;
    @XmlElement(name = "RelatedRole")
    protected OLILUREL relatedRole;
    @XmlElement(name = "AuthorizeAllChangesInd")
    protected OLILUBOOLEAN authorizeAllChangesInd;
    @XmlElement(name = "ChangeInfo")
    protected List<ChangeInfoType> changeInfo;
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
     * Gets the value of the authorizationChangeDetailKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getAuthorizationChangeDetailKey() {
        return authorizationChangeDetailKey;
    }

    /**
     * Sets the value of the authorizationChangeDetailKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setAuthorizationChangeDetailKey(PERSISTKEY value) {
        this.authorizationChangeDetailKey = value;
    }

    /**
     * Gets the value of the authorizationChangeDetailSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationChangeDetailSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationChangeDetailSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getAuthorizationChangeDetailSysKey() {
        if (authorizationChangeDetailSysKey == null) {
            authorizationChangeDetailSysKey = new ArrayList<SYSKEY>();
        }
        return this.authorizationChangeDetailSysKey;
    }

    /**
     * Gets the value of the relatedRole property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUREL }
     *     
     */
    public OLILUREL getRelatedRole() {
        return relatedRole;
    }

    /**
     * Sets the value of the relatedRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUREL }
     *     
     */
    public void setRelatedRole(OLILUREL value) {
        this.relatedRole = value;
    }

    /**
     * Gets the value of the authorizeAllChangesInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getAuthorizeAllChangesInd() {
        return authorizeAllChangesInd;
    }

    /**
     * Sets the value of the authorizeAllChangesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setAuthorizeAllChangesInd(OLILUBOOLEAN value) {
        this.authorizeAllChangesInd = value;
    }

    /**
     * Gets the value of the changeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeInfoType }
     * 
     * 
     */
    public List<ChangeInfoType> getChangeInfo() {
        if (changeInfo == null) {
            changeInfo = new ArrayList<ChangeInfoType>();
        }
        return this.changeInfo;
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