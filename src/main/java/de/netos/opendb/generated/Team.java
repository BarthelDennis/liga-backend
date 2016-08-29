
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Team complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Team"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="teamID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="teamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teamIconURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Team", propOrder = {
    "teamID",
    "teamName",
    "teamIconURL"
})
public class Team {

    protected int teamID;
    protected String teamName;
    protected String teamIconURL;

    /**
     * Ruft den Wert der teamID-Eigenschaft ab.
     * 
     */
    public int getTeamID() {
        return teamID;
    }

    /**
     * Legt den Wert der teamID-Eigenschaft fest.
     * 
     */
    public void setTeamID(int value) {
        this.teamID = value;
    }

    /**
     * Ruft den Wert der teamName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Legt den Wert der teamName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Ruft den Wert der teamIconURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamIconURL() {
        return teamIconURL;
    }

    /**
     * Legt den Wert der teamIconURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamIconURL(String value) {
        this.teamIconURL = value;
    }

}
