package in.uthraboopathy.tharasworld;

import java.util.*;

import org.junit.jupiter.api.Test;

import in.uthraboopathy.tharasworld.model.User;
import in.uthraboopathy.tharasworld.service.*;

public class TestGetAllUsers {

	@Test
	public void getAllUsers() {
		UserService userService = new UserService();
		Set<User> userList = userService.getAll();
		System.out.println(userList);
	}
	
	@Test
	public void getById() {
		UserService userService = new UserService();
		User userList = userService.findById(1);
		System.out.println(userList);
	}
}
