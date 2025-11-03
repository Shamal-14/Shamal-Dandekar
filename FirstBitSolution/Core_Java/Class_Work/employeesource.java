tiueclass Employee {
    int ID;
    String name;
    double salary;

    void setId(int i) { this.ID = i; }
    void setName(String n) { this.name = n; }
    void setSalary(double s) { this.salary = s; }
} // class Employee ends here

class TestEmployee {
    public static void main(String[] a) {
        Employee e1 = new Employee();
        e1.setId(111);
        e1.setName("shamal Dandekar");
        e1.setSalary(50000.0);

        System.out.println("employee id:" + e1.ID);
        System.out.println("employee name:" + e1.name);
        System.out.println("employee salary:" + e1.salary);
    }
} // class TestEmployee ends here

