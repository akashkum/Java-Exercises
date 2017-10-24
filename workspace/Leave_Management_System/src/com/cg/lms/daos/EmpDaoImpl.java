package com.cg.lms.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.lms.dtos.Employee;
import com.cg.lms.dtos.Leave;
import com.cg.lms.exception.EmpException;


@Repository
public class EmpDaoImpl implements EmpDao {
   
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Leave> getLeaveList(int id) throws EmpException {
		String strQry = "SELECT l FROM Leave l WHERE l.empid=?";
		TypedQuery<Leave> qry=manager.createQuery(strQry,Leave.class);
		qry.setParameter(1,id);
		List<Leave> LeaveList=qry.getResultList();
		
		return LeaveList;
	}

	@Override
	public Employee getEmpOnId(int id) throws EmpException {
		
		return manager.find(Employee.class,id);
	}



}
