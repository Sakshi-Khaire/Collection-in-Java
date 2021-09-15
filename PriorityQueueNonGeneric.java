package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

class Book implements Comparable<Book> {
    private int id;
    private String name;
    private int price;
    private String author;

    public Book(int id, String name, int price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    public int compareTo(Book b) {
        if (id > b.id) {
            return -1;
        } else if (id < b.id) {
            return 1;
        } else {
            return 0;
        }
    }

}

public class PriorityQueueNonGeneric {
    public static void main(String[] args) {
        Book b1= new Book(7, "Ways of cheating", 999, "Rajat");
        Book b2 = new Book(2, "Ways to tolerate cheating", 499, "Sakshi");
        Book b3 = new Book(6, "infinite ways of falling", 1299, "Jholba");
        Book b4 = new Book(1, "Taste everything", 1499, "Adhira");

        PriorityQueue<Book> pqueue = new PriorityQueue<Book>();
        pqueue.add(b4);
        pqueue.add(b2);
        pqueue.add(b3);
        pqueue.add(b1);

        pqueue.remove();

        Iterator<Book> itr = pqueue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
