/**
 * 
 */
package io.vipin.service;

import java.util.List;

import io.vipin.dto.BlogDto;
import io.vipin.dto.LikeCommentDataDto;
import io.vipin.model.BlogMaster;
import io.vipin.model.BlogUserMapping;

/**
 * @author VI852115
 *
 */
public interface BlogService {

	public String addBlod(BlogDto blogDto) throws Exception;

	public List<BlogMaster> getUserBlog(Long userId) throws Exception;

	public List<BlogMaster> getLAtestBlogs() throws Exception;

	public List<BlogUserMapping> getLikeComment(Long blogId, Long userId) throws Exception;

	public List<LikeCommentDataDto> getLikeCommentData(Long blogId, Long userId) throws Exception;
	
	public List<BlogUserMapping> addLike(Long blogId, Long userId, String comment, String clicktype) throws Exception;
}
