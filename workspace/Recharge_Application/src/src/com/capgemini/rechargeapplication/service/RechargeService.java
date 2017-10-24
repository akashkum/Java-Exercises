package src.com.capgemini.rechargeapplication.service;

import java.util.ArrayList;
import java.util.List;

import src.com.capgemini.rechargeapplication.bean.Recharge;
import src.com.capgemini.rechargeapplication.exception.RechargeException;



public interface RechargeService {
	
	public ArrayList<Recharge> getAllRecharge()throws RechargeException;

}
