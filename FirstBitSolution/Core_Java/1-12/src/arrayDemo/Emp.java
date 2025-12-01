package arrayDemo;

import java.util.TreeSet;

class Emp implements Comparable {

    int ID;
    String name;
    double salary;

    Emp() {
        this.ID = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    Emp(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    // SAME FORMAT AS display()
    public String toString() {
        return "\nEmployee ID: " + this.ID +
               "\nEmployee Name: " + this.name +
               "\nEmployee Salary: " + this.salary +
               "\n-------------------------";
    }

    public int compareTo(Object o) {
        Emp e = (Emp) o;
        return  this.ID - e.ID;
    }
}

class Test {
    public static void main(String[] args) {

        Emp e1 = new Emp(135, "samiksha", 10000.0);
        Emp e2 = new Emp(131, "shamal", 20000.0);
        Emp e3 = new Emp(130, "s", 5000.0);

        TreeSet t1 = new TreeSet();

        t1.add(e1);
        t1.add(e2);
        t1.add(e3);

        
        System.out.println(t1);
    }
}
