/**
 * 
 */
package io.vipin.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.vipin.model.College;

/**
 * @author VI852115
 *
 */

@Repository("collegeDao")
public class CollegeDaoImpl extends AbstractDao implements CollegeDao{

	/**
	 * Get college by college ID.
	 */
	public College getCollegeById(String id) {
		//collegeList.stream().filter(t -> (String.valueOf(t.getCollegeId())).equals(id)).findFirst().get();
		return getSession().get(College.class, Integer.parseInt(id));
	}

	/**
	 * @param collegeDto.
	 */
	public boolean addCollege(College collegeDto) {
	    getSession().save(collegeDto);
		return true;
	}

	
	@SuppressWarnings("unchecked")
	public List<College> getAllCollege() {
		Criteria criteria = getSession().createCriteria(College.class);
		return criteria.list();
	}


}
