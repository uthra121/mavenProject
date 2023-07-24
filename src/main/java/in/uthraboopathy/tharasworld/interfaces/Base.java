package in.uthraboopathy.tharasworld.interfaces;

import java.util.Set;

public interface Base <T> {

	public abstract Set<T> findAll();
	public abstract void create();
	public abstract void update();
	public abstract void delete();
	public abstract Set<T> findById(int id);
	
}
