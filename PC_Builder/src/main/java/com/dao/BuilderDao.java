package com.dao;

import java.util.List;

import com.User.entity.SaveBuild;
import com.extraclass.buildresult;

public interface BuilderDao {

	public  buildresult BuildGamingPC(double budget);
	public  buildresult BuildWorkPC(double budget);
	public  buildresult BuildGeneralPC(double budget);
	public 	void savebuild(String useremail,buildresult build);
	public List<SaveBuild> savedbuilds(String email);
}
