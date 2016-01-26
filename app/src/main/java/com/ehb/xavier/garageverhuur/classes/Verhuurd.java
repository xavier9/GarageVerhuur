package com.ehb.xavier.garageverhuur.classes;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by xavier on 27/06/2015.
 */
@DatabaseTable
public class Verhuurd {
    @DatabaseField(generatedId = true,allowGeneratedIdInsert=true)
    private int ID;
    @DatabaseField(canBeNull = true, foreign = true)
    private Garage Opslag;
    @DatabaseField(canBeNull = true, foreign = true)
    private Persoon huurder;

    /**
     * Instantiates a new Verhuurd.
     */
    public Verhuurd() {
    }

    /**
     * Instantiates a new Verhuurd.
     *
     * @param ID the iD
     */
    public Verhuurd(int ID) {
        this.ID = ID;
    }

    /**
     * Instantiates a new Verhuurd.
     *
     * @param opslag the opslag
     * @param huurder the huurder
     */
    public Verhuurd(Garage opslag, Persoon huurder) {
        Opslag = opslag;
        this.huurder = huurder;
    }

    /**
     * Instantiates a new Verhuurd.
     *
     * @param ID the iD
     * @param opslag the opslag
     * @param huurder the huurder
     */
    public Verhuurd(int ID, Garage opslag, Persoon huurder) {
        this.ID = ID;
        Opslag = opslag;
        this.huurder = huurder;
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
     * Gets opslag.
     *
     * @return the opslag
     */
    public Garage getOpslag() {
        return Opslag;
    }

    /**
     * Sets opslag.
     *
     * @param opslag the opslag
     */
    public void setOpslag(Garage opslag) {
        Opslag = opslag;
    }

    /**
     * Gets huurder.
     *
     * @return the huurder
     */
    public Persoon getHuurder() {
        return huurder;
    }

    /**
     * Sets huurder.
     *
     * @param huurder the huurder
     */
    public void setHuurder(Persoon huurder) {
        this.huurder = huurder;
    }

    @Override
    public String toString() {
        return "Verhuurd{" +
                "ID=" + ID +
                ", Opslag=" + Opslag +
                ", huurder=" + huurder +
                '}';
    }
}
