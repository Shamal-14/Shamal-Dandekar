class Farmer{
	int farmerId;
	String farmerName;
	double landArea;
	String city;
	double annualIncome;
	double insuranceAmount;
	Farmer(){
		this.farmerId=101;
		this.farmerName="Arjun";
		this.landArea=650.00;
		this.city="nimdongari";
		this.annualIncome=100000.00;
		this.insuranceAmount=50000.00;
		
	}
	Farmer(int farmerId,String farmerName,double landArea,String city,double annualIncome,double insuranceAmount){
		this.farmerId =farmerId;
		this.farmerName =farmerName;
		this.landArea =landArea;
		this.city=city;
		this.annualIncome=annualIncome;
		this.insuranceAmount=insuranceAmount;
		
	}
	 int getFarmerId() {
		return farmerId;
	}
	void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	String getFarmerName() {
		return farmerName;
	}
	 void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	double getLandArea() {
		return landArea;
	}
	void setLandArea(double landArea) {
		this.landArea = landArea;
	}
	 String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	 double getAnnualIncome() {
		return annualIncome;
	}
	void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	 double getInsuranceAmount() {
		return insuranceAmount;
	}
	 void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	void display() {
		System.out.println("Farmer Id: "+this.farmerId);
		System.out.println("Farmer Name: "+this.farmerName);
		System.out.println("Land Area :"+this.landArea+"sqft");
		System.out.println("City: "+this.city);
		System.out.println("Anual Income: "+this.annualIncome+"/year");
		System.out.println("Insurance Amount: "+this.insuranceAmount);
	}
}
//class farmer ends here
class DairyFarmer extends Farmer{
	int noOfCattles;
	double milkProducePerDay;
	int dairyLicenceNo;
	 DairyFarmer(){
		 this.noOfCattles=5;
		 this.milkProducePerDay=100;
		 this.dairyLicenceNo=568493;
		 
	 }
	 DairyFarmer(int farmerId,String farmerName,double landArea,String city,double annualIncome,double insuranceAmount,int noOfCattles,double milkProducePerDay,int dairyLicenceNo){
		 super(farmerId,farmerName,landArea,city,annualIncome,insuranceAmount);
		 this.noOfCattles =noOfCattles;
		 this.milkProducePerDay=milkProducePerDay;
		 this.dairyLicenceNo=dairyLicenceNo;
	 }
	  int getNoOfCattles() {
		 return noOfCattles;
	 }
	  void setNoOfCattles(int noOfCattles) {
		 this.noOfCattles = noOfCattles;
	 }
	  double getMilkProducePerDay() {
		 return milkProducePerDay;
	 }
	 void setMilkProducePerDay(double milkProducePerDay) {
		 this.milkProducePerDay = milkProducePerDay;
	 }
	  int getDairyLicenceNo() {
		 return dairyLicenceNo;
	 }
	 void setDairyLicenceNo(int dairyLicenceNo) {
		 this.dairyLicenceNo = dairyLicenceNo;
	 }
	 void display() {
		 super.display();
		 System.out.println("No. of Cattles: "+this.noOfCattles);
		 System.out.println("Milk Produce per day: "+this.milkProducePerDay);
		 System.out.println("Dairy Licence No.: "+this.dairyLicenceNo);
		 
	 }
}
//class dairyfarmer ends here
class PoultryFarmer extends Farmer{
	
	int noOfChickens;
	int noOfHens;
	int noOfShed;
	int eggProducePerDay;
	String poultryFarmName;
	
	PoultryFarmer(){
		super();
		this.noOfChickens=70;
		this.noOfHens=80;
		
	}
	PoultryFarmer(int farmerId,String farmerName,double landArea,String city,double annualIncome,double insuranceAmount,int noOfChickens,int noOfHens,int noOfShed,int eggProducePerDay,String PoultryFarmName){
		super(farmerId,farmerName,landArea,city,annualIncome,insuranceAmount );
		this.noOfChickens=noOfChickens;
		this.noOfHens=noOfHens;
		this.noOfShed=noOfShed;
		this.eggProducePerDay=eggProducePerDay;
		this.poultryFarmName=poultryFarmName;
		
	}
	int getNoOfChickens() {
		return noOfChickens;
	}
  void setNoOfChickens(int noOfChickens) {
		this.noOfChickens = noOfChickens;
	}
	int getNoOfHens() {
		return noOfHens;
	}
	void setNoOfHens(int noOfHens) {
		this.noOfHens = noOfHens;
	}
	int getNoOfShed() {
		return noOfShed;
	}
	void setNoOfShed(int noOfShed) {
		this.noOfShed = noOfShed;
	}
	int getEggProducePerDay() {
		return eggProducePerDay;
	}
	void setEggProducePerDay(int eggProducePerDay) {
		this.eggProducePerDay = eggProducePerDay;
	}
	String getPoultryFarmName() {
		return poultryFarmName;
	}
	void setPoultryFarmName(String poultryFarmName) {
		this.poultryFarmName = poultryFarmName;
	}
	void display() {
		super.display();
		System.out.println("No. of Chickens: "+this.noOfChickens);
		System.out.println("No. of Hens: "+this.noOfHens);
		System.out.println("No of Sheds: "+this.noOfShed);
		System.out.println("Egg Produce Per Day: "+this.eggProducePerDay);
		System.out.println("Poultry Farm Name: "+this.poultryFarmName);
		
	}
	
}
//class poultry farm ends here
class OrganicFarmer extends Farmer {
	int organicEstId;
	String cropType;
	String fertilizerUsed;
	

		OrganicFarmer (){
			super();
		this.organicEstId=101;
		this.cropType="Wheat";
		this.fertilizerUsed="Vermicompost";
		
	}
		OrganicFarmer(int farmerId,String farmerName,double landArea,String city,double annualIncome,double insuranceAmount,int organicEstId,String cropType,String fertilizerUsed){
			super(farmerId,farmerName,landArea,city,annualIncome,insuranceAmount);
			this.organicEstId=organicEstId;
			this.cropType=cropType;
			this.fertilizerUsed=fertilizerUsed;
			
		}
		 int getOrganicEstId() {
			return organicEstId;
		}
		 void setOrganicEstId(int organicEstId) {
			this.organicEstId = organicEstId;
		}
		 String getCropType() {
			return cropType;
		}
		 void setCropType(String cropType) {
			this.cropType = cropType;
		}
		 String getFertilizerUsed() {
			return fertilizerUsed;
		}
		void setFertilizerUsed(String fertilizerUsed) {
			this.fertilizerUsed = fertilizerUsed;
		}
		
     void display() {
    	 super.display();
    	 System.out.println("Organic Est Id: "+this.organicEstId);
    	 System.out.println("Crop Type : "+this.cropType);
    	 System.out.println("Fertilizer Used : "+this.fertilizerUsed);
    	 
    	 }
     }
//class OrganicFarmer ends here
class TestFarmer{
	public static void main(String[] args) {
		DairyFarmer df=new DairyFarmer();
		PoultryFarmer pf=new PoultryFarmer();
		OrganicFarmer of=new OrganicFarmer();
		df.display();
		pf.display();
		of.display();
	}
}
//class test farmer ends here