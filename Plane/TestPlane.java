/*******************************************************************************
*    Author: coronapl
*    Class: TestPlane
*    Description:
*    Test simple aggregation example.
*******************************************************************************/

public class TestPlane {

    public static void main (String[] args) {

        Passenger passenger1 = new Passenger("John", "First Class");
        Plane plane = new Plane(300, "American Airlines");

        plane.setPassenger(passenger1);

        System.out.println(plane.getData());
    }
}
