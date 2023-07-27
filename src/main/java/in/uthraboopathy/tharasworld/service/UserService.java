package in.uthraboopathy.tharasworld.service;

import java.util.*;

import in.uthraboopathy.tharasworld.dao.UserDAO;

import in.uthraboopathy.tharasworld.model.User;
import in.uthraboopathy.tharasworld.validation.UserValidator;

public class UserService {

	public Set<User> getAll() {
		
		UserDAO userDao = new UserDAO();
		
		Set<User> userList = userDao.findAll();
		
		for(User user:userList) {
			System.out.println(user);
		}
				
		return userList; 
	}
	
	public void create(User newUser) throws Exception {
		
		UserValidator.validate(newUser);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);		
		
	}
	
	public void update(int id, User updateUser) throws Exception {
				
		UserValidator.validate(updateUser);
		
		UserDAO userDao = new UserDAO();
		userDao.update(id,updateUser);
		
	}
	
	public void delete(int id) {
			
		UserDAO userDao = new UserDAO();
		userDao.delete(id);
		
	}
	
	public User findById(int id) {
		UserDAO userDao = new UserDAO();
		User user = userDao.findById(id);
//		this.printUser(user);
		return user;
	}
}
