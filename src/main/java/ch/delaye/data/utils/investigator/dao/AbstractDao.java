
package ch.delaye.data.utils.investigator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Valentin Delaye <valentin.delaye@novaccess.ch>
 */
public abstract class AbstractDao<T> implements IDao<T> {

	@PersistenceContext(unitName = "DontCare")
	private EntityManager em;
	
	public final Class<T> clazz;

	public AbstractDao(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	@Override
	public void persist(T entity) {
		em.persist(entity);
	}
	
	@Override
	public T findById(Long id) {
		return em.find(clazz, id);
	}
	
}
