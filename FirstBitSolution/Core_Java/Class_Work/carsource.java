
class car {
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
void setColor(String cl){
this.color=cl;
}
void setFuelCapacity(float fc){
this.fuelCapacity=fc;
}
}
//class car ends here
class TestCar{
public static void main(String [] args){
car c;//references
c=new car();
c.setModel("Swift Dzire");
c.setBrand("Maruti Suzuki");
c.setPrice(850000.00);
c.setColor ("White");
c.setFuelCapacity (37.5f);

System.out.println("Car model:"+c.model);
System.out.println("Car brand:"+c.brand);
System.out.println("Car price:"+c.price);
System.out.println("Car color:"+c.color);
System.out.println("Car fuel capacity:"+c.fuelCapacity);
}
}
//class TestCar ends here




