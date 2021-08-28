package collection;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListImp {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        /**
         * initialization of linkedList
         */
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Adhira"); 
        ll.add("Bittu");
        ll.add("Pooja");
        ll.add("Unke");

        ll.push("Sonu");
        /**
         * pop element method to remove a element from linkedlist
         */
        String popedElement = ll.pop();
        System.out.println("Removed elemennt : " + popedElement);

        /**
         * print with iterator
         */

        // Iterator<String> itr = ll.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        /**
         * try and catch function to catch the exception
         */

        try {
            FileInputStream fis = new FileInputStream(".//Java//collection//ObjectStoringFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String> al = (ArrayList<String>)ois.readObject();
            ois.close();
            fis.close();
            ll.addAll(al);

            ll.forEach(name -> {
                System.out.println(name);
            });


            LinkedList<Student> stu = new LinkedList<Student>();
            fis = new FileInputStream(".//Java//collection//StudentData.txt");
            ois = new ObjectInputStream(fis);
            ArrayList<Student> stu1 =  (ArrayList<Student>)ois.readObject();
            ois.close();
            fis.close();
            stu.addAll(stu1);

            stu.forEach(studentData -> {
                System.out.println(studentData.rollNo + " " + studentData.name + " " + studentData.age);
            });
        }catch(Exception e) {
            System.out.println("\nException Occured");
        }

    }
}
