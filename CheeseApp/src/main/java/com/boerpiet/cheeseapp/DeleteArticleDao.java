/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.cheeseapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Peaq
 */
public class DeleteArticleDao {
    private Connector conn = new Connector ();
    
    void delete (int id) throws SQLException {
        //class die DeletArticleDao.delete aanroept moet (scanner)input
        //toekennen aan id paramater van deze methode
        String deleteString = "DELETE * FROM Artikel" + "WHERE ArtikelId = "+id;
        if (id>=0) {// moet nog <= max value idArtikel in database bijkomen
        try (Connection artikelCon = conn.getConnection();
                PreparedStatement prepStatement = artikelCon.prepareStatement(deleteString)){
            // eventueel nog een bevestiging vragen van user voor deletion?
            
            prepStatement.executeUpdate ();
            } catch (SQLException ex) {
                ex.printStackTrace();
                }
        }
        
            else {
                System.out.println("Artikel niet gevonden in de database");
            }
        }
    } 
