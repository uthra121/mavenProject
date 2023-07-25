package in.uthraboopathy.tharasworld.dao;

import java.sql.Connection;
import java.text.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import in.uthraboopathy.tharasworld.interfaces.TaskInterface;
import in.uthraboopathy.tharasworld.model.Task;

import in.uthraboopathy.tharasworld.util.ConnectionUtil;

public class TaskDAO implements TaskInterface{
	
	// FIND ALL METHOD

	public Set<Task> findAll() {	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Set<Task> taskList = new HashSet<>();
		
		try {
			
			String query = "SELECT * FROM tasks WHERE is_active = 1";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Task task = new Task();
				task.setId(rs.getInt("id"));
				task.setTaskName(rs.getString("task_name"));
				task.setDueDate(rs.getString("due_date"));
				task.setActive(rs.getBoolean("is_active"));
				taskList.add(task);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		}finally {
			ConnectionUtil.close(con, ps, rs);
		}
		
		return taskList;
	}
	
	//   CREATE TASK
	
	
	public void create(Task newTask) {
				
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			String query = "INSERT INTO tasks (task_name, due_date) VALUES (?, ?)";
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(query);
			
			ps.setString(1, newTask.getTaskName());
			ps.setString(2,  newTask.getDueDate());

			
			ps.executeUpdate();
			
			System.out.println("Task has been created successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		} finally {
			ConnectionUtil.close(connection, ps);
		}
	}
	
	// UPDATE TASK
	
	public void update(int id, Task updateTask) {
		
	Connection connection = null;
	PreparedStatement ps = null;
	
	try {
		String query = "UPDATE tasks SET task_name = ?, due_date = ? WHERE is_active = 1 AND id = ?";
		connection = ConnectionUtil.getConnection();
		ps = connection.prepareStatement(query);
		

		
		ps.setString(1, updateTask.getTaskName());
		ps.setString(2,  updateTask.getDueDate());
		ps.setInt(3, id);
		ps.executeUpdate();
		
		System.out.println("Task has been updated successfully");
		
	} catch (SQLException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		throw new RuntimeException();
		
	} finally {
		ConnectionUtil.close(connection, ps);
	}
	
		
	}
//	
//	//  DELETE TASK
//	
//	public void delete(int id) {
//		
//		Task taskList = TaskList.listOfTasks;
//		
//		for(int i=0; i<taskList.length; i++) {
//			
//			Task task = taskList[i];
//			
//			if(task==null) {
//				continue;
//			}
//			
//			if(task.getId()==id) {
//				task.setActive(false);
//				break;
//			}
//		}
//	} 
//	
//	//  FIND BY ID
	
	@Override
	public Task findById(int id) {

		Connection connection = null;
		PreparedStatement ps = null;
		Task task = null;
		ResultSet rs = null;
		
		try {
			String query = "SELECT * FROM tasks WHERE is_active = 1 AND id = ?";
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(query);
			
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				task=new Task();
				task.setTaskName(rs.getString("task_name"));
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
				String date = dateFormat.format(rs.getDate("due_date"));
				task.setDueDate(date);
				task.setActive(rs.getBoolean("is_active"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		} finally {
			ConnectionUtil.close(connection, ps, rs);
		}
		return task;
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Task findByTaskName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task findByDueDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
