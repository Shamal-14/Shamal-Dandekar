class Distance {
    double km, meter;

    // Default Constructor
    Distance() {
        this.km = 0.0;
        this.meter = 0.0;
    }

    // Parameterized Constructor
    Distance(double km, double meter) {
        this.km = km;
        this.meter = meter;
    }

    void setKm(double k) {
        this.km = k;
    }

    void setM(double m) {
        this.meter = m;
    }

    double getKm() {
        return this.km;
    }

    double getM() {
        return this.meter;
    }

    void display() {
        System.out.println("Distance in Kilometer: " + this.km);
        System.out.println("Distance in Meter: " + this.meter);
        System.out.println("-------------------------");
    }
}
// class Distance ends here

class DistanceD {
    public static void main(String[] args) {
        Distance d1 = new Distance(); // default constructor
        Distance d2 = new Distance(); // will use setters
        Distance d3 = new Distance(5.5, 750.0); // parameterized constructor

        d2.setKm(3.0);
        d2.setM(200.0);

        d1.display();
        d2.display();
        d3.display();
    }
}
// class DistanceD ends here
