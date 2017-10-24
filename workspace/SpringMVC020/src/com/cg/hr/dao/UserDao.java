package com.cg.hr.dao;

import com.cg.hr.entities.User;
import com.cg.hr.exception.EmpException;

public interface UserDao {
User getUserOnUserName(String userName) throws EmpException;
}
