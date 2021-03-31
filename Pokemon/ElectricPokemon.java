/*******************************************************************************
*    Author: coronapl
*    Class: ElectricPokemon
*    Description:
*    Inheritance example and use of static attributes and methods.
*******************************************************************************/

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(){
        counter++;
    }

    public static String testStaticMethod(){
        return("This is a static method from the class ElectricPokemon");
    }

    public String attack () {
        return("ElectricPokemon is attacking");
    }

    public static int getCounter() {
        return(counter);
    }
}
