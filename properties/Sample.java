package collection.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Sample {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("./Java/collection/properties/data.properties");

        Properties p = new Properties();
        p.load(reader);

        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("middlename"));
        System.out.println(p.getProperty("surname"));



        Properties p1 = System.getProperties();
        
        System.out.println(p1.getProperty("os.name"));
        // Iterator itr = set.iterator();
        // while(itr.hasNext()) {
        //     Map.Entry entry = (Map.Entry)itr.next();
        //     System.out.println(entry.getKey() + " = " + entry.getValue());
        // }


        Properties p2 = new Properties();
        p2.setProperty("email", "sakshikhaire18@mgmail.com");
        p2.setProperty("phoneNumber", "8788818577");

        p2.store(new FileWriter("./Java/collection/properties/data1.properties"), "Extra details");


        //Task is to print the data 

    }
}
