/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhapLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QLSV implements Menu{
    public static Scanner sc = new Scanner(System.in);
    public static List<Student> list = new ArrayList<>();
    QLSV(){
        
    }
    
    public static void main(String [] args){
        int count = 1;
        QLSV ql = new QLSV();
        ql.Show();
        while (true){
            int n = Integer.valueOf(sc.nextLine());

            if(n == 1){
                int sl = Integer.valueOf(sc.nextLine());
                ql.Add(count, sl);
                count += sl;
            }
            if(n == 2){
                ql.ShowStudent();
            }
            if(n == 3){
                int id = Integer.valueOf(sc.nextLine());
                ql.Delete(id);
            }
            if (n == 4){
                ql.Sort1();
            }
            if (n == 5){
                ql.Sort2();
            }
            if(n == 6){ 
                int id = Integer.valueOf(sc.nextLine());
                int age = Integer.valueOf(sc.nextLine());
                String newname = sc.nextLine();
                ql.Edit(id, age, newname);
            }
            if(n == 7){
                String SearchName = sc.nextLine();
                ql.Search(SearchName);
            }
            if(n == 8){
                ql.Exit();
                break;
            }
            ql.Show();
        }
    }
    @Override
    public void Show(){
        System.out.println("Lua chon cua ban: ");
        System.out.println("1. Them SV");
        System.out.println("2. Xem DSSV");
        System.out.println("3. Xoa SV");
        System.out.println("4. Sap xep SV theo ten");
        System.out.println("5. Sap xep SV theo tuoi");
        System.out.println("6. Sua thong tin SV");
        System.out.println("7. Tim kiem theo ten");
        System.out.println("8. Thoat");
    }

    @Override
    public void ShowStudent() {
        for (Student ss: list) System.out.println(ss);
    }

    @Override
    public void Add(int thiscount, int thatcount) {
        for(int i = thiscount; i < thiscount + thatcount; ++i) list.add(Student.nextStudent(sc, i));
    }

    @Override
    public void Exit() {
        System.out.println("End Program!");
    }

    @Override
    public void Sort1() {
        Collections.sort(list, (Student o1, Student o2)->(o1.getName().compareTo(o2.getName())));
    }

    @Override
    public void Sort2() {
        Collections.sort(list, (Student o1, Student o2)->(o1.getAge() - o2.getAge()));
    }

    @Override
    public void Delete(int id) {
        for(Student a: list){
            if(a.getId().compareTo("SV" + String.format("%03d", id)) == 0){
                list.remove(a);
                break;
            }
        }
    }
    
    @Override
    public void Edit(int id, int age, String name){
        for(Student a: list){
            if(a.getId().compareTo("SV" + String.format("%03d", id)) == 0){
                a.setAge(age);
                a.setName(name);
                break;
            }
        }
    }

    @Override
    public void Search(String name) {
        for(Student a: list){
            if(a.getName().contains(name)){
                System.out.println(a);
            }
        }
    }
}
