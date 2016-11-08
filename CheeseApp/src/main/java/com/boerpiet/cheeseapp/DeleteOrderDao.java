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
public class DeleteOrderDao {
    private Connector conn = new Connector ();
    
    void delete (int id) throws SQLException {
        //class die DeleteOrderDao.delete aanroept moet (scanner)input
        //toekennen aan id paramater van deze methode
        String deleteString = "DELETE * FROM Bestelling" + "WHERE idBestelling = "+id;
        if (id>=0) {// moet nog <= max value idBestelling in database bijkomen
        try (Connection artikelCon = conn.getConnection();
                PreparedStatement prepStatement = artikelCon.prepareStatement(deleteString)){
            
            // eventueel nog een bevestiging vragen van user voor deletion?
            
            prepStatement.executeUpdate ();
            } catch (SQLException ex) {
                ex.printStackTrace();
                }
        }
        
            else {
                System.out.println("Bestelling niet gevonden in de database");
            }
        }
    }