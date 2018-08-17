/**
 * 
 */
package io.vipin.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import io.vipin.model.ChatMaster;

/**
 * @author VI852115
 *
 */
@Repository("chatMasterDao")
public class ChatMasterDaoImpl extends AbstractDao implements ChatMasterDao {

	/* (non-Javadoc)
	 * @see io.vipin.dao.ChatMasterDao#getAllChat(java.lang.String, java.lang.String)
	 */
	@Override
	public List<ChatMaster> getAllChat(String senderId, String recieverId) {
		Criteria criteria =  getSession().createCriteria(ChatMaster.class)
		.add(Restrictions.eq("senderId", senderId))
		.add(Restrictions.eq("recieverId", recieverId));
		
		return criteria.list();
		
		
		
	}

}
