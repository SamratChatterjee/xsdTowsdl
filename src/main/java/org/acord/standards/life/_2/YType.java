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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Y_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Y_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="ComplexContentDescriptorID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Y_Type", propOrder = {
    "value"
})
public class YType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ComplexContentDescriptorID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object complexContentDescriptorID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the complexContentDescriptorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComplexContentDescriptorID() {
        return complexContentDescriptorID;
    }

    /**
     * Sets the value of the complexContentDescriptorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComplexContentDescriptorID(Object value) {
        this.complexContentDescriptorID = value;
    }

}