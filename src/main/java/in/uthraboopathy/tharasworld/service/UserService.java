package in.uthraboopathy.tharasworld.service;

import in.uthraboopathy.tharasworld.dao.UserDAO;

import in.uthraboopathy.tharasworld.model.User;
import in.uthraboopathy.tharasworld.validation.UserValidator;

public class UserService {

	public User[] getAll() {
		
		UserDAO userDao = new UserDAO();
		
		User[] userList = userDao.findAll();
		
		for(int i=0; i<userList.length; i++) {
			
			System.out.println(userList[i]);
			
		}
				
		return userList; 
	}
	
	public void create(User newUser1) throws Exception {
		
		UserValidator.validate(newUser1);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser1);		
		
	}
	
	public void update(int id, User updateUser) {
				
		UserDAO userDao = new UserDAO();
		userDao.update(1,updateUser);
		
	}
	
	public void delete() {
		
		User deleteUser = new User();
		
		UserDAO userDao = new UserDAO();
		userDao.delete(1);
		
	}
	
	public User findById(int id) {
		UserDAO userDao = new UserDAO();
		User user = userDao.findById(id);
//		this.printUser(user);
		return user;
	}
}
