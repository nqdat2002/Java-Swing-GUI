/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1;

/**
 *
 * @author admin
 */
public class Executive extends Employee{
    private double bonus;

    public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate, double bonus) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.bonus = bonus;
    }

    public void awardBonus(double execBonus){
        
    }

    @Override
    public double pay(){
        return super.payRate + this.bonus;
    }
}
