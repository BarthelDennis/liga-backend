
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Location complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="locationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationStadium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "locationID",
    "locationCity",
    "locationStadium"
})
public class Location {

    protected int locationID;
    protected String locationCity;
    protected String locationStadium;

    /**
     * Ruft den Wert der locationID-Eigenschaft ab.
     * 
     */
    public int getLocationID() {
        return locationID;
    }

    /**
     * Legt den Wert der locationID-Eigenschaft fest.
     * 
     */
    public void setLocationID(int value) {
        this.locationID = value;
    }

    /**
     * Ruft den Wert der locationCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCity() {
        return locationCity;
    }

    /**
     * Legt den Wert der locationCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCity(String value) {
        this.locationCity = value;
    }

    /**
     * Ruft den Wert der locationStadium-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationStadium() {
        return locationStadium;
    }

    /**
     * Legt den Wert der locationStadium-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationStadium(String value) {
        this.locationStadium = value;
    }

}
