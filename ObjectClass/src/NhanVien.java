
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class NhanVien implements Comparable<NhanVien>{
    private String name;
    private String address;
    private String id;
    private String sex;
    private String phone_number;
    private Date date;
    private Date day_company;
    
    public NhanVien(){
        this.name = this.address = this.id = "";
        this.sex = this.phone_number = "";
        this.date = this.day_company = new Date();
    }
    
    public NhanVien(int cnt, String name, String sex, String date, String address, String phone, String day_company) throws ParseException{
        this.id = String.format("%04d", cnt);
        this.setName(name);
        this.sex = sex;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.address = address;
        this.phone_number = phone;
        this.day_company = new SimpleDateFormat("dd/MM/yyyy").parse(day_company);
    }
    
    public static NhanVien nextNhanVien(Scanner sc, int cnt) throws ParseException{
       return new NhanVien(cnt, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()); 
    }

    public void setName(String name) {
        StringTokenizer st = new StringTokenizer(name);
        name = "";
        Vector<String> v = new Vector<>();
        while (st.hasMoreTokens()){
            String a = st.nextToken();
            char c = a.charAt(0);
            c = Character.toUpperCase(c);
            a = "" + c + a.substring(1);
            v.add(a);
        }
        for (String x: v) name = name + v + " ";
        name = name.substring(1);
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDay_company(Date day_company) {
        this.day_company = day_company;
    }
    
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String getPhoneNumber(){
        return phone_number;
    }
    public String getAddress(){
        return address;
    }
    public Date getDate(){
        return date;
    }
    public Date getDayCompany(){
        return day_company;
    }
    
    @Override
    public int compareTo(NhanVien o) {
        return this.getName().compareTo(o.getName());
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + sex + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + address + " " + phone_number + " " + new SimpleDateFormat("dd/MM/yyyy").format(day_company);
    }
    
}
