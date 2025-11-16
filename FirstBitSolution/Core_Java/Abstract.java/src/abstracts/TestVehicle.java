package abstracts;


abstract class Vehicle {
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

 Vehicle(String brand, String fuel, String color, String model, 
         double price, double mileage, double speed) {
     this.brand = brand;
     this.fuel = fuel;
     this.color = color;
     this.model = model;
     this.price = price;
     this.mileage = mileage;
     this.speed = speed;
 }

 
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

 // ABSTRACT METHOD
 abstract String brake();

 // toString() instead of display()
 public String toString() {
     return "Brand: " + brand +
            "\nFuel Type: " + fuel +
            "\nColor: " + color +
            "\nModel: " + model +
            "\nPrice: " + price +
            "\nMileage: " + mileage + " km/l" +
            "\nTop Speed: " + speed + " km/h" +
            "\nBrake Type: " + brake();
 }
}

//----------------------------------------------------
//CAR CLASS
//----------------------------------------------------
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

 Car(String brand, String fuel, String color, String model, double price,
     double mileage, double speed, int numDoors, boolean airConditioner,
     boolean musicSystem) {

     super(brand, fuel, color, model, price, mileage, speed);
     this.numDoors = numDoors;
     this.airConditioner = airConditioner;
     this.musicSystem = musicSystem;
 }

 int getNumDoors() { return numDoors; }
 void setNumDoors(int numDoors) { this.numDoors = numDoors; }

 boolean getAirConditioner() { return airConditioner; }
 void setAirConditioner(boolean airConditioner) { this.airConditioner = airConditioner; }

 boolean getMusicSystem() { return musicSystem; }
 void setMusicSystem(boolean musicSystem) { this.musicSystem = musicSystem; }

 String brake() {
     return "Drum Brake";
 }

 public String toString() {
     return super.toString() +
            "\nDoors: " + numDoors +
            "\nAir Conditioner: " + (airConditioner ? "Yes" : "No") +
            "\nMusic System: " + (musicSystem ? "Yes" : "No") +
            "\n-------------------------------------";
 }
}

//----------------------------------------------------
//BIKE CLASS
//----------------------------------------------------
class Bike extends Vehicle {
 int gear;
 boolean kickStart;

 Bike() {
     super();
     this.gear = 4;
     this.kickStart = true;
 }

 Bike(String brand, String fuel, String color, String model, double price,
      double mileage, double speed, int gear, boolean kickStart) {

     super(brand, fuel, color, model, price, mileage, speed);
     this.gear = gear;
     this.kickStart = kickStart;
 }

 int getGear() { return gear; }
 void setGear(int gear) { this.gear = gear; }

 boolean getKickStart() { return kickStart; }
 void setKickStart(boolean kickStart) { this.kickStart = kickStart; }

 String brake() {
     return "Disc Brake";
 }

 public String toString() {
     return super.toString() +
            "\nGear: " + gear +
            "\nKick Start: " + (kickStart ? "Yes" : "No") +
            "\n-------------------------------------";
 }
}

//----------------------------------------------------
//BUS CLASS
//----------------------------------------------------
class Bus extends Vehicle {
 int capacity;
 double ticketPrice;

 Bus() {
     super();
     this.capacity = 50;
     this.ticketPrice = 0.0;
 }

 Bus(String brand, String fuel, String color, String model, double price,
     double mileage, double speed, int capacity, double ticketPrice) {

     super(brand, fuel, color, model, price, mileage, speed);
     this.capacity = capacity;
     this.ticketPrice = ticketPrice;
 }

 int getCapacity() { return capacity; }
 void setCapacity(int capacity) { this.capacity = capacity; }

 double getTicketPrice() { return ticketPrice; }
 void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }

 String brake() {
     return "Air Brake";
 }

 public String toString() {
     return super.toString() +
            "\nCapacity: " + capacity +
            "\nTicket Price: " + ticketPrice +
            "\n-------------------------------------";
 }
}

//----------------------------------------------------
//TEST CLASS
//----------------------------------------------------
class TestVehicle {
 public static void main(String[] args) {

     Vehicle v;

     v = new Car("Tata", "Petrol", "Red", "Nexon", 1200000, 18, 180, 4, true, true);
     System.out.println(v );
     System.out.println(v.brake());


     v = new Bike("Royal Enfield", "Petrol", "Black", "Classic 350", 220000, 35, 130, 5, true);
     System.out.println(v );
     System.out.println(v.brake());

     v = new Bus("Volvo", "Diesel", "White", "B9R", 5000000, 5, 120, 50, 300);
     System.out.println(v );
     System.out.println(v.brake());

     
 }
}
