/*******************************************************************************
*    Author: coronapl
*    Class: Driver
*    Description:
*    Define Driver object structure.
*******************************************************************************/

public class Driver {

    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("Hello " + name + "hello" + age);
    }
}
