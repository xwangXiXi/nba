package com.nba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.dao.IUserDao;
import com.nba.model.User;
@Service
public class UserService  implements IUserService{
	
	@Autowired
	private IUserDao userDao;

	public boolean addUser(User user) {
		return this.userDao.addUser(user) >0 ? true : false;
	}
	
	/*public boolean hasMatchUser(String userName,String userPassword){
		int matchCount = userDao.getMatchCount(userName, userPassword);
		return matchCount>0;
	}*/
	
}
