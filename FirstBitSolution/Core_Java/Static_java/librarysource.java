import java.util.*;

class LibraryUser {
    String name;
    int daysLate;
    static double finePerDay;

    // Static block to initialize static variable
    static {
        finePerDay = 2.0; // default fine rate per day
    }

    // Default constructor
    LibraryUser() {
        this.name = "Unknown";
        this.daysLate = 0;
    }

    // Parameterized constructor
    LibraryUser(String name, int daysLate) {
        this.name = name;
        this.daysLate = daysLate;
    }

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setDaysLate(int days) {
        this.daysLate = days;
    }

    static void setFinePerDay(double fine) {
        finePerDay = fine;
    }

    // Getter methods
    String getName() {
        return this.name;
    }

    int getDaysLate() {
        return this.daysLate;
    }

    double getFinePerDay() {
        return finePerDay;
    }

    // Non-static method to calculate fine
    double calculateFine() {
        return daysLate * finePerDay;
    }

    // Display method
    void display() {
        System.out.println("Name           : " + this.name);
        System.out.println("Days Late      : " + this.daysLate);
        System.out.println("Fine per Day   : " + finePerDay);
        System.out.println("Total Fine     : ₹" + calculateFine());
        System.out.println("--------------------------------");
    }
}

// Test class
class TestLibraryUser {
    public static void main(String[] args) {
        // Create three LibraryUser objects
        LibraryUser u1 = new LibraryUser("Shamal Dandekar", 3);
        LibraryUser u2 = new LibraryUser("Adarsh Dandekar", 5);
        LibraryUser u3 = new LibraryUser("Pratiksha", 2);

                LibraryUser.setFinePerDay(3.5);

                u1.display();
        u2.display();
        u3.display();
    }
}
