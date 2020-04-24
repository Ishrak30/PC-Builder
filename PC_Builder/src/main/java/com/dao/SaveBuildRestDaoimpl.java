package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.User.entity.SaveBuild;
import com.extraclass.SaveResult;

@Repository
public class SaveBuildRestDaoimpl implements SaveBuildRestDao {

	@Autowired
	private SessionFactory sessionFactory;
 
	
	@Override
	public void savebuild(SaveBuild build) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(build);
	}

	@Override
	public List<SaveBuild> showbuilds(String Email) {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<SaveBuild> savedbuildsquery = currentSession.createQuery("from SaveBuild", SaveBuild.class);
		List<SaveBuild> savedbuilds = savedbuildsquery.getResultList();
		List<SaveBuild> userssavedbuilds = new ArrayList<SaveBuild>();
		for (SaveBuild sb : savedbuilds) {
			if (sb.getEmail().equals(Email)) {
				userssavedbuilds.add(sb);
			}
		}
		return userssavedbuilds;
	
	}

	

}
