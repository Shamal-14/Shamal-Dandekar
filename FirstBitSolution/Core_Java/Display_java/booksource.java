class Book{
int ISBN;
String BName,category;
double price;
 void setISBN(int i){
this.ISBN=i;
}
void setBName(String n){
this.BName=n;
}
void setCategory(String c){
this.category=c;
}
void setPrice(double p){
this.price=p;
}
int getISBN(){
return this.ISBN;
}
String getbName(){
return this.BName;
}
String getCategory(){
return this.category;
}
double Price(){
return this.price;
}
void display(){
System.out.println("Book ISBN no:"+this.ISBN);
System.out.println("Book Name:"+this.BName);
System.out.println("Book category:"+this.category);
System.out.println("Book Price:"+this.price);
}
}
//class book ends here

class TestBook{
public static void main(String [] args){
Book b;//references
b=new Book();
Book b2;
b2= new Book();
b.setISBN(123456);
b.setBName("Core_Java");
b.setCategory("Programming");
b.setPrice(799.50);

b2.setISBN(127856);
b2.setBName("Advanced_Java");
b2.setCategory("Programming");
b2.setPrice(500.50);

b.display();
b2.display();
}
}
//class TestBook ends here