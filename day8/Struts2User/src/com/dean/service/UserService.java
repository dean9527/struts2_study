package com.dean.service;

import com.dean.entity.User;

public class UserService {
	public void login(User user){
		if(!user.getUsername().equals("admin")){
			throw new UserNotFoundException("User not found!");
		}
		if(!user.getPassword().equals("12345")){
			throw new PasswordErrorException("Password error!");
		}
	}
}
