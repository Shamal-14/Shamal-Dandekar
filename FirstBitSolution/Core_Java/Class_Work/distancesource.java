class distance{
double km,meter;

void setKm(double k){
this.km=k;
}
void setM(double m){
this.meter=m;
}
}
//class distance ends here
class distanceD{
public static void main(String[] args){
distance d;//reference
d= new distance();
d.setKm(3.0);
d.setM(200.0);

System.out.println("Distance in kilometer:"+d.km);
System.out.println("Distance in meter:"+d.meter);
}
}
//class distance ends here