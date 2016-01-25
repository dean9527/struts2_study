package com.dean.struts2;

import java.util.Map;

import com.dean.entity.User;
import com.dean.service.PasswordErrorException;
import com.dean.service.UserNotFoundException;
import com.dean.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction implements ModelDriven<User> {
	
	private String message = "Login Error!";
	
	private User user = new User();
	
	private UserService userService = new UserService();
	
	public String login(){
		try {
			userService.login(user);
			message = "Login Success!";
			ActionContext context = ActionContext.getContext();
			Map<String, Object> sessionMap = context.getSession();
			sessionMap.put("username", user.getUsername());

			//设置session范围内的键值对
			context.getSession().put("skey", "svalue");
			//设置application范围内的键值对
			context.getApplication().put("akey", "avalue");
			//设置request范围内的键值对
			context.put("rkey", "rvalue");
		} catch (UserNotFoundException e) {
			message = e.getMessage();
			e.printStackTrace();
		} catch (PasswordErrorException e){
			message = e.getMessage();
			e.printStackTrace();
		}
		return "success";
	}
	
	public String add(){
		message = "Add method!";
		return "success";
	}
	
	public String delete(){
		message = "Delete method!";
		return "success";
	}
	
	public String update(){
		message = "Update method!";
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
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public User getModel() {
		return user;
	}
}
