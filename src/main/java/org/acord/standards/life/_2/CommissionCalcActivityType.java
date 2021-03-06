//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

import java.math.BigDecimal;
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
 * <p>Java class for CommissionCalcActivity_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionCalcActivity_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionCalcActivityKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionCalcActivitySysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionCalcDetail" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CompanyProducerID" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionBasisAmt" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RelationRoleCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionLink" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="CompanyProducerIDREF" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="DataRep" type="{http://ACORD.org/Standards/Life/2}DATAREP_TYPES" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionCalcActivity_Type", propOrder = {
    "commissionCalcActivityKey",
    "commissionCalcActivitySysKey",
    "commissionCalcDetail",
    "commissionDetail",
    "companyProducerID",
    "commissionBasisAmt",
    "relationRoleCode",
    "commissionLink",
    "oLifEExtension"
})
public class CommissionCalcActivityType {

    @XmlElement(name = "CommissionCalcActivityKey")
    protected PERSISTKEY commissionCalcActivityKey;
    @XmlElement(name = "CommissionCalcActivitySysKey")
    protected List<SYSKEY> commissionCalcActivitySysKey;
    @XmlElement(name = "CommissionCalcDetail")
    protected CommissionCalcDetailType commissionCalcDetail;
    @XmlElement(name = "CommissionDetail")
    protected List<CommissionDetailType> commissionDetail;
    @XmlElement(name = "CompanyProducerID")
    protected String companyProducerID;
    @XmlElement(name = "CommissionBasisAmt")
    protected BigDecimal commissionBasisAmt;
    @XmlElement(name = "RelationRoleCode")
    protected OLILUREL relationRoleCode;
    @XmlElement(name = "CommissionLink")
    protected String commissionLink;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "CompanyProducerIDREF")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object companyProducerIDREF;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;

    /**
     * Gets the value of the commissionCalcActivityKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getCommissionCalcActivityKey() {
        return commissionCalcActivityKey;
    }

    /**
     * Sets the value of the commissionCalcActivityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setCommissionCalcActivityKey(PERSISTKEY value) {
        this.commissionCalcActivityKey = value;
    }

    /**
     * Gets the value of the commissionCalcActivitySysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionCalcActivitySysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionCalcActivitySysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getCommissionCalcActivitySysKey() {
        if (commissionCalcActivitySysKey == null) {
            commissionCalcActivitySysKey = new ArrayList<SYSKEY>();
        }
        return this.commissionCalcActivitySysKey;
    }

    /**
     * Gets the value of the commissionCalcDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionCalcDetailType }
     *     
     */
    public CommissionCalcDetailType getCommissionCalcDetail() {
        return commissionCalcDetail;
    }

    /**
     * Sets the value of the commissionCalcDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionCalcDetailType }
     *     
     */
    public void setCommissionCalcDetail(CommissionCalcDetailType value) {
        this.commissionCalcDetail = value;
    }

    /**
     * Gets the value of the commissionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionDetailType }
     * 
     * 
     */
    public List<CommissionDetailType> getCommissionDetail() {
        if (commissionDetail == null) {
            commissionDetail = new ArrayList<CommissionDetailType>();
        }
        return this.commissionDetail;
    }

    /**
     * Gets the value of the companyProducerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyProducerID() {
        return companyProducerID;
    }

    /**
     * Sets the value of the companyProducerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyProducerID(String value) {
        this.companyProducerID = value;
    }

    /**
     * Gets the value of the commissionBasisAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionBasisAmt() {
        return commissionBasisAmt;
    }

    /**
     * Sets the value of the commissionBasisAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionBasisAmt(BigDecimal value) {
        this.commissionBasisAmt = value;
    }

    /**
     * Gets the value of the relationRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUREL }
     *     
     */
    public OLILUREL getRelationRoleCode() {
        return relationRoleCode;
    }

    /**
     * Sets the value of the relationRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUREL }
     *     
     */
    public void setRelationRoleCode(OLILUREL value) {
        this.relationRoleCode = value;
    }

    /**
     * Gets the value of the commissionLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionLink() {
        return commissionLink;
    }

    /**
     * Sets the value of the commissionLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionLink(String value) {
        this.commissionLink = value;
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
     * Gets the value of the companyProducerIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompanyProducerIDREF() {
        return companyProducerIDREF;
    }

    /**
     * Sets the value of the companyProducerIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompanyProducerIDREF(Object value) {
        this.companyProducerIDREF = value;
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
