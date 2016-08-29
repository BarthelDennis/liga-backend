
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für GoalGetter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GoalGetter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="goalGetterID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="goalGetterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goalGetterNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goalGetterBirthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="goalGetterGoalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoalGetter", propOrder = {
    "goalGetterID",
    "goalGetterName",
    "goalGetterNationality",
    "goalGetterBirthday",
    "goalGetterGoalCount"
})
public class GoalGetter {

    protected int goalGetterID;
    protected String goalGetterName;
    protected String goalGetterNationality;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar goalGetterBirthday;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goalGetterGoalCount;

    /**
     * Ruft den Wert der goalGetterID-Eigenschaft ab.
     * 
     */
    public int getGoalGetterID() {
        return goalGetterID;
    }

    /**
     * Legt den Wert der goalGetterID-Eigenschaft fest.
     * 
     */
    public void setGoalGetterID(int value) {
        this.goalGetterID = value;
    }

    /**
     * Ruft den Wert der goalGetterName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalGetterName() {
        return goalGetterName;
    }

    /**
     * Legt den Wert der goalGetterName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalGetterName(String value) {
        this.goalGetterName = value;
    }

    /**
     * Ruft den Wert der goalGetterNationality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalGetterNationality() {
        return goalGetterNationality;
    }

    /**
     * Legt den Wert der goalGetterNationality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalGetterNationality(String value) {
        this.goalGetterNationality = value;
    }

    /**
     * Ruft den Wert der goalGetterBirthday-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGoalGetterBirthday() {
        return goalGetterBirthday;
    }

    /**
     * Legt den Wert der goalGetterBirthday-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGoalGetterBirthday(XMLGregorianCalendar value) {
        this.goalGetterBirthday = value;
    }

    /**
     * Ruft den Wert der goalGetterGoalCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalGetterGoalCount() {
        return goalGetterGoalCount;
    }

    /**
     * Legt den Wert der goalGetterGoalCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalGetterGoalCount(Integer value) {
        this.goalGetterGoalCount = value;
    }

}
