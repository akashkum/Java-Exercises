package com.cg.tms.daos;
import java.util.List;
import com.cg.tms.dtos.Trainee;
import com.cg.tms.exception.TraineeException;
public interface TraineeDao {
void insertNewTrainee(Trainee tr) throws TraineeException;
public void deleteTrainee(int id) throws TraineeException;
Trainee getTraineeOnId(int id) throws TraineeException;
List<Trainee> getTraineeList() throws TraineeException;
void modifyTraineeName(Trainee tr) throws TraineeException;


}

