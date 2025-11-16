package abstracts;
abstract class MusicalInstrument {

    String name;
    String type;

    MusicalInstrument() {
        this.name = "Unknown";
        this.type = "Unknown";
    }

    MusicalInstrument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    abstract void play();

    public String toString() {
        return "Name: " + name + ", Type: " + type;
    }
}

// Guitar class ---------------------------------------------------------

class Guitar extends MusicalInstrument {

    int strings;

    Guitar() {
        this.strings = 6;
    }

    Guitar(String name, String type, int strings) {
        super(name, type);
        this.strings = strings;
    }

    int getStrings() {
        return strings;
    }

    void setStrings(int strings) {
        this.strings = strings;
    }

    void play() {
        System.out.println("Guitar is strumming melodiously.");
    }

    public String toString() {
        return super.toString() + ", Strings: " + strings;
    }
}

// Flute class -----------------------------------------------------------

class Flute extends MusicalInstrument {

    String material;

    Flute() {
        this.material = "Bamboo";
    }

    Flute(String name, String type, String material) {
        super(name, type);
        this.material = material;
    }

    String getMaterial() {
        return material;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void play() {
        System.out.println("Flute is playing a soothing melody.");
    }

    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}

// Piano class -----------------------------------------------------------

class Piano extends MusicalInstrument {

    int keys;

    Piano() {
        this.keys = 88;
    }

    Piano(String name, String type, int keys) {
        super(name, type);
        this.keys = keys;
    }

    int getKeys() {
        return keys;
    }

    void setKeys(int keys) {
        this.keys = keys;
    }

    void play() {
        System.out.println("Piano is playing a classical tune.");
    }

    public String toString() {
        return super.toString() + ", Keys: " + keys;
    }
}

// Main class ------------------------------------------------------------

class TestInstrument {
    public static void main(String[] args) {

        MusicalInstrument d;

        d = new Guitar("Acoustic Guitar", "String", 6);
        System.out.println(d);
        d.play();

        d = new Flute("Indian Flute", "Wind", "Bamboo");
        System.out.println(d);
        d.play();

        d = new Piano("Grand Piano", "Percussion", 88);
        System.out.println(d);
        d.play();
    }
}
