class Employee {
    int ID;
    String name;
    double salary;

    void setId(int i) { 
this.ID = i;
 }
    void setName(String n) {
 this.name = n;
 }
    void setSalary(double s) {
 this.salary = s;
 }
int getId() { 
return this.ID;
 }
    String getName() {
 return this.name ;
 }
    double getSalary() {
 return this.salary ;
 }
void display(){
System.out.println("employee id:" + this.ID);
        System.out.println("employee name:" + this.name);
        System.out.println("employee salary:" + this.salary);
}

} // class Employee ends here

class TestEmployee {
    public static void main(String[] a) {
        Employee e1 = new Employee();
Employee e2 = new Employee();

        e1.setId(111);
        e1.setName("shamal Dandekar");
        e1.setSalary(50000.0);
e2.setId(122);
        e2.setName("Samiksha Dandekar");
        e2.setSalary(30000.0);

e1.display();
e2.display();



            }
} // class TestEmployee ends here

