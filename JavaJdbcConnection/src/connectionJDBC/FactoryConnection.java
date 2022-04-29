package connectionJDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {	
//	private String driverClassName = "com.mysql.cj.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost/classicmodels";
	private final String user = "root";
	private final String pass = "P@ssw0rd";
	
	private static FactoryConnection factoryConnection = null;
//	Driver driver = new org.mariadb.jdbc.Driver();
	
	private FactoryConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Exception in FactoryConnection class");
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, pass);
		return conn;
	}
	
	public static FactoryConnection getInstance() {
		if(factoryConnection == null) {
			factoryConnection = new FactoryConnection();
		}
		return factoryConnection;
	}
	
}
