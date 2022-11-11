/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1;

/**
 *
 * @author admin
 */
public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    
    public StaffMember(){
        this.name = "";
        this.address = "";
        this.phone = "";
    }
    
    public StaffMember(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " " + address + " " + phone;
    }
    
    public abstract double pay();
}
