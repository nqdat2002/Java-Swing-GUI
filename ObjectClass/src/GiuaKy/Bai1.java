/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiuaKy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 5 so nguyen cho danh sanh 1:");
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 5; ++i) l.add(sc.nextInt());
        
        System.out.println("Nhap 5 so nguyen cho danh sanh 2:");
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < 5; ++i) l2.add(sc.nextInt());
        
        System.out.print("Danh sach gop la:");
        
        List<Integer> res = new ArrayList<>();
        for(int x: l){
            res.add(x);
        }
        for(int x: l2){
            res.add(x);
        }
        
        for(int x: res){
            System.out.print(x + " ");   
        }
    }
}
