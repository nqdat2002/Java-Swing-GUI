/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giuakypart2;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class SinhVien implements Serializable {
    private String name;
    private int age;
    private String id;
    
    public SinhVien(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return name + " " + age + " " + id;
    }
}
