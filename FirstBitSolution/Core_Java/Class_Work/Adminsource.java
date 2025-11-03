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
}

//class Admin ends here

class AdminDept{
public static void main(String[] args){
Admin a;//reference
a=new Admin();
a.setId(112);
a.setName("Shamal Dandekar");
a.setSalary(30000.0);
a.setAllowance(10.00f);

System.out.println("Admin id:"+a.Id);
System.out.println("Admin name:"+a.name);
System.out.println("Admin salary:"+a.salary);
System.out.println("Admin Allowance:"+a.allowance);
}
}
//Class AdminDept ends here
