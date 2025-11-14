package Polymorphism;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class BankAccount {
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

    // ---------- Getters ----------
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

    // ---------- Setters ----------
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

    String accountType() {
        return "General Bank Account";
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
    }
}

// ---------------- SAVING ACCOUNT ----------------

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

    // ---------- Getters & Setters ----------
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

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Minimum Balance: " + minBalance);
    }
}

// ---------------- CURRENT ACCOUNT ----------------

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

    // ---------- Getters & Setters ----------
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

    void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Service Charge: " + serviceCharge);
    }
}

// ---------------- SALARY ACCOUNT ----------------

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

    // ---------- Getters & Setters ----------
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

    void display() {
        super.display();
        System.out.println("Company Name: " + companyName);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Last Transaction Date: " + lastTransactionDate);
    }
}

// ---------------- TEST CLASS ----------------

class TestBank {
    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new SavingAccount();
        accounts[1] = new CurrentAccount();
        accounts[2] = new SalaryAccount();

        double[] balances = {5000, 10000, 40000};

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].setBalance(balances[i]);
            accounts[i].display();
            System.out.println("----------------------------------");
        }
    }
}
