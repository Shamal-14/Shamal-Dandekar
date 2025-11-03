class product{
int productId;
String pName;
double price;
int quantity;

void setProductName(int i){
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
}
//class product ends here
class TestProduct{
public static void main(String[] args){
product p;//references
p=new product();
p.setProductName(101);
p.setpName("Laptop");
p.setPrice(42000);
p.setQuantity(20);

System.out.println("product ID:"+p.productId);
System.out.println("product name:"+p.pName);
System.out.println("product price:"+p.price);
System.out.println("product quantity:"+p.quantity);

}
}
//class TestProduct ends here
