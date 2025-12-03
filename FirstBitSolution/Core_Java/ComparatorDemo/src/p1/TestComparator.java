package p1;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {

	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(10,"shamal",20000));
		a1.add(new Employee(18,"samiksha",25000));
		a1.add(new Employee(12,"Yatharth",25000));
		a1.add(new Employee(5,"aadarsh",25000));
		System.out.println("before \n"+a1);
		MyIDComparator mid=new MyIDComparator();
		Collections.sort(a1,mid);
		System.out.println("\n after"+a1);
		
	}
	
}
