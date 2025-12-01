package Collection;
import java.util.*;

 class Test {
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet();

        t1.add(10);
        t1.add("30");
        t1.add(20);
        if(t1.contains(30)){
        	System.out.println("found");
        }
        else {
        	System.out.println("not found ");
        }

        System.out.println(t1);
    }
}
