/**
 * 
 */
package io.vipin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.vipin.dao.UserMasterDao;
import io.vipin.model.UserMaster;

/**
 * @author VI852115
 *
 */

@Service
@Transactional
public class UserMasterServiceImpl implements UserMasterService {

	@Autowired
	UserMasterDao userMasterDao;
	
	@Override
	public UserMaster getUserByName(String userName, String password) {
		return userMasterDao.getUserByName(userName, password);
	}
	
	@Override
	public void addUser(String userName, String password, String email) {
		userMasterDao.addUser(userName, password, email);
	}

}
