package com.test.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	//@ResponseBody
	public String login(ModelMap model) {
		//ModelMap model = new ModelMap(); this will not work
		//model.put("name", name);
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String afterLogin(ModelMap model, @RequestParam String name,@RequestParam String pass) {
		if(!loginService.validate(name, pass))
			return "login";
		model.put("name", name);
		return "welcome";
	}
}
