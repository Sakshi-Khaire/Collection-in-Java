package collection.enumExample;

import java.util.EnumMap;
import java.util.Map;

enum Names {
    sakshi, rajat, riya, adhira, pari, jholba
}

public class EnumMapImp {
    public static void main(String[] args) {
        EnumMap<Names, Integer> names = new EnumMap<Names, Integer>(Names.class);
        names.put(Names.sakshi, 1);
        names.put(Names.rajat, 2);
        names.put(Names.riya, 3);
        names.put(Names.adhira, 4);
        names.put(Names.pari, 5);
        names.put(Names.jholba, 6);

        for(Map.Entry<Names, Integer> m : names.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
