package voter;

public class Voter {
    int age;

    public Voter(int age) //only parameterized constructor
    {
        this.age = age;
    }

    void validate()  {

        if (this.age < 18)
        {
        	try {
            throw new InvalidAgeException();
        } 
        	catch(InvalidAgeException iae) {
        		System.out.println(iae);
        	}
        		
        	}
        else {
        	System.out.println("you can vote!");
        }
    }
}

