
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
 *         &lt;element name="GetLastMatchByLeagueTeamResult" type="{http://msiggi.de/Sportsdata/Webservices}Matchdata"/&gt;
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
    "getLastMatchByLeagueTeamResult"
})
@XmlRootElement(name = "GetLastMatchByLeagueTeamResponse")
public class GetLastMatchByLeagueTeamResponse {

    @XmlElement(name = "GetLastMatchByLeagueTeamResult", required = true)
    protected Matchdata getLastMatchByLeagueTeamResult;

    /**
     * Ruft den Wert der getLastMatchByLeagueTeamResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Matchdata }
     *     
     */
    public Matchdata getGetLastMatchByLeagueTeamResult() {
        return getLastMatchByLeagueTeamResult;
    }

    /**
     * Legt den Wert der getLastMatchByLeagueTeamResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Matchdata }
     *     
     */
    public void setGetLastMatchByLeagueTeamResult(Matchdata value) {
        this.getLastMatchByLeagueTeamResult = value;
    }

}
