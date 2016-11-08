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
public class UpdateOrderDao {
    private Connector conn = new Connector();
    
    void update (int id) throws SQLException {
        //class die UpdateOrderDao.update aanroept moet (scanner)input
        //toekennen aan id paramater van deze methode
        String updateString = "UPDATE Bestelling SET "
                + "(KlantKey, BestelDatum, AccountKey, Deleted) VALUES"
                +"(?,?,?,?) WHERE idBestelling = "+id;
        // if statement met id >=0 en <= max value idBestelling in database
        try (Connection artikelCon = conn.getConnection();
                PreparedStatement prepStatement = artikelCon.prepareStatement(updateString)){
            prepStatement.setInt(1, a.id);   //heeft Bestelling instantie (constructor
                                            // met vijf parameters en user input) nodig
            prepStatement.setInt(2, a.klant); // in aparte class?
            prepStatement.setLocalDate(3, a.bestelDatum);
            prepStatement.setInt (4, a.account);
            prepStatement.setBoolean(5, false);
            prepStatement.executeUpdate();
        }
        catch (SQLException e) {
    e.printStackTrace();
    }
    }
}