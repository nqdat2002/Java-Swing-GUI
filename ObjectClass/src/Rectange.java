
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange(){
        this.width = 1;
        this.height = 1;
    }
    public Rectange (double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double findArea(){
        return this.height * this.width;
    }

    public double findPerimeter(){
        return (this.height + this.width) * 2;
    }
    
    public static Rectange nextRectange(Scanner sc){
        return new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
    }
}
