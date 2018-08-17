/**
 * 
 */
package io.vipin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.vipin.dao.ChatMasterDao;
import io.vipin.model.ChatMaster;

/**
 * @author VI852115
 *
 */
@Service
@Transactional
public class ChatMasterServiceImpl implements ChatMasterService {

	@Autowired
	ChatMasterDao chatMasterDao;
	
	/* (non-Javadoc)
	 * @see io.vipin.service.ChatMasterService#getAllChat(java.lang.String, java.lang.String)
	 */
	@Override
	public List<ChatMaster> getAllChat(String senderId, String recieverId) {
		return chatMasterDao.getAllChat(senderId, recieverId);
	}

}
