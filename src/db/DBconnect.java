package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	
	public static Connection ConDB() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DBconfig.getUrl(),DBconfig.getUsername(),DBconfig.getPass());
				
		return conn;
	}
}
