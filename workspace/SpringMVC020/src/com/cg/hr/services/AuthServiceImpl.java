package com.cg.hr.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cg.hr.dao.UserDao;
import com.cg.hr.entities.User;
import com.cg.hr.exception.EmpException;
@Service
public class AuthServiceImpl implements AuthServices{

	private UserDao dao;
	

     @Resource
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
     

	@Override
	public User isAuthanticated(User userForm) throws EmpException {
		System.out.println("In service :"+userForm.getUserName() + ""+userForm.getPassword());
		
		User userDb=dao.getUserOnUserName(userForm.getUserName());
		
		if(userDb==null){
			userForm.setMessage("User Name does not Exists");
			userForm.setAuthSucc(false);
		}
		else
		{
			if(userForm.getPassword().equals(userDb.getPassword())){
				userForm.setAuthSucc(true);
				userForm.setFullName(userDb.getFullName());
			}else
			{
				userForm.setMessage("Password Mismatching");
				userForm.setAuthSucc(false);
			}
		}
		
		return userForm;
	}

}
