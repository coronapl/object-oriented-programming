/*******************************************************************************
*    Author: coronapl
*    Class: Word
*    Description:
*    Construct word objects.
*******************************************************************************/

public class Word {

    private String word;
    private int length;

    public Word(String word, int length) {
        this.word = word;
        this.length = length;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
