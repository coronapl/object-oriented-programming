/*******************************************************************************
*    Author: coronapl
*    Class: Hangman
*    Description:
*    Represent the state of the hangman.
*******************************************************************************/

public class Hangman {

    // After one incorrect letter
     public void start() {
        System.out.println("\n— — — — —    ");
        System.out.println("|        |   ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("— — — — —    ");
    }

    // After two incorrect letters
    public void head() {
        System.out.println("\n— — — — —    ");
        System.out.println("|        |   ");
        System.out.println("|        O   ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("— — — — —    ");
    }

    // After three incorrect letters
    public void body() {
        System.out.println("\n— — — — —    ");
        System.out.println("|        |   ");
        System.out.println("|        O   ");
        System.out.println("|        |   ");
        System.out.println("|        |   ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("— — — — —    ");
    }

    // After four incorrect letters
    public void leftArm() {
        System.out.println("\n— — — — —    ");
        System.out.println("|        |   ");
        System.out.println("|        O   ");
        System.out.println("|      / |   ");
        System.out.println("|        |   ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("— — — — —    ");
    }

    // After five incorrect letters
    public void rightArm() {
        System.out.println("\n— — — — —    ");
        System.out.println("|        |   ");
        System.out.println("|        O   ");
        System.out.println("|      / | \\");
        System.out.println("|        |   ");
        System.out.println("|            ");
        System.out.println("|            ");
        System.out.println("— — — — —    ");
    }

    // After six incorrect letters
    public void leftLeg() {
        System.out.println("\n— — — — —    ");
        System.out.println("|        |   ");
        System.out.println("|        O   ");
        System.out.println("|      / | \\");
        System.out.println("|        |   ");
        System.out.println("|      /     ");
        System.out.println("|            ");
        System.out.println("— — — — —    ");
    }

    // After seven incorrect letters
    public void rightLeg() {
        System.out.println("\n— — — — —    ");
        System.out.println("|        |   ");
        System.out.println("|        O   ");
        System.out.println("|      / | \\");
        System.out.println("|        |   ");
        System.out.println("|      /   \\");
        System.out.println("|            ");
        System.out.println("— — — — —    ");
    }

    // After eight or more incorrect letters
    public String dying() {
        return ("Hangman is about to die");
    }
}
