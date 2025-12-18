package model.devices;

import model.Device;
import model.interfaces.Adjustable;


public class TV extends Device
        implements Adjustable {

    private int volume;
    private int channel;

    // Default constructor
    public TV() {
        super("TV001", "Default TV");
        this.volume = 10;     // default volume
        this.channel = 1;     // default channel
    }

    // Parameterized constructor
    public TV(String deviceId, String deviceName, int volume, int channel) {
        super(deviceId, deviceName);
        this.volume = volume;
        this.channel = channel;
    }
    

    public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
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

    // Change channel
    public void changeChannel(int channel) {
        this.channel = channel;
        System.out.println(getDeviceName() +
                " channel changed to " + channel);
    }

	

    

    
}
