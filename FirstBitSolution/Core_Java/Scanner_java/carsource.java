import java.util.Scanner;

class Car {
    String model;
    String brand;
    double price;
    String color;
    float fuelCapacity;

    // Default Constructor
    Car() {
        this.model = "Default Model";
        this.brand = "Default Brand";
        this.price = 500000.00;
        this.color = "Silver";
        this.fuelCapacity = 35.0f;
    }

    // Parameterized Constructor
    Car(String model, String brand, double price, String color, float fuelCapacity) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.fuelCapacity = fuelCapacity;
    }

    // Setter Methods
    void setModel(String m) {
        this.model = m;
    }

    void setBrand(String b) {
        this.brand = b;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setColor(String co) {
        this.color = co;
    }

    void setFuelCapacity(float fc) {
        this.fuelCapacity = fc;
    }

    // Getter Methods
    String getModel() {
        return this.model;
    }

    String getBrand() {
        return this.brand;
    }

    double getPrice() {
        return this.price;
    }

    String getColor() {
        return this.color;
    }

    float getFuelCapacity() {
        return this.fuelCapacity;
    }

    // Display Method
    void display() {
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Brand: " + this.brand);
        System.out.println("Car Price: " + this.price);
        System.out.println("Car Color: " + this.color);
        System.out.println("Car Fuel Capacity: " + this.fuelCapacity + " liters");
        System.out.println("------------------------------------");
    }
}
// class Car ends here

class TestCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Taking input from user for first car ---
        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Car Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Car Price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Car Color: ");
        String color = sc.nextLine();

        System.out.print("Enter Car Fuel Capacity (in liters): ");
        float fuel = sc.nextFloat();

        Car c1 = new Car(model, brand, price, color, fuel);              
        Car c2 = new Car();                                             
        Car c3 = new Car("Creta", "Hyundai", 1450000.00, "Red", 42.5f); 
        c2.setModel("Swift Dzire");
        c2.setBrand("Maruti Suzuki");
        c2.setPrice(850000.00);
        c2.setColor("White");
        c2.setFuelCapacity(37.5f);

             c1.display();

               c2.display();

              c3.display();
    }
}
// class TestCar ends here
