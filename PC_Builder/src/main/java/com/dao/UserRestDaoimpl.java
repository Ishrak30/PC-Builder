package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.User.entity.User;
import com.extraclass.UserRest;

@Repository
public class UserRestDaoimpl implements UserRestDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void Signup(UserRest user) {
	User theuser = new User();
	theuser.setEmail(user.getEmail());
	theuser.setPass(user.getPassword());
	
	Session currentsession = sessionFactory.getCurrentSession();
	
	currentsession.save(theuser);
	}

}
