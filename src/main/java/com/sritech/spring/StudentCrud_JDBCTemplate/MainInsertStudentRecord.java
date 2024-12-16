package com.sritech.spring.StudentCrud_JDBCTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sritech.sprin.DAO.StudentDAO;
import com.sritech.sprin.DAO.Impl.StudentDAOImpl;
import com.sritech.spring.modelLayer.Student;

public class MainInsertStudentRecord {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringStudentOperations.xml");
		
		StudentDAO studentDAO=(StudentDAOImpl)context.getBean("studentDAO");

		Student student =(Student) context.getBean("student");
		
		studentDAO.saveStudentRecord(student);
	
	}

}
