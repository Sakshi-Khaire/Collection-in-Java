package collection.Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Book {
    int ID;
    String author;
    int price;
    String name;


    public Book(int iD, String author, int price, String name) {
        ID = iD;
        this.author = author;
        this.price = price;
        this.name = name;
    }
}

public class HastSetNonGenericPrac {
    public static void main(String[] agrs) {
        HashSet<Book> bookSet = new HashSet<Book>();
        Book book1 = new Book(1, "Rajat", 599, "101 ways of cheating");
        Book book2 = new Book(2, "Sakshi", 399, "3000 years of adjusting with cheater"); 
        Book book3 = new Book(3, "Athashri", 499, "Adavnce Internet Learning"); 
        Book book4 = new Book(4, "Adhira", 799, "Taste Everything");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);


        Iterator<Book> itr = bookSet.iterator();
        while(itr.hasNext()) {
            Book b = itr.next();
            System.out.println(b.ID + " " + b.author + " " + b.price + " " + b.name);
        }
    }
} 
