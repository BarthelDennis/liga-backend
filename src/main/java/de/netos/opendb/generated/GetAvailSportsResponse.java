
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
 *         &lt;element name="GetAvailSportsResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfSport" minOccurs="0"/&gt;
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
    "getAvailSportsResult"
})
@XmlRootElement(name = "GetAvailSportsResponse")
public class GetAvailSportsResponse {

    @XmlElement(name = "GetAvailSportsResult")
    protected ArrayOfSport getAvailSportsResult;

    /**
     * Ruft den Wert der getAvailSportsResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSport }
     *     
     */
    public ArrayOfSport getGetAvailSportsResult() {
        return getAvailSportsResult;
    }

    /**
     * Legt den Wert der getAvailSportsResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSport }
     *     
     */
    public void setGetAvailSportsResult(ArrayOfSport value) {
        this.getAvailSportsResult = value;
    }

}
