package com.cg.hr.dao;

import java.util.List;

import com.cg.hr.entities.Employee;
import com.cg.hr.exception.EmpException;

public interface EmpDao {
	List<Employee> getAllEmps() throws EmpException;

}
