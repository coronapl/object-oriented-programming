/*******************************************************************************
*    Author: coronapl
*    Class: Ingredient
*    Description:
*    Return the information of the ingredients of a medicine.
*******************************************************************************/

public class Ingredient {

    private String name;
    private float milligrams;

    public Ingredient(String name, float milligrams) {
        this.name = name;
        this.milligrams = milligrams;
    }

    // Setters and getters of the class

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMilligrams(float milligrams) {
        this.milligrams = milligrams;
    }

    public float getMilligrams() {
        return milligrams;
    }

    public String getIngredientData() {
        return String.format("\nName: %s | Milligrams: %f", name, milligrams);
    }
}
