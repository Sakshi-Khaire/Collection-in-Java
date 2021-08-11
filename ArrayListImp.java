package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * It uses dynamic array for storing the elements
 * It inherits AbstractList and implements List
 * 
 *  
 * Contain duplicate elements
 * Maintains insertion order
 * It is non synchronised
 * Allow random acces as array works on index basis
 * Manipulation of data is slower than the linkedlist as shiffting occurs  
 */

public class ArrayListImp {

    /**
     * Main method
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

        for(String str: list) {
            System.out.println(str);
        }

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
