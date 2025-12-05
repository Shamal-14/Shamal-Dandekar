package model;

import java.time.LocalDate;
import java.util.Date;

public class SalaryAccount extends Account {
    public LocalDate lastTransactionDate = null;

    public SalaryAccount(String accountNumber, String holderName, double balance, String Status) {
        super(accountNumber, holderName, balance, Status);
    }

    public boolean isLastTxnOlderThan2Months() {
        if (lastTransactionDate == null) return false;
        LocalDate twoMonthsAgo = LocalDate.now().minusMonths(2);
        return lastTransactionDate.isBefore(twoMonthsAgo);
    }

    public boolean deposit(double amount) {
        if (frozen) return false;
        if (isLastTxnOlderThan2Months()) {
            System.out.println("Deposit not allowed: Last transaction older than 2 months.");
            return false;
        }
        double prev = balance;
        balance += amount;
        addTransaction("TX301", "Deposit", amount, prev, balance, new Date());
        lastTransactionDate = LocalDate.now();
        return true;
    }

    public boolean withdraw(double amount) {
        if (frozen) return false;
        if (isLastTxnOlderThan2Months()) {
            System.out.println("Withdraw not allowed: Last transaction older than 2 months.");
            return false;
        }
        if (balance < amount) return false;
        double prev = balance;
        balance -= amount;
        addTransaction("TX302", "Withdraw", amount, prev, balance, new Date());
        lastTransactionDate = LocalDate.now();
        return true;
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}
