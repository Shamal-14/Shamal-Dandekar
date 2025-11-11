
class Device{
	String brand;
	String model;
	int batteryLevel;
	double price;
	
	Device(){
		this.brand="not known";
		this.model="not given";
		this.batteryLevel=0;
		this.price=0.0;
		
	}
	Device( String brand, String model,int batteryLevel,double price){
		this.brand=brand;
		this.model=model;
		this.batteryLevel=batteryLevel;
		this.price=price;
	}
	String getBrand() {
		return brand;
	}
	 void setBrand(String brand) {
		this.brand = brand;
	}
	String getModel() {
		return model;
	}
	 void setModel(String model) {
		this.model = model;
	}
	 int getBatteryLevel() {
		return batteryLevel;
	}
	void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	 double getPrice() {
		return price;
	}
	 void setPrice(double price) {
		this.price = price;
	}
	
	 void display() {
		 System.out.println("Brand: "+this.brand);
		 System.out.println("Model: "+this.model);
		 System.out.println("Battery Level: "+this.batteryLevel);
		 System.out.println("Price: "+this.price);
		 
	 }
}
//class Device ends here
class Mobile extends Device{
	int simSlots;
	int cameraMP;
	int storage;
	boolean is5g;
	
	Mobile(){
		super();
		this.simSlots=1;
		this.cameraMP=8;
		this.storage=32;
		this.is5g=false;
		
		
		
	}
	Mobile(String brand, String model, int batteryLevel,double price,int simSlots,int cameraMP,int storage,boolean is5g){
		super(brand,model,batteryLevel,price);
		this.simSlots=simSlots;
		this.cameraMP=cameraMP;
		this.storage=storage;
		this.is5g=is5g;
		
	}
	 int getSimSlots() {
		return simSlots;
	}
	void setSimSlots(int simSlots) {
		this.simSlots = simSlots;
	}
	int getCameraMP() {
		return cameraMP;
	}
	 void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}
	 int getStorage() {
		return storage;
	}
	 void setStorage(int storage) {
		this.storage = storage;
	}
	 boolean isIs5g() {
		return is5g;
	}
	 void setIs5g(boolean is5g) {
		this.is5g = is5g;
	}
	
	 void display() {
		 super.display();
		 System.out.println("Sim Slots: "+this.simSlots);
		 System.out.println("Camera Mp: "+this.cameraMP+"MP");
		 System.out.println("Storage: "+this.storage+"GB");
		 System.out.println("is 5g: "+this.is5g);
	 }
}
//class mobile ends here
class Laptop extends Device {
    int ramSize; // in GB
    String processor;
    String operatingSystem;
    
    Laptop() {
        super();
        this.ramSize = 4;
        this.processor = "not given";
        this.operatingSystem = "not known";
        
    }
    Laptop(String brand, String model, int batteryLevel, double price,
            int ramSize, String processor, String operatingSystem) {
         super(brand, model, batteryLevel, price);
         this.ramSize = ramSize;
         this.processor = processor;
         this.operatingSystem = operatingSystem;
     }
	 int getRamSize() {
		return ramSize;
	}
	 void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	String getProcessor() {
		return processor;
	}
	void setProcessor(String processor) {
		this.processor = processor;
	}
	 String getOperatingSystem() {
		return operatingSystem;
	}
	void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	void display() {
		super.display();
		System.out.println("Ram Size: "+this.ramSize+"GB");
		System.out.println("Processor: "+this.processor);
		System.out.println("Operating System: "+this.operatingSystem);
		
	}
}
//class Laptop ends here

class SmartWatch extends Device{
	int heartRate;
    int stepCount;
    boolean waterResistant;
    boolean connectedToPhone;
    
    SmartWatch(){
    	super();
    	this.heartRate=0;
    	this.stepCount=0;
    	this.waterResistant=false;
    	this.connectedToPhone=true;
    	
    }
    SmartWatch(String brand, String model, int batteryLevel, double price,
            int heartRate, int stepCount, boolean waterResistant, boolean connectedToPhone) {
    	super(brand,model,batteryLevel,price);
    	this.heartRate=heartRate;
    	this.stepCount=stepCount;
    	this.waterResistant=waterResistant;
    	this.connectedToPhone=connectedToPhone;
    	
    }
	 int getHeartRate() {
		return heartRate;
	}
	 void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	 int getStepCount() {
		return stepCount;
	}
	void setStepCount(int stepCount) {
		this.stepCount = stepCount;
	}
	boolean isWaterResistant() {
		return waterResistant;
	}
	 void setWaterResistant(boolean waterResistant) {
		this.waterResistant = waterResistant;
	}
	 boolean isConnectedToPhone() {
		return connectedToPhone;
	}
	 void setConnectedToPhone(boolean connectedToPhone) {
		this.connectedToPhone = connectedToPhone;
	}
	 void display() {
		 super.display();
		 System.out.println("Heart Rate: "+this.heartRate+"BPM");
		 System.out.println("Step Count: "+this.stepCount);
		 System.out.println("Water Resistant: "+(waterResistant?"yes":"No"));
		 System.out.println("Connected To Phone: "+(connectedToPhone?"yes":"No"));
		 
	 }
    
}
//class smart watch ends here
class TestDevice{
	public static void main(String [] args) {
		Mobile m=new Mobile();
		Laptop l=new Laptop("HP","pavilion 15",90,65000,16,"intel i7","Winddows 11");
		SmartWatch s=new SmartWatch();
		m.display();
		l.display();
		s.display();
	}
	//class TestDevice ends here
	
}