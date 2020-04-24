package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.User.entity.SaveBuild;
import com.dao.BuilderDao;
import com.extraclass.buildresult;

@Service
public class BuilderServiceimpl implements BuilderService {

	@Autowired
	private BuilderDao builderdao;
	
	@Override
	@Transactional
	public buildresult BuildGamingPC(double budget) {
	
	return	builderdao.BuildGamingPC(budget);
		
	}

	@Override
	@Transactional
	public buildresult BuildWorkPC(double budget) {
		
		return builderdao.BuildWorkPC(budget);
	}

	@Override
	@Transactional
	public buildresult BuildGeneralPC(double budget) {
		
		return builderdao.BuildGeneralPC(budget);
	}

	@Override
	@Transactional
	public void savebuild(String email, buildresult build) {
		builderdao.savebuild(email, build);
		
	}

	@Override
	@Transactional
	public List<SaveBuild> showsavedbuilds(String email) {
	List<SaveBuild>	savedbuilds = builderdao.savedbuilds(email);
		return savedbuilds;
	}

}
