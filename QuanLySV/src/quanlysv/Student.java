/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysv;

/**
 *
 * @author ASUS
 */
public class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Student o) {
       if(this.age>o.age)
           return 1;
       else if(this.age<o.age)
           return -1;
       else return 0;
    }
    
    
}
