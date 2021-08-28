package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Address {
    private int houseNo;
    private String streetName;
    private String city;
    private int pinCode;

    Address(int houseNo, String streetName, String city, int pinCode) {
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.pinCode = pinCode;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    
}

class Employee {
    private Address addr;
    private int empId;
    private String empName;
    private String phNo;
    private int empAge;

    /**
     * Parameterize Constructor for Employee
     * 
     * @param addr
     * @param empId
     * @param empName
     * @param phNo
     * @param empAge
     */
    Employee(Address addr, int empId, String empName, String phNo, int empAge) {
        this.addr = addr;
        this.empId = empId;
        this.empName = empName;
        this.phNo = phNo;
        this.empAge = empAge;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

}


public class ArrayListEmployee {
    public static void main(String[] args) {
        Address addr1 = new Address(253, "Black diamond street", "Wani", 445304);
        Address addr2 = new Address(254, "White diamond street" , "Wardha", 442001);

        Employee emp1 = new Employee(addr1, 123, "Sakshi", "8788818577", 23);
        Employee emp2 = new Employee(addr2, 111, "Rajat", "8788805097", 24);

        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);


        Iterator<Employee> itr = empList.iterator();
        while(itr.hasNext()) {
            Employee emp = itr.next();
            Address addr = emp.getAddr();
            System.out.println(addr.getHouseNo() + " " + addr.getStreetName() + " " + addr.getHouseNo() + " " + addr.getPinCode() + " " + emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getPhNo() + " " + emp.getEmpAge());
        }
    }
}
