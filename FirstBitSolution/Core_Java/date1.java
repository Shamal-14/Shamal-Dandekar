class date {
    int day, month, year;
} // date ends here

class test {
    public static void main(String[] a) {
        date d1; // reference
        d1 = new date();
        d1.day = 14;
        d1.month = 6;
        d1.year = 2002;

        System.out.printf("%d/%d/%d", d1.day, d1.month, d1.year);
    }
}
