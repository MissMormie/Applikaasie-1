/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.applikaasie;

import java.time.LocalDate;

/**
 *
 * @author Peaq
 */
public class Bestelling {
    private int id;
    private int klant;
    private LocalDate bestelDatum;
    private int account;
    
    Bestelling (int id, int klant, LocalDate bestelDatum, int account) {
        this.id = id;
        this.klant = klant;
        this.bestelDatum = bestelDatum;
        this.account = account;
    }
    
    public int getId (){
        return id;
    }
    public int getKlant() {
        return klant;
    }
    public LocalDate getBestelDatum () {
        return bestelDatum;
    }
    public int getAccount () {
        return account;
    }
    public void setbestelDatum (LocalDate bestelDatum) {
        this.bestelDatum = bestelDatum;
    }
}