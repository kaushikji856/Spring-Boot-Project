/**
 * 
 */
package io.vipin.dao;

import java.util.List;

import io.vipin.model.College;

/**
 * @author VI852115
 *
 */
public interface CollegeDao {

	/**
	 * @return
	 */
	public List<College> getAllCollege();

	/**
	 * Get college by college ID.
	 */
	public College getCollegeById(String id);

	/**
	 * @param collegeDto.
	 */
	public boolean addCollege(College collegeDto);
}
