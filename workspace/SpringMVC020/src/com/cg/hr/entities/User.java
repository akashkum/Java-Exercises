package com.cg.hr.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private boolean isAuthSucc;
	private String fullName;
	private String message;
	
	
	
	public User() {
		super();
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	@Id
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Transient
	public boolean isAuthSucc() {
		return isAuthSucc;
	}
	public void setAuthSucc(boolean isAuthSucc) {
		this.isAuthSucc = isAuthSucc;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Transient
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User(String userName, String password, boolean isAuthSucc,
			String fullName, String message) {
		super();
		this.userName = userName;
		this.password = password;
		this.isAuthSucc = isAuthSucc;
		this.fullName = fullName;
		this.message = message;
	}
	
	

}
