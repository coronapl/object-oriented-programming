/*******************************************************************************
*    Author: coronapl
*    Class: Car
*    Description:
*    Car objects structure, example of inheritance, aggregation
*    and composition.
*******************************************************************************/

public class Car extends Vehicle {

    protected int numberOfDoors;
    protected AirConditioner ac;

    public Car(Driver passenger, int numberOfDoors, int temp, String brand) {
        this.passenger = passenger;
        this.numberOfDoors = numberOfDoors;
        ac = new AirConditioner(temp, brand);
    }

    public void start() {
        System.out.println("The car is starting");
    }

    public void stop() {
        System.out.println("The car is stoping");
    }

    public void reverse() {
        System.out.println("The car is in reverse");
    }
}
