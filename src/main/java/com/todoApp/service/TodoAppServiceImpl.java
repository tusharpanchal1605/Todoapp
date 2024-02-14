package com.todoApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todoApp.dao.TodoAppDAO;
import com.todoApp.model.TodoAppVO;

@Service
@Transactional
public class TodoAppServiceImpl implements TodoAppService{
	
	@Autowired
	private TodoAppDAO todoAppDAO;
	
	public void saveTodo(TodoAppVO todoAppVO) {
		this.todoAppDAO.saveTodo(todoAppVO);
		}

	@Override
	public List<TodoAppVO> viewTodo() {
		
		return this.todoAppDAO.viewTodo();
	}

	@Override
	public List<TodoAppVO> findTodoById(int id) {
		// TODO Auto-generated method stub
		return this.todoAppDAO.findTodoById(id);
	}

	
	}


