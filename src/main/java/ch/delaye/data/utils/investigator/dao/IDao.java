
package ch.delaye.data.utils.investigator.dao;

/**
 *
 * @author Valentin Delaye <valentin.delaye@novaccess.ch>
 */
public interface IDao<T> {

	void persist(T entity);
	
	public T findById(Long id);
	
}
