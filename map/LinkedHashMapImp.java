package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapImp {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(1, "Adhira");
        lhm.put(2, "Sakshi");
        lhm.put(3, "Rajat");
        lhm.put(4, "Riya");
        lhm.put(5, "Pari");
        System.out.println(lhm.size());

        for(Map.Entry<Integer, String> m : lhm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}