🏢 Employee Management System (Java MVC)

✨ Project Overview

This is a console-based Employee Management System built in Java following the MVC architecture.
The project demonstrates strong fundamentals in Java:

ArrayList for dynamic employee storage

Inheritance & Polymorphism (Employee → HR / SalesManager / Admin)

CRUD operations: Add, Search, Update, Delete, Display

Controller handles logic, View handles input/output, Model holds data

This project is perfect for learning OOP, data structures, and MVC design pattern. 🚀

📌 Features

➕ Add Employee – Add HR, SalesManager, or Admin dynamically

🔍 Search Employee – By ID or Name

✏️ Update Employee – Update salary or other details

❌ Delete Employee – Remove employee record

📄 Display All Employees – Show all employees in a structured format

⚡ Dynamic Storage – ArrayList automatically resizes as employees are added or removed

🏷️ Inheritance – Different employee types extend base Employee class

🏗️ Project Structure (MVC)
Model

Employee.java → Base class

HR.java → Subclass

SalesManager.java → Subclass

Admin.java → Subclass

View

EmployeeView.java → Handles all user interactions

Controller

EmployeeController.java → Connects View and DAO

EmployeeDAO.java → Handles ArrayList-based data operations

Test / App

TestApp.java → Main class to run the project

🔧 Technologies Used

Java SE 8+

Console-based I/O

Collections (ArrayList)

OOP concepts (Inheritance, Polymorphism)

MVC architecture

🎮 How It Works

User runs TestApp.java

Menu is displayed with options:

1. Add Employee
2. Search Employee
3. Update Employee
4. Delete Employee
5. Display all Employees
0. Exit


Controller receives user input → calls DAO → updates ArrayList

View shows output in console
