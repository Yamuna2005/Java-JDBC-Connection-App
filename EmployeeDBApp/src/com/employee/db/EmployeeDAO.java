package com.employee.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployeeDAO {
	public void addEmployee(String name,String dept,double salary) {
		String query = "INSERT INTO employees(name,department,salary)VALUES(?,?,?)";
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(query)){
			              ps.setString(1, name);
			              ps.setString(2, dept);
			              ps.setDouble(3, salary);
			              ps.executeUpdate();
			              System.out.println("Employee added successfully!");
		}catch(SQLException e)
		{
			e.printStackTrace();
			              
		}
	}
    public void viewEmployees() {
    	String query = "SELECT * FROM employees";
    	try(Connection con = DBConnection.getConnection();
    			Statement st = con.createStatement();
    			ResultSet rs = st.executeQuery(query)){
    		while (rs.next()) {
    			System.out.println(rs.getInt("id") + "|" + rs.getString("name") + "|" +  rs.getString("department") + "|"  + rs.getDouble("salary"));
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    public void updateSalary(int id,double salary) {
    	String query = "UPDATE employees SET salary = ? WHERE id =?";
    	try(Connection con = DBConnection.getConnection();
    			PreparedStatement ps = con.prepareStatement(query)){
    		ps.setDouble(1, salary);
    		ps.setInt(2, id);
    		ps.executeUpdate();
    		System.out.println("Salary updated successfully!");
    			
    		}catch(SQLException e) {
    			e.printStackTrace();
    	}
    }
    public void deleteEmployee(int id) {
    	String query = "DELETE FROM employees WHERE id = ?";
    	try(Connection con = DBConnection.getConnection();
    			PreparedStatement ps = con.prepareStatement(query)){
    		ps.setInt(1,id);
    		ps.executeUpdate();
    		System.out.println("employee deleted successfully!");
    		
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
}
