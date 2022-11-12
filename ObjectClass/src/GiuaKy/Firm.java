/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiuaKy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Firm {
    public static List <Employee> list = new ArrayList<>();
    public static void addEmployee(List <Employee> list, Employee a){
        list.add(a);
    }

    public static void removeEmployee(List <Employee> list, String name){
        for(Employee e: list){
            if(e.getName().compareTo(name) == 0){
                list.remove(e);
                break;
            }
        }
    }

    public static void findEmployee(List <Employee> list, String name) {
        for (Employee x : list) {
            if (x.getName().equals(name)) System.out.println(x);
        }
    }

    public static void sortEmployeeList(List <Employee> list){
        Collections.sort(list);
    }

    public static void findMaxSalary(List <Employee> list){
        System.out.println(list.get(list.size() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Moi ban nhap lua chon:");
        System.out.println("1. Them Employee vao danh sach");
        System.out.println("2. Xoa Employee trong danh sach");
        System.out.println("3. Tim thong tin Employee theo ten");
        System.out.println("4. Sap xep danh sach theo thu tu luong tang dan");
        System.out.println("5. Tim thong tin Employee co luong cao nhat");
        System.out.println("6. Thoat!");

        while(true){
            System.out.println("Moi ban nhap lua chon:");
            int option = Integer.valueOf(sc.nextLine());
            if(option == 1){
                System.out.println("Nhap thong tin nhan vien can them");
                Employee a = new Employee(sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()));
                addEmployee(list, a);
            }
            
            if(option == 2){
                System.out.println("Nhap ten nhan vien can xoa");
                String newname = sc.nextLine();
                removeEmployee(list, newname);
            }
            
            if(option == 3){
                System.out.println("Nhap ten nhan vien can tim");
                String newname = sc.nextLine();
                findEmployee(list, newname);
            }
            
            if(option == 4){
                sortEmployeeList(list);
            }
            
            if(option == 5){
                sortEmployeeList(list);
                findMaxSalary(list);
            }
            
            if(option == 6){
                System.out.println("Ket thuc chuong trinh!!!");
                break;
            }
        }
    }
}





