/*******************************************************************************
*    Author: coronapl
*    Class: FirePokemon
*    Description:
*    Inheritance example and use of static attributes and methods.
*******************************************************************************/

public class FirePokemon extends Pokemon {

    public FirePokemon(){
        counter++;
    }

    public static String testStaticMethod(){
        return("This is a static method from the class FirePokemon");
    }

    public String attack () {
        return("FirePokemon is attacking");
    }

    public static int getCounter() {
        return(counter);
    }
}
