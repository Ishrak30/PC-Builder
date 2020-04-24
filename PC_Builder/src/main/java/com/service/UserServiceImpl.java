package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.User.entity.User;

import com.dao.UserDao;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	
    @Override
	@Transactional
	public List<User> getUsers() {
		
		
		
		
		return userdao.getUsers();
	}

	@Override
	@Transactional
	public void addUser(User theUser) {
		
		userdao.saveUser(theUser);
	
	}

	@Override
	@Transactional
	public boolean checkUser(String email, String password) {

		return userdao.login(email, password);
	}

	
	
}
