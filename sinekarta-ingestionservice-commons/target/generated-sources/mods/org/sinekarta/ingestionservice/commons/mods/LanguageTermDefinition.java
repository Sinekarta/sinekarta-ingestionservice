//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.03.13 alle 07:51:13 PM CET 
//


package org.sinekarta.ingestionservice.commons.mods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per languageTermDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="languageTermDefinition"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3&gt;stringPlusLanguage"&gt;
 *       &lt;attribute name="authorityURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="valueURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="authority"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="rfc3066"/&gt;
 *             &lt;enumeration value="iso639-2b"/&gt;
 *             &lt;enumeration value="iso639-3"/&gt;
 *             &lt;enumeration value="rfc4646"/&gt;
 *             &lt;enumeration value="rfc5646"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="type" type="{http://www.loc.gov/mods/v3}codeOrText" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "languageTermDefinition")
public class LanguageTermDefinition
    extends StringPlusLanguage
{

    @XmlAttribute(name = "authorityURI")
    @XmlSchemaType(name = "anyURI")
    protected String authorityURI;
    @XmlAttribute(name = "valueURI")
    @XmlSchemaType(name = "anyURI")
    protected String valueURI;
    @XmlAttribute(name = "authority")
    protected String authority;
    @XmlAttribute(name = "type")
    protected CodeOrText languageTermDefinitionType;

    /**
     * Recupera il valore della proprietà authorityURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityURI() {
        return authorityURI;
    }

    /**
     * Imposta il valore della proprietà authorityURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityURI(String value) {
        this.authorityURI = value;
    }

    /**
     * Recupera il valore della proprietà valueURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueURI() {
        return valueURI;
    }

    /**
     * Imposta il valore della proprietà valueURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueURI(String value) {
        this.valueURI = value;
    }

    /**
     * Recupera il valore della proprietà authority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Imposta il valore della proprietà authority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Recupera il valore della proprietà languageTermDefinitionType.
     * 
     * @return
     *     possible object is
     *     {@link CodeOrText }
     *     
     */
    public CodeOrText getLanguageTermDefinitionType() {
        return languageTermDefinitionType;
    }

    /**
     * Imposta il valore della proprietà languageTermDefinitionType.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeOrText }
     *     
     */
    public void setLanguageTermDefinitionType(CodeOrText value) {
        this.languageTermDefinitionType = value;
    }

}
