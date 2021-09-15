package collection.comparatorExample.searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CollectionsBinarySearchImp {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(374);
        al.add(81);
        al.add(67);
        al.add(15);
        al.add(27);

        Collections.sort(al, new MyComparator());
        System.out.println(al);

        int index = Collections.binarySearch(al, 81, new MyComparator());
        System.out.println(index);


        Comparator reverse = Collections.reverseOrder(new MyComparator());

        Collections.sort(al, reverse);
        System.out.println(al);
    }
    
}
