package com.ehb.xavier.garageverhuur.classes;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by xavier on 27/05/2015.
 */
@DatabaseTable
public class Garage {
    @DatabaseField(generatedId = true,allowGeneratedIdInsert=true)
    private int ID;
    @DatabaseField
    private String groote; // Lengte X Brete X Hoogte
    @DatabaseField
    private int prijs;
    @DatabaseField(dataType = DataType.DATE_STRING, format = "yyyy-MM-dd")
    private Date Startdate;
    @DatabaseField(dataType = DataType.DATE_STRING, format = "yyyy-MM-dd")
    private Date Endedate;
    @DatabaseField
    private String mogelijkhijd;
    @DatabaseField (canBeNull = true, foreign = true)
    private Adres AdresID;


    /**
     * Instantiates a new Garage.
     */
    public Garage() {
    }

    /**
     * Instantiates a new Garage.
     *
     * @param ID the iD
     */
    public Garage(int ID) {
        this.ID = ID;
    }

    /**
     * Instantiates a new Garage.
     *
     * @param adresID the adres iD
     * @param Enddate the enddate
     * @param mogelijkhijd the mogelijkhijd
     * @param groote the groote
     * @param Startdate the startdate
     * @param prijs the prijs
     */
    public Garage(Adres adresID, Date Enddate, String mogelijkhijd, String groote, Date Startdate,int prijs) {
        this.groote = groote;
        this.prijs = prijs;
        AdresID = adresID;
       this.mogelijkhijd = mogelijkhijd;
        this.Startdate = Startdate;
        this.Endedate = Enddate;
    }

    /**
     * Instantiates a new Garage.
     *
     * @param adresID the adres iD
     * @param Enddate the enddate
     * @param mogelijkhijd the mogelijkhijd
     * @param groote the groote
     * @param Startdate the startdate
     * @param ID the iD
     * @param prijs the prijs
     */
    public Garage(Adres adresID,Date Enddate,  String mogelijkhijd,String groote, Date Startdate,int ID, int prijs) {
        this.ID = ID;
        this.groote = groote;
        this.prijs = prijs;
        this.Startdate = Startdate;
        this.Endedate= Enddate;
        AdresID = adresID;

        this.mogelijkhijd =  mogelijkhijd;
    }

    /**
     * Gets startdate.
     *
     * @return the startdate
     */
    public Date getStartdate() {
        return Startdate;
    }

    /**
     * Gets enddate.
     *
     * @return the enddate
     */
    public Date getEnddate() {
        return Endedate;
    }

    /**
     * Sets enddate.
     *
     * @param enddate the enddate
     */
    public void setEnddate(Date enddate) {
        Endedate = enddate;
    }

    /**
     * Sets startdate.
     *
     * @param startdate the startdate
     */
    public void setStartdate(Date startdate) {
        Startdate = startdate;
    }

    /**
     * Gets iD.
     *
     * @return the iD
     */
    public int getID() {
        return ID;
    }

    /**
     * Sets iD.
     *
     * @param ID the iD
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Gets groote.
     *
     * @return the groote
     */
    public String getGroote() {
        return groote;
    }

    /**
     * Sets groote.
     *
     * @param groote the groote
     */
    public void setGroote(String groote) {
        this.groote = groote;
    }

    /**
     * Gets prijs.
     *
     * @return the prijs
     */
    public int getPrijs() {
        return prijs;
    }

    /**
     * Sets prijs.
     *
     * @param prijs the prijs
     */
    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    /**
     * Gets adres iD.
     *
     * @return the adres iD
     */
    public Adres getAdresID() {
        return AdresID;
    }

    /**
     * Sets adres iD.
     *
     * @param adresID the adres iD
     */
    public void setAdresID(Adres adresID) {
        AdresID = adresID;
    }

    /**
     * Gets mogelijkhijd.
     *
     * @return the mogelijkhijd
     */
    public String  getMogelijkhijd() {
        return mogelijkhijd;
    }

    /**
     * Sets mogelijkhijd d.
     *
     * @param mogelijkhijd the mogelijkhijd
     */
    public void setMogelijkhijdD(String mogelijkhijd) {
        this.mogelijkhijd =mogelijkhijd;
    }

    @Override
    public String toString() {

        return "Opslagruimte"+"\n"+

                "grootte= " + groote  +"\n"+
                "prijs= " + prijs +"\n"+
//                "Ligging= " + AdresID.getGemente()+"\n"+
                "type= " +  mogelijkhijd ;
    }


}
