package in.uthraboopathy.tharasworld.interfaces;

import in.uthraboopathy.tharasworld.model.TaskEntity;

public interface TaskInterface extends Base<TaskEntity>{

	public abstract TaskEntity findByTaskName();
	public abstract TaskEntity findByDueDate();
	
}
