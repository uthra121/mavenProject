package in.uthraboopathy.tharasworld;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.uthraboopathy.tharasworld.model.User;
import in.uthraboopathy.tharasworld.service.UserService;

public class TestCreateUser {
	
	@Test
	public void testCreateUserWithValidInput() {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(3);
		newUser.setFirstName("Uthra");
		newUser.setLastName("Boopathy");
		newUser.setEmail("uthra@gmail.com");
		newUser.setPassword("Uthra@12");
		newUser.setActive(true);
		
		assertDoesNotThrow(()->{
			userService.create(newUser);
		});
	
	}
	
	@Test
	public void testCreateUserWithInvalidInput() throws Exception {
		
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class, () -> {
			userService.create(null);
		});
		String exceptedMessage = "Invalid user input";
		String actualMessage = exception.getMessage();
		
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test 
	public void testCreateUserWithEmailNull() throws Exception {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(3);
		newUser.setFirstName("Uthra");
		newUser.setLastName("Boopathy");
		newUser.setEmail(null);
		newUser.setPassword("Uthra@12");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class, () -> {
			userService.create(newUser);
		});
		String exceptedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test 
	public void testCreateUserWithEmailEmpty() throws Exception {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(3);
		newUser.setFirstName("Uthra");
		newUser.setLastName("Boopathy");
		newUser.setEmail("");
		newUser.setPassword("Uthra@12");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class, () -> {
			userService.create(newUser);
		});
		String exceptedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(exceptedMessage.equals(actualMessage));
	}

}
