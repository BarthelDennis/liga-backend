
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
 *         &lt;element name="GetMatchdataByGroupLeagueSaisonResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfMatchdata" minOccurs="0"/&gt;
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
    "getMatchdataByGroupLeagueSaisonResult"
})
@XmlRootElement(name = "GetMatchdataByGroupLeagueSaisonResponse")
public class GetMatchdataByGroupLeagueSaisonResponse {

    @XmlElement(name = "GetMatchdataByGroupLeagueSaisonResult")
    protected ArrayOfMatchdata getMatchdataByGroupLeagueSaisonResult;

    /**
     * Ruft den Wert der getMatchdataByGroupLeagueSaisonResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchdata }
     *     
     */
    public ArrayOfMatchdata getGetMatchdataByGroupLeagueSaisonResult() {
        return getMatchdataByGroupLeagueSaisonResult;
    }

    /**
     * Legt den Wert der getMatchdataByGroupLeagueSaisonResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchdata }
     *     
     */
    public void setGetMatchdataByGroupLeagueSaisonResult(ArrayOfMatchdata value) {
        this.getMatchdataByGroupLeagueSaisonResult = value;
    }

}
