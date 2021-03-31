/*******************************************************************************
*    Author: coronapl
*    Class: Cat
*    Description:
*    Examples of composition, overloading and overriding.
*******************************************************************************/

public class Cat extends Pet {

    public Cat(String brand, String color) {
        // Composition -> creating and object of the class NeckLace
        neckLace = new NeckLace(brand, color);
    }

    // Overloading eat method
    public void eat(String food) {
        System.out.println("I am a cat and I am eating " + food);
    }

    // Overriding eat method
    public void drinkWater() {
        System.out.println("I am a cat and I drink water.");
    }
}
