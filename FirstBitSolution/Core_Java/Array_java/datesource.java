    class Date {
    int day, month, year;
    String dow;

    // Default Constructor
    Date() {
        this.day = 1;
        this.month = 1;
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

    // Setters
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

    // Getters
    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    String getDow() {
        return this.dow;
    }

    // Display Method
    void display() {
        System.out.println("day is=" + this.day);
        System.out.println("month is=" + this.month);
        System.out.println("year is=" + this.year);
        System.out.println("dow is=" + this.dow);
        System.out.println("----------------------");
    }
}

// Test Class
class TestDate {
    public static void main(String[] args) {
        Date arr[] = new Date[3]; // Array of 3 Date objects

        arr[0] = new Date(10, 11, 2008, "wednesday");
        arr[1] = new Date(7, 11, 2025, "friday");
        arr[2] = new Date(); // default constructor

        // Using setters for arr[2]
        arr[2].setDay(15);
        arr[2].setMonth(8);
        arr[2].setYear(2020);
        arr[2].setDow("saturday");

        // Intentional error: loop goes out of bounds
        for (int i = 0; i <= 3; i++) {
            arr[i].display(); 
        }
    }
}
