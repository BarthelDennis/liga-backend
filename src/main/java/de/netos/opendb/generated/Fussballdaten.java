
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für Fussballdaten complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Fussballdaten"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpielID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Spieltag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Spieldatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Team1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Team2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErgebnisTeam1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErgebnisTeam2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fussballdaten", propOrder = {
    "spielID",
    "spieltag",
    "spieldatum",
    "team1",
    "team2",
    "ergebnisTeam1",
    "ergebnisTeam2",
    "lastUpdate"
})
public class Fussballdaten {

    @XmlElement(name = "SpielID")
    protected int spielID;
    @XmlElement(name = "Spieltag")
    protected int spieltag;
    @XmlElement(name = "Spieldatum", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar spieldatum;
    @XmlElement(name = "Team1")
    protected String team1;
    @XmlElement(name = "Team2")
    protected String team2;
    @XmlElement(name = "ErgebnisTeam1")
    protected int ergebnisTeam1;
    @XmlElement(name = "ErgebnisTeam2")
    protected int ergebnisTeam2;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;

    /**
     * Ruft den Wert der spielID-Eigenschaft ab.
     * 
     */
    public int getSpielID() {
        return spielID;
    }

    /**
     * Legt den Wert der spielID-Eigenschaft fest.
     * 
     */
    public void setSpielID(int value) {
        this.spielID = value;
    }

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
     * Ruft den Wert der spieldatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpieldatum() {
        return spieldatum;
    }

    /**
     * Legt den Wert der spieldatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpieldatum(XMLGregorianCalendar value) {
        this.spieldatum = value;
    }

    /**
     * Ruft den Wert der team1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam1() {
        return team1;
    }

    /**
     * Legt den Wert der team1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam1(String value) {
        this.team1 = value;
    }

    /**
     * Ruft den Wert der team2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam2() {
        return team2;
    }

    /**
     * Legt den Wert der team2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam2(String value) {
        this.team2 = value;
    }

    /**
     * Ruft den Wert der ergebnisTeam1-Eigenschaft ab.
     * 
     */
    public int getErgebnisTeam1() {
        return ergebnisTeam1;
    }

    /**
     * Legt den Wert der ergebnisTeam1-Eigenschaft fest.
     * 
     */
    public void setErgebnisTeam1(int value) {
        this.ergebnisTeam1 = value;
    }

    /**
     * Ruft den Wert der ergebnisTeam2-Eigenschaft ab.
     * 
     */
    public int getErgebnisTeam2() {
        return ergebnisTeam2;
    }

    /**
     * Legt den Wert der ergebnisTeam2-Eigenschaft fest.
     * 
     */
    public void setErgebnisTeam2(int value) {
        this.ergebnisTeam2 = value;
    }

    /**
     * Ruft den Wert der lastUpdate-Eigenschaft ab.
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
     * Legt den Wert der lastUpdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

}
