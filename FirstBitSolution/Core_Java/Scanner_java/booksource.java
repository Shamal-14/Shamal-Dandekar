import java.util.Scanner;

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

    // Setter Methods
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

    // Getter Methods
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

    // Display Method
    void display() {
        System.out.println("Book ISBN No: " + this.ISBN);
        System.out.println("Book Name: " + this.BName);
        System.out.println("Book Category: " + this.category);
        System.out.println("Book Price: " + this.price);
        System.out.println("---------------------------------");
    }
}

// Test class
class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Taking input from user ---
        System.out.print("Enter Book ISBN Number: ");
        int isbn = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Book Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        // --- Creating 3 Book objects ---
        Book b1 = new Book(isbn, name, category, price);                  // from user input
        Book b2 = new Book();                                            // default constructor
        Book b3 = new Book(222333, "Python Basics", "Education", 550.75); // parameterized constructor

        // --- Setting values for b2 using setters ---
        b2.setISBN(999888);
        b2.setBName("Core Java");
        b2.setCategory("Programming");
        b2.setPrice(450.50);

        // --- Display all objects ---
        System.out.println("\n--- Book 1 (User Input) ---");
        b1.display();

        System.out.println("--- Book 2 (Using Setters) ---");
        b2.display();

        System.out.println("--- Book 3 (Parameterized Constructor) ---");
        b3.display();
    }
}
