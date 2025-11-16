
import java.util.Scanner;

class Admin {
    int id;
    String name;
    double salary;
    float allowance;

    // Default Constructor
    Admin() {
        this.id = 1;
        this.name = "Default Admin";
        this.salary = 20000.0;
        this.allowance = 1500.0f;
    }

    // Parameterized Constructor
    Admin(int id, String name, double salary, float allowance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }

    // Setter Methods
    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setAllowance(float allowance) {
        this.allowance = allowance;
    }

    // Getter Methods
    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    float getAllowance() {
        return this.allowance;
    }

        void display() {
        System.out.println("Admin ID: " + id);
        System.out.println("Admin Name: " + name);
        System.out.println("Admin Salary: " + salary);
        System.out.println("Admin Allowance: " + allowance);
            }
}
// class Admin ends here


class TestAdmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Admin ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Admin Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Admin Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Admin Allowance: ");
        float allowance = sc.nextFloat();

        
        Admin a1 = new Admin(); // default constructor
        Admin a2 = new Admin(id, name, salary, allowance); // parameterized constructor
        Admin a3 = new Admin(103, "Suresh Patil", 45000.0, 2500.0f);

        // Displaying all admin details
        a1.display();
        a2.display();
        a3.display();
    }
}
// class TestAdmin ends here
