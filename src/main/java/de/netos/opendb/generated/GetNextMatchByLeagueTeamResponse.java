
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
 *         &lt;element name="GetNextMatchByLeagueTeamResult" type="{http://msiggi.de/Sportsdata/Webservices}Matchdata"/&gt;
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
    "getNextMatchByLeagueTeamResult"
})
@XmlRootElement(name = "GetNextMatchByLeagueTeamResponse")
public class GetNextMatchByLeagueTeamResponse {

    @XmlElement(name = "GetNextMatchByLeagueTeamResult", required = true)
    protected Matchdata getNextMatchByLeagueTeamResult;

    /**
     * Ruft den Wert der getNextMatchByLeagueTeamResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Matchdata }
     *     
     */
    public Matchdata getGetNextMatchByLeagueTeamResult() {
        return getNextMatchByLeagueTeamResult;
    }

    /**
     * Legt den Wert der getNextMatchByLeagueTeamResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Matchdata }
     *     
     */
    public void setGetNextMatchByLeagueTeamResult(Matchdata value) {
        this.getNextMatchByLeagueTeamResult = value;
    }

}
