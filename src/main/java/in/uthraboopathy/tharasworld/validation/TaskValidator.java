package in.uthraboopathy.tharasworld.validation;

import in.uthraboopathy.tharasworld.exception.ValidationException;
import in.uthraboopathy.tharasworld.model.Task;
import in.uthraboopathy.tharasworld.util.StringUtil;

public class TaskValidator {

		public static void validate(Task task) throws ValidationException {

			if (task == null) {
				throw new ValidationException("Invalid task input");
			}

//			if(user.getEmail()==null || "".equals(user.getEmail().trim())) {
//				
//				throw new ValidationException("Email cannot be null or empty");
//				
//			}

			StringUtil.rejectIfInvalidString(task.getTaskName(), "TaskName");


			StringUtil.rejectIfInvalidString(task.getDueDate(), "DueDate");
			
			
		}

	}

	
