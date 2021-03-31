/*******************************************************************************
*    Author: coronapl
*    Class: Medicine
*    Description:
*    Blueprint of a medicine. All ingredients are created from
*    this class to demonstrate the use of composition.
*******************************************************************************/

import java.util.*;

public class Medicine{

    private String name;
    private String category;
    private String expirationDate;
    private int numberPills;
    private ArrayList<Ingredient> ingredients;

    public Medicine(String name, String category, String expirationDate, int numberPills) {
        this.name = name;
        this.category = category;
        this.expirationDate = expirationDate;
        this.numberPills = numberPills;
        ingredients = new ArrayList<Ingredient>();
    }

    // Setters and getters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate(String expirationDate) {
        return expirationDate;
    }

    public void setNumberPills(int numberPills) {
        this.numberPills = numberPills;
    }

    public int getNumberPills() {
        return numberPills;
    }

    public void addIngredient(String name, float milligrams) {
        // Create Ingredient instance and add it to the ingredients array of the medicine
        Ingredient ingredient = new Ingredient(name, milligrams);
        ingredients.add(ingredient);
    }

    public String getData() {

        String medicineIng = "";

        for(int i=0; i < ingredients.size(); i++) {
            medicineIng = medicineIng.concat(ingredients.get(i).getIngredientData());
        }

        return String.format("\nName: %s \nCategory: %s \nExpiration date: %s \nNumber of pills: %d \nIngredients: %s\n", name, category, expirationDate, numberPills, medicineIng);
    }
}
