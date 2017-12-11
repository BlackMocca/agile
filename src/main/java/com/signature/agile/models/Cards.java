
package com.signature.agile.models;

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
    
    
}
