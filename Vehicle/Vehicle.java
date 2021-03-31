/*******************************************************************************
*    Author: coronapl
*    Class: Vehicle
*    Description:
*    Define abstract Vehicle class.
*******************************************************************************/

public abstract class Vehicle {

    protected Driver passenger;

    public void setDriver(Driver passenger) {
        this.passenger = passenger;
    }

    public abstract void start();

    public abstract void stop();

}
