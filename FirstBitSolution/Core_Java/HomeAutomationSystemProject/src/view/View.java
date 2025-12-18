package view;


import java.util.Scanner;

import controller.HomeController;
import controller.RoomController;
import model.Home;
import model.Room;
import model.Device;
import model.devices.*;
import model.interfaces.*;

public class View {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    	HomeController homeController = new HomeController("my home");
        RoomController roomController = new RoomController();
        Home home = homeController.getHome();

        int choice;

        try {
            // Initialize Home with a name
            homeController = new HomeController("My Home");
            home = homeController.getHome();
        } catch (Exception e) {
            System.out.println("Error initializing home: " + e.getMessage());
            return;
        }

        do {
            try {
                System.out.println("\n===== HOME AUTOMATION SYSTEM =====");
                System.out.println("1. Add Room");
                System.out.println("2. Add Device to Room");
                System.out.println("3. Turn ON Device");
                System.out.println("4. Turn OFF Device");
                System.out.println("5. Adjust Device Level");
                System.out.println("6. Set Temperature");
                System.out.println("7. Read Sensor");
                System.out.println("8. Schedule Device");
                System.out.println("9. Show Home Status");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        addRoom(homeController);
                        break;

                    case 2:
                        addDevice(roomController, home);
                        break;

                    case 3:
                        changePower(home, true);
                        break;

                    case 4:
                        changePower(home, false);
                        break;

                    case 5:
                        adjustDevice(home);
                        break;

                    case 6:
                        setTemperature(home);
                        break;

                    case 7:
                        readSensor(home);
                        break;

                    case 8:
                        scheduleDevice(home);
                        break;

                    case 9:
                        home.showHomeStatus();
                        break;

                    case 0:
                        System.out.println("Exiting system...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // clear scanner buffer
            }

        } while (true);
    }

    // ================= METHODS =================

    static void addRoom(HomeController hc) {
        try {
            System.out.print("Enter Room Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            hc.addRoom(name);
            System.out.println("Room added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding room: " + e.getMessage());
        }
    }

    static void addDevice(RoomController rc, Home home) {
        try {
            System.out.print("Enter Room Name: ");
            sc.nextLine();
            String roomName = sc.nextLine();

            Room room = home.getRoom(roomName);
            if (room == null) {
                System.out.println("Room not found!");
                return;
            }

            System.out.println("""
                    Select Device:
                    1. Fan
                    2. AC
                    3. TV
                    4. Music System
                    5. Light
                    6. Shower
                    7. Geyser
                    8. Fridge
                    """);

            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Device ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Device Name: ");
            String name = sc.nextLine();

            Device device = null;

            switch (ch) {
                case 1:
                    device = new Fan(id, name, 1);// default speedLevel = 1
                    device.setDeviceName(name);
                    break;
                case 2:
                    device = new AC(id, name, 24, "Cool"); // default temperature 24°C, mode "Cool"
                    device.setDeviceName(name);
                    break;
                case 3:
                    device = new TV(id, name, 10, 1); // default volume 10, channel 1
                    device.setDeviceName(name);
                    break;
                case 4:
                    device = new MusicSystem(id, name, 5, "Stereo"); // default volume 5, mode "Stereo"
                    device.setDeviceName(name);
                    break;
                case 5:
                    device = new Light(id, name, 1); // default brightness 1
                    device.setDeviceName(name);
                    break;
                case 6:
                    device = new Shower(id, name, 37); // default temperature 37°C
                    device.setDeviceName(name);
                    break;
                case 7:
                    device = new Geyser(id, name, 50); // default heatLevel 50
                    device.setDeviceName(name);
                    break;
                case 8:
                    device = new Fridge(id, name, 4, 2); // default temperature 4°C, coolingLevel 2
                    device.setDeviceName(name);
                    break;
                default:
                    device = null;
                    break;
            }


            if (device != null) {
                rc.addDevice(room, device);
                System.out.println("Device added successfully.");
            } else {
                System.out.println("Invalid device choice!");
            }

        } catch (Exception e) {
            System.out.println("Error adding device: " + e.getMessage());
            sc.nextLine();
        }
    }

    static void changePower(Home home, boolean on) {
        try {
            Device device = getDevice(home);
            if (device == null) return;

            if (on) device.turnOn();
            else device.turnOff();

        } catch (Exception e) {
            System.out.println("Error changing power: " + e.getMessage());
            sc.nextLine();
        }
    }

    static void adjustDevice(Home home) {
        try {
            Device device = getDevice(home);
            if (!(device instanceof Adjustable adj)) {
                System.out.println("Device not adjustable!");
                return;
            }

            System.out.println("1. Increase Level");
            System.out.println("2. Decrease Level");
            int ch = sc.nextInt();

            if (ch == 1) adj.increaseLevel();
            else if (ch == 2) adj.decreaseLevel();
            else System.out.println("Invalid choice!");

        } catch (Exception e) {
            System.out.println("Error adjusting device: " + e.getMessage());
            sc.nextLine();
        }
    }

    static void setTemperature(Home home) {
        try {
            Device device = getDevice(home);
            if (!(device instanceof TemperatureControl temp)) {
                System.out.println("Temperature control not supported!");
                return;
            }

            System.out.print("Enter Temperature: ");
            int t = sc.nextInt();
            temp.setTemperature(t);
            System.out.println("Temperature set.");

        } catch (Exception e) {
            System.out.println("Error setting temperature: " + e.getMessage());
            sc.nextLine();
        }
    }

    static void readSensor(Home home) {
        try {
            Device device = getDevice(home);
            if (!(device instanceof Monitorable mon)) {
                System.out.println("No sensor available!");
                return;
            }

            System.out.println("Sensor Data: " + mon.readSensor());

        } catch (Exception e) {
            System.out.println("Error reading sensor: " + e.getMessage());
            sc.nextLine();
        }
    }

    static void scheduleDevice(Home home) {
        try {
            Device device = getDevice(home);
            if (!(device instanceof Schedulable sch)) {
                System.out.println("Scheduling not supported!");
                return;
            }

            System.out.println("1. Schedule ON");
            System.out.println("2. Schedule OFF");
            int ch = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Time (HH:MM): ");
            String  time = sc.nextLine();

            if (ch == 1) sch.scheduleOn(time);
            else if (ch == 2) sch.scheduleOff(time);
            else System.out.println("Invalid choice!");

        } catch (Exception e) {
            System.out.println("Error scheduling device: " + e.getMessage());
            sc.nextLine();
        }
    }

    static Device getDevice(Home home) {
        try {
            System.out.print("Enter Room Name: ");
            sc.nextLine();
            String roomName = sc.nextLine();

            Room room = home.getRoom(roomName);
            if (room == null) {
                System.out.println("Room not found!");
                return null;
            }

            System.out.print("Enter Device ID: ");
            String id = sc.nextLine();

            Device device = room.getDevice(id);
            if (device == null) System.out.println("Device not found!");

            return device;

        } catch (Exception e) {
            System.out.println("Error selecting device: " + e.getMessage());
            sc.nextLine();
            return null;
        }
    }
}
