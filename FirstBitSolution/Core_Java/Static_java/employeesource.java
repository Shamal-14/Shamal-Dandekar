import java.util.*;

class Employee {
    String name;
    double basicSalary;
    static double companyBonusRate;

    // Static block to initialize bonus rate
    static {
        companyBonusRate = 10.0;  // default bonus rate in %
    }

    // Default constructor
    Employee() {
        this.name = "Unknown";
        this.basicSalary = 20000.0;
    }

    // Parameterized constructor
    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setBasicSalary(double salary) {
        this.basicSalary = salary;
    }

    static void setCompanyBonusRate(double rate) {
        companyBonusRate = rate;
    }

    // Getter methods
    String getName() {
        return this.name;
    }

    double getBasicSalary() {
        return this.basicSalary;
    }

    double getCompanyBonusRate() {
        return companyBonusRate;
    }

    // Non-static method to calculate total salary
    double calculateTotalSalary() {
        return basicSalary + (basicSalary * companyBonusRate / 100);
    }

    // Display details
    void display() {
        System.out.println("Name            : " + this.name);
        System.out.println("Basic Salary    : " + this.basicSalary);
        System.out.println("Bonus Rate (%)  : " + companyBonusRate);
        System.out.println("Total Salary    : ₹" + calculateTotalSalary());
        System.out.println("----------------------------------");
    }
}

// Test class
class TestEmployee {
    public static void main(String[] args) {
        // Create three employee objects
        Employee e1 = new Employee("Shamal Dandekar", 30000);
        Employee e2 = new Employee("Adarsh Dandekar", 40000);
        Employee e3 = new Employee("Pratiksha", 50000);

        Employee.setCompanyBonusRate(12.5);

        
        e1.display();
        e2.display();
        e3.display();
    }
}
