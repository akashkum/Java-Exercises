package com.cg.tms.controllers;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.tms.dtos.Trainee;
import com.cg.tms.exception.TraineeException;
import com.cg.tms.services.TraineeService;


@Controller
public class TraineeController {
	
	
@Resource
private TraineeService service;	
	
	@RequestMapping("/getHomePage.do")
	public ModelAndView getHomePage() throws TraineeException{
		ModelAndView mAndV =new ModelAndView();
		mAndV.setViewName("MainMenu");
		return mAndV;
	}

	@RequestMapping(value="/authenticate.do",method=RequestMethod.POST)
   	public ModelAndView authenticateUser(HttpServletRequest request) throws TraineeException{
   		String userName=request.getParameter("userName");
   		String password=request.getParameter("password");
   		
   		ModelAndView mAndV=new ModelAndView();
   		
   		
   		if(userName.equals("system") && password.equals("sys")){
   			mAndV.addObject("pageHead", "Main Menu");
   			mAndV.setViewName("MainMenu");
   		}
   		else
   		{   mAndV.addObject("pageHead", "Login Page");
   		
   			mAndV.setViewName("LoginPage");
   		}
   		return mAndV;
   	}
    
	@RequestMapping("/InsertTrainee.do")
	public ModelAndView getEntryPage() throws TraineeException{
		ModelAndView mAndV =new ModelAndView();
		mAndV.setViewName("EntryPage");
		Trainee tr=new Trainee();//Command Object
		mAndV.addObject("trainee",tr);
		return mAndV;
	}
	
	@RequestMapping(value="/submitTraineeDetails.do",method=RequestMethod.POST)
	public String submitEmpDetails(@ModelAttribute("trainee") Trainee tr,Model mAndV) throws TraineeException{
		
		service.insertNewTrainee(tr);
		
		mAndV.addAttribute("trainee",tr);
		mAndV.addAttribute("pageHead","Successfull Joining of Trainee");
		return "SuccTraineeJoining";
		
	}
	
	@RequestMapping("/DeleteTrainee.do")
	public ModelAndView DeleteTraineePage() throws TraineeException{
		ModelAndView mAndV =new ModelAndView();
		mAndV.setViewName("DeletePage");
		Trainee tr=new Trainee();//Command Object
		mAndV.addObject("trainee",tr);
		mAndV.addObject("key",0);
		return mAndV;
	}
	

	
		@RequestMapping(value="/DeleteTraineeDetails.do",method=RequestMethod.POST)
	public String DeleteTraineeDetails(@ModelAttribute("trainee") Trainee tr,Model mAndV) throws TraineeException{
		Trainee tr1=service.getTraineeOnId(tr.getId());
		mAndV.addAttribute("trainee",tr1);
		mAndV.addAttribute("pageHead1","Trainee Info");
		mAndV.addAttribute("key",1);
		return "DeletePage";
		
	}
	
		@RequestMapping(value="/delete.do",method=RequestMethod.POST)
		public String delete(HttpServletRequest request) throws TraineeException{
			int id=Integer.parseInt(request.getParameter("id"));
			service.deleteTrainee(id);
			return "MainMenu";
			
		}

		
		
			@RequestMapping("/getTraineeOnId.do")
		public ModelAndView getTraineeDetails() throws TraineeException{	
		
			ModelAndView mAndV =new ModelAndView();
			mAndV.addObject("pageHead", "Retreive Operation");
			mAndV.setViewName("IndividualTraineeDetails");
			return mAndV;
		}
		
	
				@RequestMapping(value="/getIndividualDetails.do",method=RequestMethod.POST)
		   	public ModelAndView getIndividualTraineeDetails(HttpServletRequest request) throws TraineeException{
		   		int id=Integer.parseInt(request.getParameter("id"));
		   		Trainee tr=service.getTraineeOnId(id);
		   		ModelAndView mAndV=new ModelAndView();
		   		mAndV.addObject("trainee", tr);
		   		mAndV.addObject("key", 1);
		   		mAndV.setViewName("IndividualTraineeDetails");
		   		return mAndV;
				}
				
					@RequestMapping("/getTraineeList.do")
				public ModelAndView getTraineeList() throws TraineeException{
					
					List<Trainee> tlist=service.getTraineeList();
					ModelAndView mAndV =new ModelAndView();
					mAndV.addObject("tlist",tlist);
					mAndV.addObject("pageHead","Trainee Details");
					mAndV.setViewName("TraineeList");
					return mAndV;
				}
					
								
					
					
					
		   @RequestMapping("/ModifyTrainee.do")
					public ModelAndView ModifyTraineePage() throws TraineeException{
						ModelAndView mAndV =new ModelAndView();
						mAndV.setViewName("ModifyPage");
						mAndV.addObject("key",0);
						return mAndV;
					}
					
					
		   @RequestMapping(value="/modify.do",method=RequestMethod.POST)
		   	public ModelAndView modify(HttpServletRequest request) throws TraineeException{
		   		int id=Integer.parseInt(request.getParameter("id"));
		   		Trainee tr=service.getTraineeOnId(id);
		   		ModelAndView mAndV=new ModelAndView();
		   		mAndV.addObject("trainee", tr);
		   		mAndV.addObject("key", 1);
		   		mAndV.setViewName("ModifyPage");
		   		return mAndV;
				}			
					
					
		   
		   
		   @RequestMapping(value="/finalmodify.do",method=RequestMethod.POST)
			public String finalmodify(@ModelAttribute("trainee") Trainee tr,Model mAndV) throws TraineeException{
				service.modifyTraineeName(tr);
				return "MainMenu";
				
			}
	   
		   
					
					
					
					
					
}
