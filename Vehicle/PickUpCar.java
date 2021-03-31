/*******************************************************************************
*    Author: coronapl
*    Class: PickUpCar
*    Description:
*    Define PickUpCar object structure and example of inheritance
*    and aggregation.
*******************************************************************************/

public class PickUpCar extends Car {

    private float maxLoad;

    public PickUpCar(float maxLoad, Driver passenger, int numberOfDoors, int temp, String brand) {
        super(passenger, numberOfDoors, temp, brand);
        this.maxLoad = maxLoad;
    }

    public void start() {

        System.out.println("The pickup is starting");
    }

    public void stop() {

        System.out.println("The pickup is stoping ");
    }
}
