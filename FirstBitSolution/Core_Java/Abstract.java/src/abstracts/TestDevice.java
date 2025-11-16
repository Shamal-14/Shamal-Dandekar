package abstracts;



abstract class Device {
    String brand;
    String model;
    int batteryLevel;
    double price;

    Device(){
        this.brand = "not known";
        this.model = "not given";
        this.batteryLevel = 0;
        this.price = 0.0;
    }

    Device(String brand, String model, int batteryLevel, double price){
        this.brand = brand;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.price = price;
    }

    String getBrand(){
        return brand;
    }

    void setBrand(String brand){
        this.brand = brand;
    }

    String getModel(){
        return model;
    }

    void setModel(String model){
        this.model = model;
    }

    int getBatteryLevel(){
        return batteryLevel;
    }

    void setBatteryLevel(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }

    double getPrice(){
        return price;
    }

    void setPrice(double price){
        this.price = price;
    }

    // abstract method
    abstract double calDiscount();

    public String toString(){
        return "Brand: " + brand +
               "\nModel: " + model +
               "\nBattery Level: " + batteryLevel +
               "\nPrice: " + price;
    }
}

//=========================================
// MOBILE CLASS
//=========================================
class Mobile extends Device {
    int storage;

    Mobile(){
        super();
        this.storage = 32;
    }

    Mobile(String brand, String model, int batteryLevel, double price, int storage){
        super(brand, model, batteryLevel, price);
        this.storage = storage;
    }

    int getStorage(){
        return storage;
    }

    void setStorage(int storage){
        this.storage = storage;
    }

    double calDiscount(){
        return price * 0.10;
    }

    public String toString(){
        return "----- Mobile -----\n" + super.toString() +
               "\nStorage: " + storage + "GB";
    }
}

//=========================================
// LAPTOP CLASS
//=========================================
class Laptop extends Device {
    int ramSize;

    Laptop(){
        super();
        this.ramSize = 4;
    }

    Laptop(String brand, String model, int batteryLevel, double price, int ramSize){
        super(brand, model, batteryLevel, price);
        this.ramSize = ramSize;
    }

    int getRamSize(){
        return ramSize;
    }

    void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }

    double calDiscount(){
        return price * 0.15;
    }

    public String toString(){
        return "----- Laptop -----\n" + super.toString() +
               "\nRAM Size: " + ramSize + "GB";
    }
}

//=========================================
// SMARTWATCH CLASS
//=========================================
class SmartWatch extends Device {
    int stepCount;

    SmartWatch(){
        super();
        this.stepCount = 0;
    }

    SmartWatch(String brand, String model, int batteryLevel, double price, int stepCount){
        super(brand, model, batteryLevel, price);
        this.stepCount = stepCount;
    }

    int getStepCount(){
        return stepCount;
    }

    void setStepCount(int stepCount){
        this.stepCount = stepCount;
    }

    double calDiscount(){
        return price * 0.05;
    }

    public String toString(){
        return "----- SmartWatch -----\n" + super.toString() +
               "\nStep Count: " + stepCount;
    }
}


class TestDevice {
    public static void main(String[] args) {

        Device d;

        d = new Mobile("Samsung", "A15", 80, 18000, 128);
        System.out.println("Mobile Discount: " + d.calDiscount());
        System.out.println(d);  // only reference
        System.out.println();

        d = new Laptop("HP", "Pavilion", 90, 65000, 16);
        System.out.println("Laptop Discount: " + d.calDiscount());
        System.out.println(d);  // only reference
        System.out.println();

        d = new SmartWatch("Noise", "ColorFit", 70, 3000, 4500);
        System.out.println("SmartWatch Discount: " + d.calDiscount());
        System.out.println(d);  // only reference
        System.out.println();
    }
}
