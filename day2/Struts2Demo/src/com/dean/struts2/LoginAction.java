package com.dean.struts2;

public class LoginAction {
	
	private String username;
	
	private String password;
	
	private String message = "Login Error!";
	
	public String execute(){
		//String result = "error";
		if(username.equals("admin") && password.equals("12345")){
			//result = "success";
			message = "Login Success!";
		}
		//return result;
		return "success";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
