/**
 * 
 */
package io.vipin.dao;

import java.util.List;

import io.vipin.model.ClassInfo;

/**
 * @author VI852115
 *
 */
public interface ClassDao {

	public ClassInfo getClassById(String id);
	
	public List<ClassInfo> getAllClass(); 
}
