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
 * <p>Java class for AnswerChoice_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnswerChoice_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AnswerChoiceKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AnswerChoiceSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AnswerChoiceIdent" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AnswerChoiceText" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AnswerChoiceType" minOccurs="0"/>
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
@XmlType(name = "AnswerChoice_Type", propOrder = {
    "answerChoiceKey",
    "answerChoiceSysKey",
    "answerChoiceIdent",
    "answerChoiceText",
    "answerChoiceType",
    "oLifEExtension"
})
public class AnswerChoiceType {

    @XmlElement(name = "AnswerChoiceKey")
    protected PERSISTKEY answerChoiceKey;
    @XmlElement(name = "AnswerChoiceSysKey")
    protected List<SYSKEY> answerChoiceSysKey;
    @XmlElement(name = "AnswerChoiceIdent")
    protected String answerChoiceIdent;
    @XmlElement(name = "AnswerChoiceText")
    protected String answerChoiceText;
    @XmlElement(name = "AnswerChoiceType")
    protected OLILUANSWERCHOICE answerChoiceType;
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
     * Gets the value of the answerChoiceKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getAnswerChoiceKey() {
        return answerChoiceKey;
    }

    /**
     * Sets the value of the answerChoiceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setAnswerChoiceKey(PERSISTKEY value) {
        this.answerChoiceKey = value;
    }

    /**
     * Gets the value of the answerChoiceSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answerChoiceSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnswerChoiceSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getAnswerChoiceSysKey() {
        if (answerChoiceSysKey == null) {
            answerChoiceSysKey = new ArrayList<SYSKEY>();
        }
        return this.answerChoiceSysKey;
    }

    /**
     * Gets the value of the answerChoiceIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerChoiceIdent() {
        return answerChoiceIdent;
    }

    /**
     * Sets the value of the answerChoiceIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerChoiceIdent(String value) {
        this.answerChoiceIdent = value;
    }

    /**
     * Gets the value of the answerChoiceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerChoiceText() {
        return answerChoiceText;
    }

    /**
     * Sets the value of the answerChoiceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerChoiceText(String value) {
        this.answerChoiceText = value;
    }

    /**
     * Gets the value of the answerChoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUANSWERCHOICE }
     *     
     */
    public OLILUANSWERCHOICE getAnswerChoiceType() {
        return answerChoiceType;
    }

    /**
     * Sets the value of the answerChoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUANSWERCHOICE }
     *     
     */
    public void setAnswerChoiceType(OLILUANSWERCHOICE value) {
        this.answerChoiceType = value;
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
