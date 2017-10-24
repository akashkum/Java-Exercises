package src.com.cg.dth.dao;

public interface IQueryMapper {
	String VIEWALL = "SELECT * FROM Consumers";
	String VIEW = "SELECT * FROM SUBSCRIBER_ACCOUNT_DETAILS WHERE MOBILE_NUMBER=?";
}
