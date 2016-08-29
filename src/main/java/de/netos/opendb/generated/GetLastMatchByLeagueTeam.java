
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="leagueId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="teamId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "leagueId",
    "teamId"
})
@XmlRootElement(name = "GetLastMatchByLeagueTeam")
public class GetLastMatchByLeagueTeam {

    protected int leagueId;
    protected int teamId;

    /**
     * Ruft den Wert der leagueId-Eigenschaft ab.
     * 
     */
    public int getLeagueId() {
        return leagueId;
    }

    /**
     * Legt den Wert der leagueId-Eigenschaft fest.
     * 
     */
    public void setLeagueId(int value) {
        this.leagueId = value;
    }

    /**
     * Ruft den Wert der teamId-Eigenschaft ab.
     * 
     */
    public int getTeamId() {
        return teamId;
    }

    /**
     * Legt den Wert der teamId-Eigenschaft fest.
     * 
     */
    public void setTeamId(int value) {
        this.teamId = value;
    }

}
