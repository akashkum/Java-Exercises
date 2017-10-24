package src.com.cg.dth.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import src.com.cg.dth.bean.Subscriber;
import src.com.cg.dth.exception.DTHException;
import src.com.cg.dth.utility.DbConnection;
public class subscriberDAOimpl implements subscriberDAO {

	PreparedStatement preparedStatement = null;
	Connection conn = null;
	ResultSet resultSet = null;
	
	public Subscriber getAccDetails(String mnumb) throws DTHException {
		Subscriber sbean = new Subscriber(0, mnumb, mnumb, 0, null);
		try {
			conn = DbConnection.getConnection();
			preparedStatement = conn.prepareStatement(IQueryMapper.VIEW);
			preparedStatement.setString(1,mnumb);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				sbean.setSubscriber_id(resultSet.getInt(1));
				sbean.setMobile_number(resultSet.getString(2));
				sbean.setPackage_id(resultSet.getString(3));
				sbean.setAccount_balance(resultSet.getFloat(4));
				sbean.setRechargedate(resultSet.getDate(5));
			}

		} catch (SQLException e) {
			throw new DTHException("dao/sql/ERROR:"
					+ e.getMessage());
		} catch (Exception e) {
			throw new DTHException("ERROR:" + e.getMessage());
		} finally {
			try {
				if (conn != null) {
					preparedStatement.close();
					conn.close();
					resultSet.close();
				}
			} catch (Exception e) {
				throw new DTHException(
						"Could not close the connection");
			}
		}
		return sbean;
	}


	
}
