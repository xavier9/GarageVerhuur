package com.ehb.xavier.garageverhuur.classes;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by xavier on 27/05/2015.
 */
@DatabaseTable
public class Persoon {

    @DatabaseField(generatedId = true,allowGeneratedIdInsert=true)
    private  int ID;
    @DatabaseField
    private String naam;
    @DatabaseField
    private String voornaam;
    @DatabaseField
    private String email;
    @DatabaseField
    private String nationaliteit;
    @DatabaseField
    private String rijksregisternr;
    @DatabaseField
    private Date geboortedatum;
    @DatabaseField
    private String geslacht;
    @DatabaseField(canBeNull = false, foreign = true)
    private Adres AdresID;

    /**
     * Instantiates a new Persoon.
     */
    public Persoon() {
    }

    /**
     * Instantiates a new Persoon.
     *
     * @param ID the iD
     */
    public Persoon(int ID) {
        this.ID = ID;
    }

    /**
     * Instantiates a new Persoon.
     *
     * @param adresID the adres iD
     * @param voornaam the voornaam
     * @param email the email
     * @param geboortedatum the geboortedatum
     * @param geslacht the geslacht
     * @param naam the naam
     * @param nationaliteit the nationaliteit
     * @param rijksregisternr the rijksregisternr
     */
    public Persoon(Adres adresID, String voornaam, String email, Date geboortedatum, String geslacht, String naam,   String nationaliteit, String rijksregisternr ) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.email = email;
        this.nationaliteit = nationaliteit;
        AdresID = adresID;
        this.rijksregisternr = rijksregisternr;
        this.geslacht = geslacht;
        this.geboortedatum = geboortedatum;
    }

    /**
     * Instantiates a new Persoon.
     *
     * @param adresID the adres iD
     * @param voornaam the voornaam
     * @param email the email
     * @param geboortedatum the geboortedatum
     * @param geslacht the geslacht
     * @param naam the naam
     * @param nationaliteit the nationaliteit
     * @param rijksregisternr the rijksregisternr
     * @param ID the iD
     */
    public Persoon(Adres adresID, String voornaam, String email, Date geboortedatum, String geslacht, String naam,   String nationaliteit, String rijksregisternr, int ID) {
        this.ID = ID;
        this.naam = naam;
        this.voornaam = voornaam;
        this.email = email;
        this.nationaliteit = nationaliteit;
        AdresID = adresID;
        this.rijksregisternr = rijksregisternr;
        this.geslacht = geslacht;
        this.geboortedatum = geboortedatum;
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
     * Gets naam.
     *
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets naam.
     *
     * @param naam the naam
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * Gets voornaam.
     *
     * @return the voornaam
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * Sets voornaam.
     *
     * @param voornaam the voornaam
     */
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets nationaliteit.
     *
     * @return the nationaliteit
     */
    public String getNationaliteit() {
        return nationaliteit;
    }

    /**
     * Sets nationaliteit.
     *
     * @param nationaliteit the nationaliteit
     */
    public void setNationaliteit(String nationaliteit) {
        this.nationaliteit = nationaliteit;
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
     * Gets rijksregisternr.
     *
     * @return the rijksregisternr
     */
    public String getRijksregisternr() {
        return rijksregisternr;
    }

    /**
     * Sets rijksregisternr.
     *
     * @param rijksregisternr the rijksregisternr
     */
    public void setRijksregisternr(String rijksregisternr) {
        this.rijksregisternr = rijksregisternr;
    }

    /**
     * Gets geboortedatum.
     *
     * @return the geboortedatum
     */
    public Date getGeboortedatum() {
        return geboortedatum;
    }

    /**
     * Sets geboortedatum.
     *
     * @param geboortedatum the geboortedatum
     */
    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    /**
     * Gets geslacht.
     *
     * @return the geslacht
     */
    public String getGeslacht() {
        return geslacht;
    }

    /**
     * Sets geslacht.
     *
     * @param geslacht the geslacht
     */
    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "ID=" + ID +
                ", naam='" + naam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", email='" + email + '\'' +
                ", nationaliteit='" + nationaliteit + '\'' +
                ", AdresID=" + AdresID +
                '}';
    }
}
