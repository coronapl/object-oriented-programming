/*******************************************************************************
*    Author: coronapl
*    Class: Pokemon
*    Description:
*    Example of static attributes and methods.
*******************************************************************************/

public class Pokemon {

    protected static int counter;

    public static String testStaticMethod(){
        return("This is a static method from the class Pokemon");
    }

    public String attack () {
        return("Pokemon is attacking");
    }

    public static int getCounter() {
        return(counter);
    }
}
