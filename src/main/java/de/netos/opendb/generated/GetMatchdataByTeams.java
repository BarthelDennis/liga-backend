
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
 *         &lt;element name="teamID1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="teamID2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "teamID1",
    "teamID2"
})
@XmlRootElement(name = "GetMatchdataByTeams")
public class GetMatchdataByTeams {

    protected int teamID1;
    protected int teamID2;

    /**
     * Ruft den Wert der teamID1-Eigenschaft ab.
     * 
     */
    public int getTeamID1() {
        return teamID1;
    }

    /**
     * Legt den Wert der teamID1-Eigenschaft fest.
     * 
     */
    public void setTeamID1(int value) {
        this.teamID1 = value;
    }

    /**
     * Ruft den Wert der teamID2-Eigenschaft ab.
     * 
     */
    public int getTeamID2() {
        return teamID2;
    }

    /**
     * Legt den Wert der teamID2-Eigenschaft fest.
     * 
     */
    public void setTeamID2(int value) {
        this.teamID2 = value;
    }

}
