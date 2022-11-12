package NhapLop;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public abstract class GeometricObject {
    String color;
    boolean filled;
    Date dateCreated;
    
//    public abstract double getArea(){
//        
//    }
//    public abstract double getPerimeter(){
//        
//    }
    protected GeometricObject(){
        this.color = "";
        this.filled = true;
        this.dateCreated = new Date();      
    }
    
    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    @Override
    public String toString(){
        return color + " " + new SimpleDateFormat("dd/MM/yyyy").format(dateCreated) + " " + filled;
    }
}
