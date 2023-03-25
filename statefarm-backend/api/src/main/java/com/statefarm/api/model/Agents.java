package com.statefarm.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agents")
public class Agents {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long agent_id;

	@Column(name = "agent_name")
	private String agentName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "longitude")
	private String longitude;
	
	@Column(name = "latitude")
	private String latitude;
	

	@Column(name = "zipcode")
	private Integer zipcode;

	@Column(name = "photo")
	private String photo;

	public long getAgent_id() {
		return agent_id;
	}

	public void setAgent_id(long agent_id) {
		this.agent_id = agent_id;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
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


	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Agents [agent_id=" + agent_id + ", agentName=" + agentName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", longitude=" + longitude + ", latitude=" + latitude + ", zipcode=" + zipcode
				+ ", photo=" + photo + "]";
	}

	
}
