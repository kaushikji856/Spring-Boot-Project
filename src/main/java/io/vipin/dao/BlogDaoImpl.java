/**
 * 
 */
package io.vipin.dao;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import io.vipin.controller.BlogController;
import io.vipin.dto.BlogDto;
import io.vipin.dto.LikeCommentDataDto;
import io.vipin.model.BlogMaster;
import io.vipin.model.BlogUserMapping;

/**
 * @author VI852115
 *
 */
@Repository("blogDao")
public class BlogDaoImpl extends AbstractDao implements BlogDao {
	
	private static final Logger log = Logger.getLogger(BlogController.class); 
	
		/* (non-Javadoc)
	 * @see io.vipin.dao.BlogDao#addBlog(io.vipin.dto.BlogDto)
	 */
	@Override
	public String addBlog(BlogDto blogDto) {
		try {
		BlogMaster blogModel = new BlogMaster();
		blogModel.setBlogTittle(blogDto.getBlogTittle());
		blogModel.setBlogName(blogDto.getBlogName());
		blogModel.setBlogContent(blogDto.getBlogContent());
		blogModel.setBlogDate(blogDto.getBlogDate());
		blogModel.setUserId(blogDto.getUserId());
		getSession().save(blogModel);
		//String str = "delete from BlogMaster";
		//getSession().createQuery(str);
		
		} catch (Exception e) {
			log.error("Exception occured in:: "+this.getClass()+"Error is--> "+e);
		}
		return "success";
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BlogMaster> getUserBlog(Long userId) throws Exception {
		Criteria criteria =  getSession().createCriteria(BlogMaster.class)
				.add(Restrictions.eq("userId", userId));
		return criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<BlogMaster> getLAtestBlogs() throws Exception {
		Criteria criteria =  getSession().createCriteria(BlogMaster.class)
				.addOrder(Order.desc("blogDate"))
				.setMaxResults(20);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BlogUserMapping> getLikeComment(Long blogId, Long userId) throws Exception {
		Criteria criteria = getSession().createCriteria(BlogUserMapping.class)
				.add(Restrictions.eq("blogId", blogId))
				.setProjection(Projections.projectionList().add(Projections.count("liked"))
															.add(Projections.count("comments")));
		return criteria.list();
	}

	@Override
	public List<LikeCommentDataDto> getLikeCommentData(Long blogId, Long userId) throws Exception {
		
		Criteria criteria = getSession().createCriteria(BlogUserMapping.class,"blogusermapping")
                .createAlias("blogusermapping.userMaster", "usermaster")
                .add(Restrictions.eq("blogusermapping.blogId", blogId))
                .addOrder(Order.desc("commentDate")); 
		
		return criteria.list();
	}
	
	@Override
	public List<BlogUserMapping> addLike(Long blogId, Long userId, String comment, String clicktype) throws Exception {
		
		BlogUserMapping blogUserMapping = new BlogUserMapping();
		blogUserMapping.setBlogId(blogId);
		blogUserMapping.setUserId(userId);
		if("like_clicked".equalsIgnoreCase(clicktype)) {
			blogUserMapping.setLiked("Y");
			blogUserMapping.setLikedate(new Date());
		}else {
			blogUserMapping.setComments(comment);
			blogUserMapping.setCommentDate(new Date());
		}
		
		getSession().save(blogUserMapping);
		
		Criteria criteria = getSession().createCriteria(BlogUserMapping.class)
				.add(Restrictions.eq("blogId", blogId))
				.setProjection(Projections.projectionList().add(Projections.count("liked"))
															.add(Projections.count("comments")));
		return criteria.list();
	}

}
