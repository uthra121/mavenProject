package in.uthraboopathy.tharasworld;

import in.uthraboopathy.tharasworld.service.UserService;

public class App {

	public static void main(String[] args) {
		
		UserService userService = new UserService();
		
		userService.create();
		
		userService.getAll();
		
		


	}

}
