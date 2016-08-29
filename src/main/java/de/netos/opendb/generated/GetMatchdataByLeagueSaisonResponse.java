
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
 *         &lt;element name="GetMatchdataByLeagueSaisonResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfMatchdata" minOccurs="0"/&gt;
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
    "getMatchdataByLeagueSaisonResult"
})
@XmlRootElement(name = "GetMatchdataByLeagueSaisonResponse")
public class GetMatchdataByLeagueSaisonResponse {

    @XmlElement(name = "GetMatchdataByLeagueSaisonResult")
    protected ArrayOfMatchdata getMatchdataByLeagueSaisonResult;

    /**
     * Ruft den Wert der getMatchdataByLeagueSaisonResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchdata }
     *     
     */
    public ArrayOfMatchdata getGetMatchdataByLeagueSaisonResult() {
        return getMatchdataByLeagueSaisonResult;
    }

    /**
     * Legt den Wert der getMatchdataByLeagueSaisonResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchdata }
     *     
     */
    public void setGetMatchdataByLeagueSaisonResult(ArrayOfMatchdata value) {
        this.getMatchdataByLeagueSaisonResult = value;
    }

}
