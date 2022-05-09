package connectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet resultSet = null;

	public EmployeeDAO() {
		
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn;
		conn = FactoryConnection.getInstance().getConnection();
		return conn;
	}
	
	public EmployeeModel getEmployeeById(int id) {
		EmployeeModel employee = new EmployeeModel();
		
		try {
			String queryString = "SELECT * FROM employees";
			connection = getConnection();
			ps = connection.prepareStatement(queryString);
			
			resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				
				if (resultSet.getInt("employeeNumber") == id) {
//					System.out.println(
//							"EmployeeNumber: " + resultSet.getInt("employeeNumber") + 
//							" First name: " + resultSet.getString("firstName") +
//							" Last name: " + resultSet.getString("lastName") +
//							" Job title: " + resultSet.getString("jobTitle")
//							);
					employee.setEmployeeNumber(resultSet.getInt("employeeNumber"));
					employee.setFirstName(resultSet.getString("firstName"));
					employee.setLastName(resultSet.getString("lastName"));
					employee.setJobTitle(resultSet.getString("jobTitle"));
					employee.setExtension(resultSet.getString("extension"));
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employee;
	}
	
	public void addEmployee(int employeeNumber, String lastName, String firstName, String extension, String email, 
			String officeCode, int reportsTo, String jobTitle) {
		try {
			String queryString = "INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			connection = getConnection();
			ps = connection.prepareStatement(queryString);
			ps.setInt(1, employeeNumber);
			ps.setString(2, lastName);
			ps.setString(3, firstName);
			ps.setString(4, extension);
			ps.setString(5, email);
			ps.setString(6, officeCode);
			ps.setInt(7, reportsTo);
			ps.setString(8, jobTitle);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
