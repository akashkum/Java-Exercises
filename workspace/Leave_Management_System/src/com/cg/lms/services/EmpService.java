package com.cg.lms.services;

import java.util.List;

import com.cg.lms.dtos.Employee;
import com.cg.lms.dtos.Leave;
import com.cg.lms.exception.EmpException;

public interface EmpService {
	List<Leave> getLeaveList(int id) throws EmpException;
	Employee getEmpOnId(int id) throws EmpException;

}
