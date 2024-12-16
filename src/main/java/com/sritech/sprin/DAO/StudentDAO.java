package com.sritech.sprin.DAO;

import java.util.List;

import com.sritech.spring.modelLayer.Student;

public interface StudentDAO {

	public List<Student> getStundentList();
	
	public List<Student> getStudentById(int id);
	
	public void saveStudentRecord(Student stdent);
	
	public int updateStudentRecord(Student stdent);
	
	public int deleteStudentRecord(int id);
}
