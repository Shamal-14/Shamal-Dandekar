package Polymorphism;

class Farmer {
    int farmerId;
    String farmerName;
    double landArea;
    String city;
    double annualIncome;
    double insuranceAmount;

    Farmer() {
        farmerId = 101;
        farmerName = "Arjun";
        landArea = 650.0;
        city = "Nimdongari";
        annualIncome = 100000.0;
        insuranceAmount = 50000.0;
    }

    Farmer(int farmerId, String farmerName, double landArea, String city, double annualIncome, double insuranceAmount) {
        this.farmerId = farmerId;
        this.farmerName = farmerName;
        this.landArea = landArea;
        this.city = city;
        this.annualIncome = annualIncome;
        this.insuranceAmount = insuranceAmount;
    }

    int getFarmerId() { return farmerId; }
    void setFarmerId(int farmerId) { this.farmerId = farmerId; }
    String getFarmerName() { return farmerName; }
    void setFarmerName(String farmerName) { this.farmerName = farmerName; }
    double getLandArea() { return landArea; }
    void setLandArea(double landArea) { this.landArea = landArea; }
    String getCity() { return city; }
    void setCity(String city) { this.city = city; }
    double getAnnualIncome() { return annualIncome; }
    void setAnnualIncome(double annualIncome) { this.annualIncome = annualIncome; }
    double getInsuranceAmount() { return insuranceAmount; }
    void setInsuranceAmount(double insuranceAmount) { this.insuranceAmount = insuranceAmount; }

    double calculateIncome() {
        return annualIncome;
    }

    void display() {
        System.out.println("Farmer Id: " + farmerId);
        System.out.println("Farmer Name: " + farmerName);
        System.out.println("Land Area: " + landArea + " sqft");
        System.out.println("City: " + city);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("Insurance Amount: " + insuranceAmount);
    }
}

class DairyFarmer extends Farmer {
    int noOfCattles;
    double milkProducePerDay;
    int dairyLicenceNo;

    DairyFarmer() {
        super();
        noOfCattles = 5;
        milkProducePerDay = 100;
        dairyLicenceNo = 568493;
    }

    DairyFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome,
                double insuranceAmount, int noOfCattles, double milkProducePerDay, int dairyLicenceNo) {
        super(farmerId, farmerName, landArea, city, annualIncome, insuranceAmount);
        this.noOfCattles = noOfCattles;
        this.milkProducePerDay = milkProducePerDay;
        this.dairyLicenceNo = dairyLicenceNo;
    }

    int getNoOfCattles() { return noOfCattles; }
    void setNoOfCattles(int noOfCattles) { this.noOfCattles = noOfCattles; }
    double getMilkProducePerDay() { return milkProducePerDay; }
    void setMilkProducePerDay(double milkProducePerDay) { this.milkProducePerDay = milkProducePerDay; }
    int getDairyLicenceNo() { return dairyLicenceNo; }
    void setDairyLicenceNo(int dairyLicenceNo) { this.dairyLicenceNo = dairyLicenceNo; }

    double calculateIncome() {
        return annualIncome + (milkProducePerDay * noOfCattles * 20); // milk value addition
    }

    void display() {
        super.display();
        System.out.println("No. of Cattles: " + noOfCattles);
        System.out.println("Milk Produce per day: " + milkProducePerDay);
        System.out.println("Dairy Licence No.: " + dairyLicenceNo);
    }
}

class PoultryFarmer extends Farmer {
    int noOfChickens;
    int noOfHens;
    int noOfShed;
    int eggProducePerDay;
    String poultryFarmName;

    PoultryFarmer() {
        super();
        noOfChickens = 70;
        noOfHens = 80;
        noOfShed = 5;
        eggProducePerDay = 200;
        poultryFarmName = "Happy Eggs Farm";
    }

    PoultryFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome,
                  double insuranceAmount, int noOfChickens, int noOfHens, int noOfShed, int eggProducePerDay, String poultryFarmName) {
        super(farmerId, farmerName, landArea, city, annualIncome, insuranceAmount);
        this.noOfChickens = noOfChickens;
        this.noOfHens = noOfHens;
        this.noOfShed = noOfShed;
        this.eggProducePerDay = eggProducePerDay;
        this.poultryFarmName = poultryFarmName;
    }

    int getNoOfChickens() { return noOfChickens; }
    void setNoOfChickens(int noOfChickens) { this.noOfChickens = noOfChickens; }
    int getNoOfHens() { return noOfHens; }
    void setNoOfHens(int noOfHens) { this.noOfHens = noOfHens; }
    int getNoOfShed() { return noOfShed; }
    void setNoOfShed(int noOfShed) { this.noOfShed = noOfShed; }
    int getEggProducePerDay() { return eggProducePerDay; }
    void setEggProducePerDay(int eggProducePerDay) { this.eggProducePerDay = eggProducePerDay; }
    String getPoultryFarmName() { return poultryFarmName; }
    void setPoultryFarmName(String poultryFarmName) { this.poultryFarmName = poultryFarmName; }

    double calculateIncome() {
        return annualIncome + (eggProducePerDay * 5); // eggs value addition
    }

    void display() {
        super.display();
        System.out.println("No. of Chickens: " + noOfChickens);
        System.out.println("No. of Hens: " + noOfHens);
        System.out.println("No. of Sheds: " + noOfShed);
        System.out.println("Egg Produce Per Day: " + eggProducePerDay);
        System.out.println("Poultry Farm Name: " + poultryFarmName);
    }
}

class OrganicFarmer extends Farmer {
    int organicEstId;
    String cropType;
    String fertilizerUsed;

    OrganicFarmer() {
        super();
        organicEstId = 101;
        cropType = "Wheat";
        fertilizerUsed = "Vermicompost";
    }

    OrganicFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome,
                  double insuranceAmount, int organicEstId, String cropType, String fertilizerUsed) {
        super(farmerId, farmerName, landArea, city, annualIncome, insuranceAmount);
        this.organicEstId = organicEstId;
        this.cropType = cropType;
        this.fertilizerUsed = fertilizerUsed;
    }

    int getOrganicEstId() { return organicEstId; }
    void setOrganicEstId(int organicEstId) { this.organicEstId = organicEstId; }
    String getCropType() { return cropType; }
    void setCropType(String cropType) { this.cropType = cropType; }
    String getFertilizerUsed() { return fertilizerUsed; }
    void setFertilizerUsed(String fertilizerUsed) { this.fertilizerUsed = fertilizerUsed; }

    double calculateIncome() {
        return annualIncome + (landArea * 100); // organic crop value addition
    }

    void display() {
        super.display();
        System.out.println("Organic Est Id: " + organicEstId);
        System.out.println("Crop Type: " + cropType);
        System.out.println("Fertilizer Used: " + fertilizerUsed);
    }
}

class TestFarmer {
    public static void main(String[] args) {
        Farmer f;

        f = new DairyFarmer();
        System.out.println("Dairy Farmer Income: " + f.calculateIncome());
        f.display();
        System.out.println();

        f = new PoultryFarmer();
        System.out.println("Poultry Farmer Income: " + f.calculateIncome());
        f.display();
        System.out.println();

        f = new OrganicFarmer();
        System.out.println("Organic Farmer Income: " + f.calculateIncome());
        f.display();
        System.out.println();
    }
}
