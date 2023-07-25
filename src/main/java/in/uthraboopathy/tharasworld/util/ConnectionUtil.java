package in.uthraboopathy.tharasworld.util;

import java.sql.Connection;
import java.sql.*; 

public class ConnectionUtil {

	public static Connection getConnection() {
		Connection connection = null;
		String url = null;
		String username = null;
		String password = null;
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection(url, username, password); 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					 "jdbc:mysql://aws.connect.psdb.cloud/demoproject?sslMode=VERIFY_IDENTITY",
					  "1l6sjx208mmkcmiirnrl",
					  "pscale_pw_OYW0Jd66f14cK1n8Gkq8lCLCSWMcPoDn6LVEStsks45");
			
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return connection;
	}
	
	public static void close(Connection connection, PreparedStatement ps) {
		try {
			if(ps != null) {
				ps.close();
			}
			if(connection != null) {
				connection.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(connection != null) {
				connection.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
