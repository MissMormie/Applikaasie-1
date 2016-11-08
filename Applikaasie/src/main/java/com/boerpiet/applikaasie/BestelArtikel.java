/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.applikaasie;

/**
 *
 * @author Peaq
 */
public class BestelArtikel {
    private int aantal;
    private int bestelId;
    private int artikelId;
    
    BestelArtikel (int aantal, int bestelId, int artikelId) {
        this.aantal = aantal;
        this.bestelId = bestelId;
        this.artikelId = artikelId;
    }
    
    public int getAantal () {
        return aantal;
    }
    public void setAantal (int aantal) {
        this.aantal = aantal;
    }
    public int getBestelId () {
        return bestelId;
    }
    public int getArtikelId () {
        return artikelId;
    }
}