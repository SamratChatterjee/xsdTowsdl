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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceOfFundsCC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceOfFundsCC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SourceOfFundsTC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceOfFundsCC_Type", propOrder = {
    "sourceOfFundsTC"
})
public class SourceOfFundsCCType {

    @XmlElement(name = "SourceOfFundsTC")
    protected List<OLILUSOURCEOFFUNDS> sourceOfFundsTC;

    /**
     * Gets the value of the sourceOfFundsTC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceOfFundsTC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceOfFundsTC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OLILUSOURCEOFFUNDS }
     * 
     * 
     */
    public List<OLILUSOURCEOFFUNDS> getSourceOfFundsTC() {
        if (sourceOfFundsTC == null) {
            sourceOfFundsTC = new ArrayList<OLILUSOURCEOFFUNDS>();
        }
        return this.sourceOfFundsTC;
    }

}
