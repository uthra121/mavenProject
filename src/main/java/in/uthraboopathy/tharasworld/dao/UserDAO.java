package in.uthraboopathy.tharasworld.dao;

import in.uthraboopathy.tharasworld.model.User;

public class UserDAO {

	public User[] findAll() {	
		User[] userList = UserList.listOfUsers;
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
		
		UserList.listOfUsers[0] = newUser;
	}
	
	
}
