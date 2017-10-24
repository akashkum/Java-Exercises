package com.cg.hr.services;

import java.util.List;

import com.cg.hr.dtos.Employee;
import com.cg.hr.exception.EmpException;

public interface EmpService {
	List<Employee> getEmpList() throws EmpException;
	Employee getEmpOnId(int empNo) throws EmpException;
	void insertNewEmp(Employee emp) throws EmpException;
	void updateEmpName(int empNo,String empNm) throws EmpException;
	List<Integer> getEmpNoList() throws EmpException;
 public void deleteEmp(int empNo) throws EmpException;
}
