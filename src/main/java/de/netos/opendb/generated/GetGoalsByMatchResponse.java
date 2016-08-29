
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
 *         &lt;element name="GetGoalsByMatchResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfGoal" minOccurs="0"/&gt;
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
    "getGoalsByMatchResult"
})
@XmlRootElement(name = "GetGoalsByMatchResponse")
public class GetGoalsByMatchResponse {

    @XmlElement(name = "GetGoalsByMatchResult")
    protected ArrayOfGoal getGoalsByMatchResult;

    /**
     * Ruft den Wert der getGoalsByMatchResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoal }
     *     
     */
    public ArrayOfGoal getGetGoalsByMatchResult() {
        return getGoalsByMatchResult;
    }

    /**
     * Legt den Wert der getGoalsByMatchResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoal }
     *     
     */
    public void setGetGoalsByMatchResult(ArrayOfGoal value) {
        this.getGoalsByMatchResult = value;
    }

}
