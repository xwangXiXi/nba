package com.nba.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings("deprecation")
	public int getMatchCount(String userName,String userPassword){
		String sql = "SELECT COUNT(*) FROM usertable WHERE username = ? and userpassword = ?";
		return jdbcTemplate. queryForInt(sql,new Object[]{userName,userPassword});
	}
	
}
