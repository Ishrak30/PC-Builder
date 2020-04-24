package com.service;

import java.util.List;

import com.User.entity.User;
import com.extraclass.buildresult;

public interface UserService {

 	public List<User> getUsers();
	
	public void addUser(User theUser);
	
	public boolean checkUser(String email, String password);
	
	
}
