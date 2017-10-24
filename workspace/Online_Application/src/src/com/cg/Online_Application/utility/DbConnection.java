package src.com.cg.Online_Application.utility;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import src.com.cg.Online_Application.exception.RegisterException;

public class DbConnection {
	public static Connection getConnection() throws RegisterException {
		Connection conn = null;

		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/OracleDS");
			conn = ds.getConnection();
		}

		catch (SQLException e) {
			throw new RegisterException("SQL Error:"+e.getMessage());
		} catch (NamingException e) {
			throw new RegisterException("message from DB/NamingExc:"
					+ e.getMessage());
		}
		return conn;
	}
}
