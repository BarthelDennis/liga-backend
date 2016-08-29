
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für League complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="League"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leagueID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="leagueSportID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="leagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leagueShortcut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leagueSaison" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "League", propOrder = {
    "leagueID",
    "leagueSportID",
    "leagueName",
    "leagueShortcut",
    "leagueSaison"
})
public class League {

    protected int leagueID;
    protected int leagueSportID;
    protected String leagueName;
    protected String leagueShortcut;
    protected String leagueSaison;

    /**
     * Ruft den Wert der leagueID-Eigenschaft ab.
     * 
     */
    public int getLeagueID() {
        return leagueID;
    }

    /**
     * Legt den Wert der leagueID-Eigenschaft fest.
     * 
     */
    public void setLeagueID(int value) {
        this.leagueID = value;
    }

    /**
     * Ruft den Wert der leagueSportID-Eigenschaft ab.
     * 
     */
    public int getLeagueSportID() {
        return leagueSportID;
    }

    /**
     * Legt den Wert der leagueSportID-Eigenschaft fest.
     * 
     */
    public void setLeagueSportID(int value) {
        this.leagueSportID = value;
    }

    /**
     * Ruft den Wert der leagueName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueName() {
        return leagueName;
    }

    /**
     * Legt den Wert der leagueName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueName(String value) {
        this.leagueName = value;
    }

    /**
     * Ruft den Wert der leagueShortcut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueShortcut() {
        return leagueShortcut;
    }

    /**
     * Legt den Wert der leagueShortcut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueShortcut(String value) {
        this.leagueShortcut = value;
    }

    /**
     * Ruft den Wert der leagueSaison-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueSaison() {
        return leagueSaison;
    }

    /**
     * Legt den Wert der leagueSaison-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueSaison(String value) {
        this.leagueSaison = value;
    }

}
