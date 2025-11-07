        class HR {
    int Id;
    String name;
    double salary, commission;

    // Default Constructor
    HR() {
        this.Id = 0;
        this.name = "Unknown";
        this.salary = 0.0;
        this.commission = 0.0;
    }

    // Parameterized Constructor
    HR(int Id, String name, double salary, double commission) {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
    }

    void setID(int i) {
        this.Id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setCommission(double c) {
        this.commission = c;
    }

    int getID() {
        return this.Id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    double getCommission() {
        return this.commission;
    }

    void display() {
        System.out.println("HR ID: " + this.Id);
        System.out.println("HR Name: " + this.name);
        System.out.println("HR Salary: " + this.salary);
        System.out.println("HR Commission: " + this.commission);
        System.out.println("-------------------------");
    }
}
// class HR ends here

class hrDept {
    public static void main(String[] args) {
        HR h1 = new HR(); // default constructor
        HR h2 = new HR(); // will use setters
        HR h3 = new HR(300, "Rohit Patil", 25000.0, 1500.0); // parameterized constructor

        h2.setID(200);
        h2.setName("Samiksha Dandekar");
        h2.setSalary(10000.0);
        h2.setCommission(200.0);

        h1.setID(110);
        h1.setName("Shamal Dandekar");
        h1.setSalary(20000.0);
        h1.setCommission(2500.0);

        h1.display();
        h2.display();
        h3.display();
    }
}
// class hrDept ends here
