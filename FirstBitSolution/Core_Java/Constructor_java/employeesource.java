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
        Employee e1 = new Employee(); // default constructor
        Employee e2 = new Employee(); // will use setters
        Employee e3 = new Employee(133, "Rohit Patil", 40000.0); // parameterized constructor

        e2.setId(122);
        e2.setName("Samiksha Dandekar");
        e2.setSalary(30000.0);

        e1.display();
        e2.display();
        e3.display();
    }
}
// class TestEmployee ends here
