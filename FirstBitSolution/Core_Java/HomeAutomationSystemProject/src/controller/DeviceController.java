package controller;

import model.Device;

public class DeviceController {

    public void turnOn(Device device) {
        device.turnOn();
    }

    public void turnOff(Device device) {
        device.turnOff();
    }
}
