package model;

import java.time.LocalDateTime;

public abstract class Device {

    private String deviceId;
    private String deviceName;
    private boolean status;           
    private LocalDateTime lastOnTime;
    private LocalDateTime lastOffTime;

    // Constructor with device ID and name
    public Device(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = false;           // default OFF
        this.lastOnTime = null;
        this.lastOffTime = null;
    }

    // Getters and setters
    public String getDeviceId() { return deviceId; }
    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }
    public String getDeviceName() { return deviceName; }
    public void setDeviceName(String deviceName) { this.deviceName = deviceName; }
    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }
    public LocalDateTime getLastOnTime() { return lastOnTime; }
    public void setLastOnTime(LocalDateTime lastOnTime) { this.lastOnTime = lastOnTime; }
    public LocalDateTime getLastOffTime() { return lastOffTime; }
    public void setLastOffTime(LocalDateTime lastOffTime) { this.lastOffTime = lastOffTime; }

    // Methods to turn ON/OFF
    public void turnOn() {
        if (!status) {
            status = true;
            lastOnTime = LocalDateTime.now();
            System.out.println(deviceName + " turned ON");
        } else {
            System.out.println(deviceName + " is already ON");
        }
    }

    public void turnOff() {
        if (status) {
            status = false;
            lastOffTime = LocalDateTime.now();
            System.out.println(deviceName + " turned OFF");
        } else {
            System.out.println(deviceName + " is already OFF");
        }
    }

    // Device info
    public String getDeviceInfo() {
        return "Device ID: " + deviceId + ", Status: " + (status ? "ON" : "OFF")
                + ", Last ON: " + lastOnTime + ", Last OFF: " + lastOffTime;
    }

    @Override
    public String toString() {
        return getDeviceInfo();
    }
}
