package com.webApp.springboot.firstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authService;
	
	public LoginController(AuthenticationService authService) {
		super();
		this.authService = authService;
	}

	//private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping(value = "login", method = RequestMethod.GET)
	//public String loginJsp(@RequestParam String name, ModelMap model) {
	public String loginJsp() {
		//System.out.println("Request param is :" + name); //Just To show in Console
		//logger.info("Request Param is {}", name);
		//model.put("name", name);
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if (authService.authenticate(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";	
		}
		
		model.put("errorMsg", "Invalid Credentials");
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