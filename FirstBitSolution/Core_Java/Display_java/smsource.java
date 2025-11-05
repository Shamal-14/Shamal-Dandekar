class salesManager{
int ID, target;
String name;
double salary, incentive;

void setID(int i){
this.ID=i;
}
void setTarget(int t){
this.target=t;
}
void setName(String n){
this.name=n;
}
void setSalary(double s){
this.salary=s;
}
void setIncentive(double i){
this.incentive=i;
}

int getID(){
return this.ID;
}
int getTarget(){
return this.target;
}
String getName(){
return this.name;
}
double getSalary(){
return this.salary;
}
double getIncentive(){
return this.incentive;
}

void display(){
System.out.println("Sales Manager ID:"+this.ID);
System.out.println("Sales Manager Target:"+this.target);
System.out.println("Sales Manager Name:"+this.name);
System.out.println("Sales Manager Salary:"+this.salary);
System.out.println("Sales Manager Incentive:"+this.incentive);
}

}
//class salesManager ends here

class salesManagerDetails{
public static void main(String[] args){
salesManager sm, sm1; //references
sm = new salesManager();
sm1 = new salesManager();

sm.setID(101);
sm.setTarget(5);
sm.setName("Shamal Dandekar");
sm.setSalary(20000.0);
sm.setIncentive(5000.0);

sm1.setID(102);
sm1.setTarget(8);
sm1.setName("Suresh Patil");
sm1.setSalary(25000.0);
sm1.setIncentive(7000.0);

sm.display();
sm1.display();
}
}
//class salesManagerDetails ends here


