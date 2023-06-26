package in.uthraboopathy.tharasworld.dao;

import in.uthraboopathy.tharasworld.model.User;

public class UserDAO {

	public User[] findAll() {	
		User[] userList = UserList.listOfUsers;
		return userList;
	}
	
	public void create(User newuser) {
		UserList.listOfUsers[0] = newuser;
	}
	
	
}
