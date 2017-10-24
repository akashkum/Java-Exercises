package src.com.capgemini.rechargeapplication.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import src.com.capgemini.rechargeapplication.bean.Recharge;
import src.com.capgemini.rechargeapplication.exception.RechargeException;
import src.com.capgemini.rechargeapplication.utility.DbConnection;
public class RechargeImplDAO implements RechargeDao {

	PreparedStatement preparedStatement = null;
	Connection conn = null;
	ResultSet resultSet = null;

	// ---------------- 1. Get all Recharge details ---------------
	
	public ArrayList<Recharge> getAllRecharge() throws RechargeException {
		ArrayList<Recharge> list = new ArrayList<Recharge>();
		
		try {
			conn = DbConnection.getConnection();
			preparedStatement = conn.prepareStatement(IQueryMapper.VIEWALL);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				/*Recharge rec = new Recharge();
				rec.setRechargeId(resultSet.getInt(1));
				rec.setOperator(resultSet.getString(2));
				rec.setAmount(resultSet.getInt(3));
				rec.setValidity(resultSet.getInt(4));*/
				int rid= resultSet.getInt(1);
				String opt = resultSet.getString(2);
				int amt = resultSet.getInt(3);
				int val = resultSet.getInt(4);
				Recharge rec = new Recharge(rid, opt, amt, val);
				//System.out.println(rid + " " + opt + " " + amt + "" + val);
				list.add(rec);
			
				
			}
		} catch (SQLException e) {
			throw new RechargeException("dao/sql/ERROR:"
					+ e.getMessage());
		} catch (Exception e) {
			throw new RechargeException("ERROR:" + e.getMessage());
		} finally {
			try {
				if (conn != null) {
					preparedStatement.close();
					conn.close();
					resultSet.close();
				}
			} catch (Exception e) {
				throw new RechargeException(
						"Could not close the connection");
			}
		}
		for (Recharge b : list)
		{
			System.out.println(b);
		}
		return list;
	}

	
}
