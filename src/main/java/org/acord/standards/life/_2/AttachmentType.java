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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Attachment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attachment_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentKey" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentSysKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}DateCreated" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserCode" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}UserName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentBasicType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentSource" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Description" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentData" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentReference" minOccurs="0"/>
 *           &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentData64Binary" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MimeType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}MimeTypeTC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransferEncodingTypeString" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}TransferEncodingTypeTC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ImageType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentLocation" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastUpdate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}LastUpdateTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FollowUpDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FollowUpTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ImageSubmissionType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Priority" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PurgeDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PurgeTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ArchiveNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ArchiveRefNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentCategoryTC" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}FileName" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}Sequence" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}ReceivedDate" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentHashValue" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentHashType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}OriginatingSourceType" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}CreationTime" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}PageCount" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}SignatureInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentAnomaly" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ACORD.org/Standards/Life/2}AttachmentMark" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Attachment_Type", propOrder = {
    "attachmentKey",
    "attachmentSysKey",
    "dateCreated",
    "userCode",
    "userName",
    "attachmentBasicType",
    "attachmentSource",
    "description",
    "attachmentData",
    "attachmentReference",
    "attachmentData64Binary",
    "attachmentType",
    "mimeType",
    "mimeTypeTC",
    "transferEncodingTypeString",
    "transferEncodingTypeTC",
    "imageType",
    "attachmentLocation",
    "lastUpdate",
    "lastUpdateTime",
    "followUpDate",
    "followUpTime",
    "imageSubmissionType",
    "priority",
    "purgeDate",
    "purgeTime",
    "archiveNumber",
    "archiveRefNumber",
    "attachmentCategoryTC",
    "fileName",
    "sequence",
    "receivedDate",
    "attachmentHashValue",
    "attachmentHashType",
    "originatingSourceType",
    "creationTime",
    "pageCount",
    "signatureInfo",
    "attachmentAnomaly",
    "attachmentMark",
    "oLifEExtension"
})
public class AttachmentType {

