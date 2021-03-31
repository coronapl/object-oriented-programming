/*******************************************************************************
*    Author: coronapl
*    Class: AirConditioner
*    Description:
*    Define AirConditioner objects structure.
*******************************************************************************/

public class AirConditioner {

    private int temp;
    private String brand;

    public AirConditioner(int temp, String brand) {
        this.temp = temp;
        this.brand = brand;
    }

    public String toString() {
        return (temp + brand);
    }
}
