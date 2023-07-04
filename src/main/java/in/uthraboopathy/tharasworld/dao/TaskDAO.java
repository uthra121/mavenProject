package in.uthraboopathy.tharasworld.dao;

import in.uthraboopathy.tharasworld.model.Task;

public class TaskDAO {
	
	// FIND ALL METHOD

	public Task[] findAll() {	
		Task[] taskList = TaskList.listOfTasks;
		return taskList;
	}
	
	//   CREATE TASK
	
	
	public void create(Task newTask) {
				
		Task[] taskList = TaskList.listOfTasks;

		for(int i=0; i<taskList.length; i++) {
			
			Task task = taskList[i];
			
			if(task==null) {
				taskList[i] = newTask;
				break;
			}
			
		}
	}
	
	// UPDATE TASK
	
	public void update(int id, Task updateTask) {
		
		Task[] taskList = TaskList.listOfTasks;
		
		for(int i=0; i<taskList.length; i++) {
			
			Task task = taskList[i];
			
			if(task==null) {
				continue;
			}
			if(task.getId()==id) {
			
				task.setTaskName(updateTask.getTaskName());
				task.setDueDate(updateTask.getDueDate());
				break;
				
			}
			
		}
		
	}
	
	//  DELETE TASK
	
	public void delete(int id) {
		
		Task[] taskList = TaskList.listOfTasks;
		
		for(int i=0; i<taskList.length; i++) {
			
			Task task = taskList[i];
			
			if(task==null) {
				continue;
			}
			
			if(task.getId()==id) {
				task.setActive(false);
				break;
			}
		}
	} 
	
	//  FIND BY ID
	
	public Task findById(int id) {
		Task[] taskList = TaskList.listOfTasks;
		Task taskMatch = null;
	
		for (int i = 0; i < taskList.length; i++) {
			Task task = taskList[i];
			if (task.getId() == id) {
				taskMatch = task;
				break;
			}
		}
		return taskMatch;
	}
	
	
}
