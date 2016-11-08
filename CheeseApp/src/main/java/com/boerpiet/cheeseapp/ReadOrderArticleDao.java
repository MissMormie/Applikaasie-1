/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.cheeseapp;

import com.boerpiet.domeinApp.OrderArticle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Peaq
 */
public class ReadOrderArticleDao {
    private Connector conn = new Connector();
    
    OrderArticle getOrderArticle (int id) throws SQLException {
        //class die ReadOrderArticleDao.getOrderArticle aanroept moet (scanner)input
        //toekennen aan id paramater van deze methode
        OrderArticle ba = new OrderArticle ();
        String queryString = "SELECT * FROM BestelArtikel" + "WHERE idBestelArtikel = "+id;
        if (id>=0) {// moet nog <= max value idBestelArtikel in database bijkomen
        try (Connection orderArticleCon = conn.getConnection();
                PreparedStatement prepStatement = orderArticleCon.prepareStatement(queryString)){
            prepStatement.setInt(1, id);   //Weet niet zeker of dit nodig is
            //prepStatement.setInt (2, ?ba.aantal); // hoe krijg ik hier de gegevens uit de db?
            //prepStatement.setInt (3, ?ba.bestelId);
            //prepStatement.setInt (4, ?ba.artikelId);
            //prepStatement.setBoolean (5, false);
            ResultSet rs = prepStatement.executeQuery();
            // moet rs ook gesloten worden?
            
            if (rs != null){
            ba.setAantal (rs.getInt(2));
            ba.setDeleted (rs.getBoolean (5));
            }
            else {
                System.out.println("Geen bestelregels in de database");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    } return ba;
  }
}
