/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1;

/**
 *
 * @author admin
 */
public class Hourly extends Employee{
    private int hoursWorked;
    
    public Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate, int hoursWorked) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.hoursWorked = hoursWorked;
    }
    
    public void addHours (int moreHours){
        System.out.println(this.hoursWorked);
    }
    
    @Override
    public double pay(){
        return super.payRate * this.hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.hoursWorked;
    }

}
