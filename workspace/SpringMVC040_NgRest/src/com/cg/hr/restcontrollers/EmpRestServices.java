package com.cg.hr.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hr.dtos.Employee;
import com.cg.hr.exception.EmpException;
import com.cg.hr.services.EmpService;


/*http://localhost:8080/SpringMVC040_NgRest/rest/empList/7788
*/
@RestController
public class EmpRestServices {
	
	
@Autowired
private EmpService services;

@RequestMapping(value="/empList",method=RequestMethod.GET)
public List<Employee> getEmpList() throws EmpException {
	List<Employee> empList = services.getEmpList();
	return empList;
	
}
@RequestMapping(value="/empDetails/{id}",method=RequestMethod.GET)
public Employee getEmpDetails(@PathVariable("id") int empNo) throws EmpException{
	Employee emp=services.getEmpOnId(empNo);
	return emp;
}
@RequestMapping(value="/empDelete/{id}",method=RequestMethod.DELETE)
public String empDelete(@PathVariable("id") int empNo) throws EmpException{
	services.deleteEmp(empNo);
	return "Employee removed";
	
}


}
