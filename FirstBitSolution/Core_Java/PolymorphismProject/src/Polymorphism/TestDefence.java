package Polymorphism;

//---------------------- SUPER CLASS ----------------------
class Defence {
    int noOfHead;
    int noOfTroops;
    int noOfVehicle;
    String countryName;
    int noOfCasualities;
    int noOfMission;
    double budget;
    int noOfDept;
    String locationOfHeadQuarter;
    int noOfBases;
    int manPowerCount;

    Defence() {
        this.noOfHead = 2;
        this.noOfTroops = 3;
        this.noOfVehicle = 100;
        this.countryName = "India";
        this.noOfCasualities = 5;
        this.noOfMission = 7;
        this.budget = 1500000.00;
        this.noOfDept = 15;
        this.locationOfHeadQuarter = "Kashmir";
        this.noOfBases = 8;
        this.manPowerCount = 200;
    }

    Defence(int noOfHead, int noOfTroops, int noOfVehicle, String countryName, int noOfCasualities,
            int noOfMission, double budget, int noOfDept, String locationOfHeadQuarter,
            int noOfBases, int manPowerCount) {

        this.noOfHead = noOfHead;
        this.noOfTroops = noOfTroops;
        this.noOfVehicle = noOfVehicle;
        this.countryName = countryName;
        this.noOfCasualities = noOfCasualities;
        this.noOfMission = noOfMission;
        this.budget = budget;
        this.noOfDept = noOfDept;
        this.locationOfHeadQuarter = locationOfHeadQuarter;
        this.noOfBases = noOfBases;
        this.manPowerCount = manPowerCount;
    }

    // ----------- Getters and Setters -----------
    int getNoOfHead() { return noOfHead; }
    void setNoOfHead(int noOfHead) { this.noOfHead = noOfHead; }

    int getNoOfTroops() { return noOfTroops; }
    void setNoOfTroops(int noOfTroops) { this.noOfTroops = noOfTroops; }

    int getNoOfVehicle() { return noOfVehicle; }
    void setNoOfVehicle(int noOfVehicle) { this.noOfVehicle = noOfVehicle; }

    String getCountryName() { return countryName; }
    void setCountryName(String countryName) { this.countryName = countryName; }

    int getNoOfCasualities() { return noOfCasualities; }
    void setNoOfCasualities(int noOfCasualities) { this.noOfCasualities = noOfCasualities; }

    int getNoOfMission() { return noOfMission; }
    void setNoOfMission(int noOfMission) { this.noOfMission = noOfMission; }

    double getBudget() { return budget; }
    void setBudget(double budget) { this.budget = budget; }

    int getNoOfDept() { return noOfDept; }
    void setNoOfDept(int noOfDept) { this.noOfDept = noOfDept; }

    String getLocationOfHeadQuarter() { return locationOfHeadQuarter; }
    void setLocationOfHeadQuarter(String locationOfHeadQuarter) { this.locationOfHeadQuarter = locationOfHeadQuarter; }

    int getNoOfBases() { return noOfBases; }
    void setNoOfBases(int noOfBases) { this.noOfBases = noOfBases; }

    int getManPowerCount() { return manPowerCount; }
    void setManPowerCount(int manPowerCount) { this.manPowerCount = manPowerCount; }

    // ----------- Methods -----------
    String attack() {
        return "General Defence Attack Plan";
    }

    void display() {
        System.out.println("Country: " + this.countryName);
        System.out.println("No. of Heads: " + this.noOfHead);
        System.out.println("No. of Troops: " + this.noOfTroops);
        System.out.println("No. of Vehicles: " + this.noOfVehicle);
        System.out.println("No. of Casualities: " + this.noOfCasualities);
        System.out.println("No. of Missions: " + this.noOfMission);
        System.out.println("Budget: " + this.budget);
        System.out.println("No. of Departments: " + this.noOfDept);
        System.out.println("HQ Location: " + this.locationOfHeadQuarter);
        System.out.println("No. of Bases: " + this.noOfBases);
        System.out.println("Manpower Count: " + this.manPowerCount);
    }
}

//---------------------- ARMY ----------------------
class Army extends Defence {
    int noOfTank;
    int noOfGuns;
    int noOfGranade;
    int noOfBatallian;

    Army() {
        super();
        this.noOfTank = 40;
        this.noOfGuns = 590;
        this.noOfGranade = 50;
        this.noOfBatallian = 70;
    }

