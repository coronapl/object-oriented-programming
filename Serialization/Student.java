/*******************************************************************************
*    Author: coronapl
*    Class: Student
*    Description:
*    Simple Student class that implements Serializable.
*******************************************************************************/

import java.io.*;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;

    public Student (String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Setters and getters

    public void setname(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge() {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getData () {
        return (name + " " + age + " " + address);
    }
}
