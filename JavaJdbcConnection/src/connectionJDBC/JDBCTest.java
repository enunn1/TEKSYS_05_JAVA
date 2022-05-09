package connectionJDBC;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JDBCTest {
	
	private static EmployeeDAO employeeDAO;
	static Connection conn;

	@BeforeAll
	public static void setUp() {
		FactoryConnection dbConn = FactoryConnection.getInstance();
		try {
			conn = dbConn.getConnection();
			employeeDAO = new EmployeeDAO();
		} 
		catch (Exception e)
		{
			e.getMessage();
		}
	}

	private PreparedStatement stmt;
	private ResultSet rs;
	private EmployeeModel expected;
	
	@BeforeEach
	public void beforeEachMethod() throws SQLException {
		stmt = conn.prepareStatement("SELECT * FROM employees WHERE employeeNumber=?");
		stmt.setInt(1,1056);
		rs = stmt.executeQuery();
		rs.next();
		expected = new EmployeeModel();
		expected.setEmployeeNumber(rs.getInt("employeeNumber"));
		expected.setFirstName(rs.getString("firstName"));
		expected.setLastName(rs.getString("lastName"));
		expected.setJobTitle(rs.getString("jobTitle"));
		expected.setExtension(rs.getString("extension"));
	}
	
	@Test
	public void testGetById() {
		EmployeeModel actual = employeeDAO.getEmployeeById(1056);
		assertEquals(expected, actual);
	}
	
	@AfterEach
	public void afterEachMethod() throws SQLException {
		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
	}
	
	@AfterAll
	public static void tearDown() throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}
}
