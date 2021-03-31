/*******************************************************************************
*    Author: coronapl
*    Class: Book
*    Description:
*    Example of overloading.
*******************************************************************************/

public class Book {

    protected String title;
    protected String author;
    protected int pages;
    protected int year;

    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    // Setters and getters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

   public int getYear() {
       return year;
   }

   // Method to obtain the information of a book
    public String getData() {
       return String.format("\nBook information: \nTitle: %s \nAuthor: %s \nPages: %d \nYear: %d", title, author, pages, year);
    }

    // Examples of overloading

    public void findQuote(String quote) {
        System.out.println(String.format("\nThe quote '%s' was found in the book." , quote));
    }

    public void findQuote(String quote, int page) {
        System.out.println(String.format("\nThe quote '%s' was found in the page %d." , quote, page));
    }
}
