
package de.netos.opendb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für Matchdata complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Matchdata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matchID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="matchDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchDateTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="groupOrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leagueID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="leagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leagueSaison" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leagueShortcut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameTeam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameTeam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTeam1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTeam2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iconUrlTeam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iconUrlTeam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsTeam1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pointsTeam2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="matchIsFinished" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="matchResults" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfMatchResult" minOccurs="0"/&gt;
 *         &lt;element name="goals" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfGoal" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://msiggi.de/Sportsdata/Webservices}Location"/&gt;
 *         &lt;element name="NumberOfViewers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Matchdata", propOrder = {
    "matchID",
    "matchDateTime",
    "timeZoneID",
    "matchDateTimeUTC",
    "groupID",
    "groupOrderID",
    "groupName",
    "leagueID",
    "leagueName",
    "leagueSaison",
    "leagueShortcut",
    "nameTeam1",
    "nameTeam2",
    "idTeam1",
    "idTeam2",
    "iconUrlTeam1",
    "iconUrlTeam2",
    "pointsTeam1",
    "pointsTeam2",
    "lastUpdate",
    "matchIsFinished",
    "matchResults",
    "goals",
    "location",
    "numberOfViewers"
})
public class Matchdata {

    protected int matchID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchDateTime;
    @XmlElement(name = "TimeZoneID")
    protected String timeZoneID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchDateTimeUTC;
    protected int groupID;
    protected int groupOrderID;
    protected String groupName;
    protected int leagueID;
    protected String leagueName;
    protected String leagueSaison;
    protected String leagueShortcut;
    protected String nameTeam1;
    protected String nameTeam2;
    protected int idTeam1;
    protected int idTeam2;
    protected String iconUrlTeam1;
    protected String iconUrlTeam2;
    protected int pointsTeam1;
    protected int pointsTeam2;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    protected boolean matchIsFinished;
    protected ArrayOfMatchResult matchResults;
    protected ArrayOfGoal goals;
    @XmlElement(required = true)
    protected Location location;
    @XmlElement(name = "NumberOfViewers", required = true, type = Integer.class, nillable = true)
    protected Integer numberOfViewers;

    /**
     * Ruft den Wert der matchID-Eigenschaft ab.
     * 
     */
    public int getMatchID() {
        return matchID;
    }

    /**
     * Legt den Wert der matchID-Eigenschaft fest.
     * 
     */
    public void setMatchID(int value) {
        this.matchID = value;
    }

    /**
     * Ruft den Wert der matchDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatchDateTime() {
        return matchDateTime;
    }

    /**
     * Legt den Wert der matchDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatchDateTime(XMLGregorianCalendar value) {
        this.matchDateTime = value;
    }

    /**
     * Ruft den Wert der timeZoneID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Legt den Wert der timeZoneID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneID(String value) {
        this.timeZoneID = value;
    }

    /**
     * Ruft den Wert der matchDateTimeUTC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatchDateTimeUTC() {
        return matchDateTimeUTC;
    }

    /**
     * Legt den Wert der matchDateTimeUTC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatchDateTimeUTC(XMLGregorianCalendar value) {
        this.matchDateTimeUTC = value;
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
     * Ruft den Wert der leagueID-Eigenschaft ab.
     * 
     */
    public int getLeagueID() {
        return leagueID;
    }

    /**
     * Legt den Wert der leagueID-Eigenschaft fest.
     * 
     */
    public void setLeagueID(int value) {
        this.leagueID = value;
    }

    /**
     * Ruft den Wert der leagueName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueName() {
        return leagueName;
    }

    /**
     * Legt den Wert der leagueName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueName(String value) {
        this.leagueName = value;
    }

    /**
     * Ruft den Wert der leagueSaison-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueSaison() {
        return leagueSaison;
    }

    /**
     * Legt den Wert der leagueSaison-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueSaison(String value) {
        this.leagueSaison = value;
    }

    /**
     * Ruft den Wert der leagueShortcut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueShortcut() {
        return leagueShortcut;
    }

    /**
     * Legt den Wert der leagueShortcut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueShortcut(String value) {
        this.leagueShortcut = value;
    }

    /**
     * Ruft den Wert der nameTeam1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTeam1() {
        return nameTeam1;
    }

    /**
     * Legt den Wert der nameTeam1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTeam1(String value) {
        this.nameTeam1 = value;
    }

    /**
     * Ruft den Wert der nameTeam2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTeam2() {
        return nameTeam2;
    }

    /**
     * Legt den Wert der nameTeam2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTeam2(String value) {
        this.nameTeam2 = value;
    }

    /**
     * Ruft den Wert der idTeam1-Eigenschaft ab.
     * 
     */
    public int getIdTeam1() {
        return idTeam1;
    }

    /**
     * Legt den Wert der idTeam1-Eigenschaft fest.
     * 
     */
    public void setIdTeam1(int value) {
        this.idTeam1 = value;
    }

    /**
     * Ruft den Wert der idTeam2-Eigenschaft ab.
     * 
     */
    public int getIdTeam2() {
        return idTeam2;
    }

    /**
     * Legt den Wert der idTeam2-Eigenschaft fest.
     * 
     */
    public void setIdTeam2(int value) {
        this.idTeam2 = value;
    }

    /**
     * Ruft den Wert der iconUrlTeam1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrlTeam1() {
        return iconUrlTeam1;
    }

    /**
     * Legt den Wert der iconUrlTeam1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrlTeam1(String value) {
        this.iconUrlTeam1 = value;
    }

    /**
     * Ruft den Wert der iconUrlTeam2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrlTeam2() {
        return iconUrlTeam2;
    }

    /**
     * Legt den Wert der iconUrlTeam2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrlTeam2(String value) {
        this.iconUrlTeam2 = value;
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
     * Ruft den Wert der lastUpdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Legt den Wert der lastUpdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Ruft den Wert der matchIsFinished-Eigenschaft ab.
     * 
     */
    public boolean isMatchIsFinished() {
        return matchIsFinished;
    }

    /**
     * Legt den Wert der matchIsFinished-Eigenschaft fest.
     * 
     */
    public void setMatchIsFinished(boolean value) {
        this.matchIsFinished = value;
    }

    /**
     * Ruft den Wert der matchResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchResult }
     *     
     */
    public ArrayOfMatchResult getMatchResults() {
        return matchResults;
    }

    /**
     * Legt den Wert der matchResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchResult }
     *     
     */
    public void setMatchResults(ArrayOfMatchResult value) {
        this.matchResults = value;
    }

    /**
     * Ruft den Wert der goals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoal }
     *     
     */
    public ArrayOfGoal getGoals() {
        return goals;
    }

    /**
     * Legt den Wert der goals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoal }
     *     
     */
    public void setGoals(ArrayOfGoal value) {
        this.goals = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der numberOfViewers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfViewers() {
        return numberOfViewers;
    }

    /**
     * Legt den Wert der numberOfViewers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfViewers(Integer value) {
        this.numberOfViewers = value;
    }

}
