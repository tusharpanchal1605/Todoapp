package com.todoApp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.todoApp.model.TodoAppVO;

@Repository
public class TodoAppDAOImpl implements TodoAppDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void saveTodo(TodoAppVO todoAppVO) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(todoAppVO);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<TodoAppVO> viewTodo() {
		List<TodoAppVO> todolist=new ArrayList<TodoAppVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from TodoAppVO where tableStatus = true");
			todolist = (List<TodoAppVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todolist;
	}
	
	@Override
	public List<TodoAppVO> findTodoById(int id) {
		List<TodoAppVO> todolist=new ArrayList<TodoAppVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from TodoAppVO where tableStatus = true and id ='"+id+"'");
			todolist = (List<TodoAppVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todolist;
	}


	

}
