package collection.map;

import java.util.Map;
import java.util.HashMap;


public class MapInterfaceImp {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Sakshi");
        map.put(2, "Rajat");
        map.put(3, "Adhira");
        map.put(4, "Jholba");


        map.put(1, "Sakku"); // Replace Value

        /**
         * Old fashion
         */

        // Set<Map.Entry<Integer, String>> set = map.entrySet();

        // Iterator itr = set.iterator();
        // while(itr.hasNext()) {
        //     Map.Entry entry = (Map.Entry)itr.next();
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }


        /**
         * New fashion
         */

        for(Map.Entry<Integer, String> m: map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
