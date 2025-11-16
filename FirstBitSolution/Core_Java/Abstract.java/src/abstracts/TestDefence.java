package abstracts;

abstract class Defence {
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

    // ----------- Getters & Setters (3 lines each) -----------

    int getNoOfHead(){
        return noOfHead;
    }
    void setNoOfHead(int noOfHead){
        this.noOfHead = noOfHead;
    }

    int getNoOfTroops(){
        return noOfTroops;
    }
    void setNoOfTroops(int noOfTroops){
        this.noOfTroops = noOfTroops;
    }

    int getNoOfVehicle(){
        return noOfVehicle;
    }
    void setNoOfVehicle(int noOfVehicle){
        this.noOfVehicle = noOfVehicle;
    }

    String getCountryName(){
        return countryName;
    }
    void setCountryName(String countryName){
        this.countryName = countryName;
    }

    int getNoOfCasualities(){
        return noOfCasualities;
    }
    void setNoOfCasualities(int noOfCasualities){
        this.noOfCasualities = noOfCasualities;
    }

    int getNoOfMission(){
        return noOfMission;
    }
    void setNoOfMission(int noOfMission){
        this.noOfMission = noOfMission;
    }

    double getBudget(){
        return budget;
    }
    void setBudget(double budget){
        this.budget = budget;
    }

    int getNoOfDept(){
        return noOfDept;
    }
    void setNoOfDept(int noOfDept){
        this.noOfDept = noOfDept;
    }

    String getLocationOfHeadQuarter(){
        return locationOfHeadQuarter;
    }
    void setLocationOfHeadQuarter(String locationOfHeadQuarter){
        this.locationOfHeadQuarter = locationOfHeadQuarter;
    }

    int getNoOfBases(){
        return noOfBases;
    }
    void setNoOfBases(int noOfBases){
        this.noOfBases = noOfBases;
    }

    int getManPowerCount(){
        return manPowerCount;
    }
    void setManPowerCount(int manPowerCount){
        this.manPowerCount = manPowerCount;
    }

    // -------- abstract method --------
    abstract String attack();

    // -------- toString() --------
    public String toString(){
        return "Country: " + countryName +
               "\nHeads: " + noOfHead +
               "\nTroops: " + noOfTroops +
               "\nVehicles: " + noOfVehicle +
               "\nCasualities: " + noOfCasualities +
               "\nMissions: " + noOfMission +
               "\nBudget: " + budget +
               "\nDepartments: " + noOfDept +
               "\nHQ: " + locationOfHeadQuarter +
               "\nBases: " + noOfBases +
               "\nManpower: " + manPowerCount;
    }
}
class Army extends Defence {
    int noOfTank;
    int noOfGuns;
    int noOfGranade;
    int noOfBatallian;

    Army(){
        super();
        this.noOfTank = 40;
        this.noOfGuns = 590;
        this.noOfGranade = 50;
        this.noOfBatallian = 70;
    }

    Army(int noOfHead, int noOfTroops, int noOfVehicle, String countryName, int noOfCasualities,
         int noOfMission, double budget, int noOfDept, String locationOfHeadQuarter, int noOfBases,
         int manPowerCount, int noOfTank, int noOfGuns, int noOfGranade, int noOfBatallian){

        super(noOfHead, noOfTroops, noOfVehicle, countryName, noOfCasualities,
              noOfMission, budget, noOfDept, locationOfHeadQuarter, noOfBases, manPowerCount);

        this.noOfTank = noOfTank;
        this.noOfGuns = noOfGuns;
        this.noOfGranade = noOfGranade;
        this.noOfBatallian = noOfBatallian;
    }

    int getNoOfTank(){
        return noOfTank;
    }
    void setNoOfTank(int noOfTank){
        this.noOfTank = noOfTank;
    }

    int getNoOfGuns(){
        return noOfGuns;
    }
    void setNoOfGuns(int noOfGuns){
        this.noOfGuns = noOfGuns;
    }

