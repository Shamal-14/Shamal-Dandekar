class Book {
    int ISBN;
    String BName, category;
    double price;

    // Default Constructor
    Book() {
        this.ISBN = 111111;
        this.BName = "Unknown";
        this.category = "General";
        this.price = 0.0;
    }

    // Parameterized Constructor
    Book(int ISBN, String BName, String category, double price) {
        this.ISBN = ISBN;
        this.BName = BName;
        this.category = category;
        this.price = price;
    }

    void setISBN(int i) {
        this.ISBN = i;
    }

    void setBName(String n) {
        this.BName = n;
    }

    void setCategory(String c) {
        this.category = c;
    }

    void setPrice(double p) {
        this.price = p;
    }

    int getISBN() {
        return this.ISBN;
    }

    String getBName() {
        return this.BName;
    }

    String getCategory() {
        return this.category;
    }

    double getPrice() {
        return this.price;
    }

    void display() {
        System.out.println("Book ISBN No: " + this.ISBN);
        System.out.println("Book Name: " + this.BName);
        System.out.println("Book Category: " + this.category);
        System.out.println("Book Price: " + this.price);
        System.out.println("-------------------------");
    }
}
// class Book ends here

class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book(); // default constructor
        Book b2 = new Book(); // will use setters
        Book b3 = new Book(345678, "Python Programming", "Education", 650.75); // parameterized constructor

        b2.setISBN(127856);
        b2.setBName("Advanced Java");
        b2.setCategory("Programming");
        b2.setPrice(500.50);

        b1.display();
        b2.display();
        b3.display();
    }
}
// class TestBook ends here
