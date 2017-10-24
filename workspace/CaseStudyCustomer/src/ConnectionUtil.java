import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private Connection connect;

	public ConnectionUtil() throws CustException{
		PropertyServices propServices=new PropertyServices();
		
		String url=propServices.getPropertyValue("url");
		String userName=propServices.getPropertyValue("userName");
		String password=propServices.getPropertyValue("password");
		try {
			connect=DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			throw new CustException("Connectiion Opening Failed",e );
		}

}public Connection getConnection(){
	return connect;}
}