/*******************************************************************************
*    Author: coronapl
*    Class: PlayHangman
*    Description:
*    Create objects needed to play the game and execute the main logic.
*******************************************************************************/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayHangman {
    public static void main(String[] args) {

        int randomNum;
        int maxAttemps;
        int attemps = 0;
        int exit = 0;

        String letter;
        String guess = "";
        String newGuess = "";
        String oldGuess = "";
        String randomWord;

        ArrayList<Word> words = new  ArrayList<Word>();
        ArrayList<String> misses = new ArrayList<String>();

        Hangman man = new Hangman();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ReadFile reader = new ReadFile();

        // Read words from text file
        reader.readWords();
        words = reader.getWords();

        randomNum = random.nextInt(words.size());
        randomWord = words.get(randomNum).getWord();

        // The max number of attemps is the length of the word times 2
        maxAttemps = randomWord.length() * 2;

        for(int i=0; i < randomWord.length(); i++) {
            guess = guess.concat("*");
        }

        oldGuess = guess;

        do {

            System.out.println("\nThe word is: ");
            System.out.println(guess);

            System.out.println("\nType a letter: ");
            letter = scanner.nextLine();

            for(int i=0; i < randomWord.length(); i++) {
               if(letter.charAt(0) == randomWord.charAt(i)) {
                   newGuess = guess.substring(0, i) + letter + guess.substring(i + 1);
                   guess = newGuess;
               }
            }

            if(guess.equals(oldGuess)) {
                misses.add(letter);
                attemps += 1;
            }

            oldGuess = guess;

            System.out.println("\nMisses: ");
            System.out.println(misses);

            if(guess.equals(randomWord))
                exit = 1;

            if(attemps == 1)
                man.start();

            else if(attemps == 2)
                man.head();

            else if(attemps == 3)
                man.body();

            else if(attemps == 4)
                man.leftArm();

            else if(attemps == 5)
                man.rightArm();

            else if(attemps == 6)
                man.leftLeg();
            else if(attemps == 7)
                man.rightLeg();
            else if(attemps > 7)
                System.out.println(man.dying());

        } while(exit!=1 && attemps < maxAttemps);

       System.out.println(randomWord);
       scanner.close();
    }
}
