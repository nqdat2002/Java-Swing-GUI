/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testfile;

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
public class FileProcess {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, ClassNotFoundException {
//        try{
//            DataOutputStream dfo = new DataOutputStream(new FileOutputStream(new File("C:\\Users\\admin\\Documents\\NetBeansProjects\\ObjectClass\\src\\JFrame_Demo\\data.txt")));
//            dfo.write(3);
//            dfo.writeInt(200);
//            dfo.close();
//        }catch(IOException e){
//            System.out.println("Loi ghi file!");
//        }
//        
//        try{
//            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\admin\\Documents\\NetBeansProjects\\ObjectClass\\src\\JFrame_Demo\\data.txt")));
//            String s = "";
//            while((s = br.readLine()) != null){
//                System.out.println(s);
//            }
//            br.close();
//        }catch(IOException e){
//            System.out.println("Loi ghi file!");
//        }

        FileOutputStream sfw = new FileOutputStream(new File("C:\\Users\\admin\\Documents\\NetBeansProjects\\TestFile\\data.in"));
        ObjectOutputStream oopw = new ObjectOutputStream(sfw);
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien(1, "NDat", "D20", "27/06/2002", (float)(2.9)));
        list.add(new SinhVien(2, "NQDat", "D21", "27/06/2002", (float)(3.0)));
        oopw.writeObject(list);
        oopw.close();
        sfw.close();
        
        FileInputStream sfr = new FileInputStream(new File("C:\\Users\\admin\\Documents\\NetBeansProjects\\TestFile\\data.in"));
        ObjectInputStream oopr = new ObjectInputStream(sfr);
        List<SinhVien> lists = (ArrayList<SinhVien>)oopr.readObject();
        for(SinhVien x: lists){
            System.out.println(x);
        }
        oopr.close();
        sfr.close();
    }
}
