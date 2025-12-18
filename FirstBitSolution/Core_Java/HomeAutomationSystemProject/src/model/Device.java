package model;
import java.time.LocalDateTime;

public abstract class Device  {
	private String deviceId;
	private String deviceName;
	private boolean status;           
	private LocalDateTime lastOnTime;
	private LocalDateTime lastOffTime;
	
	Device( String deviceId,String deviceName, boolean status,           // true = ON, false = OFFprivate LocalDateTime lastOnTime,
	LocalDateTime lastOffTime, LocalDateTime lastOnTime){
		this.deviceId=deviceId;
		this.deviceName=deviceName;
		this.status=false;
		this.lastOnTime=lastOnTime;
		this.lastOffTime=lastOffTime;
		
	}
	 public Device(String deviceId2, String deviceName2) {
		// TODO Auto-generated constructor stub
	}
	public void turnOn() {
		//turn On device
		if(!status) {
			status=true;
			lastOnTime=LocalDateTime.now();
			System.out.println(deviceName+"turned ON");
		}
		else {
			System.out.println(deviceName+"is already ON");
		}
	}
	public void turnOff() {
		if(status) {
			status=false;
			lastOffTime=LocalDateTime.now();
			System.out.println(deviceName+"turned OFF");
		}
		else {
			System.out.println(deviceName+"is already OFF");
		}
	}
	public String getDeviceInfo() {
		return "Device ID:"+deviceId+", Status: "+(status ? "ON" : "OFF")+", Last ON: "+lastOnTime+", Last OFF: "+lastOffTime;
	}
	
    @Override
    public String toString() {
        return getDeviceInfo();
    }
	
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDateTime getLastOnTime() {
		return lastOnTime;
	}
	public void setLastOnTime(LocalDateTime lastOnTime) {
		this.lastOnTime = lastOnTime;
	}
	public LocalDateTime getLastOffTime() {
		return lastOffTime;
	}
	public void setLastOffTime(LocalDateTime lastOffTime) {
		this.lastOffTime = lastOffTime;
	}
	

}
