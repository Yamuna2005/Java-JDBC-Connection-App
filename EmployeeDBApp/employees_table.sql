CREATE DATABASE IF NON EXISTS employee_db;
USE employee_db;
CREATE TABLE IF NOT EXIST employees(id INT PRIMARY KEY AUTO INCREMENT,name VARCHAR(100) NOT NULL,department VARCHAR(50),salary DOUBLE);
INSERT INTO employees(name,department,salary)VALUES('Yamu','IT',50,000),('Anis','HR',45,000)('Priya','Designer',30,000);
