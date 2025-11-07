class Complex {
    int real;
    int imaginary;

    // Default Constructor
    Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized Constructor
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void setReal(int r) {
        this.real = r;
    }

    void setImaginary(int i) {
        this.imaginary = i;
    }

    int getReal() {
        return this.real;
    }

    int getImaginary() {
        return this.imaginary;
    }

    void display() {
        System.out.println("Complex Number: " + this.real + " + " + this.imaginary + "i");
        System.out.println("-------------------------");
    }
}
// class Complex ends here

class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(); // default constructor
        Complex c2 = new Complex(); // will use setters
        Complex c3 = new Complex(4, 9); // parameterized constructor

        c2.setReal(5);
        c2.setImaginary(2);

        c1.display();
        c2.display();
        c3.display();
    }
}
// class TestComplex ends here
