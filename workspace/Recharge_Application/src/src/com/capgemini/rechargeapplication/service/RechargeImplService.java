package src.com.capgemini.rechargeapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import src.com.capgemini.rechargeapplication.bean.Recharge;
import src.com.capgemini.rechargeapplication.dao.RechargeDao;
import src.com.capgemini.rechargeapplication.dao.RechargeImplDAO;
import src.com.capgemini.rechargeapplication.exception.RechargeException;

public class RechargeImplService implements RechargeService {
	RechargeDao dao = new RechargeImplDAO();

	public ArrayList<Recharge> getAllRecharge() throws RechargeException {
		ArrayList<Recharge> list = dao.getAllRecharge();
		return list;
	}

	
	}

