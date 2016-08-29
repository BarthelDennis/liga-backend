
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
 *         &lt;element name="GetFusballdatenResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfFussballdaten" minOccurs="0"/&gt;
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
    "getFusballdatenResult"
})
@XmlRootElement(name = "GetFusballdatenResponse")
public class GetFusballdatenResponse {

    @XmlElement(name = "GetFusballdatenResult")
    protected ArrayOfFussballdaten getFusballdatenResult;

    /**
     * Ruft den Wert der getFusballdatenResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFussballdaten }
     *     
     */
    public ArrayOfFussballdaten getGetFusballdatenResult() {
        return getFusballdatenResult;
    }

    /**
     * Legt den Wert der getFusballdatenResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFussballdaten }
     *     
     */
    public void setGetFusballdatenResult(ArrayOfFussballdaten value) {
        this.getFusballdatenResult = value;
    }

}
