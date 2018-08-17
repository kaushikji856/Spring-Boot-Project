/**
 * 
 */
package io.vipin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import io.vipin.dao.LoggingAspectDao;
import io.vipin.model.UserMaster;
import io.vipin.service.UserMasterService;

/**
 * @author VI852115
 *
 */
@Controller
public class LoginController {

	@Autowired
	UserMasterService userMasterService;

	@Autowired
	LoggingAspectDao loggingAspectDao;

	@RequestMapping("/login")
	public ModelAndView welcomePage() {
		ModelAndView mav = null;
		mav = new ModelAndView("login");
		return mav;
	}

	@RequestMapping(value = "/logoutUser", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String logoutUser(@RequestParam("username") String username) {
		loggingAspectDao.logoutUser(username);
		List<String> listResponse = new ArrayList<>();
		listResponse.add("success");
		return new Gson().toJson(listResponse);
	}

	@RequestMapping(value = "/landingPage", method = RequestMethod.GET)
	public ModelAndView accountPartnerSearch(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		ModelAndView mav = null;
		UserMaster userMaster = userMasterService.getUserByName(username, password);
		if (userMaster != null && userMaster.getUserId() != null) {
			mav = new ModelAndView("common");
			loggingAspectDao.logBefore(username, userMaster.getUserId());
			mav.addObject("username", userMaster.getUserName());
			mav.addObject("userid", userMaster.getUserId());
		} else {
			mav = new ModelAndView("404");
		}

		return mav;
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public @ResponseBody ModelAndView addUser(@RequestParam("username") String userName,
			@RequestParam("password") String password, @RequestParam("email") String email) {
		ModelAndView mav = null;
		userMasterService.addUser(userName, password, email);
		mav = new ModelAndView("login");
		return mav;
	}

}
