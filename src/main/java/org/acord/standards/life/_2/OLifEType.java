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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OLifE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OLifE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SourceInfo" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CurrentLanguage" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Activity" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Grouping" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Holding" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}InvestProduct" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Party" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyProduct" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Relation" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Currency" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Criteria" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}FinancialStatement" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Scenario" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}FormInstance" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SettlementInfo" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}DistributionAgreement" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}CommSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}SystemMessage" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Campaign" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}Case" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}CodeList" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}BusinessProcessDef" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}AuditEntry" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}UnderwritingGuidelines" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}KeyedValue" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OLifE_Type", propOrder = {
    "sourceInfo",
    "currentLanguage",
    "activityOrGroupingOrHolding"
})
public class OLifEType {

    @XmlElement(name = "SourceInfo")
    protected SourceInfoType sourceInfo;
    @XmlElement(name = "CurrentLanguage")
    protected OLILUCLIENTLANGUAGES currentLanguage;
    @XmlElements({
        @XmlElement(name = "Activity", type = ActivityType.class),
        @XmlElement(name = "Grouping", type = GroupingType.class),
        @XmlElement(name = "Holding", type = HoldingType.class),
        @XmlElement(name = "InvestProduct", type = InvestProductType.class),
        @XmlElement(name = "Party", type = PartyType.class),
        @XmlElement(name = "PolicyProduct", type = PolicyProductType.class),
        @XmlElement(name = "Relation", type = RelationType.class),
        @XmlElement(name = "Currency", type = CurrencyType.class),
        @XmlElement(name = "Criteria", type = CriteriaType.class),
        @XmlElement(name = "FinancialStatement", type = FinancialStatementType.class),
        @XmlElement(name = "Scenario", type = ScenarioType.class),
        @XmlElement(name = "FormInstance", type = FormInstanceType.class),
        @XmlElement(name = "SettlementInfo", type = SettlementInfoType.class),
        @XmlElement(name = "DistributionAgreement", type = DistributionAgreementType.class),
        @XmlElement(name = "CommSchedule", type = CommScheduleType.class),
        @XmlElement(name = "SystemMessage", type = SystemMessageType.class),
        @XmlElement(name = "Campaign", type = CampaignType.class),
        @XmlElement(name = "Case", type = CaseType.class),
        @XmlElement(name = "CodeList", type = CodeListType.class),
        @XmlElement(name = "BusinessProcessDef", type = BusinessProcessDefType.class),
        @XmlElement(name = "AuditEntry", type = AuditEntryType.class),
        @XmlElement(name = "UnderwritingGuidelines", type = UnderwritingGuidelinesType.class),
        @XmlElement(name = "KeyedValue", type = KeyedValueType.class),
        @XmlElement(name = "OLifEExtension", type = OLifEExtensionType.class)
    })
    protected List<Object> activityOrGroupingOrHolding;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the sourceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SourceInfoType }
     *     
     */
    public SourceInfoType getSourceInfo() {
        return sourceInfo;
    }

    /**
     * Sets the value of the sourceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceInfoType }
     *     
     */
    public void setSourceInfo(SourceInfoType value) {
        this.sourceInfo = value;
    }

    /**
     * Gets the value of the currentLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCLIENTLANGUAGES }
     *     
     */
    public OLILUCLIENTLANGUAGES getCurrentLanguage() {
        return currentLanguage;
    }

    /**
     * Sets the value of the currentLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCLIENTLANGUAGES }
     *     
     */
    public void setCurrentLanguage(OLILUCLIENTLANGUAGES value) {
        this.currentLanguage = value;
    }

    /**
     * Gets the value of the activityOrGroupingOrHolding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityOrGroupingOrHolding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityOrGroupingOrHolding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityType }
     * {@link GroupingType }
     * {@link HoldingType }
     * {@link InvestProductType }
     * {@link PartyType }
     * {@link PolicyProductType }
     * {@link RelationType }
     * {@link CurrencyType }
     * {@link CriteriaType }
     * {@link FinancialStatementType }
     * {@link ScenarioType }
     * {@link FormInstanceType }
     * {@link SettlementInfoType }
     * {@link DistributionAgreementType }
     * {@link CommScheduleType }
     * {@link SystemMessageType }
     * {@link CampaignType }
     * {@link CaseType }
     * {@link CodeListType }
     * {@link BusinessProcessDefType }
     * {@link AuditEntryType }
     * {@link UnderwritingGuidelinesType }
     * {@link KeyedValueType }
     * {@link OLifEExtensionType }
     * 
     * 
     */
    public List<Object> getActivityOrGroupingOrHolding() {
        if (activityOrGroupingOrHolding == null) {
            activityOrGroupingOrHolding = new ArrayList<Object>();
        }
        return this.activityOrGroupingOrHolding;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
