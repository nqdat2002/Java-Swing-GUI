/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giuakypart2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class InitFile {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, ClassNotFoundException {

        FileOutputStream sfw = new FileOutputStream(new File("C:\\Users\\admin\\Documents\\NetBeansProjects\\GiuaKyPart2\\data.in"));
        ObjectOutputStream oopw = new ObjectOutputStream(sfw);
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("Dat", 20, "B20DCPT053"));
        list.add(new SinhVien("Huy", 21, "B20DCPT094"));
        oopw.writeObject(list);
        oopw.close();
        sfw.close();
        
        FileInputStream sfr = new FileInputStream(new File("C:\\Users\\admin\\Documents\\NetBeansProjects\\GiuaKyPart2\\data.in"));
        ObjectInputStream oopr = new ObjectInputStream(sfr);
        List<SinhVien> lists = (ArrayList<SinhVien>)oopr.readObject();
        for(SinhVien x: lists){
            System.out.println(x);
        }
        oopr.close();
        sfr.close();
    }
}
