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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Exam_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exam_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CourseType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}StatusDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}InstitutionName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CompletedInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RequiredInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExemptionInd" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EducationalCreditEquivalent" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ProducerExamStatus" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamApprovalNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamWindowStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamWindowEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ApprovedHours" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamDetail" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}EffDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExpDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TrainingRequirementType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}RegistrationJurisdiction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PolicyProductInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SuitabilityProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ExamMethodInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OLifEExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ExaminingInstitutionID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
@XmlType(name = "Exam_Type", propOrder = {
    "examKey",
    "examSysKey",
    "examType",
    "courseType",
    "statusDate",
    "examName",
    "institutionName",
    "examDate",
    "completedInd",
    "requiredInd",
    "exemptionInd",
    "educationalCreditEquivalent",
    "producerExamStatus",
    "examNumber",
    "examApprovalNumber",
    "examWindowStartDate",
    "examWindowEndDate",
    "approvedHours",
    "examDetail",
    "effDate",
    "expDate",
    "trainingRequirementType",
    "registrationJurisdiction",
    "policyProductInfo",
    "suitabilityProduct",
    "examMethodInfo",
    "oLifEExtension"
})
public class ExamType {

    @XmlElement(name = "ExamKey")
    protected PERSISTKEY examKey;
    @XmlElement(name = "ExamSysKey")
    protected List<SYSKEY> examSysKey;
    @XmlElement(name = "ExamType")
    protected OLILUREGISTRATIONEXAMTYPE examType;
    @XmlElement(name = "CourseType")
    protected OLILUCOURSETYPE courseType;
    @XmlElement(name = "StatusDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(name = "ExamName")
    protected String examName;
    @XmlElement(name = "InstitutionName")
    protected String institutionName;
    @XmlElement(name = "ExamDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examDate;
    @XmlElement(name = "CompletedInd")
    protected OLILUBOOLEAN completedInd;
    @XmlElement(name = "RequiredInd")
    protected OLILUBOOLEAN requiredInd;
    @XmlElement(name = "ExemptionInd")
    protected OLILUBOOLEAN exemptionInd;
    @XmlElement(name = "EducationalCreditEquivalent")
    protected String educationalCreditEquivalent;
    @XmlElement(name = "ProducerExamStatus")
    protected OLILUEXAMSTATUSTYPE producerExamStatus;
    @XmlElement(name = "ExamNumber")
    protected String examNumber;
    @XmlElement(name = "ExamApprovalNumber")
    protected String examApprovalNumber;
    @XmlElement(name = "ExamWindowStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examWindowStartDate;
    @XmlElement(name = "ExamWindowEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examWindowEndDate;
    @XmlElement(name = "ApprovedHours")
    protected Double approvedHours;
    @XmlElement(name = "ExamDetail")
    protected String examDetail;
    @XmlElement(name = "EffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDate;
    @XmlElement(name = "ExpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDate;
    @XmlElement(name = "TrainingRequirementType")
    protected OLILUTRAININGREQTYPE trainingRequirementType;
    @XmlElement(name = "RegistrationJurisdiction")
    protected List<RegistrationJurisdictionType> registrationJurisdiction;
    @XmlElement(name = "PolicyProductInfo")
    protected List<PolicyProductInfoType> policyProductInfo;
    @XmlElement(name = "SuitabilityProduct")
    protected List<SuitabilityProductType> suitabilityProduct;
    @XmlElement(name = "ExamMethodInfo")
    protected List<ExamMethodInfoType> examMethodInfo;
    @XmlElement(name = "OLifEExtension")
    protected List<OLifEExtensionType> oLifEExtension;
    @XmlAttribute(name = "ExaminingInstitutionID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object examiningInstitutionID;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "DataRep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataRep;

    /**
     * Gets the value of the examKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getExamKey() {
        return examKey;
    }

    /**
     * Sets the value of the examKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setExamKey(PERSISTKEY value) {
        this.examKey = value;
    }

    /**
     * Gets the value of the examSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExamSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getExamSysKey() {
        if (examSysKey == null) {
            examSysKey = new ArrayList<SYSKEY>();
        }
        return this.examSysKey;
    }

    /**
     * Gets the value of the examType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUREGISTRATIONEXAMTYPE }
     *     
     */
    public OLILUREGISTRATIONEXAMTYPE getExamType() {
        return examType;
    }

    /**
     * Sets the value of the examType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUREGISTRATIONEXAMTYPE }
     *     
     */
    public void setExamType(OLILUREGISTRATIONEXAMTYPE value) {
        this.examType = value;
    }

    /**
     * Gets the value of the courseType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUCOURSETYPE }
     *     
     */
    public OLILUCOURSETYPE getCourseType() {
        return courseType;
    }

    /**
     * Sets the value of the courseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUCOURSETYPE }
     *     
     */
    public void setCourseType(OLILUCOURSETYPE value) {
        this.courseType = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the examName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamName() {
        return examName;
    }

    /**
     * Sets the value of the examName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamName(String value) {
        this.examName = value;
    }

    /**
     * Gets the value of the institutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Sets the value of the institutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionName(String value) {
        this.institutionName = value;
    }

    /**
     * Gets the value of the examDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExamDate() {
        return examDate;
    }

    /**
     * Sets the value of the examDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExamDate(XMLGregorianCalendar value) {
        this.examDate = value;
    }

    /**
     * Gets the value of the completedInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getCompletedInd() {
        return completedInd;
    }

    /**
     * Sets the value of the completedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setCompletedInd(OLILUBOOLEAN value) {
        this.completedInd = value;
    }

    /**
     * Gets the value of the requiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getRequiredInd() {
        return requiredInd;
    }

    /**
     * Sets the value of the requiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setRequiredInd(OLILUBOOLEAN value) {
        this.requiredInd = value;
    }

    /**
     * Gets the value of the exemptionInd property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public OLILUBOOLEAN getExemptionInd() {
        return exemptionInd;
    }

    /**
     * Sets the value of the exemptionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBOOLEAN }
     *     
     */
    public void setExemptionInd(OLILUBOOLEAN value) {
        this.exemptionInd = value;
    }

    /**
     * Gets the value of the educationalCreditEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCreditEquivalent() {
        return educationalCreditEquivalent;
    }

    /**
     * Sets the value of the educationalCreditEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCreditEquivalent(String value) {
        this.educationalCreditEquivalent = value;
    }

    /**
     * Gets the value of the producerExamStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUEXAMSTATUSTYPE }
     *     
     */
    public OLILUEXAMSTATUSTYPE getProducerExamStatus() {
        return producerExamStatus;
    }

    /**
     * Sets the value of the producerExamStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUEXAMSTATUSTYPE }
     *     
     */
    public void setProducerExamStatus(OLILUEXAMSTATUSTYPE value) {
        this.producerExamStatus = value;
    }

    /**
     * Gets the value of the examNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamNumber() {
        return examNumber;
    }

    /**
     * Sets the value of the examNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamNumber(String value) {
        this.examNumber = value;
    }

    /**
     * Gets the value of the examApprovalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamApprovalNumber() {
        return examApprovalNumber;
    }

    /**
     * Sets the value of the examApprovalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamApprovalNumber(String value) {
        this.examApprovalNumber = value;
    }

    /**
     * Gets the value of the examWindowStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExamWindowStartDate() {
        return examWindowStartDate;
    }

    /**
     * Sets the value of the examWindowStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExamWindowStartDate(XMLGregorianCalendar value) {
        this.examWindowStartDate = value;
    }

    /**
     * Gets the value of the examWindowEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExamWindowEndDate() {
        return examWindowEndDate;
    }

    /**
     * Sets the value of the examWindowEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExamWindowEndDate(XMLGregorianCalendar value) {
        this.examWindowEndDate = value;
    }

    /**
     * Gets the value of the approvedHours property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApprovedHours() {
        return approvedHours;
    }

    /**
     * Sets the value of the approvedHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApprovedHours(Double value) {
        this.approvedHours = value;
    }

    /**
     * Gets the value of the examDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamDetail() {
        return examDetail;
    }

    /**
     * Sets the value of the examDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamDetail(String value) {
        this.examDetail = value;
    }

    /**
     * Gets the value of the effDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Sets the value of the effDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the trainingRequirementType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUTRAININGREQTYPE }
     *     
     */
    public OLILUTRAININGREQTYPE getTrainingRequirementType() {
        return trainingRequirementType;
    }

    /**
     * Sets the value of the trainingRequirementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUTRAININGREQTYPE }
     *     
     */
    public void setTrainingRequirementType(OLILUTRAININGREQTYPE value) {
        this.trainingRequirementType = value;
    }

    /**
     * Gets the value of the registrationJurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationJurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationJurisdictionType }
     * 
     * 
     */
    public List<RegistrationJurisdictionType> getRegistrationJurisdiction() {
        if (registrationJurisdiction == null) {
            registrationJurisdiction = new ArrayList<RegistrationJurisdictionType>();
        }
        return this.registrationJurisdiction;
    }

    /**
     * Gets the value of the policyProductInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyProductInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyProductInfoType }
     * 
     * 
     */
    public List<PolicyProductInfoType> getPolicyProductInfo() {
        if (policyProductInfo == null) {
            policyProductInfo = new ArrayList<PolicyProductInfoType>();
        }
        return this.policyProductInfo;
    }

    /**
     * Gets the value of the suitabilityProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suitabilityProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuitabilityProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuitabilityProductType }
     * 
     * 
     */
    public List<SuitabilityProductType> getSuitabilityProduct() {
        if (suitabilityProduct == null) {
            suitabilityProduct = new ArrayList<SuitabilityProductType>();
        }
        return this.suitabilityProduct;
    }

    /**
     * Gets the value of the examMethodInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the examMethodInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExamMethodInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExamMethodInfoType }
     * 
     * 
     */
    public List<ExamMethodInfoType> getExamMethodInfo() {
        if (examMethodInfo == null) {
            examMethodInfo = new ArrayList<ExamMethodInfoType>();
        }
        return this.examMethodInfo;
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
     * Gets the value of the examiningInstitutionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExaminingInstitutionID() {
        return examiningInstitutionID;
    }

    /**
     * Sets the value of the examiningInstitutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExaminingInstitutionID(Object value) {
        this.examiningInstitutionID = value;
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
