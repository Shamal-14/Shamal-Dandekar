package model.devices;

import model.Device;
import model.interfaces.TemperatureControl;
import model.interfaces.Monitorable;
import model.interfaces.Schedulable;



public class Geyser extends Device
        implements TemperatureControl, Schedulable, Monitorable {

    private int heatLevel;  // Geyser heat level (1-5)

    // Default constructor
    public Geyser() {
        super("GY001", "Default Geyser");
        this.heatLevel = 3;  // default heat level
    }

    // Parameterized constructor
    public Geyser(String deviceId, String deviceName, int heatLevel) {
        super(deviceId, deviceName);
        this.heatLevel = heatLevel;
    }
    

    public int getHeatLevel() {
		return heatLevel;
	}

	public void setHeatLevel(int heatLevel) {
		this.heatLevel = heatLevel;
	}

	// Set heat level
    @Override
    public void setTemperature(int heatLevel) {
        this.heatLevel = heatLevel;
        System.out.println(getDeviceName() +
                " heat level set to " + heatLevel);
    }

    // Monitor geyser state (simple like Shower)
    @Override
    public String readSensor() {
        return "Heat Level: " + heatLevel;
    }

    // Schedule ON at specific time
    @Override
    public void scheduleOn(String time) {
        System.out.println(getDeviceName() + " scheduled to turn ON at " + time);
    }

    // Schedule OFF at specific time
    @Override
    public void scheduleOff(String time) {
        System.out.println(getDeviceName() + " scheduled to turn OFF at " + time);
    }

}
