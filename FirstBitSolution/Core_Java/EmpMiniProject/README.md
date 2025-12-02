🌟 Employee Management System (MVC Architecture)

A console-based Java application built using a clean MVC design, supporting multiple employee types.

🎯 Features
🟩 1. Add an Employee

Add new employee details (any type — Employee / HR / Admin / SalesManager).

🔍 2. Search an Employee

Search by employee ID and view their complete information.

🛠️ 3. Update an Employee

Modify name, salary, department, or role-specific details.

🗑️ 4. Delete an Employee

Remove an employee record using their ID.

📋 5. Display All Employees

Shows all employee records (including all categories).

🚪 0. Exit

Safely exits the application.

🏗️ Project Structure (MVC)
🟦 Model Layer (model)

Contains all employee-related classes:

👤 Employee (Base class)

👨‍💼 HR

🛠️ Admin

💼 SalesManager

Each class contains fields, getters/setters, and role-specific behavior.

🟧 DAO Layer (dao)

Handles complete CRUD logic:

Add

Search

Update

Delete

Display

Stores and manages all employee objects.

🟨 Controller Layer (controller)

Contains:

EmployeeController → Connects View and DAO

Uses DAO internally to perform operations based on user actions

🟩 View Layer (view)

EmployeeView → Handles all input and output

Shows menu, takes user choices, displays results

🟪 Test Layer (testclass)

TestApp → Main class that runs the entire application
