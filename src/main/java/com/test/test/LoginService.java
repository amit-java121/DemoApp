package com.test.test;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validate(String username,String password){
		
		return username.equalsIgnoreCase("amit") && password.equalsIgnoreCase("amit");
	}
}
