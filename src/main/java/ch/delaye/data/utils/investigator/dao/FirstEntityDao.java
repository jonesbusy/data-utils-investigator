
package ch.delaye.data.utils.investigator.dao;

import ch.delaye.data.utils.investigator.entities.FirstEntity;

/**
 *
 * @author Valentin Delaye <valentin.delaye@novaccess.ch>
 */
public class FirstEntityDao extends AbstractDao<FirstEntity> implements IFirstEntityDao {

	public FirstEntityDao() {
		super(FirstEntity.class);
	}

}
