package com.statefarm.api.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number ")
	private String phoneNumber;

	@Column(name = "claim_number ")
	private String claimNumber;

	@Column(name = "user_password ")
	private String userPassword;

	@Column(name = "date_of_birth ")
	private Date dateOfBirth;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", claimNumber=" + claimNumber + ", userPassword=" + userPassword
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

	public Users() {
	}

	public Users(long user_id, String firstName, String lastName, String email, String phoneNumber,
			String claimNumber, String userPassword, Date dateOfBirth) {
		super();
		this.user_id = user_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.claimNumber = claimNumber;
		this.userPassword = userPassword;
		this.dateOfBirth = dateOfBirth;
	}

	public Users(String firstName, String lastName, String email, String phoneNumber, String claimNumber,
			String userPassword, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.claimNumber = claimNumber;
		this.userPassword = userPassword;
		this.dateOfBirth = dateOfBirth;
	}
	
	

}