class Date {
    int day, month, year;
    String dow;

    void setDay(int d) {
        this.day = d;
    }

    void setMonth(int m) {
        this.month = m;
    }

    void setYear(int y) {
        this.year = y;
    }

    void setDow(String str) {
        this.dow = str;
    }

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
    void display(){
   System.out.println("Day is:"+this.day);
   System.out.println("monh is:"+this.month);
   System.out.println("year is:"+this.year);
   System.out.println("dow is:"+this.dow);
    }
}

// Date class ends here

class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();
        d2.setDay(30);
        d2.setMonth(11);
        d2.setYear(2003);
        d2.setDow("Sunday");

        d1.setDay(20);
        d1.setMonth(3);
        d1.setYear(2004);
        d1.setDow("Wednesday");

         d1.display();
         d2.display();
    }
}
// TestDate class ends here
