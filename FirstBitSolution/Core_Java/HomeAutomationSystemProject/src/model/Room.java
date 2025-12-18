package model;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String roomName;
    private List<Device> devices;

    // Constructor
    public Room(String roomName) {
        this.roomName = roomName;
        this.devices = new ArrayList<>();
    }

    // Add a device to the room
    public void addDevice(Device device) {
        if (device != null) {
            devices.add(device);
            System.out.println(device.getDeviceName() + " added to " + roomName);
        }
    }

    // Remove a device from the room
    public void removeDevice(Device device) {
        if (device != null && devices.remove(device)) {
            System.out.println(device.getDeviceName() + " removed from " + roomName);
        } else {
            System.out.println("Device not found in " + roomName);
        }
    }

    // Get all devices
    public List<Device> getDevices() {
        return devices;
    }

    // Get room name
    public String getRoomName() {
        return roomName;
    }

    public Device getDevice(String id) {
        for (Device d : devices) {
            if (d.getDeviceId() != null && d.getDeviceId().equals(id)) {
                return d;
            }
        }
        return null;
    }


    // Show room status
    public void showRoomStatus() {
        System.out.println("Room: " + roomName);
        if (devices.isEmpty()) {
            System.out.println("No devices in this room.");
        } else {
            for (Device d : devices) {
                System.out.println(" - Device: " + d.getDeviceName() + " (ID: " + d.getDeviceId() + ")");
            }
        }
    }
}
