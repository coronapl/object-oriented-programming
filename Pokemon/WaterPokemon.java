/*******************************************************************************
*    Author: coronapl
*    Class: WaterPokemon
*    Description:
*    Inheritance example and use of static attributes and methods.
*******************************************************************************/

public class WaterPokemon extends Pokemon {

    public WaterPokemon() {
        counter++;
    }

    public static String testStaticMethod(){
        return("This is a static method from the class WaterPokemon");
    }

    public String attack () {
        return("WaterPokemon is attacking");
    }

    public static int getCounter() {
        return(counter);
    }
}
