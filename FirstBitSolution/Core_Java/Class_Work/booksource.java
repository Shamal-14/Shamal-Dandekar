class book{
int ISBN;
String bName,category;
double price;
 void setISBN(int i){
this.ISBN=i;
}
void setbName(String n){
this.bName=n;
}
void setCategory(String c){
this.category=c;
}
void setPrice(double p){
this.price=p;
}
}
//class book ends here
class TestBook{
public static void main(String [] args){
book b;//references
b=new book();
b.setISBN(123456);
b.setbName("Core_Java");
b.setCategory("Programming");
b.setPrice(799.50);

System.out.println("ISBN number:"+b.ISBN);
System.out.println("Book Name:"+b.bName);
System.out.println("Book Category:"+b.category);
System.out.println("Book price:"+b.price);
}
}
//class TestBook ends here



