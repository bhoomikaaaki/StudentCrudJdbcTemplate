package com.sritech.spring.StudentCrud_JDBCTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sritech.sprin.DAO.StudentDAO;
import com.sritech.sprin.DAO.Impl.StudentDAOImpl;

public class MainDeleteStudentRecord {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringStudentOperations.xml");
		
		StudentDAO studentDAO=(StudentDAOImpl)context.getBean("studentDAO");
		
		
		int count = studentDAO.deleteStudentRecord(5);
		System.out.println("sucessfully deleted "+count+"records");
	}

}
