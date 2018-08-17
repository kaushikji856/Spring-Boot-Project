/**
 * 
 */
package io.vipin.service;

import java.util.List;

import io.vipin.model.AddressBook;

/**
 * @author VI852115
 *
 */
public interface AddressBookService {

	public List<AddressBook> getAllAddress(final long userId);
}
