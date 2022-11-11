/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class QuanLySV implements Menu{
    QuanLySV(){
        
    }

    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);   
        List<Student> student = new ArrayList<Student>();
        QuanLySV qlsv = new QuanLySV();
        while (true){
            System.out.println("----------Menu---------");
            System.out.println("1. Thêm SV");
            System.out.println("2. Xem danh sách");
            System.out.println("3. Sắp xếp theo tuoi");
            System.out.println("4. Sắp xếp theo ten");
            System.out.println("5. Xóa");
            System.out.println("6. Tìm kiếm theo tên");
            System.out.println("7. Sửa thông tin");
            System.out.println("8. Thoát");
            System.out.println("---------******--------");
            System.out.println("Nhập lựa chọn: ");
            int n = s.nextInt();
            switch(n){
                case 1:
                    qlsv.themSV(student);
                    break;
                case 2:
                    qlsv.xemDS(student);
                    break;
                case 3: 
                    qlsv.sapxepTuoi(student);
                    break;
                case 4: 
                    qlsv.sapxepTen(student);
                    break;
                case 5:
                    qlsv.xoaDS(student);
                    break;
                case 6:
                    qlsv.timkiemTen(student);
                    break;
                case 7:
                    qlsv.suathongtinSV(student);
                    break;
                case 8:  
                    qlsv.thoat();                    
            }        
  
        } 
    }

    public void themSV(List<Student> student) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String name = s.nextLine();
        System.out.println("Nhap tuoi:");
        int age = s.nextInt();    
        student.add(new Student(name,age));
    }

    @Override
    public void xemDS(List<Student> student) {
       for(Student s:student){
           System.out.println(s.toString());
       }
    }

    @Override
    public void xoaDS(List<Student> student) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten muốn xóa:");
        String name = s.nextLine();
        System.out.println("Nhap tuoi muốn xóa:");
        int age = s.nextInt();   
        Iterator<Student> st = student.iterator();
        while(st.hasNext()){
            Student o = st.next();
            if(o.getName().equals(name) && o.getAge()==age)
                st.remove();
        }

    }

    @Override
    public void thoat() {
        System.exit(0);
    }

    @Override
    public void sapxepTuoi(List<Student> student) {
        Collections.sort(student,new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
            
        });        
    }

    @Override
    public void sapxepTen(List<Student> student) {
        Collections.sort(student,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }            
        });

    }

    @Override
    public void timkiemTen(List<Student> student) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten muốn tìm kiếm:");
        String name = s.nextLine();  
        Iterator<Student> st = student.iterator();
        while(st.hasNext()){
            Student o = st.next();
            if(o.getName().compareTo(name)==0)
                System.out.println(o.toString());
        }
        
    }

    @Override
    public void suathongtinSV(List<Student> student) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten muốn sửa:");
        String name = s.nextLine();  
        Iterator<Student> st = student.iterator();
        while(st.hasNext()){
            Student o = st.next();
            if(o.getName().compareTo(name)==0){
                System.out.println("Nhap ten mới:");
                String newname = s.nextLine(); 
                o.setName(newname);                
            }                
                
        }
    }
    
}
