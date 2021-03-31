/*******************************************************************************
*    Author: coronapl
*    Class: Motorcycle
*    Description:
*    Define Motorcycle object structure and example of
*    aggregation and inheritance.
*******************************************************************************/

public class Motorcycle extends Vehicle {

    private int cubicCentimeters;

    public Motorcycle(int cubicCentimeters, Driver passenger) {
        this.cubicCentimeters = cubicCentimeters;
        this.passenger = passenger;
    }

    public void start() {
        System.out.println("The motorcycle is starting");
    }

    public void stop() {
        System.out.println("The motorcycle is stoping");
    }
}
