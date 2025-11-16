package abstracts;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


abstract class BankAccount {
    int accountNumber;
    String accHolderName;
    double balance;
    String bankName;

    BankAccount() {
        this.accountNumber = 1001;
        this.accHolderName = "Default Name";
        this.balance = 5000.0;
        this.bankName = "State Bank of India";
    }

    BankAccount(int accountNumber, String accHolderName, double balance, String bankName) {
        this.accountNumber = accountNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
        this.bankName = bankName;
    }

    
    int getAccountNumber() {
        return accountNumber;
    }
    

    String getAccHolderName() {
        return accHolderName;
    }

    double getBalance() {
        return balance;
    }

    String getBankName() {
        return bankName;
    }

    
    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance = this.balance - amount;
            System.out.println(amount + " withdraw successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    abstract String accountType();
        
    

   public String toString() {
	   return "Account Number : "+this.accountNumber+"\n"+ "Account Holder Name : "+this.accHolderName+"\n"+"Balance : "+this.balance+"\n"+"Bank Name : "+this.bankName;  }
}



class SavingAccount extends BankAccount {
    double interestRate;
    double minBalance;

    SavingAccount() {
        super();
        this.interestRate = 4.5;
        this.minBalance = 2000.0;
    }

    SavingAccount(int accountNumber, String accHolderName, double balance, String bankName,
                  double interestRate, double minBalance) {

        super(accountNumber, accHolderName, balance, bankName);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    
    double getInterestRate() {
        return interestRate;
    }

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double getMinBalance() {
        return minBalance;
    }

    void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    void withdraw(double amount) {
        if (amount > 0 && (this.balance - amount) >= this.minBalance) {
            this.balance = this.balance - amount;
            System.out.println(amount + " withdraw successfully!");
        } else {
            System.out.println("Cannot withdraw " + amount +
                    ". Minimum balance " + this.minBalance + " required.");
        }
    }

    String accountType() {
        return "Saving Account";
    }

    public String toString() {
    	return super.toString()+"Interest Rate : "+this.interestRate+"\n"+"Minimun Balance : "+this.minBalance;
    }
}



class CurrentAccount extends BankAccount {
    double overdraftLimit;
    double serviceCharge;

    CurrentAccount() {
        super();
        this.overdraftLimit = 15000;
        this.serviceCharge = 250;
    }

    CurrentAccount(int accountNumber, String accHolderName, double balance, String bankName,
                   double overdraftLimit, double serviceCharge) {

        super(accountNumber, accHolderName, balance, bankName);
        this.overdraftLimit = overdraftLimit;
        this.serviceCharge = serviceCharge;
    }

    
    double getOverdraftLimit() {
        return overdraftLimit;
    }

    void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    double getServiceCharge() {
        return serviceCharge;
    }

    void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= (this.balance + this.overdraftLimit)) {
            this.balance = this.balance - amount;
            System.out.println(amount + " withdrawn successfully!");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }

    String accountType() {
        return "Current Account";
    }

    public String toString() {
    	return super.toString()+"Overdraft Limit : "+this.overdraftLimit+"\n"+"Service Charge : "+this.serviceCharge;
    }
}


class SalaryAccount extends BankAccount {
    String companyName;
    double monthlySalary;
    String lastTransactionDate;

    SalaryAccount() {
        super();
        this.companyName = "Default Company";
        this.monthlySalary = 30000;
        this.lastTransactionDate = "2025-11-12"; // ISO format
    }

    SalaryAccount(int accountNumber, String accHolderName, double balance, String bankName,
                  String companyName, double monthlySalary, String lastTransactionDate) {

        super(accountNumber, accHolderName, balance, bankName);
        this.companyName = companyName;
        this.monthlySalary = monthlySalary;
        this.lastTransactionDate = lastTransactionDate;
    }

   
    String getCompanyName() {
        return companyName;
    }

    void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    double getMonthlySalary() {
        return monthlySalary;
    }

    void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    String getLastTransactionDate() {
        return lastTransactionDate;
    }

    void setLastTransactionDate(String lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    void withdraw(double amount) {
        LocalDate last = LocalDate.parse(this.lastTransactionDate);
        LocalDate today = LocalDate.now();

        long monthsDiff = ChronoUnit.MONTHS.between(last, today);

        if (monthsDiff <= 2) {
            if (amount > 0 && amount <= this.balance) {
                this.balance -= amount;
                System.out.println(amount + " withdraw successfully!");
                this.lastTransactionDate = today.toString();
            } else {
                System.out.println("Invalid amount or insufficient balance.");
            }
        } else {
            System.out.println("Cannot withdraw! No transactions in last 2 months.");
        }
    }

    String accountType() {
        return "Salary Account";
    }

   public String toString() {
	   return super.toString()+"Company Name : "+this.companyName+"\n"+  "Monthly Salary : "+this.monthlySalary+"\n"+"Last Transaction Date : "+this.lastTransactionDate;
	   }


class TestBank {
    public static void main(String[] args) {

        BankAccount b;
        b=new SavingAccount();
        System.out.println(b);
        System.out.println("Saving Account : "+b.accountType());
        b= new CurrentAccount();
        System.out.println(b);
        System.out.println("Current Account : "+b.accountType());
        
        b=new SalaryAccount();
        System.out.println(b);
        System.out.println("Salary Account : "+b.accountType());
        
        
        
        }
    }
}