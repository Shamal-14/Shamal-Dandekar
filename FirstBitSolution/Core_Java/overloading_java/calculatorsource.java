// Class Calculator
class Calculator {

    // Addition Overloads
    void add(int a, int b) {
        System.out.println("Addition (int, int) = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Addition (double, double) = " + (a + b));
    }

    void add(int a, double b) {
        System.out.println("Addition (int, double) = " + (a + b));
    }

    void add(double a, int b) {
        System.out.println("Addition (double, int) = " + (a + b));
    }

    // Subtraction Overloads
    void subtract(int a, int b) {
        System.out.println("Subtraction (int, int) = " + (a - b));
    }

    void subtract(double a, double b) {
        System.out.println("Subtraction (double, double) = " + (a - b));
    }

    void subtract(int a, double b) {
        System.out.println("Subtraction (int, double) = " + (a - b));
    }

    void subtract(double a, int b) {
        System.out.println("Subtraction (double, int) = " + (a - b));
    }

    // Multiplication Overloads
    void multiply(int a, int b) {
        System.out.println("Multiplication (int, int) = " + (a * b));
    }

    void multiply(double a, double b) {
        System.out.println("Multiplication (double, double) = " + (a * b));
    }

    void multiply(int a, double b) {
        System.out.println("Multiplication (int, double) = " + (a * b));
    }

    void multiply(double a, int b) {
        System.out.println("Multiplication (double, int) = " + (a * b));
    }

    // Division Overloads
    void divide(int a, int b) {
        System.out.println("Division (int, int) = " + (a / b));
    }

    void divide(double a, double b) {
        System.out.println("Division (double, double) = " + (a / b));
    }

    void divide(int a, double b) {
        System.out.println("Division (int, double) = " + (a / b));
    }

    void divide(double a, int b) {
        System.out.println("Division (double, int) = " + (a / b));
    }
}

// Class TestCalculator
class TestCalculator {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        // Addition examples
        c.add(10, 20);
        c.add(5.5, 2.5);
        c.add(10, 3.5);
        c.add(4.5, 2);

        System.out.println("----------------------------");

        // Subtraction examples
        c.subtract(20, 10);
        c.subtract(7.5, 2.5);
        c.subtract(10, 2.5);
        c.subtract(9.5, 2);

        System.out.println("----------------------------");

        // Multiplication examples
        c.multiply(5, 3);
        c.multiply(2.5, 4.0);
        c.multiply(6, 3.5);
        c.multiply(4.5, 2);

        System.out.println("----------------------------");

        // Division examples
        c.divide(20, 5);
        c.divide(9.0, 3.0);
        c.divide(10, 2.5);
        c.divide(9.0, 3);
    }
}
