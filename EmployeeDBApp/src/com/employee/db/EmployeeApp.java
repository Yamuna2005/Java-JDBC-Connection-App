package com.employee.db;
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n---Employee Dtabase Menu---");
			System.out.println("1.Add Employee");
			System.out.println("2.View Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				sc.nextLine();
			    System.out.println("Enter name: ");
			    String name = sc.nextLine();
			    System.out.println("Enter Department: ");
			    String dept = sc.nextLine();
			    System.out.println("Enter salary: ");
			    double salary = sc.nextDouble();
			    dao.addEmployee(name, dept, salary);
			    break;
			case 2:
				dao.viewEmployees();
				break;
			case 3:
				System.out.println("Enter Employee ID: ");
				int id = sc.nextInt();
				System.out.println("Enter New Salary: ");
				double newSalary = sc.nextDouble();
				dao.updateSalary(id,  newSalary);
				break;
			case 4:
				System.out.println("Enter Employee ID: ");
				int delId = sc.nextInt();
				dao.deleteEmployee(delId);
				break;
			case 5:
				System.out.println("Exiting...");
				break;
				default:
					System.out.println("Invalid Choice!");
				
			}
       }while(choice != 5);
		sc.close();
	}

}
 