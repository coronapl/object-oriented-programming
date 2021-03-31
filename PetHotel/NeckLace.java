/*******************************************************************************
*    Author: coronapl
*    Class: NeckLace
*    Description:
*    This class is instantiated in multiples classes as an example of
*    composition.
*******************************************************************************/

public class NeckLace {

    private String color;
    private String brand;

    public NeckLace(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getData() {
        return (" color: " + color + " brand" + brand);
    }
}
