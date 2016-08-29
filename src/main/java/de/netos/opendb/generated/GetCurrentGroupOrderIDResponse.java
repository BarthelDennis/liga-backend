
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
 *         &lt;element name="GetCurrentGroupOrderIDResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "getCurrentGroupOrderIDResult"
})
@XmlRootElement(name = "GetCurrentGroupOrderIDResponse")
public class GetCurrentGroupOrderIDResponse {

    @XmlElement(name = "GetCurrentGroupOrderIDResult")
    protected int getCurrentGroupOrderIDResult;

    /**
     * Ruft den Wert der getCurrentGroupOrderIDResult-Eigenschaft ab.
     * 
     */
    public int getGetCurrentGroupOrderIDResult() {
        return getCurrentGroupOrderIDResult;
    }

    /**
     * Legt den Wert der getCurrentGroupOrderIDResult-Eigenschaft fest.
     * 
     */
    public void setGetCurrentGroupOrderIDResult(int value) {
        this.getCurrentGroupOrderIDResult = value;
    }

}
