package com.cg.lms.services;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cg.lms.daos.EmpDao;
import com.cg.lms.dtos.Employee;
import com.cg.lms.dtos.Leave;
import com.cg.lms.exception.EmpException;
@Service
@Transactional
public class EmpServiceImpl implements EmpService{
    
	
	@Resource
	private EmpDao dao;

	@Override
	public List<Leave> getLeaveList(int id) throws EmpException {
		
		return dao.getLeaveList(id);
	}

	@Override
	public Employee getEmpOnId(int id) throws EmpException {
		
		return dao.getEmpOnId(id);
	}

	/*@Override
	public List<Employee> getEmpList() throws EmpException {
		
		return dao.getEmpList();
	}

	@Override
	public Employee getEmpOnId(int empNo) throws EmpException {
		// TODO Auto-generated method stub
		return dao.getEmpOnId(empNo);
	}*/

	

	
}
