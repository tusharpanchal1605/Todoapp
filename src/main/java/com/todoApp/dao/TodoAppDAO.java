package com.todoApp.dao;

import java.util.List;

import com.todoApp.model.TodoAppVO;

public interface TodoAppDAO {

	void saveTodo(TodoAppVO todoAppVO);

	List<TodoAppVO> viewTodo();

	List<TodoAppVO> findTodoById(int id);

}
