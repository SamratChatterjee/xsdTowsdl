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


/**
 * <p>Java class for ArrangementProduct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrangementProduct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ArrangementProductKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ArrangementProductSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SelectionRule" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ArrType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Name" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Sequence" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProductCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MaxNumInstances" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ArrangementOptProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}JurisdictionApproval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Attachment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ArrangementProduct_Type", propOrder = {
    "arrangementProductKey",
    "arrangementProductSysKey",
    "selectionRule",
    "arrType",
    "name",
    "description",
    "sequence",
    "productCode",
    "maxNumInstances",
    "arrangementOptProduct",
    "jurisdictionApproval",
    "attachment",
    "oLifEExtension"
})
public class ArrangementProductType {

    @XmlElement(name = "ArrangementProductKey")
    protected PERSISTKEY arrangementProductKey;
    @XmlElement(name = "ArrangementProductSysKey")
    protected List<SYSKEY> arrangementProductSysKey;
    @XmlElement(name = "SelectionRule")
    protected OLILURIDERSELECTRULE selectionRule;
    @XmlElement(name = "ArrType")
    protected OLILUARRTYPE arrType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Sequence")
    protected BigInteger sequence;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "MaxNumInstances")
    protected BigInteger maxNumInstances;
    @XmlElement(name = "ArrangementOptProduct")
    protected List<ArrangementOptProductType> arrangementOptProduct;
    @XmlElement(name = "JurisdictionApproval")
    protected List<JurisdictionApprovalType> jurisdictionApproval;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
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
     * Gets the value of the arrangementProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getArrangementProductKey() {
        return arrangementProductKey;
    }

    /**
     * Sets the value of the arrangementProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setArrangementProductKey(PERSISTKEY value) {
        this.arrangementProductKey = value;
    }

    /**
     * Gets the value of the arrangementProductSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrangementProductSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrangementProductSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getArrangementProductSysKey() {
        if (arrangementProductSysKey == null) {
            arrangementProductSysKey = new ArrayList<SYSKEY>();
        }
        return this.arrangementProductSysKey;
    }

    /**
     * Gets the value of the selectionRule property.
     * 
     * @return
     *     possible object is
     *     {@link OLILURIDERSELECTRULE }
     *     
     */
    public OLILURIDERSELECTRULE getSelectionRule() {
        return selectionRule;
    }

    /**
     * Sets the value of the selectionRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILURIDERSELECTRULE }
     *     
     */
    public void setSelectionRule(OLILURIDERSELECTRULE value) {
        this.selectionRule = value;
    }

    /**
     * Gets the value of the arrType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUARRTYPE }
     *     
     */
    public OLILUARRTYPE getArrType() {
        return arrType;
    }

    /**
     * Sets the value of the arrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUARRTYPE }
     *     
     */
    public void setArrType(OLILUARRTYPE value) {
        this.arrType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the maxNumInstances property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumInstances() {
        return maxNumInstances;
    }

    /**
     * Sets the value of the maxNumInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumInstances(BigInteger value) {
        this.maxNumInstances = value;
    }

    /**
     * Gets the value of the arrangementOptProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrangementOptProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrangementOptProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrangementOptProductType }
     * 
     * 
     */
    public List<ArrangementOptProductType> getArrangementOptProduct() {
        if (arrangementOptProduct == null) {
            arrangementOptProduct = new ArrayList<ArrangementOptProductType>();
        }
        return this.arrangementOptProduct;
    }

    /**
     * Gets the value of the jurisdictionApproval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdictionApproval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdictionApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JurisdictionApprovalType }
     * 
     * 
     */
    public List<JurisdictionApprovalType> getJurisdictionApproval() {
        if (jurisdictionApproval == null) {
            jurisdictionApproval = new ArrayList<JurisdictionApprovalType>();
        }
        return this.jurisdictionApproval;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
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
