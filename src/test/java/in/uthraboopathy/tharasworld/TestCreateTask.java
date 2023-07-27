package in.uthraboopathy.tharasworld;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.time.LocalDate;

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
		newTask.setTaskName("FOP1");
		newTask.setDueDate("09.10.2023");
		
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
	public void testCreateTaskWithTaskNameNull() {
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
	public void testCreateTaskWithTaskNameEmpty() {
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
	
	/// TEST FOR TASK DUE DATE WITH NULL
	
	@Test
	public void testCreateTaskWithTaskDueDateNull() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		newTask.setId(1);
		newTask.setTaskName("RC");
		newTask.setDueDate(null);
		newTask.setActive(true);

		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(newTask);
		});
		String expectedMessage = "DueDate cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	/// TEST FOR TASK DUE DATE WITH EMPTY

	@Test
	public void testCreateTaskWithTaskDueDateEmpty() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		newTask.setId(1);
		newTask.setTaskName("RC");
		newTask.setDueDate("");
		newTask.setActive(true);

		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(newTask);
		});
		String expectedMessage = "DueDate cannot be null or empty";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	/// TEST FOR TASK DUE DATE FORMAT
	
	@Test
	public void testCreateTaskWithTaskDueDateFormat() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		newTask.setId(1);
		newTask.setTaskName("RC");
		newTask.setDueDate("1.1.02");
		newTask.setActive(true);

		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(newTask);
		});
		String expectedMessage = "Invalid date or invalid date format(dd.mm.yyyy)";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	/// TEST FOR TASK DUE DATE IS PAST OR NOT
	
	@Test
	public void testCreateTaskWithTaskDueDateIsPast() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		newTask.setId(1);
		newTask.setTaskName("RC");
		newTask.setDueDate("10.01.2002");
		newTask.setActive(true);

		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(newTask);
		});
		String expectedMessage = "Invalid date or invalid date format(dd.mm.yyyy)";
		String actualMessage = exception.getMessage();

		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	/// TEST FOR TASK DUE DATE IS INValid
	
		@Test
		public void testCreateTaskWithTaskDueDateInValid() {
			TaskService taskService = new TaskService();
			Task newTask = new Task();
			newTask.setId(1);
			newTask.setTaskName("RC");
			newTask.setDueDate("1.10.2024");
			newTask.setActive(true);

			Exception exception = assertThrows(ValidationException.class, () -> {
				taskService.create(newTask);
			});
			String expectedMessage = "Invalid date or invalid date format(dd.mm.yyyy)";
			String actualMessage = exception.getMessage();

			assertTrue(expectedMessage.equals(actualMessage));
		}
	
}
