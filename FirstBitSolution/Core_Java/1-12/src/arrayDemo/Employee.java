package arrayDemo;

import java.awt.List;
import java.util.*;

class Employee {
    int ID;
    String name;
    double salary;

    // Default Constructor
    Employee() {
        this.ID = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Parameterized Constructor
    Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    void setId(int i) {
        this.ID = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    int getId() {
        return this.ID;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    void display() {
        System.out.println("Employee ID: " + this.ID);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
        System.out.println("-------------------------");
    }
}
// class Employee ends here

class TestEmployee {
    public static void main(String[] args) {
    	Employee e1 = new Employee(131, "samiksha", 40000.0); // default constructor
        Employee e2 = new Employee(132, "shamal", 40000.0); // will use setters
        Employee e3 = new Employee(133, "s", 40000.0); // parameterized constructor
        LinkedList L1=new LinkedList();
        L1.add(e1);
        L1.add(e2);
        L1.add(e3);
        System.out.println(L1);
        

        e1.display();
        e2.display();
        e3.display();

        
    }
}
// class TestEmployee ends here
