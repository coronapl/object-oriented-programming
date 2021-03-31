/*******************************************************************************
*    Author: coronapl
*    Class: Novel
*    Description:
*    Example of overriding.
*******************************************************************************/

public class Novel extends Book {

    public Novel(String title, String author, int pages, int year) {
        super(title, author, pages, year);
    }

    // This method is overriding the method getData from the Book class
    public String getData() {
        return String.format("\nThis book is a novel: \nTitle: %s \nAuthor: %s \nPages: %d \nYear: %d", title, author, pages, year);
    }
}
