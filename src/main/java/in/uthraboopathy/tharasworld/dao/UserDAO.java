package in.uthraboopathy.tharasworld.dao;

import in.uthraboopathy.tharasworld.interfaces.UserInterface;
import in.uthraboopathy.tharasworld.model.User;
import in.uthraboopathy.tharasworld.model.UserEntity;
import in.uthraboopathy.tharasworld.util.ConnectionUtil;

import java.sql.*;
import java.util.*;

public class UserDAO implements UserInterface{

	public Set<User> findAll() throws RuntimeException {	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Set<User> userList = new HashSet<>();
		
		try {
			
			String query = "SELECT * FROM users WHERE is_active = 1";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getBoolean("is_active"));
				userList.add(user);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		}finally {
			ConnectionUtil.close(con, ps, rs);
		}
		
		return userList;
		
//		UserEntity[] userList = UserList.listOfUsers;
//		return userList;
	}



	@Override
	public void create(User newuser) {

		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			String query = "INSERT INTO users (first_name, last_name, email, password) VALUES (?, ?, ?, ?)";
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(query);
			
			ps.setString(1, newuser.getFirstName());
			ps.setString(2,  newuser.getLastName());
			ps.setString(3,  newuser.getEmail());
			ps.setString(4,  newuser.getPassword());
			
			ps.executeUpdate();
			
			System.out.println("User has been created successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		} finally {
			ConnectionUtil.close(connection, ps);
		}

		
	}



	@Override
	public void update(User updateuser) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			String query = "UPDATE users SET first_name = ?, last_name = ?, password = ? ";
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(query);
			
			ps.setString(1, updateuser.getFirstName());
			ps.setString(2,  updateuser.getLastName());
			ps.setString(3,  updateuser.getEmail());
			
			ps.executeUpdate();
			
			System.out.println("User has been created successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		} finally {
			ConnectionUtil.close(connection, ps);
		}
		
	}



	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public User findById(int id) {

		Connection connection = null;
		PreparedStatement ps = null;
		User user = null;
		ResultSet rs = null;
		
		try {
			String query = "SELECT * FROM users WHERE is_active = 1 AND id = ?";
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(query);
			
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getBoolean("is_active"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		} finally {
			ConnectionUtil.close(connection, ps, rs);
		}
		return user;
		
	}



	@Override
	public User findByEmail(String ermail) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int countOfActiveUsers() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * 
	 * @param id
	 * @param updateUser
	 */
	
//	public void update(int id, UserEntity updateUser) {
//		
//		UserEntity[] userList = UserList.listOfUsers;
//		
//		for(int i=0; i<userList.length; i++) {
//			
//			UserEntity user = userList[i];
//			
//			if(user==null) {
//				continue;
//			}
//			
//			if(user.getId()==id) {
////				user.setFirstName("Thara");
//				
//				user.setFirstName(updateUser.getFirstName());
//				user.setLastName(updateUser.getLastName());
//				user.setPassword(updateUser.getPassword());
//				
//				break;
//			}
//			
//		}
//		
//	}
//	
//	public void delete(int id) {
//			
//			UserEntity[] userList = UserList.listOfUsers;
//			
//			for(int i=0; i<userList.length; i++) {
//				
//				UserEntity user = userList[i];
//				
//				if(user==null) {
//					continue;
//				}
//				
//				if(user.getId()==id) {
//					user.setActive(false);
//					break;
//				}
//			}
//		}
//
//	public UserEntity findById(int id) {
//		UserEntity[] userList = UserList.listOfUsers;
//		UserEntity userMatch = null;
//	
//		for (int i = 0; i < userList.length; i++) {
//			UserEntity user = userList[i];
//			if (user.getId() == id) {
//				userMatch = user;
//				break;
//			}
//		}
//		return userMatch;
//	}
//	
}
