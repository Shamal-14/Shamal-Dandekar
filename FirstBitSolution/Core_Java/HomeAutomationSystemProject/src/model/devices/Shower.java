package model.devices;

import model.Device;
import model.interfaces.TemperatureControl;
import model.interfaces.Monitorable;



public class Shower extends Device
        implements TemperatureControl, Monitorable {

    private int temperature;   // water temperature

    // Default constructor
    public Shower() {
        super("SH001", "Default Shower");
        this.temperature = 35;   // default water temperature
    }

    // Parameterized constructor
    public Shower(String deviceId, String deviceName, int temperature) {
        super(deviceId, deviceName);
        this.temperature = temperature;
    }

    // Set water temperature
    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(getDeviceName() +
                " water temperature set to " + temperature + "°C");
    }

    // Monitor shower state
    @Override
    public String readSensor() {
        return "Water Temperature: " + temperature + "°C";
    }

    // Getter
    public int getTemperature() {
        return temperature;
    }
}
