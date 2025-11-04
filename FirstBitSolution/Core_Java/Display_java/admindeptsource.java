class Admin{
int Id;
String name;
double salary;
float allowance;
 void setId(int i){
this.Id=i;
}
void setName(String n){
this.name=n;
}
void setSalary(double s){
this.salary=s;

}
void setAllowance(float a){
this.allowance=a;
}
int getId(){
return this.Id;
}
String getName(){
return this.name;
}
double getSalary(){
return this.salary;

}
float getAllowance(){
 return this.allowance;
}

void display(){
System.out.println(" Admin Id :"+this.Id);
System.out.println(" Admin name:"+this.name);
System.out.println(" Admin salary:"+this.salary);
System.out.println(" Admin allowance:"+this.allowance);
}


}

//class Admin ends here

class AdminDept{
public static void main(String[] args){
Admin a;//reference
a=new Admin();
Admin b;
b= new Admin();
a.setId(112);
a.setName("Shamal Dandekar");
a.setSalary(30000.0);
a.setAllowance(10.00f);

b.setId(111);
b.setName("Samiksha Dandekar");
b.setSalary(20000.0);
b.setAllowance(20.00f);

a.display();
b.display();

}
}
//Class AdminDept ends here
