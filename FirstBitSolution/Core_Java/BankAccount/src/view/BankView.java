package view;

import java.util.*;
import model.*;   // Import all account classes from model package

// ==========================================================
// VIEW LAYER — Displays Output and Holds Hardcoded Accounts
// ==========================================================
public class BankView {

    // List of all accounts in the system
    public ArrayList<Account> accounts = new ArrayList<>();

    // --------------------------------------------------------
    // Hardcoded sample data (acts like database)
    // --------------------------------------------------------
    public void hardcodeddate() {

        accounts.add(new SavingAccount(
                "101", "Amay Gupta", 50000, "Active"));

        accounts.add(new SalaryAccount(
                "102", "Akshay", 20000, "Active"));

        accounts.add(new LoanAccount(
                "103", "Abhijit", 0, "Active", 80000, 10.0, 720));

        accounts.add(new CurrentAccount(
                "104", "Mira", 10000, "Active", 20000));
    }

    // --------------------------------------------------------
    // Search account by account number
    // --------------------------------------------------------
    public Account searchByAccountNumber(String accountNumber) {

        for (Account a : accounts) {
            if (a.accountNumber.equals(accountNumber))
                return a;
        }

        return null;
    }

    // --------------------------------------------------------
    // Show simple message
    // --------------------------------------------------------
    public void showmessanger(String msg) {
        System.out.println(msg);
    }

    // --------------------------------------------------------
    // When account not found
    // --------------------------------------------------------
    public void showAccountNotFound() {
        System.out.println("Account Not Found!");
    }

    // --------------------------------------------------------
    // Show balance for a given account number
    // --------------------------------------------------------
    public void showBalance(String accountNumber) {

        Account a = searchByAccountNumber(accountNumber);

        if (a != null) {
            System.out.println("Balance = " + a.balance);
        } else {
            System.out.println("Account Not Found!");
        }
    }
}
