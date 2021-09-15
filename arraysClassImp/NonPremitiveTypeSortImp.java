package collection.arraysClassImp;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;

        if (e1.getSalary() > e2.getSalary()) {
            return -1;
        } else if (e1.getSalary() < e2.getSalary()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class NonPremitiveTypeSortImp {
    public static void main(String[] args) {
        Employee e1 = new Employee("Adhira", 1, 747908);
        Employee e2 = new Employee("Sakshi", 2, 7908);
        Employee e3 = new Employee("Rajat", 3, 949498444);

        Employee arr[] = new Employee[3];
        arr[0] = e1;
        arr[1] = e2;
        arr[2] = e3;

        Arrays.sort(arr, new MyComparator());
        System.out.println(Arrays.toString(arr));

    }

}
