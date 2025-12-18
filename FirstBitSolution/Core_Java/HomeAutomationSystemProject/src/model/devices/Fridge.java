package model.devices;

import model.Device;
import model.interfaces.Monitorable;



public class Fridge extends Device implements Monitorable {

    private int temperature;     // current fridge temperature in °C
    private int coolingLevel;    // cooling intensity level (1-5)

    // Default constructor
    public Fridge() {
        super("FR001", "Default Fridge");
        this.temperature = 5;      // default fridge temperature
        this.coolingLevel = 3;     // default cooling level
    }

    // Parameterized constructor
    public Fridge(String deviceId, String deviceName, int temperature, int coolingLevel) {
        super(deviceId, deviceName);
        this.temperature = temperature;
        this.coolingLevel = coolingLevel;
    }

    public int getCoolingLevel() {
		return coolingLevel;
	}

	public void setCoolingLevel(int coolingLevel) {
		this.coolingLevel = coolingLevel;
	}

	public int getTemperature() {
		return temperature;
	}

	// Set temperature
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(getDeviceName() + " temperature set to " + temperature + "°C");
    }

    // Monitor fridge state
    @Override
    public String readSensor() {
        return "Temperature: " + temperature + "°C, Cooling Level: " + coolingLevel;
    }

    
}
