package Polymorphism;

class Artist {
    String name;
    int age;
    String city;

    Artist() {
        this.name = "not given";
        this.age = 0;
        this.city = "unknown";
    }

    Artist(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Getters & Setters
    String getName() { return name; }
    void setName(String name) { this.name = name; }

    int getAge() { return age; }
    void setAge(int age) { this.age = age; }

    String getCity() { return city; }
    void setCity(String city) { this.city = city; }

    // Overridden method in subclasses
    double calIncome() {
        return 0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

//=========================================
// SINGER CLASS
//=========================================
class Singer extends Artist {
    int showsPerMonth;
    double paymentPerShow;

    Singer() {
        super();
        this.showsPerMonth = 0;
        this.paymentPerShow = 0.0;
    }

    Singer(String name, int age, String city, int showsPerMonth, double paymentPerShow) {
        super(name, age, city);
        this.showsPerMonth = showsPerMonth;
        this.paymentPerShow = paymentPerShow;
    }

    // Getters & Setters
    int getShowsPerMonth() { return showsPerMonth; }
    void setShowsPerMonth(int showsPerMonth) { this.showsPerMonth = showsPerMonth; }

    double getPaymentPerShow() { return paymentPerShow; }
    void setPaymentPerShow(double paymentPerShow) { this.paymentPerShow = paymentPerShow; }

    // overridden method
    double calIncome() {
        return showsPerMonth * paymentPerShow;
    }

    void display() {
        System.out.println("------ Singer ------");
        super.display();
        System.out.println("Shows/Month: " + showsPerMonth);
        System.out.println("Payment/Show: " + paymentPerShow);
    }
}

//=========================================
// PAINTER CLASS
//=========================================
class Painter extends Artist {
    int paintingsSold;
    double pricePerPainting;

    Painter() {
        super();
        this.paintingsSold = 0;
        this.pricePerPainting = 0.0;
    }

    Painter(String name, int age, String city, int paintingsSold, double pricePerPainting) {
        super(name, age, city);
        this.paintingsSold = paintingsSold;
        this.pricePerPainting = pricePerPainting;
    }

    // Getters & Setters
    int getPaintingsSold() { return paintingsSold; }
    void setPaintingsSold(int paintingsSold) { this.paintingsSold = paintingsSold; }

    double getPricePerPainting() { return pricePerPainting; }
    void setPricePerPainting(double pricePerPainting) { this.pricePerPainting = pricePerPainting; }

    // overridden method
    double calIncome() {
        return paintingsSold * pricePerPainting;
    }

    void display() {
        System.out.println("------ Painter ------");
        super.display();
        System.out.println("Paintings Sold: " + paintingsSold);
        System.out.println("Price/Painting: " + pricePerPainting);
    }
}

//=========================================
// ACTOR CLASS
//=========================================
class Actor extends Artist {
    int moviesDone;
    double feePerMovie;

    Actor() {
        super();
        this.moviesDone = 0;
        this.feePerMovie = 0.0;
    }

    Actor(String name, int age, String city, int moviesDone, double feePerMovie) {
        super(name, age, city);
        this.moviesDone = moviesDone;
        this.feePerMovie = feePerMovie;
    }

    // Getters & Setters
    int getMoviesDone() { return moviesDone; }
    void setMoviesDone(int moviesDone) { this.moviesDone = moviesDone; }

    double getFeePerMovie() { return feePerMovie; }
    void setFeePerMovie(double feePerMovie) { this.feePerMovie = feePerMovie; }

    // overridden method
    double calIncome() {
        return moviesDone * feePerMovie;
    }

    void display() {
        System.out.println("------ Actor ------");
        super.display();
        System.out.println("Movies Done: " + moviesDone);
        System.out.println("Fee/Movie: " + feePerMovie);
    }
}


class TestArtist {
    public static void main(String[] args) {

        Artist a;

        a = new Singer("Arijit Singh", 36, "Mumbai", 12, 250000);
        System.out.println("Singer Income: " + a.calIncome());
        a.display();
        System.out.println();

        a = new Painter("M. F. Hussain", 60, "Hyderabad", 5, 1500000);
        System.out.println("Painter Income: " + a.calIncome());
        a.display();
        System.out.println();

        a = new Actor("Hrithik Roshan", 45, "Mumbai", 3, 20000000);
        System.out.println("Actor Income: " + a.calIncome());
        a.display();
        System.out.println();
    }
}
