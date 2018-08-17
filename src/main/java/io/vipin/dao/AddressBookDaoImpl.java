/**
 * 
 */
package io.vipin.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.vipin.model.AddressBook;

/**
 * @author VI852115
 *
 */
@Repository("addressBookDao")
public class AddressBookDaoImpl extends AbstractDao implements AddressBookDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see io.vipin.dao.AddressBookDao#getAllAddress()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<AddressBook> getAllAddress(long user_id) {
		return (List<AddressBook>) getSession().createCriteria(AddressBook.class)
				.add(Restrictions.eq("usreid", user_id)).list();
	}

}
