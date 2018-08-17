/**
 * 
 */
package io.vipin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VI852115
 *
 */
@Entity
@Table(name="class_info")
public class ClassInfo {

	@Id
	@Column(name = "classid", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classid;
	
	@Column(name = "classname", nullable = true)
	private String className;

	/**
	 * Default Constructor
	 */
	public ClassInfo() {

	}

	
		
	/**
	 * @return the classid
	 */
	public int getClassid() {
		return classid;
	}



	/**
	 * @param classid the classid to set
	 */
	public void setClassid(int classid) {
		this.classid = classid;
	}




	/**
	 * @param className
	 */
	public ClassInfo(String className) {
		super();
		this.className = className;
	}

	/**
	 * @return
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className
	 */
	public void setClassName(String className) {
		this.className = className;
	}

}
