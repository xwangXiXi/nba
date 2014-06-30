package com.nba.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nba.model.User;

@Repository
public class UserDao implements IUserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	/*@SuppressWarnings("deprecation")
	public int getMatchCount(String userName,String userPassword){
		String sql = "SELECT COUNT(*) FROM usertable WHERE username = ? and userpassword = ?";
		return jdbcTemplate. queryForInt(sql,new Object[]{userName,userPassword});
	}*/
	
	public int addUser(User user){
		String result = this.hibernateTemplate.save(user).toString();
		if(result != null ){
				return Integer.parseInt(result);
		}
		return 0;
	}
}
