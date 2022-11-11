/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String name;
    private int age;
    private String id;
    
    public SinhVien(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
     public SinhVien(){
        this.name = "";
        this.age = 0;
        this.id = "";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return name + " " + age + " " + id;
    }
}
