
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustdbDaoimpl implements CustdbDao {
private Connection connect;
public CustdbDaoimpl() throws CustException{
	ConnectionUtil util = new ConnectionUtil();
	connect=util.getConnection();
	
	
}
	@Override
	public ArrayList<Customer> getCustList() throws Exception {
		ArrayList<Customer> CustList=new ArrayList<>();
		try(Statement stmt=connect.createStatement();
				
				//3.Create Resultset
				ResultSet rs=stmt.executeQuery("SELECT * FROM ctm_table ");
				) {while(rs.next()){
					int Cust_id=rs.getInt("Cust_id");
					String Cust_name=rs.getString("Cust_name");
					String gender=rs.getString("Gender");
					CustList.add(new Customer(Cust_id,Cust_name,gender));
					
			
		}
		}catch (SQLException e) {
			throw new CustException("problem in reading data",e);
		}
		return CustList;
	}
	@Override
	public Customer getCustOnId(int Cust_id) throws Exception {
		Customer cust=null;
		ResultSet rs=null;
		String qry="Select Cust_id,Cust_name,gender from Ctm_table where cust_id = ?";
		
		try(
		PreparedStatement stmt=connect.prepareStatement(qry);
				){
		stmt.setInt(1,Cust_id);
		
		 rs=stmt.executeQuery();
		
	if(rs.next())
	{
		String Cust_name=rs.getString("cust_name");
		String gender=rs.getString("gender");
		cust =new Customer(Cust_id,Cust_name,gender);
	}}catch (SQLException e) {
		throw new CustException("problem in reading data",e);
		}finally{
			try {
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {
				throw new CustException("problem in closing resources",e);
			}
			
		}
		
		return cust;
	}

	@Override
	public boolean addNewCust(Customer cust) throws CustException {
		String qry="INSERT INTO CTM_TABLE(Cust_id,Cust_name,gender)values (AUTOEMPNO.nextval,?,?)";
		int recsAffected=0;
		try(
		PreparedStatement stmt=connect.prepareStatement(qry);
				){
		
		stmt.setString(1,cust.getCust_Name());
		stmt.setString(2,cust.getGender());
		
		 recsAffected=stmt.executeUpdate();//1 for Successfull Insert
		
	}catch (SQLException e) {
		throw new CustException("problem in inserting data",e);
		}
		return (recsAffected==1) ? true : false ;
	}
	
	public void close() throws CustException{
		try {
			if(connect !=null)
				connect.close();
		} catch (SQLException e) {
			throw new CustException("problem in closing connection",e);
		}}


}
