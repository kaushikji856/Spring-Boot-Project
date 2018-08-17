/**
 * 
 */
package io.vipin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author VI852115
 *
 */
@Entity
@Table(name = "CHAT_MASTER")
public class ChatMaster {
	
	@Id
	@Column(name = "chat_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CHAT_MASTER_SEQ")
	@SequenceGenerator(name="CHAT_MASTER_SEQ", sequenceName="CHAT_MASTER_SEQ", allocationSize=1)
	private String chatId;
	
	@Column(name = "sender_id")
	private String senderId;
	
	@Column(name = "reciever_id")
	private String recieverId;
	
	@Column(name = "chat_content")
	private String chatContent;
	
	/**
	 * 
	 */
	public ChatMaster() {
	
	}

	/**
	 * @return the chatId
	 */
	public String getChatId() {
		return chatId;
	}

	/**
	 * @param chatId the chatId to set
	 */
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	/**
	 * @return the senderId
	 */
	public String getSenderId() {
		return senderId;
	}

	/**
	 * @param senderId the senderId to set
	 */
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	/**
	 * @return the recieverId
	 */
	public String getRecieverId() {
		return recieverId;
	}

	/**
	 * @param recieverId the recieverId to set
	 */
	public void setRecieverId(String recieverId) {
		this.recieverId = recieverId;
	}

	/**
	 * @return the chatContent
	 */
	public String getChatContent() {
		return chatContent;
	}

	/**
	 * @param chatContent the chatContent to set
	 */
	public void setChatContent(String chatContent) {
		this.chatContent = chatContent;
	}
	
	
	
	
	
	
	

}
