import java.util.Scanner; 
class BankAccount{
	int accountNumber;
	String accHolderName;
	double currentBalance;
	double interestRate;

	BankAccount() {
        	this.accountNumber = 0;
        	this.accHolderName = "Not Assigned";
        	this.currentBalance = 0.0;
        	    	}

    	// Parameterized constructor
    	BankAccount(int accountNumber, String accHolderName, double currentBalance, double interestRate) {
        	this.accountNumber = accountNumber;
        	this.accHolderName = accHolderName;
        	this.currentBalance = currentBalance;
        	this.interestRate = interestRate;
    	}

 
    	int getAccountNumber() {
        	return this.accountNumber;
    	}

    	String getAccHolderName() {
        	return this.accHolderName;
    	}

  	double getCurrentBalance() {
        	return this.currentBalance;
    	}

    	double getInterestRate() {
        	return this.interestRate;
    	}


    	void setAccountNumber(int accountNumber) {
    	    this.accountNumber = accountNumber;
    	}

    	void setAccHolderName(String accHolderName) {
        	this.accHolderName = accHolderName;
    	}

    	void setCurrentBalance(double currentBalance) {
        	this.currentBalance = currentBalance;
    	}

    	void setInterestRate(double interestRate) {
        	this.interestRate = interestRate;
    	}

    	void display() {
        	System.out.println("Account Number: " + accountNumber);
        	System.out.println("Account Holder Name: " + accHolderName);
        	System.out.println("Current Balance: " + currentBalance);
        	System.out.println("Interest Rate: " + interestRate + "%");
    	}
}
class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        	System.out.print("Enter Account Number: ");
        	int accNo = sc.nextInt();

        	sc.nextLine(); 

        	System.out.print("Enter Account Holder Name: ");
        	String name = sc.nextLine();

        	System.out.print("Enter Current Balance: ");
        	double balance = sc.nextDouble();

        	System.out.print("Enter Interest Rate: ");
        	double rate = sc.nextDouble();

       	 	BankAccount b1 = new BankAccount(accNo, name, balance, rate);
		b1.display();

	}
} 