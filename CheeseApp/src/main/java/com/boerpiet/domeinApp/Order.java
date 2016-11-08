/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.domeinApp;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author Peaq
 */
public class Order {
    private int id;
    private int klant;
    private LocalDate bestelDatum;
    private int account;
    private boolean deleted;
    
    public Order() {};
    public Order (int id, int klant, LocalDate bestelDatum, int account, boolean deleted) {
        this.id = id;
        this.klant = klant;
        this.bestelDatum = bestelDatum;
        this.account = account;
        this.deleted = deleted;
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
    public void setBestelDatum (LocalDate bestelDatum) {
        this.bestelDatum = bestelDatum;
    }
    public boolean getDeleted () {
        return deleted;
    }
    public void setDeleted (boolean deleted) {
        this.deleted = deleted;
    }
}
