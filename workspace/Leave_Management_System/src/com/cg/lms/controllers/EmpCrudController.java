package com.cg.lms.controllers;
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
import com.cg.lms.dtos.Employee;
import com.cg.lms.dtos.Leave;
import com.cg.lms.exception.EmpException;
import com.cg.lms.services.EmpService;


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
	@RequestMapping(value="/viewleavedetails.do",method=RequestMethod.POST)  /*Request Mapping for url coming from jsp file*/
	public ModelAndView getleaveDetails(@RequestParam("id") int id) throws EmpException{
		
		ModelAndView mAndV =new ModelAndView(); /*New ModelAndView Created*/
	Employee emp=service.getEmpOnId(id);    /*getEmpOnId Function called*/
	if (emp==null){
		mAndV.addObject("message","This Employee ID Doesn't Exists");
		mAndV.setViewName("HomePage");
	}
	
	else   /*If emp is not equal to null*/
	{
		List<Leave> LeaveList=service.getLeaveList(id);   /*Retrieving LeaveList cooresponding to id*/
		mAndV.addObject("emp",emp);
		if(LeaveList.isEmpty()){
			mAndV.addObject("message","No Leave Records Found");
			mAndV.addObject("key",0);
			mAndV.setViewName("ViewLeaveDetails");
			
		}
		else  /*If leavelist is not empty*/
		{
		mAndV.addObject("LeaveList",LeaveList);
		mAndV.addObject("key",1);
		mAndV.setViewName("ViewLeaveDetails");
		}
	}
	return mAndV;   /*Returning the mAndv Object*/
	}
}
