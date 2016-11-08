/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.cheeseapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Peaq
 */
public class CreateOrderDao {
        private Connector conn = new Connector();
    
    void insert () throws SQLException {
        String insertString = "INSERT INTO Bestelling"+ 
                "(Klantkey, BestelDatum, AccountKey, Deleted) VALUES"
                + "(?,?,?,?)";
        try (Connection artikelCon = conn.getConnection();
                PreparedStatement prepStatement = artikelCon.prepareStatement(insertString)){
            prepStatement.setInt(1, bestelling.klantKey);   //heeft Article instantie (constructor
                                            // met vier parameters en user input) nodig
            prepStatement.setLocalDate (2, bestelling.bestelDatum); // in aparte class?
            prepStatement.setInt (3, bestelling.accountKey);
            prepStatement.setBoolean (4, false);
            prepStatement.executeUpdate();        
    }
    catch (SQLException e) {
    e.printStackTrace();
    }
    }
}