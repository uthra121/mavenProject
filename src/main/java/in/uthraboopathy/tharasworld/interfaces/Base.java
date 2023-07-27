package in.uthraboopathy.tharasworld.interfaces;

import java.util.Set;

import in.uthraboopathy.tharasworld.model.User;

public interface Base <T> {

	public abstract Set<T> findAll();
	public abstract void create(T newObject);
	public abstract void update(int id, T updatedObject);
	public abstract void delete(int id);
	public abstract T findById(int id);
	
}
