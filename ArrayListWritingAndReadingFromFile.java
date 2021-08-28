package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListWritingAndReadingFromFile {
    private static Object readObject;

    /**
     * main method
     * @param args
     */

    public static void main(String[] args) {

        /**
         * initialization of arrayList
         */
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sakshi");
        al.add("Rajat");
        al.add("Riya");
        al.add("Pari");

        /**
         * try and catch function to catch the exception if there is any while executing the program
         */

        try {
            FileOutputStream fos = new FileOutputStream(".//Java//collection//ObjectStoringFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(".//Java//collection//ObjectStoringFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            readObject = ois.readObject();
            ArrayList<String> listFromFile = (ArrayList<String>)readObject;
            System.out.println("After reading from File ");
            listFromFile.forEach(name -> {
                System.out.println(name);
            });
            ois.close();
            fis.close();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
