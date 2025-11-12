class Employee{
	int empId;
	String name;
	double salary;
	
	Employee(){//default constructor
		this.empId=101;
		this.name="shamal";
		this.salary=20000.00;
		
	}
	Employee(int empId,String name,double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	int getEmpId() {
		return empId;
	}
	void setEmpId(int empId) {
		this.empId = empId;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	 double getSalary() {
		return salary;
	}
	 void setSalary(double salary) {
		this.salary = salary;
	}
	void display() {
		System.out.println("Employee ID: "+this.empId);
		System.out.println("Employee Name: "+this.name);
		System.out.println("salary: "+this.salary);
	}
}
//class Employee ends here
class HR extends Employee{
	int teamSize;
	String region;
	
	HR(){
		super();
		this.teamSize=10;
		this.region="pune ";
	}
	HR(int empId,String name,double salary, int teamSize,String region){
		super(empId,name,salary);
		this.teamSize=teamSize;
	this.region=region;
	}
	int getTeamSize() {
		return teamSize;
	}
	void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	String getRegion() {
		return region;
	}
	 void setRegion(String region) {
		this.region = region;
	}
	void display() {
		super.display();
		System.out.println("Team Size: "+this.teamSize);
		System.out.println("Region: "+this.region);
	}
	}
//class HR ends here
class SalesManager extends Employee{
	double salesTarget;
	double commisionRate;
	
	SalesManager(){
		super();
		this.salesTarget=10.00;
		this.commisionRate=150.00;
	}
	SalesManager(int empId,String name,double salary,double salesTarget,double commisionRate){
		super(empId,name,salary);
		this.salesTarget=salesTarget;
		this.commisionRate=commisionRate;
	}
	 double getSalesTarget() {
		return salesTarget;
	}
	 void setSalesTarget(double salesTarget) {
		this.salesTarget = salesTarget;
	}
	 double getCommisionRate() {
		return commisionRate;
	}
	 void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	void display() {
		super.display();
		System.out.println("Sales Target: "+this.salesTarget);
		System.out.println("Commision Rate: "+this.commisionRate+"%");
	}
}
//class sales manager ends here
class Developer extends Employee{
	String programmingLanguage;
	String projectName;
	
	Developer(){
		super();
		this.programmingLanguage="Unknown";
		this.projectName="unassigned";
		
	}
	Developer(int empId,String name,double salary,String programmingLanguage,String projectName){
		super(empId,name,salary);
		this.programmingLanguage=programmingLanguage;
		this.projectName=projectName;
		
	}
	String getProgrammingLanguage() {
		return programmingLanguage;
	}
	void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	String getProjectName() {
		return projectName;
	}
	void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	void display() {
		super.display();
		System.out.println("Programming language: "+this.programmingLanguage);
		System.out.println("Project Name: "+this.projectName);
		
		
	}
}
	class AreaSalesManager extends SalesManager{
		String areaName;
		AreaSalesManager(){
			super();
			this.areaName="none";
		}
		AreaSalesManager(int empId,String name,double salary,double salesTarget,double commisionRate,String areaName){
			super(empId,name,salary,salesTarget,commisionRate);
			this.areaName=areaName;
		}
		String getAreaName() {
			return areaName;
		}
		 void setAreaName(String areaName) {
			this.areaName = areaName;
		}
		 void display() {
			 super.display();
			 System.out.println("Area : "+this.areaName);
		 }
		
	
}
//class developer ends here
class TestEmployee{
	public static void main(String[] args) {
		HR hr =new HR();
		SalesManager sm =new SalesManager(102,"samiksha",6000,20000,5.5);
		Developer dev =new Developer();
		AreaSalesManager a=new AreaSalesManager();
		hr.display();
		sm.display();
		dev.display();
		a.display();
	}
}
//class testemployee ends here