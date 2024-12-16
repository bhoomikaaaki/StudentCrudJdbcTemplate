package com.sritech.spring.StudentCrud_JDBCTemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sritech.sprin.DAO.StudentDAO;
import com.sritech.sprin.DAO.Impl.StudentDAOImpl;
import com.sritech.spring.modelLayer.Student;

public class MainGetStudentById {
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("SpringStudentOperations.xml");
		
		StudentDAO studentDAO=(StudentDAOImpl)context.getBean("studentDAO");
		
		List<Student> list = studentDAO.getStudentById(5);
		
		System.out.println(list);
	}

}
