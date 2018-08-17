/**
 * 
 */
package io.vipin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author VI852115
 *
 */

@Entity
@Table(name = "address_book")
public class AddressBook implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "address_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADDRESS_BOOK_SEQ")
	@SequenceGenerator(name="ADDRESS_BOOK_SEQ", sequenceName="ADDRESS_BOOK_SEQ", allocationSize=1)	
	private Long addressId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "phone_no")
	private Long phoneNo;

	@Column(name = "user_id")
	private Long usreid;
	
	  /**
     * 
     */
   /* @ManyToOne
    @JoinColumn(name="user_id", nullable=false, insertable = false, updatable =false)
    private UserMaster userMaster;*/
    
	/**
	 * 
	 */
	public AddressBook() {
		super();
	}
	/**
	 * @return the usreid
	 */
	public Long getUsreid() {
		return usreid;
	}

	/**
	 * @param usreid the usreid to set
	 */
	public void setUsreid(Long usreid) {
		this.usreid = usreid;
	}


	/**
	 * @return the addressId
	 */
	public Long getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the phoneNo
	 */
	public Long getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

}
