package com.cg.hr.dao;

import java.util.List;

import com.cg.hr.entities.Employee;
import com.cg.hr.exception.EmpException;

public class EmpDaoImpl implements EmpDao {

	public EmpDaoImpl() {
		System.out.println("In Constructor of EmpDaoImpl");
	}

	@Override
	public List<Employee> getAllEmps() throws EmpException{
		System.out.println("In getAllEmps() of EmpDaoImpl");
		return null;
	}
	
	
	
}
