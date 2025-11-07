// Class Time
class Time {
    int hr;
    int min;
    int sec;

    // Default constructor
    Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    // Parameterized constructor
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        normalize();
    }

    // Method to add two Time objects
    void add(Time t1, Time t2) {
        this.hr = t1.hr + t2.hr;
        this.min = t1.min + t2.min;
        this.sec = t1.sec + t2.sec;
        normalize();
        System.out.println("Addition of Two Times = " + display());
    }

    // Overloaded method to add hours/minutes/seconds as integers
    void add(Time t, int addHr, int addMin, int addSec) {
        this.hr = t.hr + addHr;
        this.min = t.min + addMin;
        this.sec = t.sec + addSec;
        normalize();
        System.out.println("Addition of Time + Integer Values = " + display());
    }

    // Normalize time (handle 60 seconds → 1 minute, etc.)
    void normalize() {
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
        if (hr >= 24) {
            hr = hr % 24;
        }
    }

    // Display time in hh:mm:ss format
    String display() {
        return String.format("%02d:%02d:%02d", hr, min, sec);
    }
}
// class Time ends here


// Class TestTime
class TestTime {
    public static void main(String[] args) {

        Time t1 = new Time(10, 45, 55);
        Time t2 = new Time(5, 30, 20);
        Time result = new Time();

        // Add two time objects
        result.add(t1, t2);

        // Add hours, minutes, seconds to a Time object
        result.add(t1, 2, 50, 80);  // Adding 2 hrs, 50 min, 80 sec
    }
}
