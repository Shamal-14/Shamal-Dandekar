package model;

import java.util.*;

public class SavingAccount extends Account {

    // Minimum balance required to maintain the account
    static final double minimumBalance = 10000;

    // Constructor
    public SavingAccount(String accountNumber, String holderName, double balance, String Status) {
        super(accountNumber, holderName, balance, Status);
    }

    // --------------------------------------------------------
    // Deposit Operation
    // --------------------------------------------------------
    @Override
    public boolean deposit(double amount) {

        if (frozen) return false;  // Account frozen → no operation

        double prev = balance;
        balance += amount;

        // Record transaction
        addTransaction("TX101", "Deposit", amount, prev, balance, new Date());

        return true;
    }

    // --------------------------------------------------------
    // Withdraw Operation
    // --------------------------------------------------------
    @Override
    public boolean withdraw(double amount) {

        if (frozen) return false;

        // Ensure minimum ₹10,000 balance always remains
        if (balance - amount < minimumBalance)
            return false;

        double prev = balance;
        balance -= amount;

        addTransaction("TX202", "Withdraw", amount, prev, balance, new Date());

        return true;
    }

    // --------------------------------------------------------
    // Interest Calculation (4% per year)
    // --------------------------------------------------------
    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}
