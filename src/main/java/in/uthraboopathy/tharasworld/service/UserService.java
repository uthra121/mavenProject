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
	
}
