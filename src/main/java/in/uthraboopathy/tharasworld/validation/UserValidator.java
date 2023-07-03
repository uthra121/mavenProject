package in.uthraboopathy.tharasworld.validation;

import in.uthraboopathy.tharasworld.exception.ValidationException;
import in.uthraboopathy.tharasworld.model.User;
import in.uthraboopathy.tharasworld.util.StringUtil;

public class UserValidator {

	public static void validate(User user) throws ValidationException {

		if (user == null) {
			throw new ValidationException("Invalid user input");
		}

//		if(user.getEmail()==null || "".equals(user.getEmail().trim())) {
//			
//			throw new ValidationException("Email cannot be null or empty");
//			
//		}

		StringUtil.rejectIfInvalidString(user.getEmail(), "Email");


		StringUtil.rejectIfInvalidString(user.getPassword(), "Password");
		

		StringUtil.rejectIfInvalidString(user.getFirstName(), "FirstName");

//		
	}

}
