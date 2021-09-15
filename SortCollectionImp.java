package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Studentt implements Comparable<Studentt> {
    public Integer rollno;
    public String name;


    public Studentt(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int compareTo(Studentt student) {
        return name.compareTo(student.name);
    }
}

public class SortCollectionImp {
    public static void main(String[] args) {
        Studentt std1 = new Studentt(21, "Sakshi");
        Studentt std2 = new Studentt(22, "Rajat");
        Studentt std3 = new Studentt(1, "Adhira");

        ArrayList<Studentt> stuList = new ArrayList<Studentt>();
        stuList.add(std1);
        stuList.add(std2);
        stuList.add(std3);

        Collections.sort(stuList);

        Iterator<Studentt> itr = stuList.iterator();
        while(itr.hasNext()) {
            Studentt stu = itr.next();
            System.out.println(stu.rollno + " " + stu.name);
        }
    }
}