    @XmlElement(name = "AttachmentKey")
    protected PERSISTKEY attachmentKey;
    @XmlElement(name = "AttachmentSysKey")
    protected List<SYSKEY> attachmentSysKey;
    @XmlElement(name = "DateCreated")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(name = "UserCode")
    protected String userCode;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "AttachmentBasicType")
    protected OLILUBASICATTACHMENTTYPE attachmentBasicType;
    @XmlElement(name = "AttachmentSource")
    protected String attachmentSource;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AttachmentData")
    protected OLILUVARIANT attachmentData;
    @XmlElement(name = "AttachmentReference")
    protected AttachmentReferenceType attachmentReference;
    @XmlElement(name = "AttachmentData64Binary")
    protected byte[] attachmentData64Binary;
    @XmlElement(name = "AttachmentType")
    protected OLILUATTACHMENTTYPE attachmentType;
    @XmlElement(name = "MimeType")
    protected String mimeType;
    @XmlElement(name = "MimeTypeTC")
    protected OLILUMIMETYPE mimeTypeTC;
    @XmlElement(name = "TransferEncodingTypeString")
    protected String transferEncodingTypeString;
    @XmlElement(name = "TransferEncodingTypeTC")
    protected OLILUENCODETYPE transferEncodingTypeTC;
    @XmlElement(name = "ImageType")
    protected OLILUIMAGEFORMAT imageType;
    @XmlElement(name = "AttachmentLocation")
    protected OLILUATTACHLOCATION attachmentLocation;
    @XmlElement(name = "LastUpdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdate;
    @XmlElement(name = "LastUpdateTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lastUpdateTime;
    @XmlElement(name = "FollowUpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar followUpDate;
    @XmlElement(name = "FollowUpTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar followUpTime;
    @XmlElement(name = "ImageSubmissionType")
    protected OLILUAPPSUBMITTYPE imageSubmissionType;
    @XmlElement(name = "Priority")
    protected OLILUPRIORITY priority;
    @XmlElement(name = "PurgeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purgeDate;
    @XmlElement(name = "PurgeTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar purgeTime;
    @XmlElement(name = "ArchiveNumber")
    protected String archiveNumber;
    @XmlElement(name = "ArchiveRefNumber")
    protected String archiveRefNumber;
    @XmlElement(name = "AttachmentCategoryTC")
    protected OLILUATTACHMENTCATEGORYTC attachmentCategoryTC;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "Sequence")
    protected BigInteger sequence;
    @XmlElement(name = "ReceivedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receivedDate;
    @XmlElement(name = "AttachmentHashValue")
    protected String attachmentHashValue;
    @XmlElement(name = "AttachmentHashType")
    protected OLILUHASHTYPE attachmentHashType;
    @XmlElement(name = "OriginatingSourceType")
    protected OLILUORIGSOURCE originatingSourceType;
    @XmlElement(name = "CreationTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "PageCount")
    protected BigInteger pageCount;
    @XmlElement(name = "SignatureInfo")
    protected List<SignatureInfoType> signatureInfo;
    @XmlElement(name = "AttachmentAnomaly")
    protected List<AttachmentAnomalyType> attachmentAnomaly;
    @XmlElement(name = "AttachmentMark")
    protected List<AttachmentMarkType> attachmentMark;
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
     * Gets the value of the attachmentKey property.
     * 
     * @return
     *     possible object is
     *     {@link PERSISTKEY }
     *     
     */
    public PERSISTKEY getAttachmentKey() {
        return attachmentKey;
    }

    /**
     * Sets the value of the attachmentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSISTKEY }
     *     
     */
    public void setAttachmentKey(PERSISTKEY value) {
        this.attachmentKey = value;
    }

    /**
     * Gets the value of the attachmentSysKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentSysKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentSysKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYSKEY }
     * 
     * 
     */
    public List<SYSKEY> getAttachmentSysKey() {
        if (attachmentSysKey == null) {
            attachmentSysKey = new ArrayList<SYSKEY>();
        }
        return this.attachmentSysKey;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the attachmentBasicType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUBASICATTACHMENTTYPE }
     *     
     */
    public OLILUBASICATTACHMENTTYPE getAttachmentBasicType() {
        return attachmentBasicType;
    }

    /**
     * Sets the value of the attachmentBasicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUBASICATTACHMENTTYPE }
     *     
     */
    public void setAttachmentBasicType(OLILUBASICATTACHMENTTYPE value) {
        this.attachmentBasicType = value;
    }

    /**
     * Gets the value of the attachmentSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentSource() {
        return attachmentSource;
    }

    /**
     * Sets the value of the attachmentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentSource(String value) {
        this.attachmentSource = value;
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
     * Gets the value of the attachmentData property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUVARIANT }
     *     
     */
    public OLILUVARIANT getAttachmentData() {
        return attachmentData;
    }

    /**
     * Sets the value of the attachmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUVARIANT }
     *     
     */
    public void setAttachmentData(OLILUVARIANT value) {
        this.attachmentData = value;
    }

    /**
     * Gets the value of the attachmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentReferenceType }
     *     
     */
    public AttachmentReferenceType getAttachmentReference() {
        return attachmentReference;
    }

    /**
     * Sets the value of the attachmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentReferenceType }
     *     
     */
    public void setAttachmentReference(AttachmentReferenceType value) {
        this.attachmentReference = value;
    }

    /**
     * Gets the value of the attachmentData64Binary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttachmentData64Binary() {
        return attachmentData64Binary;
    }

    /**
     * Sets the value of the attachmentData64Binary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttachmentData64Binary(byte[] value) {
        this.attachmentData64Binary = value;
    }

    /**
     * Gets the value of the attachmentType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUATTACHMENTTYPE }
     *     
     */
    public OLILUATTACHMENTTYPE getAttachmentType() {
        return attachmentType;
    }

    /**
     * Sets the value of the attachmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUATTACHMENTTYPE }
     *     
     */
    public void setAttachmentType(OLILUATTACHMENTTYPE value) {
        this.attachmentType = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the mimeTypeTC property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUMIMETYPE }
     *     
     */
    public OLILUMIMETYPE getMimeTypeTC() {
        return mimeTypeTC;
    }

    /**
     * Sets the value of the mimeTypeTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUMIMETYPE }
     *     
     */
    public void setMimeTypeTC(OLILUMIMETYPE value) {
        this.mimeTypeTC = value;
    }

    /**
     * Gets the value of the transferEncodingTypeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferEncodingTypeString() {
        return transferEncodingTypeString;
    }

    /**
     * Sets the value of the transferEncodingTypeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferEncodingTypeString(String value) {
        this.transferEncodingTypeString = value;
    }

    /**
     * Gets the value of the transferEncodingTypeTC property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUENCODETYPE }
     *     
     */
    public OLILUENCODETYPE getTransferEncodingTypeTC() {
        return transferEncodingTypeTC;
    }

    /**
     * Sets the value of the transferEncodingTypeTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUENCODETYPE }
     *     
     */
    public void setTransferEncodingTypeTC(OLILUENCODETYPE value) {
        this.transferEncodingTypeTC = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUIMAGEFORMAT }
     *     
     */
    public OLILUIMAGEFORMAT getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUIMAGEFORMAT }
     *     
     */
    public void setImageType(OLILUIMAGEFORMAT value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the attachmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUATTACHLOCATION }
     *     
     */
    public OLILUATTACHLOCATION getAttachmentLocation() {
        return attachmentLocation;
    }

    /**
     * Sets the value of the attachmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUATTACHLOCATION }
     *     
     */
    public void setAttachmentLocation(OLILUATTACHLOCATION value) {
        this.attachmentLocation = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTime(XMLGregorianCalendar value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the followUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFollowUpDate() {
        return followUpDate;
    }

    /**
     * Sets the value of the followUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFollowUpDate(XMLGregorianCalendar value) {
        this.followUpDate = value;
    }

    /**
     * Gets the value of the followUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFollowUpTime() {
        return followUpTime;
    }

    /**
     * Sets the value of the followUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFollowUpTime(XMLGregorianCalendar value) {
        this.followUpTime = value;
    }

    /**
     * Gets the value of the imageSubmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUAPPSUBMITTYPE }
     *     
     */
    public OLILUAPPSUBMITTYPE getImageSubmissionType() {
        return imageSubmissionType;
    }

    /**
     * Sets the value of the imageSubmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUAPPSUBMITTYPE }
     *     
     */
    public void setImageSubmissionType(OLILUAPPSUBMITTYPE value) {
        this.imageSubmissionType = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUPRIORITY }
     *     
     */
    public OLILUPRIORITY getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUPRIORITY }
     *     
     */
    public void setPriority(OLILUPRIORITY value) {
        this.priority = value;
    }

    /**
     * Gets the value of the purgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * Sets the value of the purgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
    }

    /**
     * Gets the value of the purgeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeTime() {
        return purgeTime;
    }

    /**
     * Sets the value of the purgeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeTime(XMLGregorianCalendar value) {
        this.purgeTime = value;
    }

    /**
     * Gets the value of the archiveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveNumber() {
        return archiveNumber;
    }

    /**
     * Sets the value of the archiveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveNumber(String value) {
        this.archiveNumber = value;
    }

    /**
     * Gets the value of the archiveRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveRefNumber() {
        return archiveRefNumber;
    }

    /**
     * Sets the value of the archiveRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveRefNumber(String value) {
        this.archiveRefNumber = value;
    }

    /**
     * Gets the value of the attachmentCategoryTC property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUATTACHMENTCATEGORYTC }
     *     
     */
    public OLILUATTACHMENTCATEGORYTC getAttachmentCategoryTC() {
        return attachmentCategoryTC;
    }

    /**
     * Sets the value of the attachmentCategoryTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUATTACHMENTCATEGORYTC }
     *     
     */
    public void setAttachmentCategoryTC(OLILUATTACHMENTCATEGORYTC value) {
        this.attachmentCategoryTC = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDate(XMLGregorianCalendar value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the attachmentHashValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentHashValue() {
        return attachmentHashValue;
    }

    /**
     * Sets the value of the attachmentHashValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentHashValue(String value) {
        this.attachmentHashValue = value;
    }

    /**
     * Gets the value of the attachmentHashType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUHASHTYPE }
     *     
     */
    public OLILUHASHTYPE getAttachmentHashType() {
        return attachmentHashType;
    }

    /**
     * Sets the value of the attachmentHashType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUHASHTYPE }
     *     
     */
    public void setAttachmentHashType(OLILUHASHTYPE value) {
        this.attachmentHashType = value;
    }

    /**
     * Gets the value of the originatingSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link OLILUORIGSOURCE }
     *     
     */
    public OLILUORIGSOURCE getOriginatingSourceType() {
        return originatingSourceType;
    }

    /**
     * Sets the value of the originatingSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLILUORIGSOURCE }
     *     
     */
    public void setOriginatingSourceType(OLILUORIGSOURCE value) {
        this.originatingSourceType = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageCount(BigInteger value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the signatureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureInfoType }
     * 
     * 
     */
    public List<SignatureInfoType> getSignatureInfo() {
        if (signatureInfo == null) {
            signatureInfo = new ArrayList<SignatureInfoType>();
        }
        return this.signatureInfo;
    }

    /**
     * Gets the value of the attachmentAnomaly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentAnomaly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentAnomaly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentAnomalyType }
     * 
     * 
     */
    public List<AttachmentAnomalyType> getAttachmentAnomaly() {
        if (attachmentAnomaly == null) {
            attachmentAnomaly = new ArrayList<AttachmentAnomalyType>();
        }
        return this.attachmentAnomaly;
    }

    /**
     * Gets the value of the attachmentMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentMarkType }
     * 
     * 
     */
    public List<AttachmentMarkType> getAttachmentMark() {
        if (attachmentMark == null) {
            attachmentMark = new ArrayList<AttachmentMarkType>();
        }
        return this.attachmentMark;
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
