package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImp {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        /**
         * initialization of tree set
         */
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Sakshi");
        treeSet.add("Rajat");
        treeSet.add("Adhira");
        treeSet.add("Bittu");
        treeSet.add("Yash");

        /**
         * print with iterator
         */
        Iterator<String> itr = treeSet.descendingIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        /**
         * methods of treeSet
         */
        System.out.println(treeSet.first());
        treeSet.pollLast();
        System.out.println("Jo last aste tohch cheater aste :" + treeSet.last());

    }
}
