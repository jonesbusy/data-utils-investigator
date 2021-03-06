
package ch.delaye.data.utils.investigator.generators.partial;

import ch.delaye.data.utils.investigator.dao.ISecondEntityDao;
import ch.delaye.data.utils.investigator.entities.SecondEntity;
import javax.ejb.EJB;

/**
 *
 * @author Valentin Delaye <valentin.delaye@novaccess.ch>
 */
public class SecondPartialGenerator {

	@EJB
	private ISecondEntityDao secondEntityDao;
	
	
	public void generate() {
		System.out.println("Generating second entity batches");
		for(int i = 0 ; i < 10 ; i++) {
			SecondEntity entity = new SecondEntity();
			entity.setaSecondField("BAR " + i);
			secondEntityDao.persist(entity);
		}
	}
	
}
