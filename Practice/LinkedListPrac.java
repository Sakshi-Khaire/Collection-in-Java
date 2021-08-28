package collection.Practice;

import java.util.LinkedList;

public class LinkedListPrac {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Sakku");
        list.add("Rajat");


        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Jholba");
        list2.add("Fakira");

        list.addAll(1, list2);

        for (String name : list) {
            System.out.println(name);
        }
    }
}
