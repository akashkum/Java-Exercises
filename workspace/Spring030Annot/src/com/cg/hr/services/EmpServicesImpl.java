package com.cg.hr.services;

import java.util.List;

import com.cg.hr.dao.EmpDao;
import com.cg.hr.dao.EmpDaoImpl;
import com.cg.hr.entities.Employee;
import com.cg.hr.exception.EmpException;

public class EmpServicesImpl implements EmpServices{

		private EmpDao dao;
		//Constructor Injection
		public EmpServicesImpl() {
			
			System.out.println("In Constructor of EmpServicesImpl");
		}
		public EmpServicesImpl(EmpDao dao) {
			this.dao=dao;
			System.out.println("In Constructor of EmpServicesImpl");
		}
		//Setter Injection
		public void setDao(EmpDao dao) {
			this.dao = dao;
		}
		@Override
		public List<Employee> getAllEmps() throws EmpException{
			System.out.println("In getAllEmps() of EmpServicesImpl");
			return dao.getAllEmps();
		}
		
		
		
		
		
	}


