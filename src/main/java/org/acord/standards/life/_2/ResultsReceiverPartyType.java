//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultsReceiverParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultsReceiverParty_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ResultsReceiverPartyID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultsReceiverParty_Type")
public class ResultsReceiverPartyType {

    @XmlAttribute(name = "ResultsReceiverPartyID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object resultsReceiverPartyID;

    /**
     * Gets the value of the resultsReceiverPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResultsReceiverPartyID() {
        return resultsReceiverPartyID;
    }

    /**
     * Sets the value of the resultsReceiverPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResultsReceiverPartyID(Object value) {
        this.resultsReceiverPartyID = value;
    }

}
