
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
 *         &lt;element name="GetAvailGroupsResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfGroup" minOccurs="0"/&gt;
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
    "getAvailGroupsResult"
})
@XmlRootElement(name = "GetAvailGroupsResponse")
public class GetAvailGroupsResponse {

    @XmlElement(name = "GetAvailGroupsResult")
    protected ArrayOfGroup getAvailGroupsResult;

    /**
     * Ruft den Wert der getAvailGroupsResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getGetAvailGroupsResult() {
        return getAvailGroupsResult;
    }

    /**
     * Legt den Wert der getAvailGroupsResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setGetAvailGroupsResult(ArrayOfGroup value) {
        this.getAvailGroupsResult = value;
    }

}
