
package ch.delaye.data.utils.investigator.dao;

import ch.delaye.data.utils.investigator.entities.SecondEntity;

/**
 *
 * @author Valentin Delaye <valentin.delaye@novaccess.ch>
 */
public class SecondEntityDao extends AbstractDao<SecondEntity> implements ISecondEntityDao {

	public SecondEntityDao() {
		super(SecondEntity.class);
	}

}
