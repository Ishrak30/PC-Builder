package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.User.entity.User;

@Repository
public class Userdaoimpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public List<User> getUsers(){
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		Query<User> theQuery = currentSession.createQuery("from User",User.class);
		
		
		List<User> users = theQuery.getResultList();
		
		
		
		
		return users;
	}


	@Override
	public void saveUser(User theUser) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(theUser);
		
		
	}
	

	@Override
	public boolean login(String emailid, String pass) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
	
		
		Query<User> theQuery = currentSession.createQuery("from User",User.class);
		
		
		List<User> users = theQuery.getResultList();
		
		
	boolean login = false;	
		
		 for (User USER : users) {
		       if(USER.getEmail().equals(emailid)&&USER.getPass().equals(pass))
		    	   login = true;
	}
	
		 return login;
}
	
}
