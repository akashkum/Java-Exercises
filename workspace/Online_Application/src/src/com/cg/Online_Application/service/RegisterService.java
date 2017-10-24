package src.com.cg.Online_Application.service;

import java.util.List;



import src.com.cg.Online_Application.exception.RegisterException;

import com.cg.Online_Application.bean.User;


public interface RegisterService {
	public int registeruser(User userbean) throws RegisterException;

}
