
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien>  {
    private String name;
    private String classes;
    private String code;
    private Date date;
    private double p;

    public SinhVien(){
        this.code = this.name = this.classes = "";
        this.date = new Date();
        this.p = 0;
    }

    public SinhVien(int cnt, String name, String classes, String date, double p) throws ParseException{
        this.code = "B20DCCN" + String.format("%03d", cnt);
        this.name = SetName(name);
        this.classes = classes;
        this.date = (new SimpleDateFormat("dd/MM/yyyy").parse(date));
        this.p = p;
    }
    
    public static SinhVien nextSinhVien(Scanner sc, int cnt) throws ParseException{
        return new SinhVien(cnt,  sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.valueOf(sc.nextLine()));
    }
    
    private String SetName(String s){
        s = s.toLowerCase();
        StringTokenizer stk = new StringTokenizer(s);
        String res = "";
        while(stk.hasMoreTokens()){
            String tmp = stk.nextToken();
            char c = tmp.charAt(0);
            c = Character.toUpperCase(c);
            res += c + tmp.substring(1) + " ";
        }
        return res.substring(0, res.length() - 1);
    }
    
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getClasses(){
        return classes;
    }
    public Date getDate(){
        return date;
    }
    public double getPoint(){
        return p;
    }
    
    @Override
    public String toString(){
        return code + " " + name + " " + classes + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f", (double)p);
    }

    @Override
    public int compareTo(SinhVien o) {
        return (int) ((int) 100 * (o.getPoint() - this.getPoint()));
    }
}
