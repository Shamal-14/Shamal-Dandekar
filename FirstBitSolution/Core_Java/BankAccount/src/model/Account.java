package model;

import java.util.*;


public abstract class Account {

    public String accountNumber;
    String holderName;
    public double balance;
    String status;      
    Date openDate = new Date(); // Account opening date
    public boolean frozen = false;     // To mark account frozen or not

    // Stores all transactions of this account
    ArrayList<Transaction> history = new ArrayList<>();

    
    public Account(String accountNumber, String holderName, double balance, String status) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.status = status;
    }

    // Add a transaction to the history list
    public void addTransaction(String transactionId, String type, double amount,
            double prevBalance, double balance, Date date) {

        history.add(new Transaction(transactionId, type, amount, prevBalance, balance, date));
    }
    

    public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public boolean isFrozen() {
		return frozen;
	}

	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}

	public ArrayList<Transaction> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<Transaction> history) {
		this.history = history;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Abstract methods (child classes must override)
    public abstract boolean deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract double calculateInterest();
   
    // Getter for balance
    double getBalance() {
        return this.balance;
    }

    // Getter for transaction list
    public List<Transaction> getTransaction() {
        return history;
    }

    // Display account details
    public void display() {
        System.out.println("Account Number = " + this.accountNumber);
        System.out.println("Holder Name    = " + this.holderName);
        System.out.println("Balance        = " + this.balance);
        System.out.println("Status         = " + this.status);
        System.out.println();
    }
}
