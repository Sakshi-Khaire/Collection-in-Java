package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {
    public static void main(String[] agrs) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Adhira");
        hmap.put(2, "Sakshi");
        hmap.put(3, "Rajat");
        hmap.put(4, "Bittu");
        hmap.put(5, "Riya");

        for (Map.Entry<Integer, String> mn : hmap.entrySet()) {
            System.out.println(mn.getKey() + " " + mn.getValue());
        }

        // HashMap<Integer, String> hmap2 = (HashMap<Integer, String>)hmap.clone();

        // hmap.put(1, "Chiken");

        // for(Map.Entry<Integer, String> mn : hmap.entrySet()) {
        // System.out.println(mn.getKey() + " " + mn.getValue());
        // }

        String value = hmap.remove(5);
        System.out.println(value);

        for (Map.Entry<Integer, String> mn : hmap.entrySet()) {
            System.out.println(mn.getKey() + " " + mn.getValue());
        }

        if(hmap.containsValue("Bittu")) {
            System.out.println("Value is present");
        } else {
            System.out.println("Value is not present");
        }
        if(hmap.containsKey(3)) {
            System.out.println("Key is present");
        } else {
            System.out.println("Key is not present");
        }

        String value1 = hmap.get(2);
        System.out.println(value1);

        String valueInserted = hmap.putIfAbsent(7, "Sakshi");
        System.out.println(valueInserted);

        System.out.println("After ================");
        for (Map.Entry<Integer, String> mn : hmap.entrySet()) {
            System.out.println(mn.getKey() + " " + mn.getValue());
        }
    }
}