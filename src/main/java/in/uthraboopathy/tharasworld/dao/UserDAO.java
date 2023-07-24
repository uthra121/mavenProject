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
			
			String query = "SELECT * FROM Users WHERE isActive=1";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
//			ResultSet rs = ps.executeQuery();
			
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
	
	
	
	public void create(User newuser) {
		
//		UserList.listOfUsers[0] = newuser;
		
		Set<User> userList = UserList.listOfUsers;

		userList.add((User)newuser);
	}



	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Set<User> findById(int id) {
		// TODO Auto-generated method stub
		return null;
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
