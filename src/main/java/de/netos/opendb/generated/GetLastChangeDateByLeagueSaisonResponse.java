
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="GetLastChangeDateByLeagueSaisonResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "getLastChangeDateByLeagueSaisonResult"
})
@XmlRootElement(name = "GetLastChangeDateByLeagueSaisonResponse")
public class GetLastChangeDateByLeagueSaisonResponse {

    @XmlElement(name = "GetLastChangeDateByLeagueSaisonResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getLastChangeDateByLeagueSaisonResult;

    /**
     * Ruft den Wert der getLastChangeDateByLeagueSaisonResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGetLastChangeDateByLeagueSaisonResult() {
        return getLastChangeDateByLeagueSaisonResult;
    }

    /**
     * Legt den Wert der getLastChangeDateByLeagueSaisonResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGetLastChangeDateByLeagueSaisonResult(XMLGregorianCalendar value) {
        this.getLastChangeDateByLeagueSaisonResult = value;
    }

}
