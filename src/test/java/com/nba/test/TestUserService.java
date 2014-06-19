package com.nba.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nba.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestUserService {
	
	@Autowired
	private UserService userService;
	
	public void hasMatchUser(){
		boolean bool1 = userService.hasMatchUser("superadmin","superadmin");
		assertTrue(bool1);
	}

	private void assertTrue(boolean bool1) {
		System.out.println(bool1);
	}

}
