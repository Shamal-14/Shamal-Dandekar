class SalesManager {
    int ID, target;
    String name;
    double salary, incentive;

    // Default Constructor
    SalesManager() {
        this.ID = 101;
        this.target = 5;
        this.name = "Default Manager";
        this.salary = 20000.0;
        this.incentive = 5000.0;
    }

    // Parameterized Constructor
    SalesManager(int ID, int target, String name, double salary, double incentive) {
        this.ID = ID;
        this.target = target;
        this.name = name;
        this.salary = salary;
        this.incentive = incentive;
    }

    // Setter methods
    void setID(int i) {
        this.ID = i;
    }

    void setTarget(int t) {
        this.target = t;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setIncentive(double i) {
        this.incentive = i;
    }

    // Getter methods
    int getID() {
        return this.ID;
    }

    int getTarget() {
        return this.target;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    double getIncentive() {
        return this.incentive;
    }

    // Display method
    void display() {
        System.out.println("Sales Manager ID: " + this.ID);
        System.out.println("Sales Manager Target: " + this.target);
        System.out.println("Sales Manager Name: " + this.name);
        System.out.println("Sales Manager Salary: " + this.salary);
        System.out.println("Sales Manager Incentive: " + this.incentive);
        System.out.println("------------------------------------");
    }
}

// Test class
class TestSalesManager {
    public static void main(String[] args) {
        SalesManager sm1 = new SalesManager(); // Default constructor
        SalesManager sm2 = new SalesManager(); // Using setters
        SalesManager sm3 = new SalesManager(103, 10, "Suresh Patil", 30000.0, 7000.0); // Parameterized constructor

        sm2.setID(102);
        sm2.setTarget(8);
        sm2.setName("Shamal Dandekar");
        sm2.setSalary(25000.0);
        sm2.setIncentive(6000.0);

        sm1.display();
        sm2.display();
        sm3.display();
    }
}
