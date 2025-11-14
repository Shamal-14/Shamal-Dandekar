package Polymorphism;

class Device {
    String brand;
    String model;
    int batteryLevel;
    double price;

    Device() {
        this.brand = "not known";
        this.model = "not given";
        this.batteryLevel = 0;
        this.price = 0.0;
    }

    Device(String brand, String model, int batteryLevel, double price) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.price = price;
    }

    // overridden in all subclasses
    double calDiscount() {
        return 0;  // default
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel);
        System.out.println("Price: " + price);
    }
}

//=========================================
// MOBILE CLASS
//=========================================
class Mobile extends Device {
    int storage;

    Mobile() {
        super();
        this.storage = 32;
    }

    Mobile(String brand, String model, int batteryLevel, double price, int storage) {
        super(brand, model, batteryLevel, price);
        this.storage = storage;
    }

    double calDiscount() {
        return price * 0.10;   // 10% discount
    }

    void display() {
        System.out.println("----- Mobile -----");
        super.display();
        System.out.println("Storage: " + storage + "GB");
    }
}

//=========================================
// LAPTOP CLASS
//=========================================
class Laptop extends Device {
    int ramSize;

    Laptop() {
        super();
        this.ramSize = 4;
    }

    Laptop(String brand, String model, int batteryLevel, double price, int ramSize) {
        super(brand, model, batteryLevel, price);
        this.ramSize = ramSize;
    }

    double calDiscount() {
        return price * 0.15;   // 15% discount
    }

    void display() {
        System.out.println("----- Laptop -----");
        super.display();
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

//=========================================
// SMARTWATCH CLASS
//=========================================
class SmartWatch extends Device {
    int stepCount;

    SmartWatch() {
        super();
        this.stepCount = 0;
    }

    SmartWatch(String brand, String model, int batteryLevel, double price, int stepCount) {
        super(brand, model, batteryLevel, price);
        this.stepCount = stepCount;
    }

    double calDiscount() {
        return price * 0.05;   // 5% discount
    }

    void display() {
        System.out.println("----- SmartWatch -----");
        super.display();
        System.out.println("Step Count: " + stepCount);
    }
}


class TestDevice {
    public static void main(String[] args) {

        Device d;

        d = new Mobile("Samsung", "A15", 80, 18000, 128);
        System.out.println("Mobile Discount: " + d.calDiscount());
        d.display();
        System.out.println();

        d = new Laptop("HP", "Pavilion", 90, 65000, 16);
        System.out.println("Laptop Discount: " + d.calDiscount());
        d.display();
        System.out.println();

        d = new SmartWatch("Noise", "ColorFit", 70, 3000, 4500);
        System.out.println("SmartWatch Discount: " + d.calDiscount());
        d.display();
        System.out.println();
    }
}
