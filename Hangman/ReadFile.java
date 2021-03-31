/*******************************************************************************
*    Author: coronapl
*    Class: ReadFile
*    Description:
*    Read a list of words from a text file.
*******************************************************************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {

    private String word;
    private int length;
    private ArrayList<Word> words = new ArrayList<Word>();

    public void readWords() {
        try {
            File info = new File("words.txt");
            Scanner scanner = new Scanner(info);

            while(scanner.hasNextLine()) {

                word = scanner.next();
                length = word.length();

                Word wordObj = new Word(word, length);
                words.add(wordObj);
            }

            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public ArrayList<Word> getWords() {
        return words;
    }
}
