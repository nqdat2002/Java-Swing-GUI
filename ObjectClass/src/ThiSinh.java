
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class ThiSinh {
    private String name;
    private Date date;
    private double p1, p2, p3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public ThiSinh(){
        this.name = "";
        this.date = new Date();
        this.p1 = this.p2 = this.p3 = 0;
    }

    public ThiSinh(String name, String date, double p1, double p2, double p3) throws ParseException{
        this.name = name;
        this.date = (new SimpleDateFormat("dd/MM/yyyy").parse(date));
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public static ThiSinh nextThiSinh(Scanner sc) throws ParseException{
        return new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
    }
    
    @Override
    public String toString(){
        return name + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.1f", (double)(p1 + p2 + p3));
    }
}
