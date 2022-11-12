package NhapLop;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Student {
    private String id;
    private String name;
    private int age;
    
    public Student(){
        this.id = "";
        this.name = "";
        this.age = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Student(int cnt, String name, int age){
        this.id = "SV" + String.format("%03d", cnt);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static Student nextStudent(Scanner sc, int cnt){
        return new Student(cnt, sc.nextLine(), Integer.valueOf(sc.nextLine()));
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + age;
    }
}
