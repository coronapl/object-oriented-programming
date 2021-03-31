/*******************************************************************************
*    Author: coronapl
*    Class: Rabbit
*    Description:
*    Examples of composition, overloading and overriding.
*******************************************************************************/

public class Rabbit extends Pet {

    public Rabbit(String brand, String color) {
        // Composition -> Creating and object of the class NeckLace
        neckLace = new NeckLace(color, brand);
    }

    // Overriding eat method
    public void eat() {
        System.out.println("I am a rabbit and I am eating");
    }

    // Overloading eat method
    public void eat(String food) {
        System.out.println("I am a rabbit and I am eating " + food);
    }

    // Overriding drinkWater
    public void drinkWater() {
        System.out.println("I am a rabbit and I drink water.");
    }
}
