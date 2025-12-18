package model.devices;

import model.Device;

public class Light extends Device {

    private int brightness;   // brightness level

    // Default constructor
    public Light() {
        super("LIGHT001", "Default Light");
        this.brightness = 50;     // default brightness
    }

    // Parameterized constructor
    public Light(String deviceId, String deviceName, int brightness) {
        super(deviceId, deviceName);
        this.brightness = brightness;
    }

    // Getter
    public int getBrightness() {
        return brightness;
    }

    // Setter
    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println(getDeviceName() +
                " brightness set to " + brightness);
    }

   
}
