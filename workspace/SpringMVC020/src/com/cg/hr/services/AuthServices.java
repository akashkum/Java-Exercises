package com.cg.hr.services;

import com.cg.hr.entities.User;
import com.cg.hr.exception.EmpException;

public interface AuthServices {
	public User isAuthanticated(User user) throws EmpException;
	

}
