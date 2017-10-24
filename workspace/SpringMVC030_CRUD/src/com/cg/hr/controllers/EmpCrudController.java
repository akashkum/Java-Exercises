package com.cg.hr.controllers;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hr.dtos.Employee;

import com.cg.hr.exception.EmpException;
import com.cg.hr.services.EmpService;


@Controller
public class EmpCrudController {
	
	
@Resource
private EmpService service;	
	
	@RequestMapping("/getHomePage.do")
	public ModelAndView getHomePage() throws EmpException{
		ModelAndView mAndV =new ModelAndView();
		mAndV.setViewName("HomePage");
		return mAndV;
	}

	
    


	@RequestMapping("/getEmpList.do")
	public ModelAndView getEmpList() throws EmpException{
		
		List<Employee> empList=service.getEmpList();
		ModelAndView mAndV =new ModelAndView();
		mAndV.addObject("empList",empList);
		mAndV.addObject("pageHead","Employee List");
		mAndV.setViewName("EmpList");
		return mAndV;
	}
	
	@RequestMapping("/getEmpDetails.do")
	public ModelAndView getEmpDetails(@RequestParam("empNo") int empNo) throws EmpException{
		
	Employee emp=service.getEmpOnId(empNo);
		ModelAndView mAndV =new ModelAndView();
		mAndV.addObject("emp",emp);
		mAndV.addObject("pageHead","Employee Details");
		mAndV.setViewName("EmpDetails");
		return mAndV;
	}
	
	@RequestMapping("/getEntryPage.do")
	public ModelAndView getEntryPage() throws EmpException{
		ModelAndView mAndV =new ModelAndView();
		mAndV.setViewName("EntryPage");
		Employee emp=new Employee();//Command Object
		mAndV.addObject("employee",emp);
		return mAndV;
	}
	
	@RequestMapping(value="/submitEmpDetails.do",method=RequestMethod.POST)
	public String submitEmpDetails(@ModelAttribute("employee") Employee emp,Model mAndV) throws EmpException{
		System.out.println(emp);
		service.insertNewEmp(emp);
		
		mAndV.addAttribute("emp",emp);
		mAndV.addAttribute("pageHead","Successfull Joining of Employee");
		return "SuccEmpJoining";
		
	}
	
	
	
		@RequestMapping("/getUpdateNamePage.do")
	public ModelAndView getUpdateNamePage() throws EmpException{
		ModelAndView mAndV =new ModelAndView();
		List<Integer> idList=service.getEmpNoList();
		mAndV.addObject("idList",idList);
		mAndV.addObject("pageHead","Update Name of an Employee");
		mAndV.setViewName("UpdateNamePage");
		return mAndV;
	}
	
	@RequestMapping(value="/submitNewEmployee.do",method=RequestMethod.GET)
	public String submitNewEmployee(@RequestParam("empNo") int empNo, @RequestParam("newName") String newName,Model mAndV) throws EmpException{
		System.out.println("printing...");
		service.updateEmpName(empNo, newName);
		Employee emp=service.getEmpOnId(empNo);
		
		mAndV.addAttribute("emp",emp);
		mAndV.addAttribute("pageHead","Successfull Updated Name");
		return "SuccEmpUpdate";
		
	}

}
