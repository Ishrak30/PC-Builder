package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.entity.SaveBuild;
import com.User.entity.User;
import com.extraclass.SaveResult;
import com.extraclass.buildresult;
import com.service.BuilderService;
import com.service.SaveBuildRestService;

@RestController
@RequestMapping("/results")
public class RestSaveBuildController {

	@Autowired
	private SaveBuildRestService savebuildservice;

	@PostMapping("/save")
	public SaveBuild savebuild(@RequestBody SaveBuild build) {
		
		savebuildservice.SaveBuild(build);
		
		return build;
	}
	
	@PostMapping("/savedbuildslist")
	public List<SaveBuild> checkbuilds(@RequestBody User user){
		
		return savebuildservice.showbuilds(user.getEmail());
	}
	
}
