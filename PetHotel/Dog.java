/*******************************************************************************
*    Author: coronapl
*    Class: Dog
*    Description:
*    Examples of composition, overloading and overriding.
*******************************************************************************/

public class Dog extends Pet {

    public Dog(String brand, String color) {
        // Composition -> creating and object of the class NeckLace
        neckLace = new NeckLace(brand, color);
    }

    // Overloading the method eat
    public void eat(String food) {
        System.out.println("I am a dog and I am eating " + food);
    }

    // Overriding the abstract method drinkWater
    public void drinkWater() {
        System.out.println("I am a dog and I drink water.");
    }
}
