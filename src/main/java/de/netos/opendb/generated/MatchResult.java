
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für matchResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="matchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsTeam1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pointsTeam2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resultOrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resultTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchResult", propOrder = {
    "resultName",
    "pointsTeam1",
    "pointsTeam2",
    "resultOrderID",
    "resultTypeName",
    "resultTypeId"
})
public class MatchResult {

    protected String resultName;
    protected int pointsTeam1;
    protected int pointsTeam2;
    protected int resultOrderID;
    protected String resultTypeName;
    protected int resultTypeId;

    /**
     * Ruft den Wert der resultName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultName() {
        return resultName;
    }

    /**
     * Legt den Wert der resultName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultName(String value) {
        this.resultName = value;
    }

    /**
     * Ruft den Wert der pointsTeam1-Eigenschaft ab.
     * 
     */
    public int getPointsTeam1() {
        return pointsTeam1;
    }

    /**
     * Legt den Wert der pointsTeam1-Eigenschaft fest.
     * 
     */
    public void setPointsTeam1(int value) {
        this.pointsTeam1 = value;
    }

    /**
     * Ruft den Wert der pointsTeam2-Eigenschaft ab.
     * 
     */
    public int getPointsTeam2() {
        return pointsTeam2;
    }

    /**
     * Legt den Wert der pointsTeam2-Eigenschaft fest.
     * 
     */
    public void setPointsTeam2(int value) {
        this.pointsTeam2 = value;
    }

    /**
     * Ruft den Wert der resultOrderID-Eigenschaft ab.
     * 
     */
    public int getResultOrderID() {
        return resultOrderID;
    }

    /**
     * Legt den Wert der resultOrderID-Eigenschaft fest.
     * 
     */
    public void setResultOrderID(int value) {
        this.resultOrderID = value;
    }

    /**
     * Ruft den Wert der resultTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultTypeName() {
        return resultTypeName;
    }

    /**
     * Legt den Wert der resultTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultTypeName(String value) {
        this.resultTypeName = value;
    }

    /**
     * Ruft den Wert der resultTypeId-Eigenschaft ab.
     * 
     */
    public int getResultTypeId() {
        return resultTypeId;
    }

    /**
     * Legt den Wert der resultTypeId-Eigenschaft fest.
     * 
     */
    public void setResultTypeId(int value) {
        this.resultTypeId = value;
    }

}
