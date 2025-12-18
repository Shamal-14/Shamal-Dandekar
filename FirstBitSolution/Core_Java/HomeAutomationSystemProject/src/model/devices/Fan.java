package model.devices;
import model.Device;
import model.interfaces.Adjustable;

public class Fan extends Device implements Adjustable {
private int speedLevel; //fan  speed level

public Fan() {
	super("Fan001","Default fan");
	this.speedLevel=1;
}
//Parameterized constructor
public Fan(String deviceId, String deviceName, int speedLevel) {
    super(deviceId, deviceName);
    this.speedLevel = speedLevel;
}
public int getSpeedLevel() {
	return speedLevel;
}
public void setSpeedLevel(int speedLevel) {
	this.speedLevel = speedLevel;
}
@Override
public void increaseLevel()//increase speed
{
    speedLevel++;
    System.out.println(getDeviceName() +
            " speed increased to " + speedLevel);
}
@Override
public void decreaseLevel()//decrease speed level
{
    if (speedLevel > 1) {
        speedLevel--;
        System.out.println(getDeviceName() +
                " speed decreased to " + speedLevel);
    } else {
        System.out.println(getDeviceName() +
                " is already at minimum speed");
    }
}
}
