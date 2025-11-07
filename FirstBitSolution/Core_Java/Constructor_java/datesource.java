class Date {
    int day, month, year;
    String dow;

    // Default Constructor
    Date() {
        this.day = 1;
        this.month = 10;
        this.year = 2000;
        this.dow = "Monday";
    }

    // Parameterized Constructor
    Date(int day, int month, int year, String dow) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dow = dow;
    }

    void setDay(int day) {
        this.day = day;
    }

    void setMonth(int month) {
        this.month = month;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setDow(String dow) {
        this.dow = dow;
    }

    void display() {
        System.out.println("Day is: " + this.day);
        System.out.println("Month is: " + this.month);
        System.out.println("Year is: " + this.year);
        System.out.println("Day of Week is: " + this.dow);
        System.out.println("-------------------------");
    }
}
// Date class ends here

class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date();  // default constructor
        Date d2 = new Date();  // will use setters
        Date d3 = new Date(15, 8, 2025, "Friday");  // parameterized constructor

        d2.setDay(25);
        d2.setMonth(12);
        d2.setYear(2022);
        d2.setDow("Sunday");

        d1.display();
        d2.display();
        d3.display();
    }
}
// TestDate class ends here
