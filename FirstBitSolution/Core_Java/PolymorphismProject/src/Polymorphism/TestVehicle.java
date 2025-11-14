package Polymorphism;

class Vehicle {
    String brand;
    String fuel;
    String color;
    String model;
    double price;
    double mileage;
    double speed;

    Vehicle() {
        this.brand = "Unknown";
        this.fuel = "Petrol";
        this.color = "White";
        this.model = "N/A";
        this.price = 0.0;
        this.mileage = 0.0;
        this.speed = 0.0;
    }

    Vehicle(String brand, String fuel, String color, String model, double price, double mileage, double speed) {
        this.brand = brand;
        this.fuel = fuel;
        this.color = color;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        this.speed = speed;
    }

    // ---------- GETTERS & SETTERS ----------
    String getBrand() { return brand; }
    void setBrand(String brand) { this.brand = brand; }

    String getFuel() { return fuel; }
    void setFuel(String fuel) { this.fuel = fuel; }

    String getColor() { return color; }
    void setColor(String color) { this.color = color; }

    String getModel() { return model; }
    void setModel(String model) { this.model = model; }

    double getPrice() { return price; }
    void setPrice(double price) { this.price = price; }

    double getMileage() { return mileage; }
    void setMileage(double mileage) { this.mileage = mileage; }

    double getSpeed() { return speed; }
    void setSpeed(double speed) { this.speed = speed; }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Fuel Type: " + this.fuel);
        System.out.println("Color: " + this.color);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("Mileage: " + this.mileage + " km/l");
        System.out.println("Top Speed: " + this.speed + " km/h");
    }

    void brake() {
        System.out.println("Brake type: Generic brake system");
    }
}



class Car extends Vehicle {
    int numDoors;
    boolean airConditioner;
    boolean musicSystem;

    Car() {
        super();
        this.numDoors = 4;
        this.airConditioner = true;
        this.musicSystem = true;
    }

    Car(String brand, String fuel, String color, String model, double price, double mileage, double speed,
         int numDoors, boolean airConditioner, boolean musicSystem) {

        super(brand, fuel, color, model, price, mileage, speed);
        this.numDoors = numDoors;
        this.airConditioner = airConditioner;
        this.musicSystem = musicSystem;
    }

    // ---------- GETTERS & SETTERS ----------
    int getNumDoors() { return numDoors; }
    void setNumDoors(int numDoors) { this.numDoors = numDoors; }

    boolean getAirConditioner() { return airConditioner; }
    void setAirConditioner(boolean airConditioner) { this.airConditioner = airConditioner; }

    boolean getMusicSystem() { return musicSystem; }
    void setMusicSystem(boolean musicSystem) { this.musicSystem = musicSystem; }

    void display() {
        super.display();
        System.out.println("Doors: " + this.numDoors);
        System.out.println("Air Conditioner: " + (airConditioner ? "Yes" : "No"));
        System.out.println("Music System: " + (musicSystem ? "Yes" : "No"));
        brake();
        System.out.println("-------------------------------------");
    }

    void brake() {
        System.out.println("Brake type: Drum Brake");
    }
}
// ============= CAR CLASS ENDS HERE =====================



class Bike extends Vehicle {
    int gear;
    boolean kickStart;

    Bike() {
        super();
        this.gear = 4;
        this.kickStart = true;
    }

    Bike(String brand, String fuel, String color, String model, double price, double mileage, double speed,
         int gear, boolean kickStart) {
        super(brand, fuel, color, model, price, mileage, speed);
        this.gear = gear;
        this.kickStart = kickStart;
    }

    
    int getGear() { return gear; }
    void setGear(int gear) { this.gear = gear; }

    boolean getKickStart() { return kickStart; }
    void setKickStart(boolean kickStart) { this.kickStart = kickStart; }

    void display() {
        super.display();
        System.out.println("Gear: " + this.gear);
        System.out.println("Kick Start: " + (kickStart ? "Yes" : "No"));
        brake();
        System.out.println("-------------------------------------");
    }

    void brake() {
        System.out.println("Brake type: Disc Brake");
    }
}



class Bus extends Vehicle {
    int capacity;
    double ticketPrice;

    Bus() {
        super();
        this.capacity = 50;
        this.ticketPrice = 0.0;
    }

    Bus(String brand, String fuel, String color, String model, double price, double mileage, double speed,
         int capacity, double ticketPrice) {
        super(brand, fuel, color, model, price, mileage, speed);
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
    }

    
    int getCapacity() { return capacity; }
    void setCapacity(int capacity) { this.capacity = capacity; }

    double getTicketPrice() { return ticketPrice; }
    void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }

    void display() {
        super.display();
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Ticket Price: " + this.ticketPrice);
        brake();
       
    }

    void brake() {
        System.out.println("Brake type: Air Brake");
    }
}



class TestVehicle {
    public static void main(String[] args) {

        
        Car car = new Car("Tata", "Petrol", "Red", "Nexon", 1200000, 18, 180, 4, true, true);
        Bike bike = new Bike("Royal Enfield", "Petrol", "Black", "Classic 350", 220000, 35, 130, 5, true);
        Bus bus = new Bus("Volvo", "Diesel", "White", "B9R", 5000000, 5, 120, 50, 300);

        car.display();
        bike.display();
        bus.display();

        
        Vehicle v;

        v = new Car("Maruti", "Petrol", "Blue", "Swift", 800000, 22, 160, 4, true, true);
        v.display();  

        v = new Bike("Honda", "Petrol", "Red", "Shine", 90000, 55, 100, 4, false);
        v.display();  
        v = new Bus("Ashok Leyland", "Diesel", "Yellow", "City Bus", 3000000, 4, 90, 40, 20);
        v.display(); 
    }
}
