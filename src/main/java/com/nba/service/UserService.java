package com.nba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.dao.UserDao;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public boolean hasMatchUser(String userName,String userPassword){
		int matchCount = userDao.getMatchCount(userName, userPassword);
		return matchCount>0;
	}
	
}
