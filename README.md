## Java JDBC Employee Database App

A Java console-based application that connects to a MySQL database using JDBC and performs CRUD operations (Create, Read, Update, Delete) on an Employee table.

Java Database Connectivity (JDBC)

Use of PreparedStatement and ResultSet

SQL query handling in Java



---

## Setup Instructions

 MySQL Database Setup (Using Provided Script)

1. Open MySQL Command Line or MySQL Workbench.


2. Run the script from employees_table.sql in this repository:



SOURCE path/to/employees_table.sql;

This will:

Create the database employee_db

Create the table employees

Insert some sample data



---

# Java Project Setup in Eclipse

1. Create a new Java Project in Eclipse.


2. Create a package:



com.employee.db

3. Add the Java files:

DBConnection.java

EmployeeDAO.java

EmployeeApp.java



4. Download MySQL Connector/J from:
https://dev.mysql.com/downloads/connector/j/


5. Extract the ZIP and add the .jar file to Eclipse:



Right-click Project → Build Path → Configure Build Path → Add External JARs


---

Update Database Credentials

In DBConnection.java, set your MySQL username and password:

private static final String USER = "root";
private static final String PASSWORD = ""; // or your password


---

 ## Running the Program

1. Right-click EmployeeApp.java → Run As → Java Application.


2. Menu options will appear:



1. Add Employee
2. View Employees
3. Update Salary
4. Delete Employee
5. Exit


---

 Database Script

The file employees_table.sql in this repository contains all the commands needed to create and populate the database.
This ensures anyone can set up the database quickly and run the Java application without manual SQL typing.


---
# Project Structure

src/
com/employee/db/
   
    ├ DBConnection.java
    
    ├ EmployeeDAO.java
    
    └ EmployeeApp.java
employees_table.sql
README.md


---

# Example Usage

Add Employee

Enter Name: Yamu
Enter Department: IT
Enter Salary: 50000
Employee added successfully!

View Employees

1 | Yamu | IT | 50000.0

--- 
