/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1;

/**
 *
 * @author admin
 */
public class Staff {
    private StaffMember [] staffList;
    public void init(){
        staffList = new StaffMember[3];
        staffList[0] = new Volunteer("Dat", "Dan Phuong", "0948669343");
        staffList[1] = new Executive("Dat", "Dan Phuong", "0948669343", "NV01", 200000, 10);
        staffList[2] = new Hourly("Dat", "Dan Phuong", "0948669343", "NV01", 200000, 5);
    }
    public void payday(){
        double sum = 0;
        for(int i = 0; i < staffList.length; ++i){
            sum += staffList[i].pay();
        }
        System.out.println(String.format("%.3f", (double)(sum)));
        for(StaffMember x: staffList){
            System.out.println(x);
        }
    }
}
