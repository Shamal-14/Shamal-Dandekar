package Polymorphism;

// Parent class
class Shape {
    String color;
    int borderWidth;

    Shape() {
        this.color = "black";
        this.borderWidth = 1;
    }

    Shape(String color, int borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    // Setters and Getters
    String getColor() { return color; }
    void setColor(String color) { this.color = color; }

    int getBorderWidth() { return borderWidth; }
    void setBorderWidth(int borderWidth) { this.borderWidth = borderWidth; }

    // Common method to demonstrate polymorphism
    double area() {
        return 0; // generic shape has no defined area
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Border Width: " + borderWidth);
        System.out.println("Area: " + area());
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle() {
        super();
        this.radius = 2.5;
    }

    Circle(String color, int borderWidth, double radius) {
        super(color, borderWidth);
        this.radius = radius;
    }

    double getRadius() { return radius; }
    void setRadius(double radius) { this.radius = radius; }

    double area() {
        return 3.14 * radius * radius;
    }

    void display() {
        super.display();
        System.out.println("Radius: " + radius);
    }
}

// Rectangle class
class Rectangle extends Shape {
    int length, width;

    Rectangle() {
        super();
        this.length = 5;
        this.width = 3;
    }

    Rectangle(String color, int borderWidth, int length, int width) {
        super(color, borderWidth);
        this.length = length;
        this.width = width;
    }

    int getLength() { return length; }
    void setLength(int length) { this.length = length; }

    int getWidth() { return width; }
    void setWidth(int width) { this.width = width; }

    double area() {
        return length * width;
    }

    void display() {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle() {
        super();
        this.base = 4.0;
        this.height = 5.0;
    }

    Triangle(String color, int borderWidth, double base, double height) {
        super(color, borderWidth);
        this.base = base;
        this.height = height;
    }

    double getBase() { return base; }
    void setBase(double base) { this.base = base; }

    double getHeight() { return height; }
    void setHeight(double height) { this.height = height; }

    double area() {
        return 0.5 * base * height;
    }

    void display() {
        super.display();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }
}

// Test class demonstrating polymorphism
class TestShape {
    public static void main(String[] args) {
        Shape s;

        s = new Circle("Red", 2, 7.5);
        System.out.println("Circle Area: " + s.area());
        s.display();
        System.out.println();

        s = new Rectangle("Blue", 3, 10, 6);
        System.out.println("Rectangle Area: " + s.area());
        s.display();
        System.out.println();

        s = new Triangle("Green", 1, 8.0, 5.0);
        System.out.println("Triangle Area: " + s.area());
        s.display();
        System.out.println();
    }
}
