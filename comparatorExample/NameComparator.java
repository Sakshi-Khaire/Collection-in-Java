package collection.comparatorExample;

import java.util.Comparator;

class NameComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Books b1 = (Books)obj1;
        Books b2 = (Books)obj2;

        return -b1.name.compareTo(b2.name);
    }
}
