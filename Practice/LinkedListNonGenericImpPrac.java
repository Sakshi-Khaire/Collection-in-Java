package collection.Practice;

import java.util.HashSet;
import java.util.LinkedList;

class Patient {
    private int ID;
    private int age;
    private String name;
    private String gender;

    Patient(int ID, int age, String name, String gender) {
        this.ID = ID;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient [ID=" + ID + ", age=" + age + ", gender=" + gender + ", name=" + name + "]";
    }

}

public class LinkedListNonGenericImpPrac {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, 24, "Sakshi", "Female");
        Patient p2 = new Patient(2, 24, "Rajat", "Male");
        Patient p3 = new Patient(3, 24, "Nagnath", "Trans");

        LinkedList<Patient> pList = new LinkedList<Patient>();
        pList.addFirst(p2);
        pList.addFirst(p1);
        pList.addLast(p3);
        
        Patient lastPatient = pList.getLast();
        System.out.println(lastPatient);

        Patient indexElement = pList.get(1);
        System.out.println(indexElement);

        LinkedList<Patient> pList1 = new LinkedList<Patient>();
        pList1.addAll(pList);
        for(Patient patient : pList1) {
            System.out.println(patient);
        }

        HashSet<Patient> patientHashSet = new HashSet<Patient>(pList);
        if(patientHashSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty, It's size is : " + patientHashSet.size());
        }
    }
}
