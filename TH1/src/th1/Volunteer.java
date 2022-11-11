package th1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Volunteer extends StaffMember{
    public Volunteer(String name, String address, String phone){
        super(name, address, phone);
    }
    
    @Override
    public double pay() {
        return 0;
    }
    
}
