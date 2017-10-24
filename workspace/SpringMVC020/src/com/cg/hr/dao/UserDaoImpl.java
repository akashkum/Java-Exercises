package com.cg.hr.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.hr.entities.User;
import com.cg.hr.exception.EmpException;


@Repository
public class UserDaoImpl implements UserDao {
   
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public User getUserOnUserName(String userName) throws EmpException {
		
		System.out.println("In Dao: "+userName);
		User user=manager.find(User.class, userName);
		System.out.println("In dao : "+user);
		return user;
	}

	

}
