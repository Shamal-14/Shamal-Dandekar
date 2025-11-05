class Distance{
double km,meter;

void setKm(double k){
this.km=k;
}
void setM(double m){
this.meter=m;
}
double getKm(){
return this.km;
}
double getM(){
 return this.meter;
}
void display(){
System.out.println("Distance in kilometer:"+this.km);
System.out.println("Distance in meter:"+this.meter);
}
}
//class distance ends here
class DistanceD{
public static void main(String[] args){
Distance d,d1;//reference
d= new Distance();
d1=new Distance();
d.setKm(3.0);
d.setM(200.0);
d1.setKm(4.0);
d1.setM(400.0);
d.display();
d1.display();


}
}
//class distance ends here