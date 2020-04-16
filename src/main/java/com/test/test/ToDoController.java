package com.test.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.service.ToDoService;

@Controller
@SessionAttributes("name")
public class ToDoController {

	@Autowired
	ToDoService toDoService;
	
	@RequestMapping("/showtodo")
	public String showToDoList(ModelMap model) {
		String name = (String)model.get("name");
		System.out.println(name);
		model.put("todolist", toDoService.retrieveTodos("amit"));
		return "to-do";
	}
}
