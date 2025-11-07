class Printer {
    int num;
    char ch;
    String str;

    void print() {
        System.out.println("Printing with no arguments");
    }

    void print(int num) {
        this.num = num;
        System.out.println("Printing integer: " + this.num);
    }

    void print(char ch) {
        this.ch = ch;
        System.out.println("Printing character: " + this.ch);
    }

    void print(String str) {
        this.str = str;
        System.out.println("Printing string: " + this.str);
    }
}

class TestPrinter {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.print();
        p1.print(10);
        p1.print('a');
        p1.print("Shamal");
    }
}

