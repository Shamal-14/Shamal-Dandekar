class Product {
    int productId;
    String pName;
    double price;
    int quantity;

    // Default Constructor
    Product() {
        this.productId = 0;
        this.pName = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Parameterized Constructor
    Product(int productId, String pName, double price, int quantity) {
        this.productId = productId;
        this.pName = pName;
        this.price = price;
        this.quantity = quantity;
    }

    void setProductId(int i) {
        this.productId = i;
    }

    void setpName(String n) {
        this.pName = n;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setQuantity(int q) {
        this.quantity = q;
    }

    int getProductId() {
        return this.productId;
    }

    String getpName() {
        return this.pName;
    }

    double getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.quantity;
    }

    void display() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.pName);
        System.out.println("Product Price: " + this.price);
        System.out.println("Product Quantity: " + this.quantity);
        System.out.println("---------------------------------");
    }
}
// class Product ends here

class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product(); // default constructor
        Product p2 = new Product(); // will use setters
        Product p3 = new Product(301, "Tablet", 25000.0, 15); // parameterized constructor

        p2.setProductId(201);
        p2.setpName("Laptop");
        p2.setPrice(42000);
        p2.setQuantity(20);

        p1.display();
        p2.display();
        p3.display();
    }
}
// class TestProduct ends here
