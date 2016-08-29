
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
 *         &lt;element name="GetMatchByMatchIDResult" type="{http://msiggi.de/Sportsdata/Webservices}Matchdata"/&gt;
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
    "getMatchByMatchIDResult"
})
@XmlRootElement(name = "GetMatchByMatchIDResponse")
public class GetMatchByMatchIDResponse {

    @XmlElement(name = "GetMatchByMatchIDResult", required = true)
    protected Matchdata getMatchByMatchIDResult;

    /**
     * Ruft den Wert der getMatchByMatchIDResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Matchdata }
     *     
     */
    public Matchdata getGetMatchByMatchIDResult() {
        return getMatchByMatchIDResult;
    }

    /**
     * Legt den Wert der getMatchByMatchIDResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Matchdata }
     *     
     */
    public void setGetMatchByMatchIDResult(Matchdata value) {
        this.getMatchByMatchIDResult = value;
    }

}
