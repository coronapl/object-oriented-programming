/*******************************************************************************
*    Author: coronapl
*    Class: TestPetHotel
*    Description:
*    Test all of the classes cretated for the PetHotel.
*******************************************************************************/

public class TestPetHotel {

    public static void main(String [] args){
        Pet myDog = new Dog("dog necklace","blue");
        Pet myCat = new Cat("cat necklace","green");
        Pet myRabbit = new Rabbit("rabbit necklace","red");

        myDog.setName("Gober");
        myDog.setOwner("Silvana");

        myCat.setName("Olaf");
        myCat.setOwner("Brenda");

        myRabbit.setName("Bugs");
        myRabbit.setOwner("Gerardo");

        PetHotel petHotel = new PetHotel();
        petHotel.addPet(myDog);
        petHotel.addPet(myCat);
        petHotel.addPet(myRabbit);
        System.out.println("\nThere are 3 guests in the hotel \n");

        System.out.println("Let's feed the pets....\n");
        petHotel.feedPets();

        System.out.println("\nPets' information:\n");
        for(Pet pet: petHotel.getPets()){
            System.out.println(pet.getData());
            System.out.println("-------------");
        }
    }
}
