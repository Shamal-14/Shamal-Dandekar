import java.util.*;

class ElectricityBill {
    int customerNumber;
    String customerName;
    double unitsConsumed;
    static double ratePerUnit;

    // Static block to initialize static variable
    static {
        ratePerUnit = 5.5;
    }

    // Default constructor
    ElectricityBill() {
        this.customerNumber = 1001;
        this.customerName = "Shamal";
        this.unitsConsumed = 100.0;
    }

    // Parameterized constructor
    ElectricityBill(int number, String name, double units) {
        this.customerNumber = number;
        this.customerName = name;
        this.unitsConsumed = units;
    }

    // Setter methods
    void setCustomerNumber(int n) {
        this.customerNumber = n;
    }

    void setCustomerName(String n) {
        this.customerName = n;
    }

    void setUnitsConsumed(double n) {
        this.unitsConsumed = n;
    }

    static void setRatePerUnit(double r) {
        ratePerUnit = r;
    }

    // Getter methods
    int getCustomerNumber() {
        return this.customerNumber;
    }

    String getCustomerName() {
        return this.customerName;
    }

    double getUnitsConsumed() {
        return this.unitsConsumed;
    }

    double getRatePerUnit() {
        return ratePerUnit;
    }

    // Method to calculate bill
    double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    // Display method
    void display() {
        System.out.println("\nCustomer Number  : " + this.customerNumber);
        System.out.println("Customer Name    : " + this.customerName);
        System.out.println("Units Consumed   : " + this.unitsConsumed);
        System.out.println("Rate per Unit    : " + ratePerUnit);
        System.out.println("Total Bill       : ₹" + calculateBill());
    }
}

// Test class
class TestElectricity {
    public static void main(String[] args) {
        // Create objects using parameterized constructor
        ElectricityBill e1 = new ElectricityBill(101, "Shamal Dandekar", 150);
        ElectricityBill e2 = new ElectricityBill(102, "Adarsh Dandekar", 200);
        ElectricityBill e3 = new ElectricityBill(103, "Pratiksha", 250);
e1.display();
e2.display();
e3.display();

            }

   }
