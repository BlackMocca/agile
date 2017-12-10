/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signature.agile.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huag
 */
public class ConnectionBuilder {
    
    public static Connection getMySqlCond() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String username = "root";
        String password = "root";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/agile?useUnicode=true&characterEncoding=UTF-8", username, password);
        System.out.println("Connection Successful");
        return con;
    }
}


