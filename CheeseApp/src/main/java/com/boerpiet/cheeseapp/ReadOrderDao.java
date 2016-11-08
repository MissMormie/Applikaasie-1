/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.cheeseapp;

import com.boerpiet.domeinApp.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Peaq
 */
public class ReadOrderDao {
    private Connector conn = new Connector();
    
    Order getOrder (int id) throws SQLException {
        //class die ReadOrderDao.getOrder aanroept moet (scanner)input
        //toekennen aan id paramater van deze methode
        Order o = new Order();
        String queryString = "SELECT * FROM Bestelling" + "WHERE idBestelling = "+id;
        if (id>=0) {// moet nog <= max value idBestelling in database bijkomen
        try (Connection orderCon = conn.getConnection();
                PreparedStatement prepStatement = orderCon.prepareStatement(queryString)){
            prepStatement.setInt(1, id);   //Weet niet zeker of dit nodig is
            //prepStatement.setInt (2, ?o.klant); // hoe krijg ik hier de gegevens uit de db?
            //prepStatement.setLocalDate (3, ?o.bestelDatum); //
            //prepStatement.setInt (4, ?o.account);
            //prepStatement.setBoolean (5, false);
            ResultSet rs = prepStatement.executeQuery();
            // moet rs ook gesloten worden?
            
            if (rs != null){
            o.setBestelDatum (rs.getLocalDate(3));
            //sql kent alleen Date? moet in dat geval nog aangepast worden in class Order
            o.setDeleted (rs.getBoolean(5));
            }
            else {
                System.out.println("Geen bestellingen in de database");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    } return o;
  }
}