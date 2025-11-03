class Complex {
    int real;        
    int imaginary;  
   void setReal(int r){
this.real=r;
}
void setImaginary(int i){
this.imaginary=i;
 }
}
//class complex end here

class TestComplex {
    public static void main(String[] args) {
                Complex c;//reference
          c= new Complex();

         c.setReal (5);
        c.setImaginary (2);

          System.out.println("Complex Number: " + c.real + " + " + c.imaginary + "i");      

    }
}
