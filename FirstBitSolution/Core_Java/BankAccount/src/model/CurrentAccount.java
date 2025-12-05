package model;

import java.util.*;

// ==========================================================
// CURRENT ACCOUNT (Child of Account)
// ==========================================================
public class CurrentAccount extends Account {

    double overdraftLimit;  // Maximum overdraft allowed
    double overdraftUsed;   // How much overdraft is currently used

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance,
                   String status, double overdraftLimit) {

        super(accountNumber, holderName, balance, status);
        this.overdraftLimit = overdraftLimit;
        this.overdraftUsed = 0; // Initially no overdraft used
    }

    // -------------------------------
    // Deposit Logic
    // -------------------------------
    @Override
    public boolean deposit(double amount) {

        if (frozen) return false; // Account frozen → no operations

        double prev = balance;

        // If overdraft is used, deposit first reduces overdraft
        if (overdraftUsed > 0) {

            overdraftUsed -= amount;

            // If overdraft fully cleared and still money left → add to balance
            if (overdraftUsed < 0) {
                balance += (-overdraftUsed);
                overdraftUsed = 0;
            }
        } 
        else {
            balance += amount; // Normal deposit
        }

        // Add deposit transaction
        addTransaction("TX309881", "Deposit", amount, prev, balance, new Date());
        return true;
    }

    // -------------------------------
    // Withdraw Logic
    // -------------------------------
    @Override
    public boolean withdraw(double amount) {

        if (frozen) return false;  // Account frozen → no operations

        double prev = balance; 
        double originalAmount = amount;

        // Remaining overdraft available
        double remainingOD = overdraftLimit - overdraftUsed;

        // If balance + remaining overdraft is not enough → cannot withdraw
        if (balance + remainingOD < amount) return false;

        // Case 1: Sufficient balance → directly deduct
        if (balance >= amount) {
            balance -= amount;
        } 
        else {
            // Case 2: Use overdraft
            amount -= balance;
            balance = 0;
            overdraftUsed += amount;
        }

        // Add withdrawal transaction
        addTransaction("TXC202", "Withdraw", originalAmount, prev, balance, new Date());
        return true;
    }

    // Current accounts do not provide interest
    @Override
    public double calculateInterest() {
        return 0;
    }
}
