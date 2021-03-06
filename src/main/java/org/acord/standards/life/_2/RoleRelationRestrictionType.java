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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleRelationRestriction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleRelationRestriction_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Relationship" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RoleRestriction" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RelatedRoleCC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OriginatingRole" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OppositeGenderInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MinNumRelatedRolePlayers" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxNumRelatedRolePlayers" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RelatedRoleDataCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleRelationRestriction_Type", propOrder = {
    "relationship",
    "roleRestriction",
    "relatedRoleCC",
    "originatingRole",
    "oppositeGenderInd",
    "minNumRelatedRolePlayers",
    "maxNumRelatedRolePlayers",
    "relatedRoleDataCollection"
})
public class RoleRelationRestrictionType {

    @XmlElement(name = "Relationship")
    protected OLILUREL relationship;
    @XmlElement(name = "RoleRestriction")
    protected RoleRestrictionType roleRestriction;
    @XmlElement(name = "RelatedRoleCC")
    protected RelatedRoleCCType relatedRoleCC;
    @XmlElement(name = "OriginatingRole")
    protected OLILUREL originatingRole;
    @XmlElement(name = "OppositeGenderInd")
    protected OLILUBOOLEAN oppositeGenderInd;
    @XmlElement(name = "MinNumRelatedRolePlayers")
    protected BigInteger minNumRelatedRolePlayers;
    @XmlElement(name = "MaxNumRelatedRolePlayers")
    protected BigInteger maxNumRelatedRolePlayers;
    @XmlElement(name = "RelatedRoleDataCollection")
    protected List<RelatedRoleDataCollectionType> relatedRoleDataCollection;

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUREL }
     *     
     */
    public OLILUREL getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUREL }
     *     
     */
    public void setRelationship(OLILUREL value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the roleRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link RoleRestrictionType }
     *     
     */
    public RoleRestrictionType getRoleRestriction() {
        return roleRestriction;
    }

    /**
     * Sets the value of the roleRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleRestrictionType }
     *     
     */
    public void setRoleRestriction(RoleRestrictionType value) {
        this.roleRestriction = value;
    }

    /**
     * Gets the value of the relatedRoleCC property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedRoleCCType }
     *     
     */
    public RelatedRoleCCType getRelatedRoleCC() {
        return relatedRoleCC;
    }

    /**
     * Sets the value of the relatedRoleCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedRoleCCType }
     *     
     */
    public void setRelatedRoleCC(RelatedRoleCCType value) {
        this.relatedRoleCC = value;
    }

    /**
     * Gets the value of the originatingRole property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUREL }
     *     
     */
    public OLILUREL getOriginatingRole() {
        return originatingRole;
    }

    /**
     * Sets the value of the originatingRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUREL }
     *     
     */
    public void setOriginatingRole(OLILUREL value) {
        this.originatingRole = value;
    }

    /**
     * Gets the value of the oppositeGenderInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getOppositeGenderInd() {
        return oppositeGenderInd;
    }

    /**
     * Sets the value of the oppositeGenderInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setOppositeGenderInd(OLILUBOOLEAN value) {
        this.oppositeGenderInd = value;
    }

    /**
     * Gets the value of the minNumRelatedRolePlayers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumRelatedRolePlayers() {
        return minNumRelatedRolePlayers;
    }

    /**
     * Sets the value of the minNumRelatedRolePlayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinNumRelatedRolePlayers(BigInteger value) {
        this.minNumRelatedRolePlayers = value;
    }

    /**
     * Gets the value of the maxNumRelatedRolePlayers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumRelatedRolePlayers() {
        return maxNumRelatedRolePlayers;
    }

    /**
     * Sets the value of the maxNumRelatedRolePlayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumRelatedRolePlayers(BigInteger value) {
        this.maxNumRelatedRolePlayers = value;
    }

    /**
     * Gets the value of the relatedRoleDataCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedRoleDataCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedRoleDataCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedRoleDataCollectionType }
     * 
     * 
     */
    public List<RelatedRoleDataCollectionType> getRelatedRoleDataCollection() {
        if (relatedRoleDataCollection == null) {
            relatedRoleDataCollection = new ArrayList<RelatedRoleDataCollectionType>();
        }
        return this.relatedRoleDataCollection;
    }

}
