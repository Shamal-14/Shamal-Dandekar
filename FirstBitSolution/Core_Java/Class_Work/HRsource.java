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
}
//class HR ends here
class hrDept{
public static void main(String[] args){
HR h;
h=new HR();
h.setID(110);
h.setName("shamal Dandekar");
h.setSalary(20000.0);
h.setCommision(2500.0);

System.out.println("HR ID:"+h.Id);
System.out.println("HR Name:"+h.name);
System.out.println("HR Salary:"+h.salary);
System.out.println("HR commision:"+h.commision);
}
}
//class hrDept ends here







