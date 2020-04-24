package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.BuilderCompListRestService;
import com.service.UserService;
import com.User.entity.*;
import com.extraclass.buildresult;

@RestController
@RequestMapping("/rest")
public class RestUserController {

	@Autowired
	
	private UserService userservice;
	
	
	@GetMapping("/listusers")
	public List<User> getusers(){
		List<User> theusers = userservice.getUsers();
		
		
		return theusers;
	}
	
	@PostMapping("/adduser")
	public User adduser(@RequestBody User theuser) {
		
		userservice.addUser(theuser);
		
		return theuser;
	}
	
	
}
