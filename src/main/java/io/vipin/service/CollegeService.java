/**
 * 
 */
package io.vipin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import io.vipin.model.College;

/**
 * @author VI852115
 *
 */
public interface CollegeService {

	
	
	/**
	 * @return
	 */
	public List<College> getAllCollege();
	
	/**
	 * Get college by college ID.
	 */
	public College getCollegeById(@PathVariable String id);	

	/**
	 * @param collegeDto
	 */
	public boolean addCollege(College collegeDto) ;
}
