
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
 *         &lt;element name="GetMatchdataByGroupLeagueSaisonJSONResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getMatchdataByGroupLeagueSaisonJSONResult"
})
@XmlRootElement(name = "GetMatchdataByGroupLeagueSaisonJSONResponse")
public class GetMatchdataByGroupLeagueSaisonJSONResponse {

    @XmlElement(name = "GetMatchdataByGroupLeagueSaisonJSONResult")
    protected String getMatchdataByGroupLeagueSaisonJSONResult;

    /**
     * Ruft den Wert der getMatchdataByGroupLeagueSaisonJSONResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetMatchdataByGroupLeagueSaisonJSONResult() {
        return getMatchdataByGroupLeagueSaisonJSONResult;
    }

    /**
     * Legt den Wert der getMatchdataByGroupLeagueSaisonJSONResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetMatchdataByGroupLeagueSaisonJSONResult(String value) {
        this.getMatchdataByGroupLeagueSaisonJSONResult = value;
    }

}
