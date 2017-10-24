package src.com.cg.Online_Application.dao;
import src.com.cg.Online_Application.exception.RegisterException;
import com.cg.Online_Application.bean.User;

public interface RegisterDAO {
	public int registeruser(User userbean) throws RegisterException;

}
