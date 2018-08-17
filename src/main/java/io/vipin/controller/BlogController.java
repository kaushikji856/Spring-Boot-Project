/**
 * 
 */
package io.vipin.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import io.vipin.dao.LoggingAspectDao;
import io.vipin.dto.BlogDto;
import io.vipin.dto.LikeCommentDataDto;
import io.vipin.dto.StatusDto;
import io.vipin.model.BlogMaster;
import io.vipin.model.BlogUserMapping;
import io.vipin.model.LoginInfo;
import io.vipin.service.BlogService;

/**
 * @author VI852115
 *
 */
@Controller
public class BlogController {

	private static final Logger log = Logger.getLogger(BlogController.class);
	
	@Autowired
	BlogService blogService;
	
	@Autowired
	LoggingAspectDao loggingAspectDao;
	
	
	@RequestMapping(value = "/addBlog", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody String addBlog(@RequestParam("tittle") String tittle,
			@RequestParam("name") String name, @RequestParam("content") String content, @RequestParam("user_id") String user_id) {
		BlogDto blogDto = new BlogDto();
		try {
		blogDto.setBlogTittle(tittle);
		blogDto.setBlogName(name);
		blogDto.setBlogContent(content);
		blogDto.setBlogDate(new Date());
		blogDto.setUserId(new Long(user_id));
			blogService.addBlod(blogDto);
		} catch (Exception e) {
			log.error("Exception occured in:: "+this.getClass()+"Error is--> "+e);
		}
		StatusDto statusDto = new StatusDto();
		statusDto.setFaultString("");
		statusDto.setStatus("success");
		return new Gson().toJson(statusDto);
	}
	
	@RequestMapping(value = "/getUserBlog", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getUserBlog(@RequestParam("user_id") String userid) {
		List<BlogMaster> blogMastersList  = null;
		List<BlogMaster> listResponse = new ArrayList<>();
		try {
			blogMastersList  = blogService.getUserBlog(new Long(userid));
			if(blogMastersList != null) {
				for (BlogMaster blogMaster : blogMastersList) {
					BlogMaster blogModel = new BlogMaster();
					blogModel.setBlogTittle(blogMaster.getBlogTittle());
					blogModel.setBlogId(blogMaster.getBlogId());
					blogModel.setBlogName(blogMaster.getBlogName()); 
					blogModel.setBlogContent(blogMaster.getBlogContent());
					blogModel.setBlogDate(blogMaster.getBlogDate());
					blogModel.setUserId(blogMaster.getUserId());
					listResponse.add(blogModel); 
				}
			}
		} catch (Exception e) {
			log.error("Exception occured in:: "+this.getClass()+"Error is--> "+e);
		}
		return new Gson().toJson(listResponse);
	}
	
	@RequestMapping(value = "/getLatestBlogs", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getLaestBlogs() {
		List<BlogMaster> blogMastersList  = null;
		List<BlogMaster> listResponse = new ArrayList<>();
		try {
			blogMastersList  = blogService.getLAtestBlogs();
			if(blogMastersList != null) { 
				for (BlogMaster blogMaster : blogMastersList) {
					BlogMaster blogModel = new BlogMaster();
					blogModel.setBlogTittle(blogMaster.getBlogTittle());
					blogModel.setBlogId(blogMaster.getBlogId());
					blogModel.setBlogName(blogMaster.getBlogName()); 
					blogModel.setBlogContent(blogMaster.getBlogContent());
					blogModel.setBlogDate(blogMaster.getBlogDate());
					blogModel.setUserId(blogMaster.getUserId());
					listResponse.add(blogModel); 
				}
			}
		} catch (Exception e) {
			log.error("Exception occured in:: "+this.getClass()+"Error is--> "+e);
		}
		return new Gson().toJson(listResponse);
	}
	
	
	@RequestMapping(value = "/getLikeAndComment", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getLikeAndComment(@RequestParam("blogid") String blogid,@RequestParam("user_id") String userid) {
		List<BlogUserMapping> likeCommentList  = null;
		try {
			likeCommentList  = blogService.getLikeComment(Long.parseLong(blogid), Long.parseLong(userid));
		} catch (Exception e) {
			log.error("Exception occured in:: "+this.getClass()+"Error is--> "+e);
		}
		return new Gson().toJson(likeCommentList);
	}
	
	@RequestMapping(value = "/getLikeCommentData", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getLikeCommentData(@RequestParam("blogid") String blogid,@RequestParam("userid") String userid) {
		List<LikeCommentDataDto> likeCommentList  = null;
		try {
			likeCommentList  = blogService.getLikeCommentData(Long.parseLong(blogid), Long.parseLong(userid));
		} catch (Exception e) {
			log.error("Exception occured in:: "+this.getClass()+"Error is--> "+e);
		}
		return new Gson().toJson(likeCommentList);
	}
	
	@RequestMapping(value = "/addLike", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody String addLike(@RequestParam("blogid") String blogid,
			@RequestParam("userid") String userid, @RequestParam("comment") String comment,
			@RequestParam("clicktype") String clicktype) {
		List<BlogUserMapping> likeCommentList  = null;
		try {
			likeCommentList  = blogService.addLike(Long.parseLong(blogid), Long.parseLong(userid), comment, clicktype);
		} catch (Exception e) {
			log.error("Exception occured in:: "+this.getClass()+"Error is--> "+e);
		}
		return new Gson().toJson(likeCommentList);
	}
	
	@RequestMapping(value = "/getOnlineFriends", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getOnlineFriends(@RequestParam("user_id") String userid) {
		List<LoginInfo> likeCommentList  = null;
		try {
			likeCommentList  = loggingAspectDao.getOnlineFriends(new Long(userid));  
		} catch (Exception e) {
			log.error("Exception occured in:: "+this.getClass()+"Error is--> "+e);
		}
		return new Gson().toJson(likeCommentList);
	}
	
}
