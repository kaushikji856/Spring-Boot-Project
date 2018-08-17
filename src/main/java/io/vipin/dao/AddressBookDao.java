/**
 * 
 */
package io.vipin.dao;

import java.io.Serializable;
import java.util.List;

import io.vipin.model.AddressBook;

/**
 * @author VI852115
 *
 */
public interface AddressBookDao extends Serializable {
	
	public List<AddressBook> getAllAddress(long user_id);

}
