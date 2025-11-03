   class date{
 int day, month, year;
 
String dow;
    void setDay(int d){
this.day=d;
}
void setMonth(int m){
this.month=m;
}
void setYear(int y){
this.year=y;
}
void setDOW(String str){
this.dow=str;
}
}
// date class ends here

class test {
    public static void main(String[] a) {
        date d1 = new date();

        d1.setDay ( 14);
        d1.setMonth ( 6);
        d1.setYear (2002);
        d1.setDOW ("Friday"); // day of the week

        System.out.println("Date: " + d1.day + "/" + d1.month + "/" + d1.year);
        System.out.println("Day of Week: " + d1.dow);
    }//main ends here
}//class ends here
