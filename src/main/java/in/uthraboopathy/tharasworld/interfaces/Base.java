package in.uthraboopathy.tharasworld.interfaces;

import java.util.Set;

import in.uthraboopathy.tharasworld.model.User;

public interface Base <T> {

	public abstract Set<T> findAll();
	public abstract void create(User newuser);
	public abstract void update(User updateuser);
	public abstract void delete();
	public abstract T findById(int id);
	
}
