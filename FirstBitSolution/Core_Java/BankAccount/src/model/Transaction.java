package model;

import java.util.Date;

// ==========================================================
// TRANSACTION CLASS (Used by all Account types)
// ==========================================================
public class Transaction {

    String transactionId;     // Unique ID for each transaction
    String type;              // Deposit / Withdraw / LoanPayment
    double prevBalance;       // Balance before transaction
    double balance;           // Balance after transaction
    double amount;            // Transaction amount
    Date date;                // Timestamp

    // Constructor
    public Transaction(String transactionId, String type, double amount,
                       double prevBalance, double balance, Date date) {

        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.prevBalance = prevBalance;
        this.balance = balance;
        this.date = date;
    }

    public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrevBalance() {
		return prevBalance;
	}

	public void setPrevBalance(double prevBalance) {
		this.prevBalance = prevBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	// Display transaction details
    public void display() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount);
        System.out.println("Previous Balance: " + prevBalance);
        System.out.println("Balance After Transaction: " + balance);
        System.out.println("Date: " + date);
        System.out.println();
    }
}
