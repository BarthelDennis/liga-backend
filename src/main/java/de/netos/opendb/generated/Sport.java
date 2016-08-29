
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Sport complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Sport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sportsID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sportsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sport", propOrder = {
    "sportsID",
    "sportsName"
})
public class Sport {

    protected int sportsID;
    protected String sportsName;

    /**
     * Ruft den Wert der sportsID-Eigenschaft ab.
     * 
     */
    public int getSportsID() {
        return sportsID;
    }

    /**
     * Legt den Wert der sportsID-Eigenschaft fest.
     * 
     */
    public void setSportsID(int value) {
        this.sportsID = value;
    }

    /**
     * Ruft den Wert der sportsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportsName() {
        return sportsName;
    }

    /**
     * Legt den Wert der sportsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportsName(String value) {
        this.sportsName = value;
    }

}
