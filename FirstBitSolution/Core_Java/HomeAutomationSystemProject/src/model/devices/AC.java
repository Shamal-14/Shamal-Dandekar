package model.devices;

import model.Device;
import model.interfaces.Adjustable;
import model.interfaces.TemperatureControl;
import model.interfaces.Monitorable;


public class AC extends Device
        implements Adjustable, TemperatureControl, Monitorable {

    private int temperature;   // current temperature
    private String mode;       // Cooling / Heating

    public AC() {
        super("AC001", "Default AC"); 
        this.temperature = 24;
        this.mode = "Cooling";
    }

    // Constructor
    public AC(String deviceId, String deviceName, int temperature, String mode) {
        super(deviceId, deviceName);
        this.temperature = temperature;   
        this.mode = mode;                 }


    
    public int getTemperature() {
		return temperature;
	}

	public String getMode() {
		return mode;
	}

	@Override
    public void increaseLevel() {
        temperature--;   // more cooling
        System.out.println(getDeviceName() +
                " cooling increased, temperature: " + temperature + "°C");
    }

    
    @Override
    public void decreaseLevel() {
        temperature++;   // less cooling
        System.out.println(getDeviceName() +
                " cooling decreased, temperature: " + temperature + "°C");
    }

    
    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(getDeviceName() +
                " temperature set to " + temperature + "°C");
    }

   
    @Override
    public String readSensor() //monitor AC state
    {
        return "Temperature: " + temperature +
               "°C, Mode: " + mode;
    }

    // Optional mode setter
    public void setMode(String mode) {
        this.mode = mode;
        System.out.println(getDeviceName() + " mode set to " + mode);
    }
}
