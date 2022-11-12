/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhapLop;

/**
 *
 * @author admin
 */
public class Chicken extends Animal implements Edible{
    @Override
    public void Sound(){
        System.out.println("Chicken is eating!");
    }

    @Override
    public void HowtoEat() {
        System.out.println("Can Eat!");
    }
}
