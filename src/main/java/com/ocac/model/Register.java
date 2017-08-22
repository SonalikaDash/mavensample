package com.ocac.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Firstname;
	private String Lastname;
	private String Emailid;
	private String Password;
	private String Confirmpwd;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstname() {
		return Firstname;
	}



	public void setFirstname(String firstname) {
		this.Firstname= firstname;
	}



	public String getLastname() {
		return Lastname;
	}



	public void setLastname(String lastname) {
		this.Lastname = lastname;
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



	public String getConfirmpwd() {
		return Confirmpwd;
	}



	public void setConfirmpwd(String confirmpwd) {
		this.Confirmpwd = confirmpwd;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", firstname=" + Firstname + ", lastname=" + Lastname + ", emailid=" + Emailid + ", password=" + Password+ ", confirmpwd=" + Confirmpwd + "]";
	}
	
}
