/*******************************************************************************
*    Author: coronapl
*    Class: TestDriver
*    Description:
*    Program with examples of inheritance, composition, aggregation and
*    abstraction.
*******************************************************************************/

public class TestDriver {

    public static void main(String[] args) {

        Driver driver = new Driver("Pablo", 19);

        Vehicle car = new Car(driver, 4, 50, "Mazda");
        Vehicle pickup = new PickUpCar((float) 500.5, driver, 4, 50, "Mazda");
        Motorcycle moto = new Motorcycle(500, driver);

        car.start();
    }
}
