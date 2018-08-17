/**
 * 
 */
package io.vipin.service;

import io.vipin.model.UserMaster;

/**
 * @author VI852115
 *
 */
public interface UserMasterService {
	
	public UserMaster getUserByName(String userName, String password);
	public void addUser(String userName, String password, String email);

}
