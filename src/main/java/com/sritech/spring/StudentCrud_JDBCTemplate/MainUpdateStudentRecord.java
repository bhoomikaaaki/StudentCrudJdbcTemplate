package com.sritech.spring.StudentCrud_JDBCTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sritech.sprin.DAO.StudentDAO;
import com.sritech.sprin.DAO.Impl.StudentDAOImpl;
import com.sritech.spring.modelLayer.Student;

public class MainUpdateStudentRecord {
	public static void main(String[] args) {
		
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("SpringStudentOperations.xml");
		
		StudentDAO studentDAO=(StudentDAOImpl)contex.getBean("studentDAO");
		
		Student student=new Student();
		
		student.setStudentId(5);
		student.setStudentName("chinni");
		student.setStudentCourse("Devops");
		student.setStudentGender("male");
		student.setStudentAge(30);
		
		int count = studentDAO.updateStudentRecord(student);
		
		System.out.println("successfully updated "+count+"records");
		
		
		
	}

}
