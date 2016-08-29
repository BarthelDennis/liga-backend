
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
 *         &lt;element name="GetGoalGettersByLeagueSaisonResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfGoalGetter" minOccurs="0"/&gt;
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
    "getGoalGettersByLeagueSaisonResult"
})
@XmlRootElement(name = "GetGoalGettersByLeagueSaisonResponse")
public class GetGoalGettersByLeagueSaisonResponse {

    @XmlElement(name = "GetGoalGettersByLeagueSaisonResult")
    protected ArrayOfGoalGetter getGoalGettersByLeagueSaisonResult;

    /**
     * Ruft den Wert der getGoalGettersByLeagueSaisonResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoalGetter }
     *     
     */
    public ArrayOfGoalGetter getGetGoalGettersByLeagueSaisonResult() {
        return getGoalGettersByLeagueSaisonResult;
    }

    /**
     * Legt den Wert der getGoalGettersByLeagueSaisonResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoalGetter }
     *     
     */
    public void setGetGoalGettersByLeagueSaisonResult(ArrayOfGoalGetter value) {
        this.getGoalGettersByLeagueSaisonResult = value;
    }

}
