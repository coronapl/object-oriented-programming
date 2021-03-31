/*******************************************************************************
*    Author: coronapl
*    Class: PetHotel
*    Description:
*    Example of aggregation.
*******************************************************************************/

import java.util.*;

public class PetHotel {

    private ArrayList<Pet> pets = new ArrayList<Pet>();

    // Agregation -> pets are added to the ArrayList
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void feedPets() {
        for (int i = 0; i < pets.size(); i++) {
            pets.get(i).eat();
            pets.get(i).drinkWater();
        }
    }
}
