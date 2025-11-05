class product{
int productId;
String pName;
double price;
int quantity;

void setProductId(int i){
this.productId=i;
}
void setpName(String n){
this.pName=n;
}
void setPrice(double p){
this.price=p;
}
void setQuantity(int q){
this.quantity=q;
}
int getProductId(){
return this.productId;
}
String  setpName(){
return this.pName;
}
double setPrice(){
return this.price;
}
int setQuantity(){
return this.quantity;
}
void display(){
System.out.println("product ID:"+this.productId);
System.out.println("product name:"+this.pName);
System.out.println("product price:"+this.price);
System.out.println("product quantity:"+this.quantity);

}

}
//class product ends here
class TestProduct{
public static void main(String[] args){
product p,p1;//references
p=new product();
p1=new product();
p.setProductId(101);
p.setpName("Laptop");
p.setPrice(42000);
p.setQuantity(20);
p1.setProductId(201);
p1.setpName("Laptop");
p1.setPrice(35000);
p1.setQuantity(10);
p.display();
p1.display();


}
}
//class TestProduct ends here
