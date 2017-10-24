package com.cg.hr.services;

import java.util.List;






import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.hr.dao.EmpDao;
import com.cg.hr.dao.EmpDaoImpl;
import com.cg.hr.entities.Employee;
import com.cg.hr.exceptions.EmpException;


@Service("empService")
public class EmpServicesImpl implements EmpServices {
	
	private EmpDao dao;
	
	//Setter Injection
	//@Autowired
	//@Resource  //byName,byType
	@Qualifier("empDao")
	//@Resource
	public void setDao(EmpDao dao) {
		this.dao = dao;
		System.out.println("In setDao of EmpServiceImpl");
	}

	public EmpServicesImpl() {
	
		 System.out.println("In no arg Constructor of EmpServicesImpl");
	}
	//Constructor Injection
	public EmpServicesImpl(EmpDao dao) {
		// dao = new EmpDaoImpl();
		this.dao = dao;
		 System.out.println("In Constructor of EmpServicesImpl");
	}

	@Override
	public List<Employee> getAllEmps() throws EmpException {
		 System.out.println("In getAllEmps() of EmpServicesImpl");
		return dao.getAllEmps();
	}

	public Employee getEmpOnId(int empNo) throws EmpException {
		
		return dao.getEmpOnId(empNo);
	}

}
