package Polymorphism;

class Employee {
    int empId;
    String name;
    double salary;

    Employee() {
        this.empId = 101;
        this.name = "Shamal";
        this.salary = 20000.00;
    }

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    int getEmpId() { return empId; }
    void setEmpId(int empId) { this.empId = empId; }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    double getSalary() { return salary; }
    void setSalary(double salary) { this.salary = salary; }

    // Polymorphic method
    double calSal() { return salary; }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// HR Class
class HR extends Employee {
    int teamSize;
    String region;

    HR() {
        super();
        this.teamSize = 10;
        this.region = "Pune";
    }

    HR(int empId, String name, double salary, int teamSize, String region) {
        super(empId, name, salary);
        this.teamSize = teamSize;
        this.region = region;
    }

    int getTeamSize() { return teamSize; }
    void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    String getRegion() { return region; }
    void setRegion(String region) { this.region = region; }

    double calSal() { return salary; }

    void display() {
        super.display();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Region: " + region);
    }
}

// SalesManager Class
class SalesManager extends Employee {
    double salesTarget;
    double commissionRate;

    SalesManager() {
        super();
        this.salesTarget = 10.0;
        this.commissionRate = 150.0;
    }

    SalesManager(int empId, String name, double salary, double salesTarget, double commissionRate) {
        super(empId, name, salary);
        this.salesTarget = salesTarget;
        this.commissionRate = commissionRate;
    }

    double getSalesTarget() { return salesTarget; }
    void setSalesTarget(double salesTarget) { this.salesTarget = salesTarget; }

    double getCommissionRate() { return commissionRate; }
    void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }

    double calSal() { return salary + commissionRate; }

    void display() {
        super.display();
        System.out.println("Sales Target: " + salesTarget);
        System.out.println("Commission Rate: " + commissionRate + "%");
    }
}

// Developer Class
class Developer extends Employee {
    String programmingLanguage;
    String projectName;

    Developer() {
        super();
        this.programmingLanguage = "Unknown";
        this.projectName = "Unassigned";
    }

    Developer(int empId, String name, double salary, String programmingLanguage, String projectName) {
        super(empId, name, salary);
        this.programmingLanguage = programmingLanguage;
        this.projectName = projectName;
    }

    String getProgrammingLanguage() { return programmingLanguage; }
    void setProgrammingLanguage(String programmingLanguage) { this.programmingLanguage = programmingLanguage; }

    String getProjectName() { return projectName; }
    void setProjectName(String projectName) { this.projectName = projectName; }

    double calSal() { return salary; }

    void display() {
        super.display();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Project Name: " + projectName);
    }
}

// AreaSalesManager Class
class AreaSalesManager extends SalesManager {
    String areaName;

    AreaSalesManager() {
        super();
        this.areaName = "None";
    }

    AreaSalesManager(int empId, String name, double salary, double salesTarget, double commissionRate, String areaName) {
        super(empId, name, salary, salesTarget, commissionRate);
        this.areaName = areaName;
    }

    String getAreaName() { return areaName; }
    void setAreaName(String areaName) { this.areaName = areaName; }

    void display() {
        super.display();
        System.out.println("Area: " + areaName);
    }
}

// Test class demonstrating polymorphism
class TestEmployee1 {
    public static void main(String[] args) {
        Employee e1;

        e1 = new HR(101, "Shamal", 20000, 8, "Pune");
        System.out.println("HR Salary: " + e1.calSal());
        e1.display();
        System.out.println();

        e1 = new SalesManager(102, "Samiksha", 6000, 20000, 5.5);
        System.out.println("Sales Manager Salary: " + e1.calSal());
        e1.display();
        System.out.println();

        e1 = new Developer(103, "Shamal", 20000, "Java", "Employee Management");
        System.out.println("Developer Salary: " + e1.calSal());
        e1.display();
        System.out.println();

        e1 = new AreaSalesManager(104, "Ravi", 25000, 30000, 10.5, "Mumbai");
        System.out.println("Area Sales Manager Salary: " + e1.calSal());
        e1.display();
        System.out.println();
    }
}
