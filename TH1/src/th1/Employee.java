/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1;

/**
 *
 * @author admin
 */
public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee() {
    }

    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + this.socialSecurityNumber + " " + this.payRate;
    }

    @Override
    public double pay(){
        return this.payRate;
    }
}