    int getNoOfGranade(){
        return noOfGranade;
    }
    void setNoOfGranade(int noOfGranade){
        this.noOfGranade = noOfGranade;
    }

    int getNoOfBatallian(){
        return noOfBatallian;
    }
    void setNoOfBatallian(int noOfBatallian){
        this.noOfBatallian = noOfBatallian;
    }

    String attack(){
        return "Army Attack: Ground Assault with Tanks & Infantry";
    }

    public String toString(){
        return super.toString() +
               "\nTanks: " + noOfTank +
               "\nGuns: " + noOfGuns +
               "\nGrenades: " + noOfGranade +
               "\nBatallions: " + noOfBatallian;
    }
}
class Navy extends Defence {
    int noOfShips;
    int noOfSubmarines;

    Navy(){
        super();
        this.noOfShips = 25;
        this.noOfSubmarines = 10;
    }

    Navy(int noOfHead, int noOfTroops, int noOfVehicle, String countryName, int noOfCasualities,
         int noOfMission, double budget, int noOfDept, String locationOfHeadQuarter, int noOfBases,
         int manPowerCount, int noOfShips, int noOfSubmarines){

        super(noOfHead, noOfTroops, noOfVehicle, countryName, noOfCasualities,
              noOfMission, budget, noOfDept, locationOfHeadQuarter, noOfBases, manPowerCount);

        this.noOfShips = noOfShips;
        this.noOfSubmarines = noOfSubmarines;
    }

    int getNoOfShips(){
        return noOfShips;
    }
    void setNoOfShips(int noOfShips){
        this.noOfShips = noOfShips;
    }

    int getNoOfSubmarines(){
        return noOfSubmarines;
    }
    void setNoOfSubmarines(int noOfSubmarines){
        this.noOfSubmarines = noOfSubmarines;
    }

    String attack(){
        return "Navy Attack: Warships & Submarine Missile Launch";
    }

    public String toString(){
        return super.toString() +
               "\nShips: " + noOfShips +
               "\nSubmarines: " + noOfSubmarines;
    }
}
class AirForce extends Defence {
    int noOfAircraft;
    int noOfMissions;

    AirForce(){
        super();
        this.noOfAircraft = 50;
        this.noOfMissions = 20;
    }

    AirForce(int noOfHead, int noOfTroops, int noOfVehicle, String countryName, int noOfCasualities,
             int noOfMission, double budget, int noOfDept, String locationOfHeadQuarter, int noOfBases,
             int manPowerCount, int noOfAircraft, int noOfMissions){

        super(noOfHead, noOfTroops, noOfVehicle, countryName, noOfCasualities,
              noOfMission, budget, noOfDept, locationOfHeadQuarter, noOfBases, manPowerCount);

        this.noOfAircraft = noOfAircraft;
        this.noOfMissions = noOfMissions;
    }

    int getNoOfAircraft(){
        return noOfAircraft;
    }
    void setNoOfAircraft(int noOfAircraft){
        this.noOfAircraft = noOfAircraft;
    }

    int getNoOfMissions(){
        return noOfMissions;
    }
    void setNoOfMissions(int noOfMissions){
        this.noOfMissions = noOfMissions;
    }

    String attack(){
        return "Air Force Attack: Fighter Jet Air Strike";
    }

    public String toString(){
        return super.toString() +
               "\nAircraft: " + noOfAircraft +
               "\nAir Missions: " + noOfMissions;
    }
}
public class TestDefence {
    public static void main(String[] args) {

        Defence d;

        d = new Army();
        System.out.println(d);
        System.out.println(d.attack());
        System.out.println("-----------------------");

        d = new Navy();
        System.out.println(d);
        System.out.println(d.attack());
        System.out.println("-----------------------");

        d = new AirForce();
        System.out.println(d);
        System.out.println(d.attack());
        System.out.println("-----------------------");
    }
}
