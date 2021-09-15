package collection.enumExample;

import java.util.EnumSet;
import java.util.Set;

import java.util.Iterator;

enum sakshi {
    SAKSHI, RAJENDRA, KHAIRE, RAJAT, VIJAY, DABADE
};


public class EnumImp {
    public static void main(String[] args) {
        System.out.println(sakshi.SAKSHI);
        Set<sakshi> set = EnumSet.allOf(sakshi.class);

        Iterator<sakshi> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
