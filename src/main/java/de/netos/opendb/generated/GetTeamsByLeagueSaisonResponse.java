
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
 *         &lt;element name="GetTeamsByLeagueSaisonResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfTeam" minOccurs="0"/&gt;
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
    "getTeamsByLeagueSaisonResult"
})
@XmlRootElement(name = "GetTeamsByLeagueSaisonResponse")
public class GetTeamsByLeagueSaisonResponse {

    @XmlElement(name = "GetTeamsByLeagueSaisonResult")
    protected ArrayOfTeam getTeamsByLeagueSaisonResult;

    /**
     * Ruft den Wert der getTeamsByLeagueSaisonResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTeam }
     *     
     */
    public ArrayOfTeam getGetTeamsByLeagueSaisonResult() {
        return getTeamsByLeagueSaisonResult;
    }

    /**
     * Legt den Wert der getTeamsByLeagueSaisonResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTeam }
     *     
     */
    public void setGetTeamsByLeagueSaisonResult(ArrayOfTeam value) {
        this.getTeamsByLeagueSaisonResult = value;
    }

}
