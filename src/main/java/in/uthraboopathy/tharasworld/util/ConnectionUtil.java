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
			  "9cbvaaz368fwk7jpkmfd",
			  "pscale_pw_rp5FeNYPQLWC0IoIUusZhkFe9ZPM5J2xjYbtMHGGlIQ");
			
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
