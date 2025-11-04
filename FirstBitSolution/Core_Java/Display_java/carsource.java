class Car {
    String model;
    String brand;
    double price;
    String color;
    float fuelCapacity;

 void setModel(String m){
this.model=m;
 }
void setBrand(String b){
this.brand=b;
}
void setPrice(double p){
this.price=p;
}
void setColor(String co){
this.color=co;
}
void setFuelCapacity(float fc){
this.fuelCapacity=fc;
}
String getModel(){
 return this.model;
 }
String getBrand(){
return this.brand;
}
double setPrice(){
return this.price;
}
String getColor(){
return this.color;
}
float getFuelCapacity(){
 return this.fuelCapacity;
}
void display(){
System.out.println("Car model:"+this.model);
System.out.println("Car brand:"+this.brand);
System.out.println("Car price:"+this.price);
System.out.println("Car color:"+this.color);
System.out.println("Car fuel capacity:"+this.fuelCapacity);
}

}
//class car ends here
class TestCar{
public static void main(String [] args){
Car c,c1;//references
c=new Car();
c1=new Car();
c.setModel("Swift Dzire");
c.setBrand("Maruti Suzuki");
c.setPrice(850000.00);
c.setColor ("White");
c.setFuelCapacity (37.5f);
c1.setModel("Civic");
c1.setBrand("Honda");
c1.setPrice(750000.00);
c1.setColor ("Black");
c1.setFuelCapacity (40.5f);

c.display();
c1.display();
}
}
//class TestCar ends here




