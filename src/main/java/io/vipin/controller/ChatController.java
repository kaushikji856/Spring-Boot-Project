/**
 * 
 */
package io.vipin.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import io.vipin.model.ChatMaster;
import io.vipin.service.ChatMasterService;

/**
 * @author VI852115
 *
 */

@Controller
public class ChatController {
	
	/**
	 * 
	 */
	private static final Logger log = Logger.getLogger(ChatMaster.class);
	
	/**
	 * 
	 */
	@Autowired
	ChatMasterService chatMasterService;
	
	/**
	 * @param senderId
	 * @param recieverId
	 * @return
	 */
	@RequestMapping(value = "/getAllChat",method = RequestMethod.GET, produces = "application/json")
	
	public @ResponseBody String getAllChat(@RequestParam("senderid") String senderId,	@RequestParam("recieverid") String recieverId) {
		List<ChatMaster> chatMastersList = new ArrayList<>();
		StringBuilder stringBuilder = new StringBuilder();
		try {
			chatMastersList  = chatMasterService.getAllChat(senderId, recieverId);
			if(chatMastersList != null) {
				stringBuilder.append(new Gson().toJson(chatMastersList));
			}
		} catch (Exception e) {
			log.error("Exception occured in:: "+this.getClass()+"Error is--> "+e);
		}
		
		return stringBuilder.toString();
	}
	

}
