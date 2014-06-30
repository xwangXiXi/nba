package com.nba.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nba.model.User;
import com.nba.service.IUserService;

@Controller
@RequestMapping(value = "/user")
public class UserAction {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUserAction(
			@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "userPassword", required = true) String userPassword,
			@RequestParam(value = "rid", required = true) int rid) {
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setRid(rid);
		return this.userService.addUser(user) == true ? "success" : "fail";
	}

	// public ModelAndView loginCheck(HttpServletRequest request,LoginCommand
	// loginCommand ){
	// boolean isUser = userService.hasMatchUser(loginCommand.getUserName(),
	// loginCommand.getUserPassword());
	// if(!isUser){
	// return new ModelAndView("index","error","”√ªß√˚√‹¬Î¥ÌŒÛ");
	// }else{
	// return new ModelAndView("main");
	// }
	// }
}
