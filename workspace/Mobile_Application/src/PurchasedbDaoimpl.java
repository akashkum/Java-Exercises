import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class PurchasedbDaoimpl implements PurchasedbDao {
private Connection connect;
static Logger myLogger=Logger.getLogger("myLogger");
public PurchasedbDaoimpl() throws PurchaseException{
	ConnectionUtil util = new ConnectionUtil();
	connect=util.getConnection();
	myLogger.log(Level.INFO,"Connection proccured in EMpdbDaoImpl.");
	
}
	@Override
	public boolean addNewPurchase(Purchase pdetails) throws PurchaseException {
		String qry="INSERT INTO purchasedetails values (seq.nextval,?,?,?,sysdate,?)";
		int recsAffected=0;
	
		try(
		PreparedStatement stmt=connect.prepareStatement(qry);
				){
		
		stmt.setString(1,pdetails.getCname());
		stmt.setString(2,pdetails.getMailid());
		stmt.setString(3,pdetails.getPhoneno());
		stmt.setInt(4,pdetails.getMobileid());
		
		 recsAffected=stmt.executeUpdate();//1 for Successfull Insert
		
	}catch (SQLException e) {
		throw new PurchaseException("Problem in inserting data",e);
		}
		
//
		String qry1 ="UPDATE mobiles SET quantity=quantity-1 WHERE mobileid=?";
		int recsAff=0;
				try(PreparedStatement stmt1=connect.prepareStatement(qry1);) {
					stmt1.setInt(1,pdetails.getMobileid());
					 recsAff=stmt1.executeUpdate();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
		
	//
		return (recsAffected==1) ? true : false ; //////
		
	
		
	}
	
	public void close() throws PurchaseException{
		try {
			if(connect !=null)
				connect.close();
		} catch (SQLException e) {
			throw new PurchaseException("problem in closing connection",e);
		}}


}
