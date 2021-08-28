package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImp {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        /**
         * initialization of HashSet
         */
        HashSet<String> hset = new HashSet<String>();
        hset.add("Sakku");
        hset.add("Rajat");
        hset.add("Riya");
        hset.add("Pari");
        hset.add("Sejal");

        /**
         * 
         * checking whether hset contains a specific element or not
         */
        if(hset.contains("Saransh")) {
            System.out.println("Is present in the HashSet");
        } else {
            System.out.println("Is absent in the HashSet");
        }

        /**
         * initialization of new hashSet
         */
        HashSet<String> newHashSet = new HashSet<String>();
        newHashSet = (HashSet<String>)hset.clone();
        newHashSet.removeIf(str -> str.contains("Rajat"));

        /**
         * printing with iterator
         */
        Iterator<String> itr = newHashSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
