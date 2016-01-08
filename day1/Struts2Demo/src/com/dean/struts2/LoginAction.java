package com.dean.struts2;

public class LoginAction {
	
	private String username;
	
	private String password;
	
	public String execute(){
		String result = "error";
		if(username.equals("admin") && password.equals("12345")){
			result = "success";
		}
		return result;
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
}
