/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiuaKy;

/**
 *
 * @author admin
 */
class Employee extends StaffMember implements Comparable <Employee> {
    private int workingDay;

    public Employee(){
    }
    
    public Employee(String name, int age, int workingDay){
        this.name = name;
        this.age = age;
        this.workingDay = workingDay;
    }

    public String getName(){
        return super.name;
    }

    public int getAge(){
        return super.age;
    }
    
    @Override
    public double Payment() {
        return workingDay * 10;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + workingDay + " " + Payment() + "$";
    }

    @Override
    public int compareTo(Employee o) {
        if (this.Payment() < o.Payment()) return -1;
        return 1;
    }
}