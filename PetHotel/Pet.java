/*******************************************************************************
*    Author: coronapl
*    Class: Pet
*    Description:
*    Example of abstract class that aggregates to PetHotel.
*******************************************************************************/

public abstract class Pet {

    protected String name;
    protected String owner;
    protected NeckLace neckLace;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public String getData() {
        return ("Name: " + name + " Owner: " + owner + neckLace.getData());
    }

    public void eat() {
        System.out.println("Pet is eating");
    }

    public abstract void drinkWater();
}
