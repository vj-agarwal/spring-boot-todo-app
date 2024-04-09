package com.webApp.springboot.firstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUser = username.equalsIgnoreCase("vijay");
		boolean isValidPassword = password.equalsIgnoreCase("pass");
		
		return isValidUser && isValidPassword;
	} 

}
