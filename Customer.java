package com.infinira.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer{
	
	private static final String INVALID_FIRST_NAME = "First name cannot be NULL or EMPTY";
	private static final String INVALID_LAST_NAME = "Last name cannot be NULL or EMPTY";
	private static final String INVALID_GENDER = "Gender cannot be NULL or EMPTY";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = INVALID_FIRST_NAME)
	@Column(name="first_name")
	private String firstName;
	
	@NotNull(message = INVALID_LAST_NAME)
	@Column(name="last_name")
	private String lastName;
	
	@NotNull(message = INVALID_GENDER)
	@Column(name="gender")
	private String gender;
	
	//ITU recommended that the maximum length of mobile number is 15 digits to the telephone numbers!
	@Size(min=10,max=15)
	@NotNull
	@Column(name="mobile_num")
	private String mobileNum;
	
	@Email
	@NotNull
	@Column(name="email_id")
	private String emailId;
	
	public Customer() { }

	public Customer(long id, String firstName,String lastName,String gender,String mobileNum,String emailId) {
		
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobileNum = mobileNum;
		this.emailId = emailId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
			
}