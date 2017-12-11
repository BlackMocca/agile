
package com.signature.agile.models;

import com.signature.agile.utils.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cards {
    private int id;
    private String code;
    private int deposit_type;
    private int point;
    private boolean available;

    public Cards(int id, String code, int deposit_type, int point, boolean available) {
        this.id = id;
        this.code = code;
        this.deposit_type = deposit_type;
        this.point = point;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDeposit_type() {
        return deposit_type;
    }

    public void setDeposit_type(int deposit_type) {
        this.deposit_type = deposit_type;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point; 
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public static int UseCard(String code){
        try {
            Connection con = ConnectionBuilder.getMySqlCond();
            PreparedStatement pstmt = con.prepareStatement("update cards set available=? where code=?");
            pstmt.setInt(1, 0);
            pstmt.setString(2, code);
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
