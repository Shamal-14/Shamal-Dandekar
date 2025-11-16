package abstracts;


abstract class HospitalStaff {
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

 // Getters & Setters (3-line format)
 String getName() { return name; }
 void setName(String name) { this.name = name; }

 int getAge() { return age; }
 void setAge(int age) { this.age = age; }

 String getDepartment() { return department; }
 void setDepartment(String department) { this.department = department; }

 double getSalary() { return salary; }
 void setSalary(double salary) { this.salary = salary; }

 // ABSTRACT METHOD
 abstract String duties();

 // toString (no display)
 public String toString() {
     return "Name: " + name +
            "\nAge: " + age +
            "\nDepartment: " + department +
            "\nSalary: " + salary +
            "\nDuties: " + duties();
 }
}

//------------------------------------------------
//RECEPTIONIST
//------------------------------------------------
class Receptionist extends HospitalStaff {
 String shift;

 Receptionist() {
     this.shift = "Morning";
 }

 Receptionist(String name, int age, String department, double salary, String shift) {
     super(name, age, department, salary);
     this.shift = shift;
 }

 String getShift() { return shift; }
 void setShift(String shift) { this.shift = shift; }

 String duties() {
     return "Handles front desk and patient appointments";
 }
}

//------------------------------------------------
//NURSE
//------------------------------------------------
class Nurse extends HospitalStaff {
 int patientsPerDay;

 Nurse() {
     this.patientsPerDay = 5;
 }

 Nurse(String name, int age, String department, double salary, int patientsPerDay) {
     super(name, age, department, salary);
     this.patientsPerDay = patientsPerDay;
 }

 int getPatientsPerDay() { return patientsPerDay; }
 void setPatientsPerDay(int patientsPerDay) { this.patientsPerDay = patientsPerDay; }

 String duties() {
     return "Takes care of patients and assists doctors";
 }
}

//------------------------------------------------
//DOCTOR
//------------------------------------------------
class Doctor extends HospitalStaff {
 String specialization;

 Doctor() {
     this.specialization = "General Physician";
 }

 Doctor(String name, int age, String department, double salary, String specialization) {
     super(name, age, department, salary);
     this.specialization = specialization;
 }

 String getSpecialization() { return specialization; }
 void setSpecialization(String specialization) { this.specialization = specialization; }

 String duties() {
     return "Diagnoses patients and prescribes treatment";
 }
}

//------------------------------------------------
//MAIN CLASS
//------------------------------------------------
class TestHospital {
 public static void main(String[] args) {

     HospitalStaff h;

     h = new Receptionist("Shamal", 28, "Reception", 18000, "Evening");
     System.out.println(h);
     System.out.println();

     h = new Nurse("Samiksha", 30, "Nursing", 25000, 12);
     System.out.println(h);
     System.out.println();

     h = new Doctor("Ravi", 40, "Cardiology", 70000, "Cardiologist");
     System.out.println(h);
     System.out.println();
 }
}
