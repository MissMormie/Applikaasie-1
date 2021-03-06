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
public class CreateArticleDao {
    private Connector conn = new Connector();
    
    void insert () throws SQLException {
        String insertString = "INSERT INTO Artikel"+ "(Naam, Prijs, Voorraad, Deleted) VALUES"
                + "(?,?,?,?)";
        try (Connection artikelCon = conn.getConnection();
                PreparedStatement prepStatement = artikelCon.prepareStatement(insertString)){
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
