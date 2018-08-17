/**
 * 
 */
package io.vipin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import io.vipin.dao.CollegeDao;
import io.vipin.model.College;
import io.vipin.utility.Utility;

/**
 * @author VI852115
 *
 */
@Service
@Transactional
public class CollegeServiceImpl implements CollegeService{
	
	@Autowired
	CollegeDao collegeDao;

	
	public List<College> getAllCollege() {
		return collegeDao.getAllCollege();
	}
		
	/**
	 * Get college by college ID.
	 */
	public College getCollegeById(@PathVariable String id) {
		return collegeDao.getCollegeById(id);
	}

	/**
	 * @param collegeDto
	 */
	public boolean addCollege(College collegeDto) {
		boolean flag = collegeDao.addCollege(collegeDto);
		return flag;
	}
	
}
