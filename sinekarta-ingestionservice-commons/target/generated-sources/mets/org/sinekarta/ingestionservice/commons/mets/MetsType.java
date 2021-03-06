//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.13 alle 07:51:10 PM CET 
//


package org.sinekarta.ingestionservice.commons.mets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * metsType: Complex Type for METS Sections
 * 			A METS document consists of seven possible subsidiary sections: metsHdr (METS document header), dmdSec (descriptive metadata section), amdSec (administrative metadata section), fileGrp (file inventory group), structLink (structural map linking), structMap (structural map) and behaviorSec (behaviors section).
 * 			
 * 
 * <p>Classe Java per metsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="metsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metsHdr" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="agent" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                           &lt;attribute name="ROLE" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="CREATOR"/&gt;
 *                                 &lt;enumeration value="EDITOR"/&gt;
 *                                 &lt;enumeration value="ARCHIVIST"/&gt;
 *                                 &lt;enumeration value="PRESERVATION"/&gt;
 *                                 &lt;enumeration value="DISSEMINATOR"/&gt;
 *                                 &lt;enumeration value="CUSTODIAN"/&gt;
 *                                 &lt;enumeration value="IPOWNER"/&gt;
 *                                 &lt;enumeration value="OTHER"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="OTHERROLE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="TYPE"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="INDIVIDUAL"/&gt;
 *                                 &lt;enumeration value="ORGANIZATION"/&gt;
 *                                 &lt;enumeration value="OTHER"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="OTHERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="altRecordID" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="metsDocumentID" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *                 &lt;attribute name="CREATEDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="LASTMODDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmdSec" type="{http://www.loc.gov/METS/}mdSecType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amdSec" type="{http://www.loc.gov/METS/}amdSecType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileSec" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fileGrp" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.loc.gov/METS/}fileGrpType"&gt;
 *                           &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="structMap" type="{http://www.loc.gov/METS/}structMapType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="structLink" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.loc.gov/METS/}structLinkType"&gt;
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="behaviorSec" type="{http://www.loc.gov/METS/}behaviorSecType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="OBJID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PROFILE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metsType", propOrder = {
    "metsHdr",
    "dmdSec",
    "amdSec",
    "fileSec",
    "structMap",
    "structLink",
    "behaviorSec"
})
@XmlSeeAlso({
    Mets.class
})
public class MetsType {

