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
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
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
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
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
	public double getSalesTarget() {
		return salesTarget;
	}
	public void setSalesTarget(double salesTarget) {
		this.salesTarget = salesTarget;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
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
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	void display() {
		super.display();
		System.out.println("Programming language: "+this.programmingLanguage);
		System.out.println("Project Name: "+this.projectName);
		
		
		
	}
}
//class developer ends here
class TestEmployee{
	public static void main(String[] args) {
		HR hr =new HR();
		SalesManager sm =new SalesManager(102,"samiksha",6000,20000,5.5);
		Developer dev =new Developer();
		hr.display();
		sm.display();
		dev.display();
	}
}
//class testemployee ends here