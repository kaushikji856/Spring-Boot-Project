/**
 * 
 */
package io.vipin.service;

import java.util.List;

import io.vipin.model.ClassInfo;

/**
 * @author VI852115
 *
 */
public interface ClassService {

	public ClassInfo getClassById(String id);
	
	public List<ClassInfo> getAllClass();
	
}
