package com.webApp.springboot.firstWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	//private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("login")
	//public String loginJsp(@RequestParam String name, ModelMap model) {
	public String loginJsp() {
		//System.out.println("Request param is :" + name); //Just To show in Console
		//logger.info("Request Param is {}", name);
		//model.put("name", name);
		return "login";
	}

}
/*
 * localhost:8080/login
 * 
 * B1: Identifies Correct Controller Method
 * => /login => LoginController.loginJsp
 * 
 * B2: Executes Controller Method
 * => puts data into model
 * => returns view name => login
 * 
 * B3: Identifies Correct View
 * => /WEB-INF/jsp/login.jsp
 * 
 * B4: Executes View 
 * => Provides the response to Client 
 */