/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signature.agile.models;

import com.signature.agile.utils.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author huag1
 */
public class HelloMaven {
    private int id;
    private String message;

    public HelloMaven() {
    }

    public HelloMaven(int id, String message) {
        this.id = id;
        this.message = message;
    }
    
    public static String getMessageById(int number){
        String sql = "select * from hello_maven where id=" + number;
        try{
            Connection con = ConnectionBuilder.getMySqlCond();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return rs.getString("message");
            }
        }catch(Exception ex){
            ex.getStackTrace();
        }
        return null;
    }
    
}
