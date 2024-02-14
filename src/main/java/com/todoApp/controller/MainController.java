package com.todoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.todoApp.model.TodoAppVO;
import com.todoApp.service.TodoAppService;




@Controller
public class MainController {
	@Autowired
	private TodoAppService todoAppService;
	@GetMapping({"/","home"})
	public ModelAndView adminIndex(){
		List<TodoAppVO> todoList = this.todoAppService.viewTodo();
		return new ModelAndView("admin/home","todoList",todoList);
	}
	
}
