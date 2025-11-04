class Complex {
    int real;        
    int imaginary;  
   void setReal(int r){
this.real=r;
}
void setImaginary(int i){
this.imaginary=i;
 }
int getReal(){
return this.real;
}
int getImaginary(){
return this.imaginary;
 }
void display(){
System.out.println("Complex Number: " + this.real + " + " + this.imaginary + "i"); 
}
}
//class complex end here

class TestComplex {
    public static void main(String[] args) {
    Complex c,c1;//reference
    c= new Complex();
    c1=new Complex();
   c.setReal (5);
   c.setImaginary (2);

c1.setReal (7);
c1.setImaginary (5);

c.display();
c1.display();


}//main ends here
}//class TestComplex ends here
