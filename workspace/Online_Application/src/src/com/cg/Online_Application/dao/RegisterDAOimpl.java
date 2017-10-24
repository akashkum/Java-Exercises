package src.com.cg.Online_Application.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import src.com.cg.Online_Application.exception.RegisterException;
import src.com.cg.Online_Application.utility.DbConnection;
import com.cg.Online_Application.bean.User;
public class RegisterDAOimpl implements RegisterDAO {

	PreparedStatement preparedStatement = null;
	Connection conn = null;
	ResultSet resultSet = null;
	public int registeruser(User userbean) throws RegisterException {
		int result = 0;
		int sequence = 0;
		try {
			conn = DbConnection.getConnection();
			
			preparedStatement = conn.prepareStatement(IQueryMapper.GETSEQUENCEID);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				sequence = resultSet.getInt(1);
			} else {
				sequence = 0;
			}
			if (sequence != 0) {
                
				preparedStatement = conn.prepareStatement(IQueryMapper.INSERTQUERY);
				preparedStatement.setInt(1,sequence);
				preparedStatement.setString(2, userbean.getOwner_name());
				preparedStatement.setString(3, userbean.getBusinessname());
				preparedStatement.setString(4, userbean.getEmailid());
				preparedStatement.setString(5, userbean.getMobileno());
				preparedStatement.setString(6, userbean.getIsactive());
				
				result = preparedStatement.executeUpdate();

				
				if (result == 0) {
					return 0;
				}
			}

		} catch (SQLException e) {
			throw new RegisterException("dao/sql/ERROR:"
					+ e.getMessage());
		} catch (Exception e) {
			throw new RegisterException("ERROR:" + e.getMessage());
		} finally {
			try {
				if (conn != null) {
					preparedStatement.close();
					conn.close();
					resultSet.close();
				}
			} catch (Exception e) {
				throw new RegisterException("Could not close the connection");
			}
		}
		return sequence;
	}

	
}
