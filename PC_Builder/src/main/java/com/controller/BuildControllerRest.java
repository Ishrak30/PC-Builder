package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.extraclass.Budget_And_type;
import com.extraclass.buildresult;
import com.service.BuilderService;

@RestController
@RequestMapping("/buildpc")
public class BuildControllerRest {

	@Autowired
	BuilderService builderservice;
	
	
	Budget_And_type price = new Budget_And_type();
	

	
	@PostMapping("/budgetinput")
	public buildresult budgetinput(@RequestBody Budget_And_type budget) {
		
		System.out.println(budget.getBudget());
		System.out.println(budget.getType());
		
		if(budget.getType().equals("work")) {
		return builderservice.BuildGamingPC(budget.getBudget());
		
		}
		else if(budget.getType().equals("gaming")) {
			return builderservice.BuildGamingPC(budget.getBudget());
		}
		else if(budget.getType().equals("general")) {
				return builderservice.BuildGeneralPC(budget.getBudget());
		}
	return builderservice.BuildGamingPC(budget.getBudget());
	}
	
}
