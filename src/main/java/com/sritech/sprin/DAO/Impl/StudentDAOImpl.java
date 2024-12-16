package com.sritech.sprin.DAO.Impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sritech.sprin.DAO.StudentDAO;

import com.sritech.spring.modelLayer.Student;
import com.sritech.spring.modelLayer.StudentMapper;

public class StudentDAOImpl implements StudentDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public List<Student> getStundentList() {
		
		
		List<Student> list=jdbcTemplate.query("select * from student",new StudentMapper());
	
		return list;
	}



	public List<Student> getStudentById(int id) {
		
		
		List<Student> list=jdbcTemplate.query("select * from student where STUDENT_ID=?",new StudentMapper(),id);
	
		return list;
	}



	public void saveStudentRecord(Student stdent) {

		jdbcTemplate.update("INSERT INTO STUDENT VALUES(?,?,?,?,?)",stdent.getStudentId(),stdent.getStudentName(),stdent.getStudentCourse(),stdent.getStudentGender(),stdent.getStudentAge());
		
		System.out.println("sucessfully student record inserted");
		
	}



	public int updateStudentRecord(Student stdent) {
		
		
		int count = jdbcTemplate.update("update student set STUDENT_NAME=?,STUDENT_COURSE=?,STUDENT_GENDER =?,STUDENT_AGE  =? where STUDENT_ID  =?",stdent.getStudentName(),stdent.getStudentCourse(),stdent.getStudentGender(),stdent.getStudentAge(),stdent.getStudentId());
		
		return count;
	}



	public int deleteStudentRecord(int id) {
		
		int count = jdbcTemplate.update("delete from student where STUDENT_ID=?",id);
		
		return count;
	}
	

}
