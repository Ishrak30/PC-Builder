package com.service;

import java.util.List;
import com.User.entity.SaveBuild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.SaveBuildRestDao;
import com.extraclass.SaveResult;

@Service
public class SaveBuildRestServiceimpl implements SaveBuildRestService {

	@Autowired
	private SaveBuildRestDao savebuilddao;
	
	@Override
	@Transactional
	public void SaveBuild(SaveBuild build) {
		savebuilddao.savebuild(build);
	}

	@Override
	@Transactional
	public List<SaveBuild> showbuilds(String Email) {
		
		return savebuilddao.showbuilds(Email);
	}

}
