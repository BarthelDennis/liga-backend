
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
 *         &lt;element name="GetGoalsByLeagueSaisonResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfGoal" minOccurs="0"/&gt;
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
    "getGoalsByLeagueSaisonResult"
})
@XmlRootElement(name = "GetGoalsByLeagueSaisonResponse")
public class GetGoalsByLeagueSaisonResponse {

    @XmlElement(name = "GetGoalsByLeagueSaisonResult")
    protected ArrayOfGoal getGoalsByLeagueSaisonResult;

    /**
     * Ruft den Wert der getGoalsByLeagueSaisonResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoal }
     *     
     */
    public ArrayOfGoal getGetGoalsByLeagueSaisonResult() {
        return getGoalsByLeagueSaisonResult;
    }

    /**
     * Legt den Wert der getGoalsByLeagueSaisonResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoal }
     *     
     */
    public void setGetGoalsByLeagueSaisonResult(ArrayOfGoal value) {
        this.getGoalsByLeagueSaisonResult = value;
    }

}
