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
public class ArticleDao {
        //private PreparedStatement prepStatement;
    private Connector conn = new Connector();
    
    Article getArticle (int id) throws SQLException {
        Article a = new Article();
        String queryString = "select * from Article" + "where Article.id = ?";
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
