//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 07:49:02 PM IST 
//


package org.acord.standards.life._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChestForcedMeasure_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChestForcedMeasure_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MeasureUnits" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MeasureValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChestForcedMeasure_Type", propOrder = {
    "measureUnits",
    "measureValue"
})
public class ChestForcedMeasureType {

    @XmlElement(name = "MeasureUnits")
    protected OLILUMEASUREUNITS measureUnits;
    @XmlElement(name = "MeasureValue")
    protected Double measureValue;

    /**
     * Gets the value of the measureUnits property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMEASUREUNITS }
     *     
     */
    public OLILUMEASUREUNITS getMeasureUnits() {
        return measureUnits;
    }

    /**
     * Sets the value of the measureUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMEASUREUNITS }
     *     
     */
    public void setMeasureUnits(OLILUMEASUREUNITS value) {
        this.measureUnits = value;
    }

    /**
     * Gets the value of the measureValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeasureValue() {
        return measureValue;
    }

    /**
     * Sets the value of the measureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeasureValue(Double value) {
        this.measureValue = value;
    }

}
