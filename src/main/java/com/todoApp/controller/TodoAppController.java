package com.todoApp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.todoApp.model.TodoAppVO;
import com.todoApp.service.TodoAppService;

@Controller
public class TodoAppController {
	@Autowired TodoAppService todoAppService;
	
	
	
	@GetMapping("addTodo")
	public ModelAndView addTodo() {
		return new ModelAndView("admin/addTodo", "TodoAppVO", new TodoAppVO());
	}
	
	@PostMapping("save")
	public ModelAndView saveTodo(@ModelAttribute TodoAppVO todoAppVO){
		this.todoAppService.saveTodo(todoAppVO);
		return new ModelAndView("redirect:home.html");
	}
	
	@GetMapping("home.html")
	public ModelAndView viewTodo() {
		List<TodoAppVO> todoList = this.todoAppService.viewTodo();
		System.out.println(todoList);
		return new ModelAndView("admin/home", "todoList", todoList);
	}
	
	@GetMapping("index")
	public ModelAndView index(){
		return new ModelAndView("admin/home");
	}
	
	@GetMapping("deleteTodo")
	public ModelAndView deleteTodo(@ModelAttribute TodoAppVO todoAppVO, @RequestParam int id) {
		
		
		List<TodoAppVO> todoList = this.todoAppService.findTodoById(id);
		todoAppVO = todoList.get(0);
		todoAppVO.setTableStatus(false);;
		
		this.todoAppService.saveTodo(todoAppVO);
		
		return new ModelAndView("redirect:/home");
	}
	
	@GetMapping("editTodo")
	public ModelAndView editTodo(@ModelAttribute TodoAppVO todoAppVO, @RequestParam int id) {
		
		
		List<TodoAppVO> todoList = this.todoAppService.findTodoById(id);
		todoAppVO = todoList.get(0);
		System.out.println(todoAppVO);
		return new ModelAndView("admin/addTodo", "TodoAppVO",todoAppVO);
	}
	
	
	
}
