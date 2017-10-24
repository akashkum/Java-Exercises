package src.src.com.cg.ebill.dao;

public interface IQueryMapper {
	String VIEWALL = "SELECT * FROM Consumers";
	String VIEW = "SELECT * FROM Consumers WHERE consumer_num=?";
}
