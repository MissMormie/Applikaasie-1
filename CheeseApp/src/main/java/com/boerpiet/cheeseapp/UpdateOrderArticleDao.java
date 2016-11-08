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
public class UpdateOrderArticleDao {
    private Connector conn = new Connector();
    
    void update (int id) throws SQLException {
        //class die UpdateOrderArticleDao.update aanroept moet (scanner)input
        //toekennen aan id paramater van deze methode
        String updateString = "UPDATE BestelArtikel SET "
                + "(Aantal, bestelId, artikelId, deleted) VALUES "
                +"(?,?,?,?) WHERE bestelArtikel = "+id;
        // if statement met id >=0 en <= max value artikel.id in database
        try (Connection artikelCon = conn.getConnection();
                PreparedStatement prepStatement = artikelCon.prepareStatement(updateString)){
            prepStatement.setInt(1, a.id);   //heeft OrderArticle instantie (constructor
                                            // met vijf parameters en user input) nodig
            prepStatement.setInt (2, a.aantal); // in aparte class?
            prepStatement.setInt (3, a.bestelId);
            prepStatement.setInt (4, a.artikelId);
            prepStatement.setBoolean(5, false);
            prepStatement.executeUpdate();
        }
        catch (SQLException e) {
    e.printStackTrace();
    }
    }
}