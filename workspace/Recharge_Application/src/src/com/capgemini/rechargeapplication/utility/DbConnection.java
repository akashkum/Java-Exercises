package src.com.capgemini.rechargeapplication.utility;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import src.com.capgemini.rechargeapplication.exception.RechargeException;




public class DbConnection {
	public static Connection getConnection() throws RechargeException {
		Connection conn = null;

		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/OracleDS");
			conn = ds.getConnection();
		}

		catch (SQLException e) {
			throw new RechargeException("SQL Error:"+e.getMessage());
		} catch (NamingException e) {
			throw new RechargeException("message from DB/NamingExc:"
					+ e.getMessage());
		}
		return conn;
	}
}
