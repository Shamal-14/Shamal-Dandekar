 
package Collection;

import java.util.*;

class Demo {
	 public static void main(String [] args) {
		 ArrayList a1 =new ArrayList();
		 a1.add(10);
		 a1.add(30);
		 a1.add(20);
		 if(a1.contains (30)) {
			 System.out.println("found");
		 }
		 else {
			 System.out.println("not found");
		 }
		 a1.remove(1);
		 System.out.println(a1);
	 }

}
