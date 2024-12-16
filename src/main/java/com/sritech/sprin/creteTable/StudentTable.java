package com.sritech.sprin.creteTable;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentTable {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
	 
	
	public void createTable(String query){
		
		jdbcTemplate.execute(query);
		
		System.out.println("sucessfully created table");
	}
	

}
