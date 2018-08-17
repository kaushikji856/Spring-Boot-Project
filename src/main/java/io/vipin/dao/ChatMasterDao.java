/**
 * 
 */
package io.vipin.dao;

import java.util.List;

import io.vipin.model.ChatMaster;

/**
 * @author VI852115
 *
 */
public interface ChatMasterDao {

	
	List<ChatMaster> getAllChat(String senderId, String recieverId);
}
