# 🏠 Home Automation System

A **Java-based Home Automation System** to manage rooms and smart devices in your home.  
This project demonstrates **OOP concepts** like **Inheritance, Polymorphism, Abstraction, Interfaces**, and **Exception Handling**.

---

## 🎯 Features

- Add multiple **rooms** in the home. 🏠
- Add multiple **devices** per room:
  - 🌬️ Fan
  - ❄️ AC
  - 📺 TV
  - 🎵 Music System
  - 💡 Light
  - 🚿 Shower
  - 🔥 Geyser
  - 🧊 Fridge
- Turn devices **ON/OFF** 🔌.
- Adjust settings for **Adjustable devices**:
  - Speed, Volume, Brightness, Temperature, etc. ⚙️
- Set **temperature** for supported devices 🌡️.
- Read **sensor data** for Monitorable devices 📟.
- **Schedule devices** ON/OFF at specific times ⏰.
- Display **home status** showing all devices and their current state 📊.

---

## 📁 Project Structure
HomeAutomationSystem/
│
├─ src/
│ ├─ controller/
│ │ ├─ HomeController.java
│ │ └─ RoomController.java
│ │
│ ├─ model/
│ │ ├─ Device.java
│ │ ├─ Home.java
│ │ ├─ Room.java
│ │ └─ AbstractDevice.java
│ │
│ ├─ model/devices/
│ │ ├─ AC.java
│ │ ├─ Fan.java
│ │ ├─ Fridge.java
│ │ ├─ Geyser.java
│ │ ├─ Light.java
│ │ ├─ MusicSystem.java
│ │ ├─ Shower.java
│ │ └─ TV.java
│ │
│ ├─ model/interfaces/
│ │ ├─ Adjustable.java
│ │ ├─ Monitorable.java
│ │ ├─ Schedulable.java
│ │ └─ TemperatureControl.java
│ │
│ └─ view/
│ └─ View.java
│
└─ README.md


---

## 🚀 Usage

1. **Clone the repository**:  

```bash
git clone https://github.com/yourusername/HomeAutomationSystem.git


Open in your IDE (Eclipse, IntelliJ, VSCode).

Run the View.java file to start the application.

Use the menu interface to:

Add rooms 🏠

Add devices to rooms 💡

Turn devices ON/OFF 🔌

Adjust device settings ⚙️

Schedule devices ⏰

View home status 📊

🎮 Example Menu
===== HOME AUTOMATION SYSTEM =====
1. Add Room
2. Add Device to Room
3. Turn ON Device
4. Turn OFF Device
5. Adjust Device Level
6. Set Temperature
7. Read Sensor
8. Schedule Device
9. Show Home Status
0. Exit
Enter choice:

🎨 Example Output
Room 'Living Room' added successfully
Device 'Fan001' added to room 'Living Room'
Fan 'Fan001' turned ON
Fan 'Fan001' speed increased to 2
AC 'AC001' set to temperature 24°C
Device 'Light001' turned OFF

🛠️ Technologies Used
Technology	Description
Java 8+	Core programming language
OOP Concepts	Inheritance, Polymorphism, Abstraction
Interfaces	Adjustable, Monitorable, TemperatureControl
Exception Handling	Proper error handling for runtime stability
LocalDateTime	Tracks device last ON/OFF times


