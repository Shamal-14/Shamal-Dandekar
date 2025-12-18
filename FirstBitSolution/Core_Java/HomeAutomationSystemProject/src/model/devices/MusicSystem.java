        package model.devices;

import model.Device;
import model.interfaces.Adjustable;
import model.interfaces.Schedulable;



public class MusicSystem extends Device
        implements Adjustable, Schedulable {

    private int volume;
    private String mode;   // Bluetooth / AUX / USB / Radio

    // Default constructor
    public MusicSystem() {
        super("MS001", "Default Music System");
        this.volume = 10;          // default volume
        this.mode = "Bluetooth";  // default mode
    }

    // Parameterized constructor
    public MusicSystem(String deviceId, String deviceName, int volume, String mode) {
        super(deviceId, deviceName);
        this.volume = volume;
        this.mode = mode;
    }

    // Getters & setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
        System.out.println(getDeviceName() + " mode set to " + mode);
    }

    // Increase volume
    @Override
    public void increaseLevel() {
        volume++;
        System.out.println(getDeviceName() +
                " volume increased to " + volume);
    }

    // Decrease volume
    @Override
    public void decreaseLevel() {
        if (volume > 0) {
            volume--;
            System.out.println(getDeviceName() +
                    " volume decreased to " + volume);
        } else {
            System.out.println("Volume is already at minimum");
        }
    }

	@Override
	public void scheduleOn(String time) {
		System.out.println(getDeviceName() +
                " scheduled to turn ON at " + time);
		
	}

	@Override
	public void scheduleOff(String  time) {
		System.out.println(getDeviceName() +
                " scheduled to turn OFF at " + time);
		
	}

    
	
}
