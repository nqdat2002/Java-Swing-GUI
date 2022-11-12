
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Triangle extends Point{
    private Point p1, p2, p3;
    private double a, b, c;  
    
    public Triangle(){
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
        this.p3 = new Point(0, 0);
        this.a = Point.distance(p1, p2);
        this.b = Point.distance(p2, p3);
        this.c = Point.distance(p1, p3);
    }

    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.a = Point.distance(p1, p2);
        this.b = Point.distance(p2, p3);
        this.c = Point.distance(p1, p3);
    }

    public boolean valid(){
        return (a + b > c && a + c > b && b + c > a);
    }
    
    public String getPerimeter(){
        return String.format("%.3f", (double)(a + b + c));
    }
    
    public String getArea(){
        double p = (a + b + c) / 2;
        return String.format("%.2f", (double)Math.sqrt(p * (p - a) * (p - b) * (p - c)));     
    }
    
    public String getCircumcircle(){
        double p = (a + b + c) / 2;
        double S = (p * (p - a) * (p - b) * (p - c));
        return String.format("%.3f", (double) Math.PI * (a * a * b * b * c * c / (16 * S)));
    }
    
    public static Triangle nextTriangle(Scanner sc){
        return new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
    }
    
    @Override
    public String toString(){
        return p1.toString() + " " + p2.toString() + " " + p3.toString();
    }
}
