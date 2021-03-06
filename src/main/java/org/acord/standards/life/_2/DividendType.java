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
 * <p>Java class for Dividend_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dividend_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DividendKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DividendSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}GuarInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DivType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DivOYTOptType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DefaultInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SelectionRule" minOccurs="0"/>
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
@XmlType(name = "Dividend_Type", propOrder = {
    "dividendKey",
    "dividendSysKey",
    "guarInd",
    "divType",
    "divOYTOptType",
    "defaultInd",
    "selectionRule",
    "tableRef",
    "oLifEExtension"
})
public class DividendType {

    @XmlElement(name = "DividendKey")
    protected PERSISTKEY dividendKey;
    @XmlElement(name = "DividendSysKey")
    protected List<SYSKEY> dividendSysKey;
    @XmlElement(name = "GuarInd")
    protected OLILUBOOLEAN guarInd;
    @XmlElement(name = "DivType")
    protected OLILUDIVTYPE divType;
    @XmlElement(name = "DivOYTOptType")
    protected OLILUDIVOYTTYPE divOYTOptType;
    @XmlElement(name = "DefaultInd")
    protected OLILUBOOLEAN defaultInd;
    @XmlElement(name = "SelectionRule")
    protected OLILURIDERSELECTRULE selectionRule;
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
     * Gets the value of the dividendKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getDividendKey() {
        return dividendKey;
    }

    /**
     * Sets the value of the dividendKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setDividendKey(PERSISTKEY value) {
        this.dividendKey = value;
    }

    /**
     * Gets the value of the dividendSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dividendSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDividendSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getDividendSysKey() {
        if (dividendSysKey == null) {
            dividendSysKey = new ArrayList<SYSKEY>();
        }
        return this.dividendSysKey;
    }

    /**
     * Gets the value of the guarInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getGuarInd() {
        return guarInd;
    }

    /**
     * Sets the value of the guarInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setGuarInd(OLILUBOOLEAN value) {
        this.guarInd = value;
    }

    /**
     * Gets the value of the divType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDIVTYPE }
     *     
     */
    public OLILUDIVTYPE getDivType() {
        return divType;
    }

    /**
     * Sets the value of the divType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDIVTYPE }
     *     
     */
    public void setDivType(OLILUDIVTYPE value) {
        this.divType = value;
    }

    /**
     * Gets the value of the divOYTOptType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUDIVOYTTYPE }
     *     
     */
    public OLILUDIVOYTTYPE getDivOYTOptType() {
        return divOYTOptType;
    }

    /**
     * Sets the value of the divOYTOptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUDIVOYTTYPE }
     *     
     */
    public void setDivOYTOptType(OLILUDIVOYTTYPE value) {
        this.divOYTOptType = value;
    }

    /**
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getDefaultInd() {
        return defaultInd;
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setDefaultInd(OLILUBOOLEAN value) {
        this.defaultInd = value;
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
