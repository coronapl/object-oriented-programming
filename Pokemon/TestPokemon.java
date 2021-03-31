/*******************************************************************************
*    Author: coronapl
*    Class: TestPokemon
*    Description:
*    Test static methods and overriding results.
*******************************************************************************/

import java.util.ArrayList;

public class TestPokemon {

    public static void main(String args[]) {

        ArrayList<Pokemon> listPokemon = new ArrayList<>();

        System.out.println("\nTesting the static methods from each class: ");

        System.out.println(Pokemon.testStaticMethod());
        System.out.println(WaterPokemon.testStaticMethod());
        System.out.println(ElectricPokemon.testStaticMethod());
        System.out.println(FirePokemon.testStaticMethod());

        Pokemon picachu = new ElectricPokemon();
        Pokemon raichu = new ElectricPokemon();
        Pokemon lapras = new WaterPokemon();
        Pokemon vulpix = new FirePokemon();

        System.out.println("\nCounter of Pokemons: ");
        System.out.println("Pokemon: " + Pokemon.getCounter());

        listPokemon.add(picachu);
        listPokemon.add(raichu);
        listPokemon.add(lapras);
        listPokemon.add(vulpix);

        // Example of overriding
        System.out.println("\nAttack method of each class: ");
        for(int i=0; i < listPokemon.size(); i++) {
            System.out.println(listPokemon.get(i).attack());
        }

    }
}
