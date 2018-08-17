/**
 * 
 */
package io.vipin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.vipin.dao.AbstractDao;
import io.vipin.dao.AddressBookDao;
import io.vipin.model.AddressBook;

/**
 * @author VI852115
 *
 */
@Service
@Transactional
public class AddressBookServiceImpl extends AbstractDao implements AddressBookService {

	
	@Autowired
	AddressBookDao addressBookDao;
	
	@Override
	public List<AddressBook> getAllAddress(long user_id) {
		return addressBookDao.getAllAddress(user_id);
	}

}
