package src.src.com.cg.ebill.utility;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import src.src.com.cg.ebill.exception.EbillException;

public class DbConnection {
	public static Connection getConnection() throws EbillException {
		Connection conn = null;

		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/OracleDS");
			conn = ds.getConnection();
		}

		catch (SQLException e) {
			throw new EbillException("SQL Error:"+e.getMessage());
		} catch (NamingException e) {
			throw new EbillException("message from DB/NamingExc:"
					+ e.getMessage());
		}
		return conn;
	}
}
