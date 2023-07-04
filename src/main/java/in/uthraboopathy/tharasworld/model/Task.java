package in.uthraboopathy.tharasworld.model;

public class Task {

	int id;
	String taskName;
	String dueDate;
	boolean isActive;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	@Override
	public String toString() {
		return "Task [id = " + id + ", taskName = " + taskName + ", dueDate = " + dueDate + ", isActive = " + isActive + "]";
	}

}
