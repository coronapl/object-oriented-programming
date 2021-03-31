/*******************************************************************************
*    Author: coronapl
*    Class: TestBook
*    Description:
*    Create objects and test overriding and overloading methods.
*******************************************************************************/

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();

        Book book1 = new Book("Calculus", "James Stewart", 3200 , 1986);
        Book book2 = new Dictionary("Longman Dictionary of Contemporary English", "No author", 1000, 2014);
        Book book3 = new Novel("The Godfather", "Mario Puzo", 446 , 1969);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        for(int i=0; i < books.size(); i++) {
            System.out.println(books.get(i).getData());
        }

        books.get(0).findQuote("This book is about calculus");
        books.get(1).findQuote("Apple: a fruit that grows in a tree", 26);
        books.get(2).findQuote("I'm gonna make him an offer he can't refuse", 312);
    }
}
