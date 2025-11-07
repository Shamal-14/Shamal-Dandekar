
class Admin {
    int Id;
    String name;
    double salary;
    float allowance;

    // Default Constructor
    Admin() {
        this.Id = 1;
        this.name = "Default Admin";
        this.salary = 20000.0;
        this.allowance = 1500.0f;
    }

    // Parameterized Constructor
    Admin(int Id, String name, double salary, float allowance) {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }

    void setId(int i) {
        this.Id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setAllowance(float a) {
        this.allowance = a;
    }

    int getId() {
        return this.Id;
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
        System.out.println("Admin Id: " + this.Id);
        System.out.println("Admin Name: " + this.name);
        System.out.println("Admin Salary: " + this.salary);
        System.out.println("Admin Allowance: " + this.allowance);
            }
}
// Admin class ends here

class TestAdmin {
    public static void main(String[] args) {
        Admin a1 = new Admin(); // default constructor
        Admin a2 = new Admin(); // will use setters
        Admin a3 = new Admin(103, "Suresh Patil", 45000.0, 2500.0f); // parameterized constructor

        a2.setId(102);
        a2.setName("Shamal Dandekar");
        a2.setSalary(40000.0);
        a2.setAllowance(2000.0f);

        a1.display();
        a2.display();
        a3.display();
    }
}
// TestAdmin class ends here
