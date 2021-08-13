package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * It uses dynamic array for storing the elements It inherits AbstractList and
 * implements List
 * 
 * 
 * Contain duplicate elements Maintains insertion order It is non synchronised
 * Allow random acces as array works on index basis Manipulation of data is
 * slower than the linkedlist as shiffting occurs
 */

public class ArrayListImp {

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Initialization of ArrayList
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sakshi");
        list.add("Rajat");
        list.add("Riya");
        list.add("Cheater");
        list.add("Sakshi");


        /**
         * Methods of ArrayList
         * indexOf(Object o) return index in ArrayList where o is present (-1 for not found)
         */
        int isPresent = list.indexOf("Sakshi");
        if (isPresent == -1) {
            System.out.println("Does not contain this element");
        } else {
            System.out.println("index of sakshi is:" + isPresent);
        }

        if (list.contains("Riya")) {
            System.out.println("It is present");
        } else {
            System.out.println("It is not present");
        }

        if (list.remove("Sakshi")) {
            System.err.println("Sakshi is removed");
        } else {
            System.err.println("Unable to find in the list");
        }

        /**
         * Check whether the ArrayList is empty of not
         */
        if (list.isEmpty()) {
            System.out.println("List is MT");
        } else {
            System.out.println("Contain elemets");
        }

        /**
         * To get the size of list
         */
        System.out.println("Size of list is:" + list.size());

        System.out.println(list);

        /**
         * Printing elements using iterator
         */
        System.out.println("\nList : ");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        /**
         * Printing using each loop
         */
        System.out.println("\nList : printing using for-each loop");
        for (String names : list) {
            System.out.println(names);
        }

        /**
         * Sorting the ArrayList using Collectionsort() method
         */
        Collections.sort(list);
        System.out.println("\nSorted array : ");
        Iterator<String> itr1 = list.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        /**
         * Print by using forEach loop
         */
        System.out.println("\nUsing forEach loop (lambda function)");
        list.forEach((name) -> {
            System.out.println(name);
        });

        /**
         * Print using forEachRemaining loop
         */
        System.out.println(("\nUsing For-EachRemaining loop")); 
        Iterator<String> itr2 = list.iterator();
        itr2.forEachRemaining(name -> {
            System.out.println(name);
        });

    }
}
