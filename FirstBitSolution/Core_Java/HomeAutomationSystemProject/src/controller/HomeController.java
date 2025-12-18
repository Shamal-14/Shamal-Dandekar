package controller;

import model.Home;
import model.Room;

public class HomeController {

    private Home home;

    // Constructor to initialize Home with a name
    public HomeController(String homeName) {
        this.home = new Home(homeName);
    }

    // Getter for Home
    public Home getHome() {
        return home;
    }

    // Add a room to the home
    public void addRoom(String name) {
        home.addRoom(new Room(name));
    }
}  