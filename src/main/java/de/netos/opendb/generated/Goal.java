
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Goal complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Goal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="goalID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="goalMachID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="goalScoreTeam1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="goalScoreTeam2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="goalMatchMinute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="goalGetterID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="goalGetterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goalPenalty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="goalOwnGoal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="goalOvertime" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="goalComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Goal", propOrder = {
    "goalID",
    "goalMachID",
    "goalScoreTeam1",
    "goalScoreTeam2",
    "goalMatchMinute",
    "goalGetterID",
    "goalGetterName",
    "goalPenalty",
    "goalOwnGoal",
    "goalOvertime",
    "goalComment"
})
public class Goal {

    protected int goalID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goalMachID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goalScoreTeam1;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goalScoreTeam2;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goalMatchMinute;
    protected int goalGetterID;
    protected String goalGetterName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean goalPenalty;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean goalOwnGoal;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean goalOvertime;
    protected String goalComment;

    /**
     * Ruft den Wert der goalID-Eigenschaft ab.
     * 
     */
    public int getGoalID() {
        return goalID;
    }

    /**
     * Legt den Wert der goalID-Eigenschaft fest.
     * 
     */
    public void setGoalID(int value) {
        this.goalID = value;
    }

    /**
     * Ruft den Wert der goalMachID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalMachID() {
        return goalMachID;
    }

    /**
     * Legt den Wert der goalMachID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalMachID(Integer value) {
        this.goalMachID = value;
    }

    /**
     * Ruft den Wert der goalScoreTeam1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalScoreTeam1() {
        return goalScoreTeam1;
    }

    /**
     * Legt den Wert der goalScoreTeam1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalScoreTeam1(Integer value) {
        this.goalScoreTeam1 = value;
    }

    /**
     * Ruft den Wert der goalScoreTeam2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalScoreTeam2() {
        return goalScoreTeam2;
    }

    /**
     * Legt den Wert der goalScoreTeam2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalScoreTeam2(Integer value) {
        this.goalScoreTeam2 = value;
    }

    /**
     * Ruft den Wert der goalMatchMinute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoalMatchMinute() {
        return goalMatchMinute;
    }

    /**
     * Legt den Wert der goalMatchMinute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoalMatchMinute(Integer value) {
        this.goalMatchMinute = value;
    }

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
     * Ruft den Wert der goalPenalty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoalPenalty() {
        return goalPenalty;
    }

    /**
     * Legt den Wert der goalPenalty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoalPenalty(Boolean value) {
        this.goalPenalty = value;
    }

    /**
     * Ruft den Wert der goalOwnGoal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoalOwnGoal() {
        return goalOwnGoal;
    }

    /**
     * Legt den Wert der goalOwnGoal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoalOwnGoal(Boolean value) {
        this.goalOwnGoal = value;
    }

    /**
     * Ruft den Wert der goalOvertime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoalOvertime() {
        return goalOvertime;
    }

    /**
     * Legt den Wert der goalOvertime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoalOvertime(Boolean value) {
        this.goalOvertime = value;
    }

    /**
     * Ruft den Wert der goalComment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalComment() {
        return goalComment;
    }

    /**
     * Legt den Wert der goalComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalComment(String value) {
        this.goalComment = value;
    }

}
