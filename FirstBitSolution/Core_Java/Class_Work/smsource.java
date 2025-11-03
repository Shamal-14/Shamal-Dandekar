class salesManager{
int ID,target;
String name;
double salary,incentive;
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
}
//class salesManager ends here
class salesMangerDetails{
public static void main (String[] args){
salesManager sm;//refereances
sm=new salesManager();
sm.setID(101);
sm.setTarget(5);
sm.setName("Shamal Dandekar");
sm.setSalary(20000.0);
sm.setIncentive(5000.0);

System.out.println("Sales Manager ID:"+sm.ID);
System.out.println("Sales Manager Target:"+sm.target);
System.out.println("Sales Manager name:"+sm.name);
System.out.println("Sales Manager salary:"+sm.salary);
System.out.println("Sales Manager Incentive:"+sm.incentive);
}
}
//class salesManagerDetails ends here






