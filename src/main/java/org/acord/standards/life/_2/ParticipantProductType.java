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
 * <p>Java class for ParticipantProduct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantProduct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ParticipantProductKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ParticipantProductSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ParticipantRoleCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RelatedParticipantProductInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AllowedDesignation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EntityType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ParticipantProduct_Type", propOrder = {
    "participantProductKey",
    "participantProductSysKey",
    "participantRoleCode",
    "relatedParticipantProductInfo",
    "allowedDesignation",
    "entityType",
    "oLifEExtension"
})
public class ParticipantProductType {

    @XmlElement(name = "ParticipantProductKey")
    protected PERSISTKEY participantProductKey;
    @XmlElement(name = "ParticipantProductSysKey")
    protected List<SYSKEY> participantProductSysKey;
    @XmlElement(name = "ParticipantRoleCode")
    protected OLILUPARTICROLE participantRoleCode;
    @XmlElement(name = "RelatedParticipantProductInfo")
    protected List<RelatedParticipantProductInfoType> relatedParticipantProductInfo;
    @XmlElement(name = "AllowedDesignation")
    protected List<AllowedDesignationType> allowedDesignation;
    @XmlElement(name = "EntityType")
    protected List<EntityTypeType> entityType;
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
     * Gets the value of the participantProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getParticipantProductKey() {
        return participantProductKey;
    }

    /**
     * Sets the value of the participantProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setParticipantProductKey(PERSISTKEY value) {
        this.participantProductKey = value;
    }

    /**
     * Gets the value of the participantProductSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantProductSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantProductSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getParticipantProductSysKey() {
        if (participantProductSysKey == null) {
            participantProductSysKey = new ArrayList<SYSKEY>();
        }
        return this.participantProductSysKey;
    }

    /**
     * Gets the value of the participantRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPARTICROLE }
     *     
     */
    public OLILUPARTICROLE getParticipantRoleCode() {
        return participantRoleCode;
    }

    /**
     * Sets the value of the participantRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPARTICROLE }
     *     
     */
    public void setParticipantRoleCode(OLILUPARTICROLE value) {
        this.participantRoleCode = value;
    }

    /**
     * Gets the value of the relatedParticipantProductInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParticipantProductInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParticipantProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedParticipantProductInfoType }
     * 
     * 
     */
    public List<RelatedParticipantProductInfoType> getRelatedParticipantProductInfo() {
        if (relatedParticipantProductInfo == null) {
            relatedParticipantProductInfo = new ArrayList<RelatedParticipantProductInfoType>();
        }
        return this.relatedParticipantProductInfo;
    }

    /**
     * Gets the value of the allowedDesignation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedDesignation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedDesignation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedDesignationType }
     * 
     * 
     */
    public List<AllowedDesignationType> getAllowedDesignation() {
        if (allowedDesignation == null) {
            allowedDesignation = new ArrayList<AllowedDesignationType>();
        }
        return this.allowedDesignation;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityTypeType }
     * 
     * 
     */
    public List<EntityTypeType> getEntityType() {
        if (entityType == null) {
            entityType = new ArrayList<EntityTypeType>();
        }
        return this.entityType;
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
