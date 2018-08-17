/**
 * 
 */
package io.vipin.dao;

import org.apache.catalina.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import io.vipin.model.UserMaster;

/**
 * @author VI852115
 *
 */

@Repository("userMasterDao")
public class UserMasterDaoImpl extends AbstractDao implements UserMasterDao {

	
	@Override
	public UserMaster getUserByName(String userName, String password) {
		Criteria criteria =  getSession().createCriteria(UserMaster.class)
				.add(Restrictions.eq("userName", userName))
				.add(Restrictions.eq("password", password));
		return (UserMaster) criteria.list().get(0);
	}

	@Override
	public void addUser(String userName, String password, String email) {
		
		getSession().save(new UserMaster(userName, password, email));
	}
	
}
