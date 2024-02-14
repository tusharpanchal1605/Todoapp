package com.todoApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todoapp_table")
public class TodoAppVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "todoapp_id")
	private Integer id;

	@Column(name = "todoapp_title")
	private String title;
	
	@Column(name = "todoapp_date")
	private String date;
	
	@Column(name="todoapp_status")
	private String status;
	
	@Column(name = "status")
	private boolean tableStatus=true;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isTableStatus() {
		return tableStatus;
	}

	public void setTableStatus(boolean tableStatus) {
		this.tableStatus = tableStatus;
	}

	
}
