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
}
//class student ends here 

class TestStudent{
public static void main(String[] args){
student s;//references
s=new student();
s.setRollNo(14);
s.setName("Shamal Dandekar");
s.setMarks(85.35%);

System.out.println("Student roll no:"+s.rollNo);
System.out.println("Student Name:"+s.name);
System.out.println("Student marks:"+s.marks);
}
}
//class TestStudent ends here



