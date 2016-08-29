
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Spieltag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Liga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Saison" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Userkennung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "spieltag",
    "liga",
    "saison",
    "userkennung"
})
@XmlRootElement(name = "GetFusballdaten")
public class GetFusballdaten {

    @XmlElement(name = "Spieltag")
    protected int spieltag;
    @XmlElement(name = "Liga")
    protected String liga;
    @XmlElement(name = "Saison")
    protected int saison;
    @XmlElement(name = "Userkennung")
    protected String userkennung;

    /**
     * Ruft den Wert der spieltag-Eigenschaft ab.
     * 
     */
    public int getSpieltag() {
        return spieltag;
    }

    /**
     * Legt den Wert der spieltag-Eigenschaft fest.
     * 
     */
    public void setSpieltag(int value) {
        this.spieltag = value;
    }

    /**
     * Ruft den Wert der liga-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiga() {
        return liga;
    }

    /**
     * Legt den Wert der liga-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiga(String value) {
        this.liga = value;
    }

    /**
     * Ruft den Wert der saison-Eigenschaft ab.
     * 
     */
    public int getSaison() {
        return saison;
    }

    /**
     * Legt den Wert der saison-Eigenschaft fest.
     * 
     */
    public void setSaison(int value) {
        this.saison = value;
    }

    /**
     * Ruft den Wert der userkennung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserkennung() {
        return userkennung;
    }

    /**
     * Legt den Wert der userkennung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserkennung(String value) {
        this.userkennung = value;
    }

}
