🧑‍💼 Employee Sorting using Comparator in Java

✨ Project Overview

This is a Java console-based project demonstrating how to sort objects in an ArrayList using a custom Comparator.

The project uses:

ArrayList to store Employee objects

Comparator interface to define custom sorting logic

Collections.sort() method to sort the list based on a chosen attribute

📌 Features

Add multiple Employee objects to an ArrayList

Display Employee objects before and after sorting

Sort Employees by ID using a custom Comparator

Learn how Java Comparator interface works for custom sorting

🏗️ Project Structure

Employee.java → Class representing Employee with attributes: ID, Name, Salary

MyIDComparator.java → Implements Comparator<Employee> for sorting by ID

TestComparator.java → Main class to demonstrate sorting

🔧 How to Run

Clone the repository

Compile all .java files

Run TestComparator.java

Observe the output of Employees before and after sorting

📝 Example Output
Before sorting:
[Employee [id=10, name=shamal, salary=20000], Employee [id=18, name=samiksha, salary=25000], ...]

After sorting by ID:
[Employee [id=5, name=aadarsh, salary=25000], Employee [id=10, name=shamal, salary=20000], ...]

💡 Concepts Covered

Java Collections (ArrayList)

Comparator interface

Custom sorting logic

OOP: Employee class design
