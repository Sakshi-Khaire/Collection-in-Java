package collection.comparatorExample;

import java.util.Comparator;

class AuthorComparator implements Comparator {
    public int compare(Object obj5, Object obj6) {
        Books b5 = (Books)obj5;
        Books b6 = (Books)obj6;


        return b5.author.compareTo(b6.author);
    }
}
