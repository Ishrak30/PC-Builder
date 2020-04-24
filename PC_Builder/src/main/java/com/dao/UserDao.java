package com.dao;

import java.util.List;

import com.User.entity.User;

public interface UserDao {

	public List<User> getUsers();
	public void saveUser(User theUser);
	
	boolean login(String email, String pass);
}
