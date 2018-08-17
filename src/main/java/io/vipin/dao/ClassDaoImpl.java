/**
 * 
 */
package io.vipin.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.vipin.model.ClassInfo;

/**
 * @author VI852115
 *
 */
@Repository("classDao")
public class ClassDaoImpl extends AbstractDao implements ClassDao{

	@Override
	public ClassInfo getClassById(String id) {
		return getSession().get(ClassInfo.class, Integer.parseInt(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ClassInfo> getAllClass() {
		Criteria criteria = getSession().createCriteria(ClassInfo.class);
		return criteria.list();
	}

}
