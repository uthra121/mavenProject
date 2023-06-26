package in.uthraboopathy.tharasworld.service;

import in.uthraboopathy.tharasworld.dao.UserDAO;

import in.uthraboopathy.tharasworld.model.User;

public class UserService {

	public User[] getAll() {
		
		UserDAO userDao = new UserDAO();
		
		User[] userList = userDao.findAll();
		
		for(int i=0; i<userList.length; i++) {
			
			System.out.println(userList[i]);
			
		}
				
		return userList; 
	}
	
	public void create() {
		
		User newUser = new User();
		newUser.setId(001);
		newUser.setFirstName("Uthra");
		newUser.setLastName("Boopathy");
		newUser.setEmail("uthra@gmail.com");
		newUser.setPassword("Uthra@12");
		newUser.setActive(true);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
		
		
		
	}
	
}
