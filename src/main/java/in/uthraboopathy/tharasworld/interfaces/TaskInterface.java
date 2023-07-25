package in.uthraboopathy.tharasworld.interfaces;

import in.uthraboopathy.tharasworld.model.Task;

public interface TaskInterface extends Base<Task>{

	public abstract Task findByTaskName();
	public abstract Task findByDueDate();
	
}
