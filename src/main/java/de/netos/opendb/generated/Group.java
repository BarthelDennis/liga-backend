
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Group complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupOrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "groupName",
    "groupOrderID",
    "groupID"
})
public class Group {

    protected String groupName;
    protected int groupOrderID;
    protected int groupID;

    /**
     * Ruft den Wert der groupName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Legt den Wert der groupName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Ruft den Wert der groupOrderID-Eigenschaft ab.
     * 
     */
    public int getGroupOrderID() {
        return groupOrderID;
    }

    /**
     * Legt den Wert der groupOrderID-Eigenschaft fest.
     * 
     */
    public void setGroupOrderID(int value) {
        this.groupOrderID = value;
    }

    /**
     * Ruft den Wert der groupID-Eigenschaft ab.
     * 
     */
    public int getGroupID() {
        return groupID;
    }

    /**
     * Legt den Wert der groupID-Eigenschaft fest.
     * 
     */
    public void setGroupID(int value) {
        this.groupID = value;
    }

}
