package collection.Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sakshi");
        list.add("Rajat");
        list.add("Riya");
        list.add(2, "Pari");
        int index = list.indexOf("Pari");
        if (index == -1) {
            System.out.println("No such element present");
        } else {
            list.set(index, "Akshara");
        }

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        boolean isPresent = list.contains("Rajat");
        if (isPresent) {
            System.out.println("Element is present");
        } else {
            System.out.println("It is not present");
        }
    }
}
