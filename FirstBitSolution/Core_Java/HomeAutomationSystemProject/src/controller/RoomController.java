package controller;

import model.Room;
import model.Device; // Make sure this is the base device class

public class RoomController {

    // Add a device to a room
    public void addDevice(Room room, Device device) {
        if (room != null && device != null) {
            room.addDevice(device);
            System.out.println("Device '" + device.getDeviceName() + "' added to room '" + room.getRoomName() + "'");
        } else {
            System.out.println("Room or Device is null!");
        }
    }
}
