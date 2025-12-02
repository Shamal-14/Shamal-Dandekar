
package Controller;
import java.util.ArrayList;

import Model.Employee;
import Model.Admin;
import Model.HR;
import Model.SalesManager;

public class EmployeeDAO {

    private static ArrayList<Employee> empList = new ArrayList<>();

    static {
        empList.add(new HR(101, "Ranjit", 50000, 5000));
        empList.add(new HR(102, "Amit", 48000, 4500));
        empList.add(new HR(103, "Sneha", 47000, 4000));

        empList.add(new SalesManager(201, "Karan", 60000, 12, 8000));
        empList.add(new SalesManager(202, "Meena", 58000, 15, 7500));
        empList.add(new SalesManager(203, "Rohit", 62000, 10, 9000));

        empList.add(new Admin(301, "Pragati", 70000, 10000));
        empList.add(new Admin(302, "Isha", 68000, 9500));
        empList.add(new Admin(303, "Pooja", 72000, 11000));
        empList.add(new Admin(304, "Shubham", 75000, 12000));
    }



	public boolean addEmployee(Employee e) {
		empList.add(e);
		System.out.println("Employee addes");
		return false;
		}
		
		
	

	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		for (Employee e:empList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
		
		
	}

	public boolean updateEmployee(int id, double newSalary) {
	    for (Employee e : empList) {
	        if (e.getId() == id) {
	            e.setSalary(newSalary);
	            return true;
	        }
	    }
	    return false;
	}


	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return empList.removeIf(emp->emp.getId()==id);
               
       
		
	}

	public void displayAll() {
	    if (empList.isEmpty()) {
	        System.out.println("No employees found!");
	        return;
	    }

	    for (Employee e : empList) {
	        System.out.println(e);
	    }
	}

	

}
