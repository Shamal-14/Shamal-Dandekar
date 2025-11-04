class Date{
    int day, month, year; 
    String dow;
    void setDay(int d){
         this.day = d;
    }
    void setMonth(int m){
         this.month = m;
    } 
    void setYear(int y){
         this.year = y;
    }
    void setDow(String str){
         this.dow = str;
    }
    int getDay(){
         return this.day;
    }
    int getMonth(){
         return this.month;
    }

    int getYear(){
         return this.year;
    }


}//date class ends here


class Test{
    public static void main(String [] args){
        Date d1 = new Date();
        Date d2 = new Date();
        d2.setDay(30);
        d2.setMonth(11);
        d2.setYear(2003);
        d2.setDay(31);
        d1.setMonth(03);
        d1.setYear(2004);
        d1.setDow("Wednesday");
        System.out.println(d1);

        if(d1.getDay()>d2.getDay()){
             System.out.println("d1 is younger");
         }
        else if(d1.getMonth()>d2.getMonth()){
             System.out.println("d1 is younger");
             }
       else if(d1.getYear()>d2.getYear()){
             System.out.println("d1 is younger");
             }

 }//main ends here
}//Test class ends here