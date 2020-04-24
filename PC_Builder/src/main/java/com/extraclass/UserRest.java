package com.extraclass;

public class UserRest {
	private String Email;
	private String password;
	
	
	
	public UserRest() {
		super();
	}
	public UserRest(String email, String password) {
		super();
		Email = email;
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
