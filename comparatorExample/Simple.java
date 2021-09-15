package collection.comparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Simple {
    public static void main(String[] args) {
        Books b1 = new Books(1299, "Taste Everything", "Adhira");
        Books b2 = new Books(1199, "1000 ways of cheating", "Rajat");
        Books b3 = new Books(199, "Shampoo", "Sakshi");

        ArrayList<Books> al = new ArrayList<Books>();
        al.add(b1);
        al.add(b2);
        al.add(b3);

        NameComparator nc = new NameComparator();
        Collections.sort(al, nc);

        Iterator<Books> itr = al.iterator();
        while(itr.hasNext()) {
            Books book = itr.next();
            System.out.println(book.price + " " + book.name + " " + book.author);
        }
        System.out.println("\n");

        PriceComparator pc = new PriceComparator();
        Collections.sort(al, pc);

        Iterator<Books> itr1 = al.iterator();
        while(itr1.hasNext()) {
            Books book1 = itr1.next();
            System.out.println(book1.price + " " + book1.name + " " + book1.author);
        }
        System.out.println("\n");


        AuthorComparator ac = new AuthorComparator();
        Collections.sort(al, ac);

        Iterator<Books> itr2 = al.iterator();
        while(itr2.hasNext()) {
            Books book2 = itr2.next();
            System.out.println(book2.price + " " + book2.name + " " + book2.author);
        }
        System.out.println("\n");

    }
}
