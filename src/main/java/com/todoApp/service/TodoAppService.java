package com.todoApp.service;

import java.util.List;

import com.todoApp.model.TodoAppVO;

public interface TodoAppService {

	void saveTodo(TodoAppVO todoAppVO);

	List<TodoAppVO> viewTodo();

	List<TodoAppVO> findTodoById(int id);

}
