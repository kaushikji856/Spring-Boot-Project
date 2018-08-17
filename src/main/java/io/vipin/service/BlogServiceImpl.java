/**
 * 
 */
package io.vipin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.vipin.dao.BlogDao;
import io.vipin.dto.BlogDto;
import io.vipin.dto.LikeCommentDataDto;
import io.vipin.model.BlogMaster;
import io.vipin.model.BlogUserMapping;

/**
 * @author VI852115
 *
 */
@Service
@Transactional
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.vipin.service.BlogService#addBlod(java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public String addBlod(BlogDto blogDto) throws Exception {
		return blogDao.addBlog(blogDto);
	}

	@Override
	public List<BlogMaster> getUserBlog(Long userId) throws Exception {
		
		return blogDao.getUserBlog(userId);
	}

	@Override
	public List<BlogMaster> getLAtestBlogs() throws Exception {
		return blogDao.getLAtestBlogs();
	}

	@Override
	public List<BlogUserMapping> getLikeComment(Long blogId, Long userId) throws Exception {
		return blogDao.getLikeComment(blogId, userId);
	}

	@Override
	public List<LikeCommentDataDto> getLikeCommentData(Long blogId, Long userId) throws Exception {
		return blogDao.getLikeCommentData(blogId, userId);
	}

	@Override
	public List<BlogUserMapping> addLike(Long blogId, Long userId, String comment, String clicktype) throws Exception {
		return blogDao.addLike(blogId, userId, comment, clicktype);
	}
	
	

}
