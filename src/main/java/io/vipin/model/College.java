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
@Table(name="college")
public class College {

	@Id
	@Column(name = "collegeid", nullable = false)
	private int collegeId;
	@Column(name = "collegename", nullable = true)
	private String collegeName;

	/**
	 * Default Constructor
	 */
	public College() {
	}

	/**
	 * @param collegeName
	 */
	public College(int collegeId, String collegeName) {
		super();
		this.collegeName = collegeName;
		this.collegeId = collegeId;
	}

	/**
	 * @return
	 */
	public String getCollegeName() {
		return collegeName;
	}

	/**
	 * @param collegeName
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/**
	 * @return
	 */
	public int getCollegeId() {
		return collegeId;
	}

	/**
	 * @param collegeId
	 */
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + collegeId;
		result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		College other = (College) obj;
		if (collegeId != other.collegeId)
			return false;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		return true;
	}
	
	

}
