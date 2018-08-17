/**
 * 
 */
package io.vipin.dto;

import java.util.Date;

/**
 * @author VI852115
 *
 */
public class BlogDto {

	private Long blogId;
	private String blogTittle;
	private String blogName;
	private String blogContent;
	private Date blogDate;
	private Long userId;
	
	
	/**
	 * 
	 */
	public BlogDto() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param blogId
	 * @param blogTittle
	 * @param blogName
	 * @param blogContent
	 * @param blogDate
	 * @param userId
	 */
	public BlogDto(Long blogId, String blogTittle, String blogName, String blogContent, Date blogDate, Long userId) {
		super();
		this.blogId = blogId;
		this.blogTittle = blogTittle;
		this.blogName = blogName;
		this.blogContent = blogContent;
		this.blogDate = blogDate;
		this.userId = userId;
	}


	/**
	 * @return the blogId
	 */
	public Long getBlogId() {
		return blogId;
	}


	/**
	 * @param blogId the blogId to set
	 */
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}


	/**
	 * @return the blogTittle
	 */
	public String getBlogTittle() {
		return blogTittle;
	}


	/**
	 * @param blogTittle the blogTittle to set
	 */
	public void setBlogTittle(String blogTittle) {
		this.blogTittle = blogTittle;
	}


	/**
	 * @return the blogName
	 */
	public String getBlogName() {
		return blogName;
	}


	/**
	 * @param blogName the blogName to set
	 */
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}


	/**
	 * @return the blogContent
	 */
	public String getBlogContent() {
		return blogContent;
	}


	/**
	 * @param blogContent the blogContent to set
	 */
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}


	/**
	 * @return the blogDate
	 */
	public Date getBlogDate() {
		return blogDate;
	}


	/**
	 * @param blogDate the blogDate to set
	 */
	public void setBlogDate(Date blogDate) {
		this.blogDate = blogDate;
	}


	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
