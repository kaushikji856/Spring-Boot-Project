/**
 * 
 */
package io.vipin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.vipin.dao.ClassDao;
import io.vipin.dao.CollegeDao;
import io.vipin.model.ClassInfo;

/**
 * @author VI852115
 *
 */
@Service
@Transactional
public class ClassServiceImpl implements ClassService{

	
	@Autowired
	ClassDao classDao;

	@Override
	public ClassInfo getClassById(String id) {
		return classDao.getClassById(id);
	}

	@Override
	public List<ClassInfo> getAllClass() {
		
		return classDao.getAllClass();
	}

}
