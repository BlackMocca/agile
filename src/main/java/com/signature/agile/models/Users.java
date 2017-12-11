package com.signature.agile.models;

import com.signature.agile.utils.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Users {
   private  int id ;
   private  String name;
   private  String email;
   private  String gender;
   private  String phone_num;
   private  int point;

    public Users(int id, String name, String email, String gender, String phone_num, int point) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phone_num = phone_num;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
   
    public static int AddPoint(double point,int id){
       try {
           Connection con = ConnectionBuilder.getMySqlCond();
           PreparedStatement pstmt = con.prepareStatement("update users set point=? where id=?");
           pstmt.setDouble(1, point);
           pstmt.setInt(2, id);
           int updated = pstmt.executeUpdate();
           if (updated != 0){
               return 1;
           }
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
       }
       return 0;
    }
    
}