    Army(int noOfHead, int noOfTroops, int noOfVehicle, String countryName, int noOfCasualities, int noOfMission,
         double budget, int noOfDept, String locationOfHeadQuarter, int noOfBases, int manPowerCount,
         int noOfTank, int noOfGuns, int noOfGranade, int noOfBatallian) {

        super(noOfHead, noOfTroops, noOfVehicle, countryName, noOfCasualities, noOfMission, budget,
              noOfDept, locationOfHeadQuarter, noOfBases, manPowerCount);

        this.noOfTank = noOfTank;
        this.noOfGuns = noOfGuns;
        this.noOfGranade = noOfGranade;
        this.noOfBatallian = noOfBatallian;
    }

    // Getters & Setters
    int getNoOfTank() { return noOfTank; }
    void setNoOfTank(int noOfTank) { this.noOfTank = noOfTank; }

    int getNoOfGuns() { return noOfGuns; }
    void setNoOfGuns(int noOfGuns) { this.noOfGuns = noOfGuns; }

    int getNoOfGranade() { return noOfGranade; }
    void setNoOfGranade(int noOfGranade) { this.noOfGranade = noOfGranade; }

    int getNoOfBatallian() { return noOfBatallian; }
    void setNoOfBatallian(int noOfBatallian) { this.noOfBatallian = noOfBatallian; }

    String attack() {
        return "Army Attack: Ground Assault with Tanks and Infantry";
    }

    void display() {
        super.display();
        System.out.println("No. of Tanks: " + this.noOfTank);
        System.out.println("No. of Guns: " + this.noOfGuns);
        System.out.println("No. of Grenades: " + this.noOfGranade);
        System.out.println("No. of Batallions: " + this.noOfBatallian);
    }
}

//---------------------- NAVY ----------------------
class Navy extends Defence {
    int noOfShips;
    int noOfSubmarines;

    Navy() {
        super();
        this.noOfShips = 25;
        this.noOfSubmarines = 10;
    }

    Navy(int noOfHead, int noOfTroops, int noOfVehicle, String countryName, int noOfCasualities,
         int noOfMission, double budget, int noOfDept, String locationOfHeadQuarter, int noOfBases,
         int manPowerCount, int noOfShips, int noOfSubmarines) {

        super(noOfHead, noOfTroops, noOfVehicle, countryName, noOfCasualities, noOfMission,
              budget, noOfDept, locationOfHeadQuarter, noOfBases, manPowerCount);

        this.noOfShips = noOfShips;
        this.noOfSubmarines = noOfSubmarines;
    }

    int getNoOfShips() { return noOfShips; }
    void setNoOfShips(int noOfShips) { this.noOfShips = noOfShips; }

    int getNoOfSubmarines() { return noOfSubmarines; }
    void setNoOfSubmarines(int noOfSubmarines) { this.noOfSubmarines = noOfSubmarines; }

    String attack() {
        return "Navy Attack: Launching Missiles from Warships and Submarines";
    }

    void display() {
        super.display();
        System.out.println("No. of Ships: " + this.noOfShips);
        System.out.println("No. of Submarines: " + this.noOfSubmarines);
    }
}

//---------------------- AIR FORCE ----------------------
class AirForce extends Defence {
    int noOfAircraft;
    int noOfMissions;

    AirForce() {
        super();
        this.noOfAircraft = 50;
        this.noOfMissions = 20;
    }

    AirForce(int noOfHead, int noOfTroops, int noOfVehicle, String countryName, int noOfCasualities,
             int noOfMission, double budget, int noOfDept, String locationOfHeadQuarter, int noOfBases,
             int manPowerCount, int noOfAircraft, int noOfMissions) {

        super(noOfHead, noOfTroops, noOfVehicle, countryName, noOfCasualities, noOfMission,
              budget, noOfDept, locationOfHeadQuarter, noOfBases, manPowerCount);

        this.noOfAircraft = noOfAircraft;
        this.noOfMissions = noOfMissions;
    }

    int getNoOfAircraft() { return noOfAircraft; }
    void setNoOfAircraft(int noOfAircraft) { this.noOfAircraft = noOfAircraft; }

    int getNoOfMissions() { return noOfMissions; }
    void setNoOfMissions(int noOfMissions) { this.noOfMissions = noOfMissions; }

    String attack() {
        return "Air Force Attack: Air Strike using Fighter Jets and Missiles";
    }

    void display() {
        super.display();
        System.out.println("No. of Aircraft: " + noOfAircraft);
        System.out.println("No. of Air Missions: " + noOfMissions);
    }
}

//---------------------- TEST CLASS ----------------------
public class TestDefence {
    public static void main(String[] args) {

        Army army = new Army();
        army.display();

        Navy navy = new Navy();
        navy.display();

        AirForce airForce = new AirForce();
        airForce.display();

        

        Defence d;

        d = new Army();
        System.out.println(d.attack());

        d = new Navy();
        System.out.println(d.attack());

        d = new AirForce();
        System.out.println(d.attack());
    }
}
