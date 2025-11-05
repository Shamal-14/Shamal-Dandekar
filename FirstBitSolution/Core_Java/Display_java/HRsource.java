class HR{
int Id;
String name;
double salary,commision;
 void setID(int i){
this.Id=i;
}
void setName(String n){
this.name=n;
}
void setSalary(double s){
this.salary=s;
}
void setCommision(double c){
this.commision=c;
}
 int getID(){
return this.Id;
}
String getName(){
return this.name;
}
double getSalary(){
return this.salary;
}
double getCommision(){
return this.commision;
}
void display(){
System.out.println("HR ID:"+this.Id);
System.out.println("HR Name:"+this.name);
System.out.println("HR Salary:"+this.salary);
System.out.println("HR commision:"+this.commision);
}
}
//class HR ends here
class hrDept{
public static void main(String[] args){
HR h,h1;
h=new HR();
h1=new HR();
h.setID(110);
h.setName("shamal Dandekar");
h.setSalary(20000.0);
h.setCommision(2500.0);

h1.setID(200);
h1.setName("samiksha Dandekar");
h1.setSalary(10000.0);
h1.setCommision(200.0);
h.display();
h1.display();


}
}
//class hrDept ends here







