package src.src.com.cg.ebill.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import src.com.cg.ebill.bean.Consumers;
import src.src.com.cg.ebill.exception.EbillException;
import src.src.com.cg.ebill.utility.DbConnection;

public class ebillDAOimpl implements ebillDAO {

	PreparedStatement preparedStatement = null;
	Connection conn = null;
	ResultSet resultSet = null;
	
	
	/*Code for Getting details of all Consumers*/
	public ArrayList<Consumers> getAllConsumers() throws EbillException {
		ArrayList<Consumers> clist = new ArrayList<Consumers>();
		Consumers cbean = new Consumers(0, null, null);
		try {
			conn = DbConnection.getConnection();
			preparedStatement = conn.prepareStatement(IQueryMapper.VIEWALL);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cbean.setConsumer_num(resultSet.getInt(1));
				cbean.setConsumer_name(resultSet.getString(2));
				cbean.setAddress(resultSet.getString(3));
				clist.add(cbean);
			cbean = new Consumers(0, null, null);
			}
		} catch (SQLException e) {
			throw new EbillException("dao/sql/ERROR:"
					+ e.getMessage());
		} catch (Exception e) {
			throw new EbillException("ERROR:" + e.getMessage());
		} finally {
			try {
				if (conn != null) {
					preparedStatement.close();
					conn.close();
					resultSet.close();
				}
			} catch (Exception e) {
				throw new EbillException(
						"Could not close the connection");
			}
		}
		return clist;
	}
	
	
	public Consumers getConsumer(int cnumb) throws EbillException {
		Consumers cbean = new Consumers(cnumb, null, null);
		try {
			conn = DbConnection.getConnection();
			preparedStatement = conn.prepareStatement(IQueryMapper.VIEW);
			preparedStatement.setInt(1,cnumb);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cbean.setConsumer_num(resultSet.getInt(1));
				cbean.setConsumer_name(resultSet.getString(2));
				cbean.setAddress(resultSet.getString(3));
			}

		} catch (SQLException e) {
			throw new EbillException("dao/sql/ERROR:"
					+ e.getMessage());
		} catch (Exception e) {
			throw new EbillException("ERROR:" + e.getMessage());
		} finally {
			try {
				if (conn != null) {
					preparedStatement.close();
					conn.close();
					resultSet.close();
				}
			} catch (Exception e) {
				throw new EbillException(
						"Could not close the connection");
			}
		}
		return cbean;
	}

	
	
	
	
}
