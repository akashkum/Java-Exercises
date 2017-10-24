package src.com.cg.Online_Application.dao;

public interface IQueryMapper {
	String GETSEQUENCEID = "SELECT seq_firm_master.NEXTVAL FROM dual";
	String INSERTQUERY="INSERT INTO FIRMS_MASTER VALUES(?,?,?,?,?,?)";
	
}
