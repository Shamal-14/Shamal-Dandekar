class Student {
    int rollNo;
    String name;
    double marks;

    // Default Constructor
    Student() {
        this.rollNo = 1;
        this.name = "Default Student";
        this.marks = 75.0;
    }

    // Parameterized Constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Setter methods
    void setRollNo(int r) {
        this.rollNo = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMarks(double m) {
        this.marks = m;
    }

    // Getter methods
    int getRollNo() {
        return this.rollNo;
    }

    String getName() {
        return this.name;
    }

    double getMarks() {
        return this.marks;
    }

    // Display method
    void display() {
        System.out.println("Student Roll No: " + this.rollNo);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Marks: " + this.marks);
        System.out.println("------------------------------------");
    }
}

// Test class
class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(); // Default constructor
        Student s2 = new Student(); // Using setters
        Student s3 = new Student(10,"shamal d,40.5);
 

        s2.setRollNo(15);
        s2.setName("Shamal Dandekar");
        s2.setMarks(88.5);

        s1.display();
        s2.display();
        s3.display();
    }
}
