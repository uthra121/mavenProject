package in.uthraboopathy.tharasworld.util;

import in.uthraboopathy.tharasworld.exception.ValidationException;

public class StringUtil {
	
	public static void rejectIfInvalidString(String input, String inputName) throws ValidationException{
		
		if(input==null || "".equals(input.trim())){
			
			throw new ValidationException(inputName.concat(" cannot be null or empty"));
			
		}
		
	} 
	
	public static boolean isValidString(String input) {
		
		if(input == null || "".equals(input.trim())) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static boolean isInvalidString(String input) {
		
		if(input == null || "".equals(input.trim())) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
}
