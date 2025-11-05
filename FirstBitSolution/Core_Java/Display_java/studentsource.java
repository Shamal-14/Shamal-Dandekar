class student{
int rollNo;
String name;
double marks;

void setRollNo(int r){
this.rollNo=r;
}
void setName(String n){
this.name=n;
}
void setMarks(double m){
this.marks=m;
}

int getRollNo(){
return this.rollNo;
}
String getName(){
return this.name;
}
double getMarks(){
return this.marks;
}

void display(){
System.out.println("Student Roll No:"+this.rollNo);
System.out.println("Student Name:"+this.name);
System.out.println("Student Marks:"+this.marks);
}
}
//class student ends here

class TestStudent{
public static void main(String[] args){
student s, s1; //references
s = new student();
s1 = new student();

s.setRollNo(14);
s.setName("Shamal Dandekar");
s.setMarks(85.35);

s1.setRollNo(15);
s1.setName("samiksha dandekar");
s1.setMarks(90.50);

s.display();
s1.display();
}
}
//class TestStudent ends here


