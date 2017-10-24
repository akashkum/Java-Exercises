package com.cg.tms.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.tms.dtos.Trainee;
import com.cg.tms.exception.TraineeException;

@Repository
public class TraineeDaoImpl implements TraineeDao {
   
	
	@PersistenceContext
	private EntityManager manager;


	@Override
	public void insertNewTrainee(Trainee tr) throws TraineeException {
		manager.persist(tr);
		
	}


	@Override
	public void deleteTrainee(int id) throws TraineeException {
		Trainee tr=manager.find(Trainee.class, id);
		manager.remove(tr);
		
	}


	@Override
	public Trainee getTraineeOnId(int id) throws TraineeException {
		return manager.find(Trainee.class, id);
		
	}


	@Override
	public List<Trainee> getTraineeList() throws TraineeException {
		String strQry = "SELECT t FROM Trainee t";
		TypedQuery<Trainee> qry=manager.createQuery(strQry,Trainee.class);
		List<Trainee> tlist=qry.getResultList();
		
		return tlist;
	}


	@Override
	public void modifyTraineeName(Trainee tr) throws TraineeException {
		Trainee tr1 =manager.find(Trainee.class, tr.getId());
		tr1.setDomain(tr.getDomain());
		tr1.setLocation(tr.getLocation());
		tr1.setName(tr.getName());
		
	}

	
	

	

}
