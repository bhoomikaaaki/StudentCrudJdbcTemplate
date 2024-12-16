package com.sritech.spring.StudentCrud_JDBCTemplate;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sritech.sprin.DAO.StudentDAO;
import com.sritech.sprin.DAO.Impl.StudentDAOImpl;
import com.sritech.spring.modelLayer.Student;

public class MainGetStudentList {

	public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("SpringStudentOperations.xml");
		
		StudentDAO studentDAO=(StudentDAOImpl)contex.getBean("studentDAO");
		
		List<Student> list = studentDAO.getStundentList();
	
		
		Iterator<Student> iterator = list.iterator();
		
		while(iterator.hasNext()){
			
			Student student = iterator.next();
			
			System.out.println(student);
		}
	}
}
