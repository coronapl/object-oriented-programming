/*******************************************************************************
*    Author: coronapl
*    Class: Plane
*    Description:
*    Define Plane objects structure and example of composition.
*******************************************************************************/

public class Plane {

    private int capacity;
    private String airline;
    private Engine engine;
    private Passenger passenger1;

    public Plane (int capacity, String airline) {
        this.capacity = capacity;
        this.airline = airline;
        this.engine = new Engine(5000, "NGX");
    }

    public void setPassenger(Passenger passenger1) {
        this.passenger1 = passenger1;
    }

    public String getData() {
        return (this.getAirplaneData() + engine.getEngineData() + passenger1.getPassengerData());
    }

    public String getAirplaneData() {
        return ("\nplane: \ncapacity: " + capacity + " airline: " + airline);
    }
}
