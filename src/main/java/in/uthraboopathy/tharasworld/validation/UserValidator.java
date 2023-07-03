package in.uthraboopathy.tharasworld.validation;

import in.uthraboopathy.tharasworld.model.User;

public class UserValidator {
	
	public static void validate(User user) throws Exception {
		
		if(user==null) {
			throw new Exception("Invalid user input");
		}
		
		if(user.getEmail()==null || "".equals(user.getEmail().trim())) {
			
			throw new Exception("Email cannot be null or empty");
			
		}
		
	}
	
	public static void passwordValidate(User user) throws Exception {
		
		if(user==null) {
			throw new Exception("Invalid user input");
		}
		
		if(user.getPassword()==null || "".equals(user.getPassword().trim())) {
			
			throw new Exception("Password cannot be null or empty");
			
		}
		
	}
	
	public static void firstNameValidate(User user) throws Exception {
		
		if(user==null) {
			throw new Exception("Invalid user input");
		}
		
		if(user.getFirstName()==null || "".equals(user.getFirstName().trim())) {
			
			throw new Exception("Firstname cannot be null or empty");
			
		}
		
	}

}
