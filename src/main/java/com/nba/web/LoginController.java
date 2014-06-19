package com.nba.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nba.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/loginCheck.do")
	public ModelAndView loginCheck(HttpServletRequest request,LoginCommand loginCommand ){
		
		boolean isUser = userService.hasMatchUser(loginCommand.getUserName(), loginCommand.getUserPassword());
		if(!isUser){
			return new  ModelAndView("index","error","”√ªß√˚√‹¬Î¥ÌŒÛ");
		}else{
			return new  ModelAndView("main");
		}
	}
}
