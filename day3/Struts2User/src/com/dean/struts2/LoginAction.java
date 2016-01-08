package com.dean.struts2;

import com.dean.entity.User;

public class LoginAction {
	
	private String message = "Login Error!";
	
	private User user;
	
	public String execute(){
		if(user.getUsername().equals("admin") && user.getPassword().equals("12345")){
			message = "Login Success!";
		}
		return "success";
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
