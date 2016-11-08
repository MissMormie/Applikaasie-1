/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.applikaasie;

import java.sql.*;

/**
 *
 * @author Peaq
 */
public class ArtikelDao {
    //private PreparedStatement prepStatement;
    private Connector conn = new Connector();
    
    Artikel getArtikel (int id) throws SQLException {
        Artikel a = new Artikel();
        String queryString = "select * from Artikel" + "where Artikel.id = ?";
        try (Connection artikelCon = conn.getConnection();
                PreparedStatement prepStatement = artikelCon.prepareStatement(queryString)){
            ResultSet rs = prepStatement.executeQuery();
            if (rs != null){
            a.naam = rs.getString(2);
            a.prijs = rs.getDouble(3);
            a.voorraad = rs.getInt(4);
            }
            else {
                System.out.println("Geen artikelen in de database");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return a;
    }
}   
    