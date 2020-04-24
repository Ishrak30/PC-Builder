package com.service;

import java.util.List;

import com.User.entity.SaveBuild;
import com.extraclass.buildresult;

public interface BuilderService {
	public buildresult BuildGamingPC(double budget);
	public buildresult BuildWorkPC(double budget);
	public buildresult BuildGeneralPC(double budget);
	public void savebuild(String email,buildresult build);
	public List<SaveBuild> showsavedbuilds(String email);
}
