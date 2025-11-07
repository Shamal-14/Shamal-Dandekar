class BankAccount {
    int accountNumber;
    String accHolderName;
    double currentBalance;
    double interestRate;

    // Default Constructor
    BankAccount() {
        this.accountNumber = 1001;
        this.accHolderName = "adarsh dandekar";
        this.currentBalance = 5000.0;
        this.interestRate = 4.5;
    }

    // Parameterized Constructor
    BankAccount(int accountNumber, String accHolderName, double currentBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accHolderName = accHolderName;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
    }

    void setAccountNumber(int a) {
        this.accountNumber = a;
    }

    void setAccHolderName(String n) {
        this.accHolderName = n;
    }

    void setCurrentBalance(double b) {
        this.currentBalance = b;
    }

    void setInterestRate(double r) {
        this.interestRate = r;
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

    void display() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accHolderName);
        System.out.println("Current Balance: " + this.currentBalance);
        System.out.println("Interest Rate: " + this.interestRate + "%");
         
   }
}

// Test class
class TestBankAccount {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(); 
        BankAccount b2 = new BankAccount(); 
        BankAccount b3 = new BankAccount(1003, "samiksha dandekar", 80000.0, 5.0);
        b2.setAccountNumber(1002);
        b2.setAccHolderName("Shamal Dandekar");
        b2.setCurrentBalance(65000.0);
        b2.setInterestRate(4.8);

        b1.display();
        b2.display();
        b3.display();
    }
}
