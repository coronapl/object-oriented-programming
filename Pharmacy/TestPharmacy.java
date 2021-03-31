/*******************************************************************************
*    Author: coronapl
*    Class: TestPharmacy
*    Description:
*    Obtain information from the user, create objects and write information
*    to a text file.
*******************************************************************************/

import java.util.*;

public class TestPharmacy {
    public static void main(String args[]) {

        String letterMed, letterIng;
        String name;
        String category;
        String expirationDate;
        int numberPills;
        String nameIngredient;
        float milligrams;
        String information;

        Pharmacy myPharmacy = new Pharmacy();
        Scanner myScanner = new Scanner(System.in);
        WriteFile writer = new WriteFile();

        System.out.println("\nPHARMACY\n");

        do {

            System.out.println("\nDo you want to enter a medicine? (y/n)");
            letterMed = myScanner.nextLine();

            if(letterMed.charAt(0) == 'Y' || letterMed.charAt(0) == 'y') {
                System.out.println("\nMedicine");

                // Read medicine information from the user
                System.out.print("Name: ");
                name = myScanner.nextLine();

                System.out.print("Category: ");
                category = myScanner.nextLine();

                System.out.print("Expiration date: ");
                expirationDate = myScanner.nextLine();

                System.out.print("Number of pills: ");
                numberPills = myScanner.nextInt();
                myScanner.nextLine();

                // Create medicine object
                Medicine medicine = new Medicine(name, category, expirationDate, numberPills);

                // Add medicine to the pharmacy instance
                myPharmacy.addMedicine(medicine);

                do {
                    System.out.println("\nIngredient");

                    // Read ingredients of medicine
                    System.out.print("Name: ");
                    nameIngredient = myScanner.nextLine();

                    System.out.print("Milligrams: ");
                    milligrams = myScanner.nextFloat();
                    myScanner.nextLine();

                    // Create ingredient in medicine class
                    medicine.addIngredient(nameIngredient, milligrams);

                    System.out.println("\nDo you want to introduce another ingredient? (y/n)");
                    letterIng = myScanner.nextLine();
                } while(letterIng.charAt(0) != 'n' && letterIng.charAt(0) != 'N');
            }
        } while(letterMed.charAt(0) != 'n' && letterMed.charAt(0) != 'N');

        // Write information to a text file
        information = myPharmacy.getMedicines();
        System.out.println(information);
        writer.writeFile(information);
    }
}
