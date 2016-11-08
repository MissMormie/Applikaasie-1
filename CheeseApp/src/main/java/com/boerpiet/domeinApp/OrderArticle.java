/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.domeinApp;

/**
 *
 * @author Peaq
 */
public class OrderArticle {
    private int id;
    private int aantal;
    private int bestelId;
    private int artikelId;
    private boolean deleted;
    
    public OrderArticle (){};
    public OrderArticle (int id, int aantal, int bestelId, int artikelId, boolean deleted) {
        this.id = id;
        this.aantal = aantal;
        this.bestelId = bestelId;
        this.artikelId = artikelId;
        this.deleted = deleted;
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
    public boolean getDeleted () {
        return deleted;
    }
    public void setDeleted (boolean deleted) {
        this.deleted = deleted;
    }
}
