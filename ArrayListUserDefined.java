package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

public class ArrayListUserDefined {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Adhira", 16);
        Student s2 = new Student(2, "Rajat", 24);
        Student s3 = new Student(3, "Sakshi", 23);

        ArrayList<Student> stuList = new ArrayList<Student>();
        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);

        try {
            FileOutputStream fos = new FileOutputStream(".//Java//collection//StudentData.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stuList);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(".//Java//collection//StudentData.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Student> stuListFromFile = (ArrayList<Student>) ois.readObject();
            System.out.println("After reading from file");
            stuListFromFile.forEach(student -> {
                System.out.println(student.rollNo + " " + student.name + " " + student.age);
            });
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Exception Occured\n" +  e);
        }

    }
}
