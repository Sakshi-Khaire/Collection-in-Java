package collection.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableImplementation {
    public static void main(String[] args) {
        Hashtable<Integer, String> htable = new Hashtable<Integer, String>();
        htable.put(1, "Adhiru");
        htable.put(2, "Sakshi");
        htable.put(3, "Rajat");
        htable.put(4, "Riya");
        htable.put(5, "Pari");

        for(Map.Entry<Integer, String> m: htable.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(htable.getOrDefault(7, "NotFound"));
    }
}
