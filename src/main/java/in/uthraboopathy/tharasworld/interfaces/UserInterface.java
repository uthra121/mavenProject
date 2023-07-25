package in.uthraboopathy.tharasworld.interfaces;

import in.uthraboopathy.tharasworld.model.User;

public interface UserInterface extends Base<User>{

	public abstract User findByEmail(String email);
	public abstract int countOfActiveUsers();
	
}
