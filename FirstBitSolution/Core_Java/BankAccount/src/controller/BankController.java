package controller;

import java.util.*;
import model.*;
import view.*; 

public class BankController {

    public BankView b1 = new BankView();       // View object
    Scanner obj1 = new Scanner(System.in);

    // Constructor → loads hardcoded data
    public BankController() { 
        b1.hardcodeddate(); 
    }

    
    public void showmenu() {

        while (true) {

            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Freeze Account");
            System.out.println("5. Search Account");
            System.out.println("6. Display All Accounts");
            System.out.println("7. Deposit Money");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int ch = obj1.nextInt();
            obj1.nextLine();

            if (ch == 1) createAccount();
            if (ch == 2) deleteAccount();
            if (ch == 3) withdrawmoney();
            if (ch == 4) freeezeAccount();
            if (ch == 5) searchAccount();
            if (ch == 6) displayAccount();
            if (ch == 7) depositemoney();
            if (ch == 8) return;
        }
    }

    
    void createAccount() {

        System.out.println("\nAccount Types:");
        System.out.println("2. Saving Account");
        System.out.println("3. Salary Account");
        System.out.println("4. Loan Account");
        System.out.println("5. Current Account");
        System.out.print("Enter choice: ");

        int c = obj1.nextInt();
        obj1.nextLine();

        if (c < 2 || c > 5) {
            System.out.println("Invalid Account Type!");
            return;
        }

        // Common details for all accounts
        System.out.print("Enter Account Number: ");
        String acc = obj1.nextLine();

        System.out.print("Enter Holder Name: ");
        String name = obj1.nextLine();

        System.out.print("Enter Opening Balance: ");
        double bal = obj1.nextDouble();
        obj1.nextLine();

        Account a = null;

        // -------- Account creation logic ----------
        if (c == 2) a = new SavingAccount(acc, name, bal, "Active");
        if (c == 3) a = new SalaryAccount(acc, name, bal, "Active");

        if (c == 4) {
            System.out.print("Enter Loan Amount: ");
            double t = obj1.nextDouble();
            System.out.print("Enter Interest Rate: ");
            double rate = obj1.nextDouble();
            System.out.print("Enter CIBIL Score: ");
            int cb = obj1.nextInt();
            obj1.nextLine();
            a = new LoanAccount(acc, name, 0, "Active", t, rate, cb);
        }

        if (c == 5) {
            System.out.print("Enter Overdraft Limit: ");
            double limit = obj1.nextDouble();
            obj1.nextLine();
            a = new CurrentAccount(acc, name, bal, "Active", limit);
        }

        // Add opening transaction
        a.addTransaction("TXOPEN", "OpeningBalance", bal, 0, bal, new Date());

        b1.accounts.add(a);
        System.out.println("Account Created Successfully!");
    }

    // --------------------------------------------------------
    // DELETE ACCOUNT
    // --------------------------------------------------------
    void deleteAccount() {
        System.out.print("Enter Account Number: ");
        String acc = obj1.nextLine();

        Account a = b1.searchByAccountNumber(acc);
        if (a == null) {
            b1.showAccountNotFound();
        } else {
            b1.accounts.remove(a);
            b1.showmessanger("Account Deleted Successfully");
        }
    }

    // --------------------------------------------------------
    // WITHDRAW MONEY
    // --------------------------------------------------------
    void withdrawmoney() {
        System.out.print("Enter Account Number: ");
        String acc = obj1.nextLine();

        Account a = b1.searchByAccountNumber(acc);
        if (a == null) {
            b1.showAccountNotFound();
            return;
        }

        System.out.print("Enter Amount: ");
        double amt = obj1.nextDouble();
        obj1.nextLine();

        if (a.withdraw(amt))
            System.out.println("Amount Withdrawn Successfully!");
        else
            System.out.println("Withdraw Failed!");
    }

    // --------------------------------------------------------
    // FREEZE ACCOUNT
    // --------------------------------------------------------
    void freeezeAccount() {
        System.out.print("Enter Account Number: ");
        String acc = obj1.nextLine();

        Account a = b1.searchByAccountNumber(acc);
        if (a == null) {
            b1.showAccountNotFound();
            return;
        }

        if (a.frozen) {
            System.out.println("Account Already Frozen");
            return;
        }

        a.frozen = true;
        System.out.println("Account Frozen Successfully!");
    }

    // --------------------------------------------------------
    // SEARCH ACCOUNT
    // --------------------------------------------------------
    void searchAccount() {
        System.out.print("Enter Account Number: ");
        String acc = obj1.nextLine();

        Account a = b1.searchByAccountNumber(acc);
        if (a == null) {
            b1.showAccountNotFound();
            return;
        }

        System.out.println("Account Found!");
        a.display();
    }

    // --------------------------------------------------------
    // DISPLAY ALL ACCOUNTS + TRANSACTION HISTORY
    // --------------------------------------------------------
    void displayAccount() {

        for (Account a : b1.accounts) {

            a.display();

            System.out.println("Transaction History:");
            if (a.getTransaction().isEmpty())
                System.out.println("No Transactions Found.");
            else
                for (Transaction t : a.getTransaction())
                    t.display();

            System.out.println("--------------------------------");
        }
    }

    
    void depositemoney() {
        System.out.print("Enter Account Number: ");
        String acc = obj1.nextLine();

        Account a = b1.searchByAccountNumber(acc);

        if (a == null) {
            System.out.println("Account Not Found!");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = obj1.nextDouble();
        obj1.nextLine();

        if (a.deposit(amount))
            b1.showmessanger("Amount Deposited Successfully!");
        else
            System.out.println("Deposit Failed!");
    }
}