    protected MetsType.MetsHdr metsHdr;
    protected List<MdSecType> dmdSec;
    protected List<AmdSecType> amdSec;
    protected MetsType.FileSec fileSec;
    @XmlElement(required = true)
    protected List<StructMapType> structMap;
    protected MetsType.StructLink structLink;
    protected List<BehaviorSecType> behaviorSec;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "OBJID")
    protected String objid;
    @XmlAttribute(name = "LABEL")
    protected String metsTypeLabel;
    @XmlAttribute(name = "TYPE")
    protected String type;
    @XmlAttribute(name = "PROFILE")
    protected String profile;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà metsHdr.
     * 
     * @return
     *     possible object is
     *     {@link MetsType.MetsHdr }
     *     
     */
    public MetsType.MetsHdr getMetsHdr() {
        return metsHdr;
    }

    /**
     * Imposta il valore della proprietà metsHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link MetsType.MetsHdr }
     *     
     */
    public void setMetsHdr(MetsType.MetsHdr value) {
        this.metsHdr = value;
    }

    /**
     * Gets the value of the dmdSec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmdSec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmdSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MdSecType }
     * 
     * 
     */
    public List<MdSecType> getDmdSec() {
        if (dmdSec == null) {
            dmdSec = new ArrayList<MdSecType>();
        }
        return this.dmdSec;
    }

    /**
     * Gets the value of the amdSec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amdSec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmdSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmdSecType }
     * 
     * 
     */
    public List<AmdSecType> getAmdSec() {
        if (amdSec == null) {
            amdSec = new ArrayList<AmdSecType>();
        }
        return this.amdSec;
    }

    /**
     * Recupera il valore della proprietà fileSec.
     * 
     * @return
     *     possible object is
     *     {@link MetsType.FileSec }
     *     
     */
    public MetsType.FileSec getFileSec() {
        return fileSec;
    }

    /**
     * Imposta il valore della proprietà fileSec.
     * 
     * @param value
     *     allowed object is
     *     {@link MetsType.FileSec }
     *     
     */
    public void setFileSec(MetsType.FileSec value) {
        this.fileSec = value;
    }

    /**
     * Gets the value of the structMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructMapType }
     * 
     * 
     */
    public List<StructMapType> getStructMap() {
        if (structMap == null) {
            structMap = new ArrayList<StructMapType>();
        }
        return this.structMap;
    }

    /**
     * Recupera il valore della proprietà structLink.
     * 
     * @return
     *     possible object is
     *     {@link MetsType.StructLink }
     *     
     */
    public MetsType.StructLink getStructLink() {
        return structLink;
    }

    /**
     * Imposta il valore della proprietà structLink.
     * 
     * @param value
     *     allowed object is
     *     {@link MetsType.StructLink }
     *     
     */
    public void setStructLink(MetsType.StructLink value) {
        this.structLink = value;
    }

    /**
     * Gets the value of the behaviorSec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the behaviorSec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBehaviorSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BehaviorSecType }
     * 
     * 
     */
    public List<BehaviorSecType> getBehaviorSec() {
        if (behaviorSec == null) {
            behaviorSec = new ArrayList<BehaviorSecType>();
        }
        return this.behaviorSec;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà objid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJID() {
        return objid;
    }

    /**
     * Imposta il valore della proprietà objid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJID(String value) {
        this.objid = value;
    }

    /**
     * Recupera il valore della proprietà metsTypeLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetsTypeLabel() {
        return metsTypeLabel;
    }

    /**
     * Imposta il valore della proprietà metsTypeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetsTypeLabel(String value) {
        this.metsTypeLabel = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà profile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFILE() {
        return profile;
    }

    /**
     * Imposta il valore della proprietà profile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFILE(String value) {
        this.profile = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="fileGrp" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.loc.gov/METS/}fileGrpType"&gt;
     *                 &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileGrp"
    })
    public static class FileSec {

        @XmlElement(required = true)
        protected List<MetsType.FileSec.FileGrp> fileGrp;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the fileGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fileGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFileGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetsType.FileSec.FileGrp }
         * 
         * 
         */
        public List<MetsType.FileSec.FileGrp> getFileGrp() {
            if (fileGrp == null) {
                fileGrp = new ArrayList<MetsType.FileSec.FileGrp>();
            }
            return this.fileGrp;
        }

        /**
         * Recupera il valore della proprietà id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Imposta il valore della proprietà id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.loc.gov/METS/}fileGrpType"&gt;
         *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FileGrp
            extends FileGrpType
        {


        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="agent" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *                 &lt;attribute name="ROLE" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="CREATOR"/&gt;
     *                       &lt;enumeration value="EDITOR"/&gt;
     *                       &lt;enumeration value="ARCHIVIST"/&gt;
     *                       &lt;enumeration value="PRESERVATION"/&gt;
     *                       &lt;enumeration value="DISSEMINATOR"/&gt;
     *                       &lt;enumeration value="CUSTODIAN"/&gt;
     *                       &lt;enumeration value="IPOWNER"/&gt;
     *                       &lt;enumeration value="OTHER"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="OTHERROLE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="TYPE"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="INDIVIDUAL"/&gt;
     *                       &lt;enumeration value="ORGANIZATION"/&gt;
     *                       &lt;enumeration value="OTHER"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="OTHERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="altRecordID" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="metsDocumentID" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
     *       &lt;attribute name="CREATEDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="LASTMODDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "agent",
        "altRecordID",
        "metsDocumentID"
    })
    public static class MetsHdr {

        protected List<MetsType.MetsHdr.Agent> agent;
        protected List<MetsType.MetsHdr.AltRecordID> altRecordID;
        protected MetsType.MetsHdr.MetsDocumentID metsDocumentID;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "ADMID")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> admid;
        @XmlAttribute(name = "CREATEDATE")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdate;
        @XmlAttribute(name = "LASTMODDATE")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastmoddate;
        @XmlAttribute(name = "RECORDSTATUS")
        protected String recordstatus;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the agent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetsType.MetsHdr.Agent }
         * 
         * 
         */
        public List<MetsType.MetsHdr.Agent> getAgent() {
            if (agent == null) {
                agent = new ArrayList<MetsType.MetsHdr.Agent>();
            }
            return this.agent;
        }

        /**
         * Gets the value of the altRecordID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the altRecordID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAltRecordID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetsType.MetsHdr.AltRecordID }
         * 
         * 
         */
        public List<MetsType.MetsHdr.AltRecordID> getAltRecordID() {
            if (altRecordID == null) {
                altRecordID = new ArrayList<MetsType.MetsHdr.AltRecordID>();
            }
            return this.altRecordID;
        }

        /**
         * Recupera il valore della proprietà metsDocumentID.
         * 
         * @return
         *     possible object is
         *     {@link MetsType.MetsHdr.MetsDocumentID }
         *     
         */
        public MetsType.MetsHdr.MetsDocumentID getMetsDocumentID() {
            return metsDocumentID;
        }

        /**
         * Imposta il valore della proprietà metsDocumentID.
         * 
         * @param value
         *     allowed object is
         *     {@link MetsType.MetsHdr.MetsDocumentID }
         *     
         */
        public void setMetsDocumentID(MetsType.MetsHdr.MetsDocumentID value) {
            this.metsDocumentID = value;
        }

        /**
         * Recupera il valore della proprietà id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Imposta il valore della proprietà id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the admid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the admid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADMID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getADMID() {
            if (admid == null) {
                admid = new ArrayList<Object>();
            }
            return this.admid;
        }

        /**
         * Recupera il valore della proprietà createdate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCREATEDATE() {
            return createdate;
        }

        /**
         * Imposta il valore della proprietà createdate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCREATEDATE(XMLGregorianCalendar value) {
            this.createdate = value;
        }

        /**
         * Recupera il valore della proprietà lastmoddate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLASTMODDATE() {
            return lastmoddate;
        }

        /**
         * Imposta il valore della proprietà lastmoddate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLASTMODDATE(XMLGregorianCalendar value) {
            this.lastmoddate = value;
        }

        /**
         * Recupera il valore della proprietà recordstatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECORDSTATUS() {
            return recordstatus;
        }

        /**
         * Imposta il valore della proprietà recordstatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECORDSTATUS(String value) {
            this.recordstatus = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *       &lt;attribute name="ROLE" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="CREATOR"/&gt;
         *             &lt;enumeration value="EDITOR"/&gt;
         *             &lt;enumeration value="ARCHIVIST"/&gt;
         *             &lt;enumeration value="PRESERVATION"/&gt;
         *             &lt;enumeration value="DISSEMINATOR"/&gt;
         *             &lt;enumeration value="CUSTODIAN"/&gt;
         *             &lt;enumeration value="IPOWNER"/&gt;
         *             &lt;enumeration value="OTHER"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="OTHERROLE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="TYPE"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="INDIVIDUAL"/&gt;
         *             &lt;enumeration value="ORGANIZATION"/&gt;
         *             &lt;enumeration value="OTHER"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="OTHERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "note"
        })
        public static class Agent {

            @XmlElement(required = true)
            protected String name;
            protected List<String> note;
            @XmlAttribute(name = "ID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "ROLE", required = true)
            protected String role;
            @XmlAttribute(name = "OTHERROLE")
            protected String otherrole;
            @XmlAttribute(name = "TYPE")
            protected String type;
            @XmlAttribute(name = "OTHERTYPE")
            protected String othertype;

            /**
             * Recupera il valore della proprietà name.
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
             * Imposta il valore della proprietà name.
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
             * Gets the value of the note property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the note property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNote().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getNote() {
                if (note == null) {
                    note = new ArrayList<String>();
                }
                return this.note;
            }

            /**
             * Recupera il valore della proprietà id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Imposta il valore della proprietà id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Recupera il valore della proprietà role.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getROLE() {
                return role;
            }

            /**
             * Imposta il valore della proprietà role.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setROLE(String value) {
                this.role = value;
            }

            /**
             * Recupera il valore della proprietà otherrole.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOTHERROLE() {
                return otherrole;
            }

            /**
             * Imposta il valore della proprietà otherrole.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOTHERROLE(String value) {
                this.otherrole = value;
            }

            /**
             * Recupera il valore della proprietà type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Imposta il valore della proprietà type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Recupera il valore della proprietà othertype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOTHERTYPE() {
                return othertype;
            }

            /**
             * Imposta il valore della proprietà othertype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOTHERTYPE(String value) {
                this.othertype = value;
            }

        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AltRecordID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "ID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "TYPE")
            protected String type;

            /**
             * Recupera il valore della proprietà value.
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
             * Imposta il valore della proprietà value.
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
             * Recupera il valore della proprietà id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Imposta il valore della proprietà id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Recupera il valore della proprietà type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Imposta il valore della proprietà type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class MetsDocumentID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "ID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "TYPE")
            protected String type;

            /**
             * Recupera il valore della proprietà value.
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
             * Imposta il valore della proprietà value.
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
             * Recupera il valore della proprietà id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Imposta il valore della proprietà id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Recupera il valore della proprietà type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Imposta il valore della proprietà type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.loc.gov/METS/}structLinkType"&gt;
     *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StructLink
        extends StructLinkType
    {


    }

}
