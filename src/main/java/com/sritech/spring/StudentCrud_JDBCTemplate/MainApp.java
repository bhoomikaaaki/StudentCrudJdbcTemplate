package com.sritech.spring.StudentCrud_JDBCTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sritech.sprin.creteTable.StudentTable;

public class MainApp 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext contex=new ClassPathXmlApplicationContext("SpringConfig.xml");
    	
    	StudentTable studentTable=(StudentTable)contex.getBean("studentTable");
    	
    	studentTable.createTable("create table student (student_Id number(4), student_Name varchar2(30), student_course varchar2(30), student_gender varchar2(30), student_age number(2))");
    	
    }
}
