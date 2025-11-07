class Shape {

    // Area of Triangle
    void area(double base, double height) {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }

    // Area of Rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    // Area of Circle
    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14159 * radius * radius));
    }
}
// class Shape ends here


// Class TestShape
class TestShape {
    public static void main(String[] args) {

        Shape s = new Shape();

        // Calculate area of Triangle
        s.area(10.0, 5.0);

        // Calculate area of Rectangle
        s.area(8, 6);

        // Calculate area of Circle
        s.area(7.0);
    }
}//class TestShape ends here
