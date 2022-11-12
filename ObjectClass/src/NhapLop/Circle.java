package NhapLop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Circle extends GeometricObject{
    private double radius;
    
    Circle(){
        this.radius = 0.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }
    
    public double getDiameter(){
        return 2 * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
