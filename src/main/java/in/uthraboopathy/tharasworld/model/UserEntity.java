package in.uthraboopathy.tharasworld.model;

public abstract class UserEntity implements Comparable<UserEntity>{
	
	int id;
	String firstName;
	String lastName;
	String email;
	String password;
	boolean isActive = true;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	public String fullName() {
		
		return firstName.concat(" ").concat(lastName);
		
	}
	
	@Override
	public int compareTo(UserEntity u) {
			
		if (this.getId() == u.getId()) {
			return 0;
		} else {
			if (this.id>getId()) {
				return 1;
			} else {
				return -1;
			}
			
		}
		
	}
	
	@Override
	public String toString() {
		return "User [id= " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", email = " + email
				+ ", password = " + password + ", isActive = " + isActive + "]";
	}
	
}
