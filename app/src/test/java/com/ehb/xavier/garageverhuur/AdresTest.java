/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ehb.xavier.garageverhuur;



import com.ehb.xavier.garageverhuur.classes.Adres;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by xavier on 8/08/2015.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class AdresTest {
    Adres adresNull;
    Adres adresEmpty;
    Adres adres1;
    @Before
    public void setUp() throws Exception {
        adresNull = new Adres();
        adresEmpty = new Adres("","","","","",1,1);
        adres1 = new Adres();
    }
    @After
    public void tearDown() throws Exception {
        adresNull = null;
    }
    @Test
    public void testGetSetPostcode() throws Exception {
        assertNull(adresNull.getPostcode());
        assertNotNull(adresEmpty.getPostcode());
        adres1.setPostcode("3070");
        assertNotNull(adres1.getPostcode());
        assertEquals(null, adres1.getPostcode(), "3070");

    }

    @Test
    public void testGetSetID() throws Exception {
//        assertNull(adresNull.getID());
        assertNotNull(adresEmpty.getID());
        adres1.setID(1);
        assertNotNull(adres1.getID());
        assertEquals(null, adres1.getID(), 1);
    }

    @Test
    public void testGetSetStraat() throws Exception {
        assertNull(adresNull.getStraat());
        assertNotNull(adresEmpty.getStraat());
        adres1.setStraat("Straat");
        assertNotNull(adres1.getStraat());
        assertEquals(null, adres1.getStraat(), "Straat");
    }

    @Test
    public void testGetSetNr() throws Exception {
//        assertNull(adresNull.getNr());
        assertNotNull(adresEmpty.getNr());
        adres1.setNr(5);
        assertNotNull(adres1.getNr());
        assertEquals(null, adres1.getNr(), 5);
    }

    @Test
    public void testGetSetBus() throws Exception {
        assertNull(adresNull.getBus());
        assertNotNull(adresEmpty.getBus());
        adres1.setBus("bus");
        assertNotNull(adres1.getBus());
        assertEquals(null, adres1.getBus(), "bus");
    }

    @Test
    public void testGetSetGemente() throws Exception {
        assertNull(adresNull.getGemente());
        assertNotNull(adresEmpty.getGemente());
        adres1.setGemente("gem");
        assertNotNull(adres1.getGemente());
        assertEquals(null, adres1.getGemente(), "gem");
    }

    @Test
    public void testGetSetLand() throws Exception {
        assertNull(adresNull.getLand());
        assertNotNull(adresEmpty.getLand());
        adres1.setLand("land");
        assertNotNull(adres1.getLand());
        assertEquals(null, adres1.getLand(), "land");
    }


}