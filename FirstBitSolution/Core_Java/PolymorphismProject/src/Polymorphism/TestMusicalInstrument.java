
package Polymorphism;



class MusicalInstrument {
    String brand;
    String type;
    double price;

    MusicalInstrument() {
        this.brand = "not given";
        this.type = "unknown";
        this.price = 0.0;
    }

    MusicalInstrument(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    // Getters & Setters
    String getBrand() { return brand; }
    void setBrand(String brand) { this.brand = brand; }

    String getType() { return type; }
    void setType(String type) { this.type = type; }

    double getPrice() { return price; }
    void setPrice(double price) { this.price = price; }

    // overridden in subclasses
    String playSound() {
        return "Unknown sound...";
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}

//=====================================
// GUITAR CLASS
//=====================================
class Guitar extends MusicalInstrument {
    int strings;
    String bodyType;

    Guitar() {
        super();
        this.strings = 0;
        this.bodyType = "none";
    }

    Guitar(String brand, String type, double price, int strings, String bodyType) {
        super(brand, type, price);
        this.strings = strings;
        this.bodyType = bodyType;
    }

    // Getters & Setters
    int getStrings() { return strings; }
    void setStrings(int strings) { this.strings = strings; }

    String getBodyType() { return bodyType; }
    void setBodyType(String bodyType) { this.bodyType = bodyType; }

    // overridden method
    String playSound() {
        return "Guitar sound: Strum Strum 🎸";
    }

    void display() {
        System.out.println("----- Guitar -----");
        super.display();
        System.out.println("Strings: " + strings);
        System.out.println("Body Type: " + bodyType);
    }
}

//=====================================
// FLUTE CLASS
//=====================================
class Flute extends MusicalInstrument {
    String material;
    int holes;

    Flute() {
        super();
        this.material = "none";
        this.holes = 0;
    }

    Flute(String brand, String type, double price, String material, int holes) {
        super(brand, type, price);
        this.material = material;
        this.holes = holes;
    }

    // Getters & Setters
    String getMaterial() { return material; }
    void setMaterial(String material) { this.material = material; }

    int getHoles() { return holes; }
    void setHoles(int holes) { this.holes = holes; }

    // overridden method
    String playSound() {
        return "Flute sound: Phee Phee 🎶";
    }

    void display() {
        System.out.println("----- Flute -----");
        super.display();
        System.out.println("Material: " + material);
        System.out.println("Holes: " + holes);
    }
}

//=====================================
// PIANO CLASS
//=====================================
class Piano extends MusicalInstrument {
    int keys;
    String size;

    Piano() {
        super();
        this.keys = 0;
        this.size = "none";
    }

    Piano(String brand, String type, double price, int keys, String size) {
        super(brand, type, price);
        this.keys = keys;
        this.size = size;
    }

    // Getters & Setters
    int getKeys() { return keys; }
    void setKeys(int keys) { this.keys = keys; }

    String getSize() { return size; }
    void setSize(String size) { this.size = size; }

    // overridden method
    String playSound() {
        return "Piano sound: Ting Ting 🎹";
    }

    void display() {
        System.out.println("----- Piano -----");
        super.display();
        System.out.println("Keys: " + keys);
        System.out.println("Size: " + size);
    }
}


class TestInstrument {
    public static void main(String[] args) {

        MusicalInstrument m;

        m = new Guitar("Yamaha", "Acoustic", 15000, 6, "Wooden");
        System.out.println(m.playSound());
        m.display();
        System.out.println();

        m = new Flute("Bamboo Co.", "Classical", 1200, "Bamboo", 8);
        System.out.println(m.playSound());
        m.display();
        System.out.println();

        m = new Piano("Casio", "Digital", 45000, 88, "Large");
        System.out.println(m.playSound());
        m.display();
        System.out.println();
    }
}

