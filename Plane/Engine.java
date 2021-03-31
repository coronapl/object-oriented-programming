/*******************************************************************************
*    Author: coronapl
*    Class: Engine
*    Description:
*    Define Engine object structure.
*******************************************************************************/

public class Engine {

    private int rpm;
    private String model;

    public Engine(int rpm, String model) {
        this.rpm = rpm;
        this.model = model;
    }

    public String getEngineData() {
        return ("\n\nEngine: \nrpm: " + rpm + " model: " + model);
    }
}
