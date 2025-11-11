
	class Student {
	    int FBIN;
	    String name;
	    int distance;
	    static int count = 0; // shared by all objects

	    // Default constructor
	    Student() {
	        this.FBIN = 0;
	        this.name = "Unknown";
	        this.distance = 0;
	        count++;     
	        }

	    // Parameterized constructor
	    Student(int FBIN, String name, int distance) {
	        this.FBIN = FBIN;
	        this.name = name;
	        this.distance = distance;
	        count++;
	    }

	    // Setters
	    void setFBIN(int FBIN) {
	        this.FBIN = FBIN;
	    }

	    void setName(String name) {
	        this.name = name;
	    }

	    void setDistance(int distance) {
	        this.distance = distance;
	    }

	    // Getters
	    int getFBIN() {
	        return FBIN;
	    }

	    String getName() {
	        return name;
	    }

	    int getDistance() {
	        return distance;
	    }

	    // Display
	    void display() {
	        System.out.println("FBIN: " + this.FBIN);
	        System.out.println("Name: " + this.name);
	        System.out.println("Distance: " + this.distance);
	    }
	}

	// Derived class
	class PlacedStudent extends Student //step 1 "is-a"
	{
	//remove state and behavior inherited from super class
	    String companyName;
	    String designation;

	        PlacedStudent() {
	        super(); 
	        this.companyName = "Not Placed";
	        this.designation = "N/A";
	    }

	    // Parameterized constructor
	    PlacedStudent(int FBIN, String name, int distance, String companyName, String designation) {
	        super(FBIN, name, distance); 
	        this.companyName = companyName;
	        this.designation = designation;
	    }

	    // Setters
	    void setCompanyName(String companyName) {
	        this.companyName = companyName;
	    }

	    void setDesignation(String designation) {
	        this.designation = designation;
	    }

	    // Getters
	    String getCompanyName() {
	        return companyName;
	    }

	    String getDesignation() {
	        return designation;
	    }

	    // Display
	    void display() {
	        super.display();
	        System.out.println("Company Name: " + this.companyName);
	        System.out.println("Designation: " +this. designation);
	    }
	}

	// Main class
	 class TestStudent {
	    public static void main(String[] args) {

	        Student s1 = new Student();
	        PlacedStudent p1 = new PlacedStudent(102, "Shamal", 15, "TCS", "Developer");
	        PlacedStudent p2 = new PlacedStudent(103, "Samiksha", 20, "Infosys", "Tester");
	        s1.display();

	         p1.display();

	         p2.display();

	        System.out.println("\nTotal Objects Created count : " + Student.count);
	    }
	}

	        


