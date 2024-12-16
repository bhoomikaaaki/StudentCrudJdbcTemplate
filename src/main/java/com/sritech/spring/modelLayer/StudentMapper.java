package com.sritech.spring.modelLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNumber) throws SQLException {
	
		Student student=new Student();
		
		student.setStudentId(rs.getInt(1));
		student.setStudentName(rs.getString(2));
		student.setStudentCourse(rs.getString(3));
		student.setStudentGender(rs.getString(4));
		student.setStudentAge(rs.getInt(5));
		
		
		return student;
	}

	
	

}
