/*******************************************************************************
*    Author: coronapl
*    Class: Passenger
*    Description:
*    Define Passenger object structure.
*******************************************************************************/

public class Passenger {

    private String name;
    private String travelClass;

    public Passenger(String name, String travelClass) {
        this.name = name;
        this.travelClass = travelClass;
    }

    public String getPassengerData() {
        return ("\n\nPassenger: \nname: " + name + " travel class: " + travelClass);
    }
}
