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
public class Article {
    private int id;
    private String naam;
    private double prijs;
    private int voorraad;
    
    public Article (){};
    public Article (int id, String naam, double prijs, int voorraad) {
        this.id = id;
        this.naam = naam;
        this.prijs = prijs;
        this.voorraad = voorraad;
    }
    
    public int getId () {
        return id;
    }
    public String getNaam () {
        return naam;
    }
    public void setNaam (String naam) {
        this.naam = naam;
    }
    public double getPrijs () {
        return prijs;
    }
    public void setPrijs (double prijs) {
        this.prijs = prijs;
    }
    public int getVoorraad () {
        return voorraad;
    }
    public void setVoorraad (int voorraad) {
        this.voorraad = voorraad;
    }
}
