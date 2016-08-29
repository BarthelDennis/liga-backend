
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
 *         &lt;element name="GetAvailLeaguesBySportsResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfLeague" minOccurs="0"/&gt;
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
    "getAvailLeaguesBySportsResult"
})
@XmlRootElement(name = "GetAvailLeaguesBySportsResponse")
public class GetAvailLeaguesBySportsResponse {

    @XmlElement(name = "GetAvailLeaguesBySportsResult")
    protected ArrayOfLeague getAvailLeaguesBySportsResult;

    /**
     * Ruft den Wert der getAvailLeaguesBySportsResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeague }
     *     
     */
    public ArrayOfLeague getGetAvailLeaguesBySportsResult() {
        return getAvailLeaguesBySportsResult;
    }

    /**
     * Legt den Wert der getAvailLeaguesBySportsResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeague }
     *     
     */
    public void setGetAvailLeaguesBySportsResult(ArrayOfLeague value) {
        this.getAvailLeaguesBySportsResult = value;
    }

}
