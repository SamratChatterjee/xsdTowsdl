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
 * <p>Java class for CommFormula_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommFormula_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommFormulaKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommFormulaSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommEvent" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CommissionType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RelationRoleCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierCommCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CarrierCommCodeDesc" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TableIdentity" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProviderDomain" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PaymentRateCategory" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TableRef" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CommFormula_Type", propOrder = {
    "commFormulaKey",
    "commFormulaSysKey",
    "commEvent",
    "commissionType",
    "relationRoleCode",
    "carrierCommCode",
    "carrierCommCodeDesc",
    "tableIdentity",
    "providerDomain",
    "paymentRateCategory",
    "tableRef",
    "oLifEExtension"
})
public class CommFormulaType {

    @XmlElement(name = "CommFormulaKey")
    protected PERSISTKEY commFormulaKey;
    @XmlElement(name = "CommFormulaSysKey")
    protected List<SYSKEY> commFormulaSysKey;
    @XmlElement(name = "CommEvent")
    protected OLILUCOMMEVENT commEvent;
    @XmlElement(name = "CommissionType")
    protected OLILUCOMMTYPE commissionType;
    @XmlElement(name = "RelationRoleCode")
    protected OLILUREL relationRoleCode;
    @XmlElement(name = "CarrierCommCode")
    protected String carrierCommCode;
    @XmlElement(name = "CarrierCommCodeDesc")
    protected String carrierCommCodeDesc;
    @XmlElement(name = "TableIdentity")
    protected String tableIdentity;
    @XmlElement(name = "ProviderDomain")
    protected String providerDomain;
    @XmlElement(name = "PaymentRateCategory")
    protected OLILUPAYRATECAT paymentRateCategory;
    @XmlElement(name = "TableRef")
    protected List<TableRefType> tableRef;
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
     * Gets the value of the commFormulaKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getCommFormulaKey() {
        return commFormulaKey;
    }

    /**
     * Sets the value of the commFormulaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setCommFormulaKey(PERSISTKEY value) {
        this.commFormulaKey = value;
    }

    /**
     * Gets the value of the commFormulaSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commFormulaSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommFormulaSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getCommFormulaSysKey() {
        if (commFormulaSysKey == null) {
            commFormulaSysKey = new ArrayList<SYSKEY>();
        }
        return this.commFormulaSysKey;
    }

    /**
     * Gets the value of the commEvent property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOMMEVENT }
     *     
     */
    public OLILUCOMMEVENT getCommEvent() {
        return commEvent;
    }

    /**
     * Sets the value of the commEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOMMEVENT }
     *     
     */
    public void setCommEvent(OLILUCOMMEVENT value) {
        this.commEvent = value;
    }

    /**
     * Gets the value of the commissionType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOMMTYPE }
     *     
     */
    public OLILUCOMMTYPE getCommissionType() {
        return commissionType;
    }

    /**
     * Sets the value of the commissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOMMTYPE }
     *     
     */
    public void setCommissionType(OLILUCOMMTYPE value) {
        this.commissionType = value;
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
     * Gets the value of the carrierCommCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCommCode() {
        return carrierCommCode;
    }

    /**
     * Sets the value of the carrierCommCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCommCode(String value) {
        this.carrierCommCode = value;
    }

    /**
     * Gets the value of the carrierCommCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCommCodeDesc() {
        return carrierCommCodeDesc;
    }

    /**
     * Sets the value of the carrierCommCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCommCodeDesc(String value) {
        this.carrierCommCodeDesc = value;
    }

    /**
     * Gets the value of the tableIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableIdentity() {
        return tableIdentity;
    }

    /**
     * Sets the value of the tableIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableIdentity(String value) {
        this.tableIdentity = value;
    }

    /**
     * Gets the value of the providerDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDomain() {
        return providerDomain;
    }

    /**
     * Sets the value of the providerDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderDomain(String value) {
        this.providerDomain = value;
    }

    /**
     * Gets the value of the paymentRateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPAYRATECAT }
     *     
     */
    public OLILUPAYRATECAT getPaymentRateCategory() {
        return paymentRateCategory;
    }

    /**
     * Sets the value of the paymentRateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPAYRATECAT }
     *     
     */
    public void setPaymentRateCategory(OLILUPAYRATECAT value) {
        this.paymentRateCategory = value;
    }

    /**
     * Gets the value of the tableRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableRefType }
     * 
     * 
     */
    public List<TableRefType> getTableRef() {
        if (tableRef == null) {
            tableRef = new ArrayList<TableRefType>();
        }
        return this.tableRef;
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
