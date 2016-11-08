/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boerpiet.applikaasie;
import java.sql.*;

/**
 *
 * @author Peaq
 */
public class Connector {
    public Connection getConnection () throws SQLException {
        // Class.forName("com.mysql.jdbc.driver");
        // dit is niet meer nodig sinds JDBC 4.0?
        Connection con = 
            DriverManager.getConnection
            ("jdbc:mysql://localhost/Applikaasie", "boerpiet", "kaaskop");
        return con;
    }
}