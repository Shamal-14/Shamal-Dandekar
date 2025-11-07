class Student {
    int rollno;
    String name;
    double percentage;

    Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }
}
// class Student ends here


class Employee {
    int id;
    String name;
    double annualSalary;

    Employee(int id, String name, double annualSalary) {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
    }
}
// class Employee ends here


class Bank {

        void approveLoan(Student s) {
        System.out.println("Loan Approval for Student: " + s.name);

        if (s.percentage > 80) {
            System.out.println("Approved Loan Amount = ₹2,00,000");
        } else if (s.percentage >= 60) {
            System.out.println("Approved Loan Amount = ₹1,00,000");
        } else if (s.percentage >= 40) {
            System.out.println("Approved Loan Amount = ₹50,000");
        } else {
            System.out.println("No Loan Approved (Below 40%)");
        }

        System.out.println("--------------------------------");
    }

        void approveLoan(Employee e) {
        System.out.println("Loan Approval for Employee: " + e.name);

        if (e.annualSalary > 12) {
            System.out.println("Approved Loan Amount = ₹7,00,000");
        } else if (e.annualSalary >= 10) {
            System.out.println("Approved Loan Amount = ₹6,00,000");
        } else if (e.annualSalary >= 6) {
            System.out.println("Approved Loan Amount = ₹5,00,000");
        } else if (e.annualSalary >= 4) {
            System.out.println("Approved Loan Amount = ₹4,00,000");
        } else {
            System.out.println("No Loan Approved (Below 4 LPA)");
        }

        System.out.println("--------------------------------");
    }
}
// class Bank ends here


// Class TestBank
class TestBank {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Riya", 85);
        Student s2 = new Student(102, "Amit", 58);
        Student s3 = new Student(103, "Neha", 35);

       
        Employee e1 = new Employee(201, "Raj", 13);
        Employee e2 = new Employee(202, "Priya", 9);
        Employee e3 = new Employee(203, "Arjun", 3.5);

        Bank bank = new Bank();

        bank.approveLoan(s1);
        bank.approveLoan(s2);
        bank.approveLoan(s3);

        bank.approveLoan(e1);
        bank.approveLoan(e2);
        bank.approveLoan(e3);
    }
}
