package com.ocac.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	private String id;
	private String Emailid;
	private String Password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		this.Emailid = emailid;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
}