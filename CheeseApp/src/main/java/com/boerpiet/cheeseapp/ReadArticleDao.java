/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.cheeseapp;
import com.boerpiet.domeinApp.Article;
import java.sql.*;
/**
 *
 * @author Peaq
 */
public class ReadArticleDao {
    private Connector conn = new Connector();
    
    Article getArticle (int id) throws SQLException {
        //class die ReadArticleDao.getArticle aanroept moet (scanner)input
        //toekennen aan id paramater van deze methode
        Article a = new Article();
        String queryString = "SELECT * FROM Artikel" + "WHERE ArtikelId = "+id;
        if (id>=0) {// moet nog <= max value Artikel.id in database bijkomen
        try (Connection artikelCon = conn.getConnection();
                PreparedStatement prepStatement = artikelCon.prepareStatement(queryString)){
            prepStatement.setInt(1, id);   //Weet niet zeker of dit nodig is
            //prepStatement.setString(2, ?a.naam); // hoe krijg ik hier de gegevens uit de db?
            //prepStatement.setDouble(3, ?a.prijs);
            //prepStatement.setInt (4, ?a.voorraad);
            ResultSet rs = prepStatement.executeQuery();
            // moet rs ook gesloten worden?
            
            if (rs != null){
            a.setNaam (rs.getString(2));
            a.setPrijs (rs.getDouble(3));
            a.setVoorraad (rs.getInt(4));
            }
            else {
                System.out.println("Geen artikelen in de database");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    } return a;
  }
}