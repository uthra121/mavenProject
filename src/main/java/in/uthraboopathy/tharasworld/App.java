package in.uthraboopathy.tharasworld;

//import in.uthraboopathy.tharasworld.model.User;
//import in.uthraboopathy.tharasworld.service.UserService;
import in.uthraboopathy.tharasworld.model.*;
import in.uthraboopathy.tharasworld.service.*;

public class App {

	public static void main(String[] args) {
		
//		
//		User newUser = new User();
//		newUser.setId(001);
//		newUser.setFirstName("Uthra");
//		newUser.setLastName("Boopathy");
//		newUser.setEmail("uthra@gmail.com");
//		newUser.setPassword("Uthra@12");
//		newUser.setActive(true);
//		
		UserService userService;
		
		try {
			userService = new UserService();

			User newUser1 = new User();
			newUser1.setId(2);
			newUser1.setFirstName("Ramya");
			newUser1.setLastName("Boopathy");
			newUser1.setEmail("ramya@gmail.com");
			newUser1.setPassword("Uthra@12");
			newUser1.setActive(true);
			
			userService.create(newUser1);
			userService.getAll();
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
//		UserService newUser = new UserService();
//		newUser.getAll();
//		
//		userService.create(newUser1);
		
//		User updateUser = new User(003, "rams@gmail.com");
////		updateUser.setId(2);
//		updateUser.setFirstName("Ramya");
//		updateUser.setLastName("Boopathy");
////		updateUser.setEmail("ramys@gmail.com");
//		updateUser.setPassword("Uthra@12");
//		updateUser.setActive(true);
//		
//		
////		userService.update(2, updateUser);
////		
////		userService.getAll();
////		
		
		////////////////    FOR TASK   ////////////
		
		
//		TaskService taskService;
//
//		try {
//			taskService = new TaskService();
//			
//			TaskEntity newTask = new TaskEntity();
//			newTask.setId(1);
//			newTask.setTaskName("Rc");
//			newTask.setDueDate("01.10.2023");
//			newTask.setActive(true);
//
//			taskService.create(newTask);
//			taskService.getAll();
//
//
//		} catch (Exception e) {
//		
//			e.printStackTrace();
//		}
		

	}

}
