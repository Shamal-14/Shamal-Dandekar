
Bank Management System – Java
A simple Java project using OOP concepts like inheritance, polymorphism, abstraction, and MVC.
📌 Features
Create Account

Delete Account

Deposit Money

Withdraw Money

Freeze Account

Search Account

Display All Accounts

Show Transaction History

📌 Account Types

Saving Account (Minimum balance ₹10,000)

Salary Account (No transactions after 2 months → Block)

Current Account (Overdraft support)

Loan Account (Loan approved only if CIBIL ≥ 650)

📌 Project Structure
model/
   Account.java
   SavingAccount.java
   SalaryAccount.java
   LoanAccount.java
   CurrentAccount.java
   Transaction.java

view/
   BankView.java

controller/
   BankController.java

test/
   Test.java

📌 How to Run
javac test/Test.java
java test.Test

📌 Technologies Used

Core Java

OOP

ArrayList

Date & LocalDate

MVC Pattern

📌 About the Project

This project is a simple mini-banking system where you can create accounts, perform transactions, freeze accounts, check balances, and view full transaction history.
