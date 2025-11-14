package Polymorphism;

class HospitalStaff {
    String name;
    int age;
    String department;
    double salary;

    HospitalStaff() {
        this.name = "Unknown";
        this.age = 0;
        this.department = "General";
        this.salary = 15000;
    }

    HospitalStaff(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String duties() {
        return "General hospital duties";
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Duties: " + duties());
    }
}

// ---------------------------------------
class Receptionist extends HospitalStaff {
    String shift;

    Receptionist() {
        this.shift = "Morning";
    }

    Receptionist(String name, int age, String department, double salary, String shift) {
        super(name, age, department, salary);
        this.shift = shift;
    }

    public String duties() {
        return "Handles front desk and patient appointments";
    }
}

// ---------------------------------------
class Nurse extends HospitalStaff {
    int patientsPerDay;

    Nurse() {
        this.patientsPerDay = 5;
    }

    Nurse(String name, int age, String department, double salary, int patientsPerDay) {
        super(name, age, department, salary);
        this.patientsPerDay = patientsPerDay;
    }

    public String duties() {
        return "Takes care of patients and assists doctors";
    }
}

// ---------------------------------------
class Doctor extends HospitalStaff {
    String specialization;

    Doctor() {
        this.specialization = "General Physician";
    }

    Doctor(String name, int age, String department, double salary, String specialization) {
        super(name, age, department, salary);
        this.specialization = specialization;
    }

    public String duties() {
        return "Diagnoses patients and prescribes treatment";
    }
}

// ---------------------------------------
class TestHospital {
    public static void main(String[] args) {

        HospitalStaff h;

        h = new Receptionist("Shamal", 28, "Reception", 18000, "Evening");
        System.out.println("Receptionist Salary: " + h.salary);
        h.display();
        System.out.println();

        h = new Nurse("Samiksha", 30, "Nursing", 25000, 12);
        System.out.println("Nurse Salary: " + h.salary);
        h.display();
        System.out.println();

        h = new Doctor("Ravi", 40, "Cardiology", 70000, "Cardiologist");
        System.out.println("Doctor Salary: " + h.salary);
        h.display();
        System.out.println();
    }
}
