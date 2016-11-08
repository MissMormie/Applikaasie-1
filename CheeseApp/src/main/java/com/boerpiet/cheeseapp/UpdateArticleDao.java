/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.cheeseapp;
import java.sql.*;

/**
 *
 * @author Peaq
 */
public class UpdateArticleDao {
    private Connector conn = new Connector();
    
    void updateArticle (int id) throws SQLException {
        //class die ReadArticleDao.getArticle aanroept moet (scanner)input
        //toekennen aan id paramater van deze methode
        String updateString = "UPDATE Artikel SET (Naam, Prijs, Voorraad, Deleted) VALUES"
                +"(?,?,?,?) WHERE ArtikelId="+id;
        // if statement met id >=0 en <= max value artikel.id in database
        try (Connection artikelCon = conn.getConnection();
                PreparedStatement prepStatement = artikelCon.prepareStatement(updateString)){
            prepStatement.setInt(1, a.id);   //heeft Article instantie (constructor
                                            // met vier parameters en user input) nodig
            prepStatement.setString(2, a.naam); // in aparte class?
            prepStatement.setDouble(3, a.prijs);
            prepStatement.setInt (4, a.voorraad);
            prepStatement.setBoolean(5, false);
            prepStatement.executeUpdate();
        }
        catch (SQLException e) {
    e.printStackTrace();
    }
    }
}
