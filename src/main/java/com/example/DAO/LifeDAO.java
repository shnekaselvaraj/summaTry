package com.example.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.model.Life;

@Component
public class LifeDAO 
{
	@Autowired
	JdbcTemplate jdbcTemplate;
    
	public void setTemplate(JdbcTemplate jdbcTemplate) {    
	    this.jdbcTemplate = jdbcTemplate;  
	}
	public int save(Life life) {
		String query="insert into life (name,age,status) values('"+life.getName()+"',"+life.getAge()+",'"+life.getStatus()+"')";
	   return jdbcTemplate.update(query);
	}
	
}
