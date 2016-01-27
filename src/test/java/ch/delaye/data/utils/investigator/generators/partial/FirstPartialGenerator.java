
package ch.delaye.data.utils.investigator.generators.partial;

import ch.delaye.data.utils.investigator.dao.IFirstEntityDao;
import ch.delaye.data.utils.investigator.entities.FirstEntity;
import javax.ejb.EJB;

/**
 *
 * @author Valentin Delaye <valentin.delaye@novaccess.ch>
 */
public class FirstPartialGenerator {

	@EJB
	private IFirstEntityDao firstEntityDao;
	
	public void generate() {
		for(int i = 0 ; i < 10 ; i++) {
			FirstEntity entity = new FirstEntity();
			entity.setaFirstField("FOO " + i);
			firstEntityDao.persist(entity);
		}
	}
	
}
