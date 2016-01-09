package com.dean.struts2;

import com.dean.entity.User;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction implements ModelDriven<User> {
	
	private String message = "Login Error!";
	
	private User user = new User();
	
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

	@Override
	public User getModel() {
		return user;
	}
}
