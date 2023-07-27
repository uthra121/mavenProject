package in.uthraboopathy.tharasworld;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

import org.junit.jupiter.api.Test;

import in.uthraboopathy.tharasworld.exception.ValidationException;
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
	
	@Test
	public void testUpdateUser() {

		UserService userService = new UserService();
		
		User updateUser = new User();
		
		updateUser.setFirstName("Uthra");
		updateUser.setLastName("Boopathi Kannan");
		updateUser.setEmail("uthra@gmail.com");
		updateUser.setPassword("Uthra@12");
		
		assertDoesNotThrow(() -> {
			userService.update(1, updateUser);
		});
		
	}
	
	
	@Test
	public void deleteUser() {
		
		UserService userService = new UserService();
		
		userService.delete(1);
		
	}
}
