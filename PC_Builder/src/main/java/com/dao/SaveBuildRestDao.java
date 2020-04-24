package com.dao;

import java.util.List;

import com.User.entity.SaveBuild;
import com.extraclass.SaveResult;

public interface SaveBuildRestDao {

	public void savebuild(SaveBuild build);
	public List<SaveBuild> showbuilds(String email);
}
