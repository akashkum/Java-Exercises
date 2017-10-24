package com.cg.tms.services;
import java.util.List;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.cg.tms.daos.TraineeDao;
import com.cg.tms.dtos.Trainee;
import com.cg.tms.exception.TraineeException;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{
    
	
	@Resource
	private TraineeDao dao;

	

	@Override
	public void insertNewTrainee(Trainee tr) throws TraineeException {
		dao.insertNewTrainee(tr);
		
	}



	@Override
	public void deleteTrainee(int id) throws TraineeException {
		dao.deleteTrainee(id);
		
	}



	@Override
	public Trainee getTraineeOnId(int id) throws TraineeException {
		return dao.getTraineeOnId(id);
	}



	@Override
	public List<Trainee> getTraineeList() throws TraineeException {
		return dao.getTraineeList();
	}



	@Override
	public void modifyTraineeName(Trainee tr) throws TraineeException {
		dao.modifyTraineeName(tr);
		
	}

	


}
