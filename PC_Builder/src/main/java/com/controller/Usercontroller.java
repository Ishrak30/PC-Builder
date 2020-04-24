package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.User.entity.User;
import com.dao.UserDao;
import com.extraclass.buildresult;
import com.service.UserService;

@Controller
@SessionAttributes("Emailid")
public class Usercontroller {
	
	//injecting userservice into controller
	@Autowired
	private UserService userservice;
	
	@GetMapping("/list")
	public String listusers(Model themodel) {
		//get users from the user
		List<User> theUsers = userservice.getUsers(); 	
		
		//	add the users to the model
		themodel.addAttribute("users",theUsers);
		
		return "list-users";
	}
	
	
	@RequestMapping("/login")
	public String login(){
		
			return "login";
	}
	
	@RequestMapping("/loginprocess")
	public String loginavalidate(HttpServletRequest request,Model model) {
		
		String useremail = request.getParameter("mailid");
		String userpass = request.getParameter("password");
		
		if(userservice.checkUser(useremail, userpass)) {
			model.addAttribute("Emailid",useremail);
			return "pc-type";
		}
		else 
			return "login";
	}
	

	@RequestMapping("/showsignup")
	public String showsignupform() {
		
		return "signup";
	}
	
	
	@PostMapping("/signup")
	public String singup(@ModelAttribute("user") User theuser){
		
		userservice.addUser(theuser);
		
		return "redirect:/login";
	}
	
	
	
}