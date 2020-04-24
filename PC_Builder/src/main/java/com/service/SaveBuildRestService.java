package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.User.entity.SaveBuild;
import com.extraclass.SaveResult;


public interface SaveBuildRestService {
	public void SaveBuild(SaveBuild build);
	public List<SaveBuild> showbuilds(String Email);
	
}
