package in.uthraboopathy.tharasworld;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.uthraboopathy.tharasworld.exception.ValidationException;
import in.uthraboopathy.tharasworld.model.Task;
import in.uthraboopathy.tharasworld.service.TaskService;

public class TestCreateTask {
	
	/// TEST FOR VALID INPUTS
	
	@Test
	public void testCreateTaskWithValidInput() {
		
		TaskService taskService = new TaskService();
		
		Task newTask = new Task();
		newTask.setId(3);
		newTask.setTaskName("RC");
		newTask.setDueDate("09.07.2023");
		newTask.setActive(true);
		
		assertDoesNotThrow(()->{
			taskService.create(newTask);
		});
	
	}
	
	/// TEST FOR INVALID INPUTS
	
	@Test
	public void testCreateTaskWithInvalidInput() throws Exception {
		
		TaskService taskService = new TaskService();
		
		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(null);
		});
		String exceptedMessage = "Invalid task input";
		String actualMessage = exception.getMessage();
		
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	/// TEST FOR TASK NAME WITH NULL
	
	@Test
	public void testCreateUserWithTaskNameNull() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		newTask.setId(1);
		newTask.setTaskName(null);
		newTask.setDueDate("09.07.2023");
		newTask.setActive(true);

		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(newTask);
		});
		String expectedMessage = "TaskName cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	/// TEST FOR TASK NAME WITH EMPTY

	@Test
	public void testCreateUserWithTaskNameEmpty() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		newTask.setId(1);
		newTask.setTaskName("");
		newTask.setDueDate("09.07.2023");
		newTask.setActive(true);

		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(newTask);
		});
		String expectedMessage = "TaskName cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}

}
