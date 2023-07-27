package in.uthraboopathy.tharasworld.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Set;

import in.uthraboopathy.tharasworld.dao.TaskDAO;
import in.uthraboopathy.tharasworld.exception.ValidationException;
import in.uthraboopathy.tharasworld.model.Task;
import in.uthraboopathy.tharasworld.model.User;
import in.uthraboopathy.tharasworld.validation.TaskValidator;

public class TaskService {

	public Set<Task> getAll() {

		TaskDAO taskDao = new TaskDAO();

		Set<Task> taskList = taskDao.findAll();

		return taskList;
	}

	public void create(Task newTask) throws Exception {

//		TaskValidator.validate(newTask);

		try {
			TaskValidator.validate(newTask);

		} catch (ValidationException e) {

			throw new ValidationException(e.getMessage());
		
		} catch (Exception e) {

			throw new ValidationException("Invalid date or invalid date format(dd.mm.yyyy)");

		}

		TaskDAO taskDao = new TaskDAO();
		taskDao.create(newTask);

	}
	
	/**
	 * 
	 * @param id
	 * @param updateTask
	 */

	public void update(int id, Task updateTask) {

		
		TaskDAO taskDao = new TaskDAO();
		taskDao.update(1, updateTask);

	}

	public void delete(int id) {

		Task deleteTask = new Task();

		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(1);

	}

	public Task findById(int id) {
		TaskDAO taskDao = new TaskDAO();
		Task task = taskDao.findById(id);
		return task;
	}

}
