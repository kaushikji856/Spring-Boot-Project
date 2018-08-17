/**
 * 
 */
package io.vipin.service;

import java.util.List;

import io.vipin.model.ChatMaster;

/**
 * @author VI852115
 *
 */
public interface ChatMasterService {
	
	/**
	 * @param senderId
	 * @param recieverId
	 * @return
	 */
	List<ChatMaster> getAllChat(String senderId, String recieverId); 

}
