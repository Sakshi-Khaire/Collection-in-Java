package collection.comparatorExample;

import java.util.Comparator;

class PriceComparator implements Comparator {
    public int compare(Object obj3, Object obj4) {
        Books b3 = (Books)obj3;
        Books b4 = (Books)obj4;

        if(b3.price==b4.price) {
            return 0;
        } else if(b3.price > b4.price) {
            return 1;
        } else {
            return -1;
        }
    }
}
